package dao;

import model.Employee;

public interface Dao {

	//String id,String name,String age,String salary,String email,String address
	public int addemp(Employee E);
	public int upemp(String id,String name,String age,String salary,String email,String address);
	public int delemp(int id);
	public int serachemp(int id);
}
