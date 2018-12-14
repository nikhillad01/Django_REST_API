package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Eculidien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter point X");
		int x=sc.nextInt();
		System.out.println("Enter point Y");
		int y=sc.nextInt();
		Utility.euclidien(x, y);
	}

}
