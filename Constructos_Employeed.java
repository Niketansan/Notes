
public class EmployeeDet {

	int id;

	String empName;

	public EmployeeDet(int id , String empName) {
       this. id = id;
       this. empName = empName;
	}

	public void add() {
     System.out.println(this.id);
	}

	public static void main(String[] args) {

		EmployeeDet empDet = new EmployeeDet(1,"sai");

		empDet.add();

	}
}
