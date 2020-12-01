package kr.co.ikosmo.mvc.vo;

public class BoardVO {
	
/*

NO      NOT NULL NUMBER        
PWD              VARCHAR2(10)  
WRITER           VARCHAR2(34)  
SUBJECT          VARCHAR2(100) 
CONTENT          VARCHAR2(400) 
REGDATE          DATE          

	
 */

	
	
private int no;
private String pwd;
private String writer;
private String subject;
private String content;
private String regdate;



public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getWriter() {
	return writer;
}

public void setWriter(String writer) {
	this.writer = writer;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getRegdate() {
	return regdate;
}

public void setRegdate(String regdate) {
	this.regdate = regdate;
}

}
