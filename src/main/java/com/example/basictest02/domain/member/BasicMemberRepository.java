package com.example.basictest02.domain.member;

import com.example.basictest02.domain.dto.Dto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.basictest02.domain.dto.Dto;
import java.util.List;

@Repository
public interface BasicMemberRepository extends JpaRepository<BasicMember, Long> {

   // @Modifying
   // @Query("insert INTO BasicMember (name, pw, adr, email) VALUES (:#{#dto.name}, :#{#dto.pw}, :#{#dto.adr}, :#{#dto.email}) RETURNING id")
   // long insertMember(@Param("dto")Dto dto);
  //  @Transactional
  /*  @Modifying
    @Query(value = "insert into basic_member (name, pw, adr, email, user_id) values (:#{#dto.name}, :#{#dto.pw}, :#{#dto.adr}, :#{#dto.email}, :#{#dto.user_id}) returning id", nativeQuery = true)
    int insertMember(@Param("dto")Dto dto);
*/
    @Transactional
    @Modifying
    @Query(value = "insert into basic_member (name, pw, adr, email, user_id) values (:#{#dto.name}, :#{#dto.pw}, :#{#dto.adr}, :#{#dto.email}, :#{#dto.user_id})",nativeQuery = true)
    int insertMember(@Param("dto")Dto dto);

    @Transactional
    @Modifying
    @Query(value = "UPDATE basic_member SET pw = :#{#dto.pw}, name = :#{#dto.name}, adr = :#{#dto.adr}, email = :#{#dto.email}, user_id = :#{#dto.user_id} WHERE id = :id", nativeQuery = true)
    void updateMember(@Param("dto")Dto dto, Long id);


// @Transactional
// @Modifying
// @Query(value = "update basic_member set pw =:pw where id = :1", nativeQuery = true)
// void aa(@Param("dto")String pw);
 @Modifying
 @Transactional
 @Query(value = "DELETE FROM basic_member where id = :id", nativeQuery = true)
 void deleteMember(Long id);
}