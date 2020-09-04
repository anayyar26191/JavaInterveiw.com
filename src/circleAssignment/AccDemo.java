package circleAssignment;

public class AccDemo {

	 String name;
	  int age;
	  public static void main(String[] args) {
		  Account();
	    
	 }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	public static void Account(){
	AccDemo acc =new AccDemo();
	      acc.setName("Anna");
	      acc.setAge(40);
	      System.out.println("Print Name :"+acc.getName());
	      System.out.println("Print Age  :"+acc.getAge());
	    }
	} 


