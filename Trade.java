
public class Trade {

	private  String name;
	
	private int id;
	
	private int  sum;
	
	private int count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public  void getFullname(Trade t) {
		
	   t.getCount();
	   
	   t.getSum();
		if(t.getName().length()>0){
			
		}
	}

	public static void main(String[] args) {

		Trade t = new Trade();
      
	  t.setName("sairam");
	  t.setCount(1);
	  t.setId(2);
	  t.setSum(1);

	   t.getFullname(t);
	
	}

}
