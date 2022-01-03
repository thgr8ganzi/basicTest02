package com.example.basictest02.domain.service;

import com.example.basictest02.domain.dto.Dto;
import com.example.basictest02.domain.member.BasicMember;
import com.example.basictest02.domain.member.BasicMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BasicMemberService {

    @Autowired
    BasicMemberRepository memberRepository;


    public int saveData(Dto dto) {
       int row = memberRepository.insertMember(dto);
       return row;
    }

    public void update(Dto dto, Long id) {
        memberRepository.updateMember(dto, id);
    }

    public List<BasicMember> getId() {
        return memberRepository.findAll();
    }

    public List<BasicMember> getId2(Long id) {
        return memberRepository.findAllById(Collections.singleton(id));
    }

    public void deleteId(Long id) {
        memberRepository.deleteMember(id);
    }
}
