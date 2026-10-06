package com.example.mavenshop.mapper;

import com.example.mavenshop.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    // 등록
//    void insert(Member member);

    // 단건 조회 (PK)
    Member findById(Long id);

    // 조건 단건 조회
//    Member findByEmail(String email);

    // 존재 여부 - boolean 리턴은 exists 접두사
//    boolean existsByEmail(String email);

    // 목록 조회
    List<Member> findAll();
//    List<Member> findByStatus(@Param("status") String status);

    // 수정
//    void update(Member member);

    // 삭제 (물리삭제) / 상태변경(논리삭제)면 updateStatus로 따로 두기도 함
//    void deleteById(Long id);

    // 개수
//    int count();
}
