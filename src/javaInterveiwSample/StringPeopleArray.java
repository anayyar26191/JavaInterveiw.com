package javaInterveiwSample;

public class StringPeopleArray {
	private String name;
	private char gender;
	private String phoneNo[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void printArray()
	{
		for(int i=0;i<phoneNo.length;i++){
		System.out.println(phoneNo[i]);
		}
	}

}
