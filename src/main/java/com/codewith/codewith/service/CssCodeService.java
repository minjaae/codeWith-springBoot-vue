package com.codewith.codewith.service;

import com.codewith.codewith.repository.HtmlCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CssCodeService {
    private final HtmlCodeRepository htmlCodeRepository;
}
