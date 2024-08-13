package springioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("1")
	private int Lid;
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + ", Brand=" + Brand + "]";
	}
	@Value("Hpenvy")
	private String Lname;
	@Value("HP")
	private String Brand;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}

}
