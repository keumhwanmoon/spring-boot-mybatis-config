package com.jason.controller;

import com.jason.domain.Member;
import com.jason.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Jason on 2016-09-03.
 */
@Controller
public class MemberController {
    @Autowired
    MemberMapper memberMapper;

    @RequestMapping("/")
    @ResponseBody
    public List<Member> findMembers() {
        return memberMapper.findMembers();
    }
}
