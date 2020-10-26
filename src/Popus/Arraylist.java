package Popus;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("kaku");
		al.add("topper");
		al.add("ramos");
		al.add(null);
		al.add("mannu");
		al.add("tani");
		System.out.println(al);
		ArrayList<String> al1= new ArrayList<>();
		al1.add("dharuv");
		al1.add("pranjal");
		al1.add("perri");
		al1.addAll(al);
		System.out.println(al1);
	}

}
