package xyz.juniorapeles.ja_startarer_template.exception;

import org.springframework.http.HttpStatus;

public record ApiError(
        HttpStatus status,
        String message,
        String debugMessage
) {}
