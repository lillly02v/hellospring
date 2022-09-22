package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.EmaillistVo;
import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
  
  @Autowired
  private SqlSession sqlSession;

  
  public List<GuestbookVo> getList(){
    System.out.println("----> sqlSession.selectList()");
    System.out.println(sqlSession);

    return sqlSession.selectList("GuestBookXml.selectList");
  }
  
  public int insert(GuestbookVo guestbookVo) {
	  System.out.println(guestbookVo);
	  return sqlSession.insert("GuestBookXml.insert", guestbookVo);
  }
  
  public int delete(GuestbookVo guestbookVod) {
	  System.out.println(guestbookVod);
	  return sqlSession.delete("GuestBookXml.delete", guestbookVod);
  }
}
