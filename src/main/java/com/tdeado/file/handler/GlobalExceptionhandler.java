package com.tdeado.file.handler;

import com.google.gson.JsonSyntaxException;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import com.tdeado.file.utils.Ret;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@ControllerAdvice
public class GlobalExceptionhandler {

    @ExceptionHandler(value = JsonSyntaxException.class)
    @ResponseBody
    private Ret exceptionHandler(HttpServletRequest req, JsonSyntaxException e) {
        return Ret.err(e.getMessage());
    }

    @ExceptionHandler(value = CommunicationsException.class)
    @ResponseBody
    private Ret exceptionHandler(HttpServletRequest req, CommunicationsException e) {
        return Ret.err(e.getMessage());
    }

    @ExceptionHandler(value = SQLException.class)
    @ResponseBody
    private Ret sqlExceptionHandler(HttpServletRequest req, SQLException e) {
        return Ret.err(e.getMessage());
    }
    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    private Ret exceptionHandler(HttpServletRequest req, IllegalArgumentException e) {
        return Ret.err(e.getMessage());
    }
    @ExceptionHandler(value = MySQLIntegrityConstraintViolationException.class)
    @ResponseBody
    private Ret MySQLIntegrityConstraintViolationException(HttpServletRequest req, Exception e) {
        return Ret.err(e.getMessage());
    }

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    private Ret RuntimeException(HttpServletRequest req, Exception e) {
        return Ret.err(e.getMessage());
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Ret exceptionHandler(HttpServletRequest req, Exception e) {
        return Ret.err(e.getMessage());
    }


}
