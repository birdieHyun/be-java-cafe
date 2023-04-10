package kr.codesqaud.cafe.repository.reply;

import kr.codesqaud.cafe.domain.Reply;

import java.util.List;
import java.util.Optional;

public interface ReplyRepository {

    int save(Reply reply);

    List<Reply> findAllReplyByArticleId(int articleId);

    Optional<Reply> findReplyByReplyId(int replyId);

    void delete(int replyId);
}
