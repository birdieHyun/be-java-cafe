package kr.codesqaud.cafe.interceptor;

import kr.codesqaud.cafe.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class UpdateUserInterceptor implements HandlerInterceptor {

    private Logger log = LoggerFactory.getLogger(getClass());
    private final String LOGIN_USER = "user";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        User loginedUser = (User) session.getAttribute(LOGIN_USER);
        String[] split = request.getRequestURI().split("/");
        String userId = split[split.length -1];
        String decode = URLDecoder.decode(userId, StandardCharsets.UTF_8);
        log.info(userId);

        if (!loginedUser.getUserId().equals(decode)) {
            throw new IllegalArgumentException("본인의 페이지만 수정할 수 있습니다.");
        }
        return true;
    }
}
