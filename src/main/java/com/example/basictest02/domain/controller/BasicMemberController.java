package com.example.basictest02.domain.controller;

import com.example.basictest02.domain.dto.Dto;
import com.example.basictest02.domain.member.BasicMember;
import com.example.basictest02.domain.service.BasicMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasicMemberController {

    @Autowired
    BasicMemberService basicMemberService;

//    insert
    @PostMapping(value = "/savedata", produces = "application/json; charset=utf-8")
    public String savecontrol(@RequestBody Dto dto){
        int i = basicMemberService.saveData(dto);
        String message = "가 변경되었습니다";

        return i + message;
    }

//    update
    @PostMapping(value = "/update/{id}", produces = "application/json; charset=utf-8")
    public void updateController(@PathVariable("id")Long id, @RequestBody Dto dto){
        basicMemberService.update(dto, id);
    }

//    allGet
    @GetMapping(value = "/getter" , produces = "application/json; charset=utf-8")
    public List<BasicMember> getController(){
       return basicMemberService.getId();
    }

//    getOnce
    @GetMapping(value = "/getter2/{id}" , produces = "application/json; charset=utf-8")
    public List<BasicMember> getController2(@PathVariable Long id){
        return basicMemberService.getId2(id);
    }

//    delete
    @DeleteMapping(value = "/delete/{id}")
    public void deleteController(@PathVariable("id") Long id){
        basicMemberService.deleteId(id);
    }






}
