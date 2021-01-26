package eu.senla.homework_3;

import java.util.Scanner;

public class Cat {
	
	final String name = "GERMAN";
    final int age = 5;
	
	static String name_2;
	static int age_2;
	
	private String name_3;
	private int age_3;
	
	
    static final String[] arrayCat = {"Kuzia", "Barsik", "German", "Tom", "Sonia"};
    static final int[] arrayAge = {1, 2, 3, 4, 5};
    
    public String cat; 
	
/////////////////////////////////////////////////////////////////Part-1////////////////////////////////////////////////////
	public  String getName() {
		return name;
	}
	public  int getAge() {
		return age;
	}
/////////////////////////////////////////////////////////////////Part-2////////////////////////////////////////////////////
	
	public static String getName_2() {
		return name_2;
	}
	public static void setName_2(String name_2) {
		Cat.name_2 = name_2;
	}
	public static int getAge_2() {
		return age_2;
	}
	public static void setAge_2(int age_2) {
		Cat.age_2 = age_2;
	}
/////////////////////////////////////////////////////////////////Part-3////////////////////////////////////////////////////
	
	public String getName_3() {
		return name_3;
	}
	public int getAge_3() {
		return age_3;
	}

	public  Cat(String cat_name, int cat_age) {
	       name_3 = cat_name;
	       age_3 = cat_age;
	   }
/////////////////////////////////////////////////////////////////Part-4////////////////////////////////////////////////////
	
	public static String[] getArrayCat() {
		return arrayCat;
	}
	public static int[] getArrayAge() {
		return arrayAge;
	}
/////////////////////////////////////////////////////////////////Part-5////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Cat [cat=" + cat + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (cat == null) {
			if (other.cat != null)
				return false;
		} else if (!cat.equals(other.cat))
			return false;
		return true;
	}


	}
	
	
	 

