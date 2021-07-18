package com.codewith.codewith.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class JavascriptRequestDto {
    private String code;
    private String content;
    private int stage;
    private String imgUrl;

    public JavascriptRequestDto(String code, String content, int stage, String imgUrl) {
        this.code = code;
        this.content = content;
        this.stage = stage;
        this.imgUrl= imgUrl;
    }
}
