package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Stake");
	int s=sc.nextInt();
	System.out.println("Enter Your Goal");
	int g=sc.nextInt();
	System.out.println("Enter Number of trials");
	int t=sc.nextInt();
	Utility.gambler(s, t, g);
}
}