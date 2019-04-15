package controller;

import model.Employee;
import services.*;


public class Controller {
	
	public static void main(String[] args) {
	
		Employee e = new Employee("1006", "Bulutu", "13", "1000", "bulutu@gmail.com", "Vancuber");
		Services s = new Services();
		s.addemp(e);
		//s.delemp(1001);
		//s.serachemp(1000);
		//s.upemp("1005", "Captain Planet","22", "9000", "captainplanet@email.com", "New Jersey");
		
	}
	

}
