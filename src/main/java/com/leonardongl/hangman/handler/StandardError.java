package com.leonardongl.hangman.handler;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;

    public StandardError(Integer status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }
}
