package com.jason.controller;

import com.jason.domain.Member;
import com.jason.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016-09-03.
 */
@Controller
public class MemberController {
    private final MemberMapper memberMapper;

    @Autowired
    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @RequestMapping("/members")
    @ResponseBody
    public List<Member> findMembers() {
        return memberMapper.findMembers();
    }
}
