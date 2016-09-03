package com.jason.mapper;

import com.jason.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Jason on 2016-09-03.
 */
@Mapper
public interface MemberMapper {
    @Select("Select * From Member")
    List<Member> findMembers();
}
