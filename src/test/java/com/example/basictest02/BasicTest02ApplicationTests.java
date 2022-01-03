package com.example.basictest02;

import com.example.basictest02.domain.dto.Dto;
import com.example.basictest02.domain.member.BasicMember;
import com.example.basictest02.domain.member.BasicMemberRepository;
import com.example.basictest02.domain.service.BasicMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@WebAppConfiguration
@SpringBootTest
class BasicTest02ApplicationTests {
    @Autowired
    BasicMemberRepository memberRepository;

    @Autowired
    BasicMemberService basicMemberService;

//    @Test
//    @Transactional
//    public void asd(){
//
//       Dto dto = new Dto();
//       Long id = 2L;
//       dto.setUser_id("az");
//       dto.setPw("zz");
//       dto.setName("zz");
//       dto.setAdr("zz");
//       dto.setEmail("Zz");
//        System.out.println(dto.toString());
//       memberRepository.updateMember(dto, id);
//    }

//    @Transactional
//    @Test
//    public void dd(){
//        String pw = "XXX";
//        memberRepository.aa(pw);
//    }

    @Test
    void sss(){
        memberRepository.deleteMember(11L);
    }


}
