package com.example.mavenshop.service;

import com.example.mavenshop.domain.Member;
import com.example.mavenshop.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public List<Member> findAll() {
        List<Member> members = memberMapper.findAll();

        return members;
    }
}
