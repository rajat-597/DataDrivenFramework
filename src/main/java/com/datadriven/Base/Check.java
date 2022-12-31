package com.datadriven.Base;

public class Check {
	
	public static String[][] arrayReturn() {
		 String[][] str = {{"RAM", "SHYAM"},{"SITA","GITA"}};
		 return str;
	}
	
	public static void main(String agrs[]) {

	String path = System.getProperty("user.dir") ;
	System.out.println(path);
    String[][] value =	arrayReturn();
    // accessing the value of array
    for(int i = 0;i<value.length;i++) { // it will tell us about the number of row
    	for(int j=0;j<value[0].length;j++) { // it tells about number of cell inside each row
    		System.out.println(value[i][j] + " ");
    	}
    }
}
}
