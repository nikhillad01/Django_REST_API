package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a");
	int a=sc.nextInt();
	System.out.println("Enter b");
	int b=sc.nextInt();
	System.out.println("Enter c");
	int c=sc.nextInt();
	Utility.quadratic(a, b, c);
	}

}
