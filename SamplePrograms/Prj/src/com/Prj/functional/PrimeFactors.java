package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find Prime factors ");
		int n=sc.nextInt();
		Utility.pfactors(n);
	}

}
