package com.javaex.vo;

public class EmaillistVo {
  private int    no;
  private String lastName;
  private String firstName; 
  private String email;
  /**
   * @return the no
   */
  public int getNo() {
    return no;
  }
  /**
   * @param no the no to set
   */
  public void setNo(int no) {
    this.no = no;
  }
  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }
  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }
  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }
  @Override
  public String toString() {
    return "EmaillistVo [no=" + no + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + "]";
  }
  /**
   * 
   */
  public EmaillistVo() {
  }
  /**
   * @param no
   * @param lastName
   * @param firstName
   * @param email
   */
  public EmaillistVo(int no, String lastName, String firstName, String email) {
    this.no = no;
    this.lastName = lastName;
    this.firstName = firstName;
    this.email = email;
  }
  /**
   * @param lastName
   * @param firstName
   * @param email
   */
  public EmaillistVo(String lastName, String firstName, String email) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.email = email;
  }
  
  
  
}
