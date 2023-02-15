
public class Emplyee {
	int emp_id;
	String emp_name;
	long emp_pnimeNo;
	double emp_salary;
	public Emplyee(int id,String name,long phone,double salary) {
		this.emp_id=id;
		this.emp_name=name;
		this.emp_pnimeNo=phone;
		this.emp_salary=salary;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getEmp_pnimeNo() {
		return emp_pnimeNo;
	}
	public void setEmp_pnimeNo(long emp_pnimeNo) {
		this.emp_pnimeNo = emp_pnimeNo;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
}
