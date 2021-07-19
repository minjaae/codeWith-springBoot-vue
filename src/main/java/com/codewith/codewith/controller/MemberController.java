package com.codewith.codewith.controller;

import com.codewith.codewith.dto.MemberDto;
import com.codewith.codewith.model.Member;
import com.codewith.codewith.model.Scrap;
import com.codewith.codewith.repository.MemberRepository;
import com.codewith.codewith.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;
    private MemberRepository memberRepository;
    @GetMapping("/api/member")
    public List<Member> getMember() {
        return memberRepository.findAll();
    }
    // 메인 페이지
//    @GetMapping("/")
//    public String index() {
//        return "/index.html";
//    }
//
//    // 회원가입 페이지
//    @GetMapping("/user/signup")
//    public String dispSignup() {
//        return "redirect:/Signup";
//    }
    // 회원가입 처리
    @PostMapping("/api/signup")
    public Member createSignup(@RequestBody MemberDto memberDto) {
        return memberService.joinUser(memberDto);

         //"redirect:/Signup";
    }

//    // 로그인 페이지
//    @GetMapping("/user/login")
//    public String dispLogin() {
//        return "/";
//    }
//
//    // 로그인 결과 페이지
//    @GetMapping("/user/login/result")
//    public String dispLoginResult() {
//        return "/";
//    }
//
//    // 로그아웃 결과 페이지
//    @GetMapping("/user/logout/result")
//    public String dispLogout() {
//        return "/";
//    }
//
//    // 접근 거부 페이지
//    @GetMapping("/user/denied")
//    public String dispDenied() {
//        return "/";
//    }

//    // 내 정보 페이지
//    @GetMapping("/user/info")
//    public String dispMyInfo() {
//        return "/Mypage";
//    }
}
