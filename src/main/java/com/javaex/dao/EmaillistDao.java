package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.EmaillistVo;
import com.javaex.vo.GuestbookVo;

@Repository
public class EmaillistDao {
  
  @Autowired
  private SqlSession sqlSession;

  
  public List<EmaillistVo> getList(){
    System.out.println("----> sqlSession.selectList()");
    System.out.println(sqlSession);

    return sqlSession.selectList("emaillist.list"); //mappers밑의 emaillist.xml로 이동
  }
  
  public int insert(EmaillistVo vo) {
	  System.out.println(vo);
	  return sqlSession.insert("emaillist.insert", vo);
  }
  
  public int delete(int no) {
	  System.out.println(no);
	  return sqlSession.insert("emaillist.delete", no);
  }
  
}