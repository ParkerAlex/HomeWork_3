package eu.senla.homework_3;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {	
		
        Cat cat_1 = new Cat("BARSIK", 7);
//////////////////////////////////////////////////PART-1////////////////////////////////////////       
        
        String name = cat_1.getName();
		int age = cat_1.getAge();
        
        int counter = 0;
        while (counter < 10) {
        	
        	System.out.println("Name is: " + name + "; Age is: " + age);
        	
        	counter++;
        }
        System.out.println();
//////////////////////////////////////////////////PART-2////////////////////////////////////////
        
            cat_1.setName_2((String) "KUZIA");
            cat_1.setAge_2((int) 3);
		
        for(int counter_2 = 0; counter_2 < 10; counter_2++){

        	String name_2 = cat_1.getName_2();
    		int age_2 = cat_1.getAge_2();

        	System.out.println("Name_2 is: " + name_2 + "; Age_2 is: " + age_2);
        }
        System.out.println();
///////////////////////////////////////////////////////PART-3//////////////////////////////////    
        
        String name_3 = cat_1.getName_3(); 
        int age_3 = cat_1.getAge_3();
        
        int counter_3 = 0;
        do {
        	 counter_3++;
        	System.out.println("Name_3 is: " + name_3 + "; Age_3 is: " + age_3);
        } while (counter_3 < 10);
        System.out.println();
///////////////////////////////////////////////////////PART-4//////////////////////////////////   
        
        String[] arrayCat_1 = cat_1.getArrayCat();
        int[] arrayAge_1 = cat_1.getArrayAge();
        int count = 0;
        for(String counter_4: arrayCat_1) {
        	
        	System.out.println("Name_4 is: " +counter_4 + "; Age_4 is: " + arrayAge_1[count]);
        	count++;
        }
        System.out.println();
///////////////////////////////////////////////////////PART-5////////////////////////////////// 
        
        Cat cat3 = new Cat("MURKA", 10);          
        System.out.println(cat3);         //WHY ZERO???????????????????
	}

}
