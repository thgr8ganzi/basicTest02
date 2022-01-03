package com.example.basictest02.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "basic_member")
public class BasicMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String user_id;

    @Column
    String pw;

    @Column
    String name;

    @Column
    String adr;

    @Column
    String email;

    @Builder
    public BasicMember(long id, String user_id, String pw, String name, String adr, String email){
        this.id = id;
        this.user_id = user_id;
        this.pw = pw;
        this.name = name;
        this.adr = adr;
        this.email = email;
    }




}