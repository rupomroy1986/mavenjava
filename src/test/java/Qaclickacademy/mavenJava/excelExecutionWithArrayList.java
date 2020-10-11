package Qaclickacademy.mavenJava;

import java.io.IOException;
import java.util.ArrayList;

public class excelExecutionWithArrayList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDrivenWithMethodArray d=new dataDrivenWithMethodArray();
		//d.getData("purchase");
		  ArrayList<String> a1       =d.getData("purchase");
		  System.out.println(a1.get(0));
		  System.out.println(a1.get(1));
		  System.out.println(a1.get(2));
		  System.out.println(a1.get(3));
		  
		


	}

}
