package com.karmy.book.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum BusinessErrorCodes {
    NO_CODE(0, HttpStatus.NOT_IMPLEMENTED, "No code"),
    INCORRECT_CURRENT_PASSWORD(300, HttpStatus.BAD_REQUEST, "Incorrect Current Password"),
    NEW_PASSWORD_SAME_AS_CURRENT(301, HttpStatus.BAD_REQUEST, "New Password cannot be same as Current Password"),
    ACCOUNT_DISABLED(303, HttpStatus.FORBIDDEN, "User Account is Disabled"),
    BAD_CREDENTIALS(304, HttpStatus.UNAUTHORIZED, "Bad Credentials"),
    ACCOUNT_LOCKED(302, HttpStatus.FORBIDDEN, "User Account is Locked"),
    ;

    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
