package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javaex.dao.EmaillistDao;
import com.javaex.vo.EmaillistVo;

@Controller
public class EmaillistController {
  
  @Autowired
  EmaillistDao dao;

  
  @RequestMapping("/getEmailList") 
  public ModelAndView getEmailList( ModelAndView mav) {
    System.out.println(">>> "+this.getClass()+ " 호출됨!"); //class이름 호출
    
//    mav = new ModelAndView(); 
    
    mav.addObject( "list", dao.getList() ); //EmaillistDao로 이동
    mav.setViewName( "/WEB-INF/views/getEmailList.jsp" );
    //mav.setViewName( "getEmailList" );
    return mav;
  }
  
  @RequestMapping(value="/form", method=RequestMethod.GET) 
  public String form() {
	  System.out.println("form");
	  return "/WEB-INF/views/form.jsp";
  }
  
  @RequestMapping(value="/add", method=RequestMethod.POST) 
  public String add(@ModelAttribute EmaillistVo emaillistVo) {
	  System.out.println("add");
	  System.out.println(emaillistVo);
	  
	  dao.insert(emaillistVo);
	  
	  return "redirect:/getEmailList";
  }
  
  @RequestMapping(value="/delete/{no}", method=RequestMethod.GET) 
  public String delete(@PathVariable("no") int no) {
	  dao.delete(no);
	  
	  return "redirect:/getEmailList";
  }
  
}