package kr.codesqaud.cafe.controller;

import kr.codesqaud.cafe.exception.AddressException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public String controlException(Exception ex, Model model) {
        model.addAttribute("ex", ex.getMessage());

        return "error/error";
    }

    @ExceptionHandler(AddressException.class)
    public String handleAddress(HttpServletResponse response, Model model) {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        model.addAttribute("ex", "올바르지 못한 경로입니다.");

        return "error/error";
    }
}
