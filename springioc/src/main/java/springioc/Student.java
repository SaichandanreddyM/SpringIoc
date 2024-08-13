package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private int Sid;
	@Value("Sai")
	private String Sname;
	@Value("sai@gmail.com")
	private String mail;
	@Autowired
	private Laptop laptop;
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", mail=" + mail + ", laptop=" + laptop + "]";
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
