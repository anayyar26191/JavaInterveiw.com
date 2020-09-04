package bankData;

public class Customer {
	String name;
	int age;
	String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean validateAge(int age) {
		if (age >= 2 && age <= 75) {
			return true;
		} else {
			return false;
		}

	}
public boolean validateAddresLength(String addrss){
	int length =address.length();
	if(length>=100 && length<=250){
		return true;
	}
	else{
		return false;
	}
}
}