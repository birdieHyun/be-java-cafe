String.prototype.format = function() {
  var args = arguments;
  return this.replace(/{(\d+)}/g, function(match, number) {
    return typeof args[number] != 'undefined'
        ? args[number]
        : match
        ;
  });
};

// $(".submit-write button[type=submit]").click(addAnswer);
// function addAnswer(e) {
//   e.preventDefault();
//
//   var queryString = $("form[name=answer]").serialize(); // 폼의 name 속성을 answer로 변경
//
//   var url = $(".answer-write").attr("action");
//   console.log("url : " + url);
//   console.log("queryString" + queryString)
//
//   $.ajax({
//     type : 'post',
//     url : url,
//     data : queryString,
//     dataType : 'json',
//
//     error: function (error) {
//       console.log(error)
//       alert("error 발생");
//     },
//     success : function (data, status) {
//       console.log(data);
//       var answerTemplate = $("#answerTemplate").html();
//       var template = answerTemplate.format(data.articleId, data.userId, data.timestamp, data.contents, data.id);
//       $("textarea[name=contents]").val("");
//
//       // 새로운 댓글을 마지막 댓글로 추가
//       var articles = $(".qna-comment-slipp-articles > article");
//       var lastArticle = articles.last();
//       var newArticle = $(template);
//
//       // 새로운 댓글을 마지막 댓글로 추가
//       lastArticle.after(newArticle);
//
//       // 댓글 수 업데이트
//       var numReplies = $(".qna-comment-slipp-articles > article").length;
//       $(".qna-comment-count strong").val(numReplies);
//     }
//   });
// }

$('#btn-save').click(() => {
  var queryString = $(".submit-write textarea[name='contents']").serialize();
  var url = window.location.pathname + '/replies';
  var articleIndex = window.location.pathname.split('articles/')[1];
  var replyCounter = $(".qna-comment-count strong");


  $.ajax({
    type: 'POST',
    url: url,
    data: queryString,
    dataType: 'json',
  }).done((data) => {
    var answerTemplate = $("#answerTemplate").html();
    var template = answerTemplate.format(data.userName, data.createDate,
        data.contents, articleIndex, data.id);

    $(".qna-comment-slipp-articles").append(template);
    $("textarea[name=contents]").val("");

    $(".btn-delete").last().on("click", deleteReply);

    var replyCount = Number(replyCounter.text());
    replyCounter.text(replyCount + 1);

  }).fail((err) => {
    alert(JSON.stringify(err));
  });
});


$('.delete-answer-button').click(deleteAnswer);

function deleteAnswer(e) {
  var deleteBtn = (e.target);
  var url = e.target.dataset['url'];

  $.ajax({
    type : 'delete',
    url : url,
    dataType : 'json'
  }).done((data) => {
    deleteBtn.closest("article").remove();
    var numberOfArticles = $(".qna-comment-slipp-articles > article").length;
    var qnaCommentCounter = $(".qna-comment-count strong").text(numberOfArticles);
  }).fail((data) => {
    console.log(data);
    console.log(data.errorMessage);
  });
}