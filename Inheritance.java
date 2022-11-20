
class EmployeePersonalDetails {

	String panCard;

	EmployeePersonalDetails(String panCard) {
		System.out.println(" parent calss ");

		this.panCard = panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getPanCard() {

		System.out.println("Saafs" + this.panCard);
		return panCard;
	}

}

public class EmployeeDet extends EmployeePersonalDetails{ 

	int id;

	String empName;

	public EmployeeDet(int a, String name, String panCard) {
		super(panCard);

		System.out.println(" Childclass " + "" + a + "" + name);
		// TODO Auto-generated constructor stub
	}

	public void add(int a) {
		System.out.println(this.id);
	}

	public void add() {
		System.out.println("123");
		super.getPanCard();
	}

	public static void main(String[] args) {

		EmployeeDet empDet = new EmployeeDet(1, "sairam", "123d323e3");
  
		empDet.add();
		
		empDet.getPanCard();

	}
	
	/***  A class extend only one at at ime */
}


