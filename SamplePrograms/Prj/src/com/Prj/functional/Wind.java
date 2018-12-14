package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature");
		double t=sc.nextDouble();
		System.out.println("enter speed(in miles per hour),");
		double v=sc.nextDouble();
		Utility.wind(t, v);
	}

}
