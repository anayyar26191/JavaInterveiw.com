package javaInterveiwSample;

public class RuunerArray {

	public static void main(String[] args) {
		StringPeopleArray p = new StringPeopleArray();
		p.setName("Anju");
		p.setGender('M');
		String contact[]=new String[2];
		contact[0]="999 999 999";
		contact[1]="999 999 301";
		
		p.setPhoneNo(contact);
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getPhoneNo());
		p.printArray();

	}

}
