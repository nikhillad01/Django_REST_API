package com.Prj.functional;
import java.util.*;
import com.Prj.utilities.*;
import com.Prj.utilities.Utility;
public class Addition {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// TODO Auto-generated method stub
	System.out.println("enter Number");
	int num1=sc.nextInt();
	System.out.println("enter 2nd Number");
	int num2=sc.nextInt();
	Utility Ut=new Utility();
	Ut.add(num1, num2);
	}

}
