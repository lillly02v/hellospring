package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.EmaillistVo;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestbookController {
  @Autowired
  //GuestbookDao guestbookDao;
  
  GuestbookDao guestbookDao = new GuestbookDao();
  
  @RequestMapping("/getGuestbookList")
  public ModelAndView getGuestbookList( ModelAndView mav) {
    System.out.println(">>> "+this.getClass()+ " 호출됨!");
    
//    mav = new ModelAndView(); 
    
    mav.addObject( "guestbookList", guestbookDao.getList() );
    mav.setViewName( "/WEB-INF/views/getGuestbookList.jsp" );
    //mav.setViewName( "getGuestbookList" );
    return mav;
  }
  
  @RequestMapping(value="/addGuestbook", method=RequestMethod.POST) 
  public String add(@ModelAttribute GuestbookVo guestbookVo) {
	  System.out.println("add guestbook");
	  System.out.println(guestbookVo);
	  guestbookDao.insert(guestbookVo);
	  return "redirect:/getGuestbookList";
  }
  
  @RequestMapping(value="/deleteform", method=RequestMethod.GET) 
  public String deleteform() {
	  System.out.println("deleteform guestbook");
	  return "/WEB-INF/views/deleteform.jsp";
  }
  
  @RequestMapping(value="/deleteGb", method=RequestMethod.POST) 
  public String delete(@RequestParam("no") String no, @RequestParam("password") String password, @ModelAttribute GuestbookVo guestbookVo) {
	  System.out.println("delete guestbook");
	  int num = Integer.parseInt(no);
	  guestbookVo.setNo(num);
	  guestbookVo.setPassword(password);
	  
	  guestbookDao.delete(guestbookVo);
	  return "redirect:/getGuestbookList";
	  
	  
  }
}