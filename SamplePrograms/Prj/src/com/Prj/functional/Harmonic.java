package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nth value to find Harmonic");
		int nth=sc.nextInt();
		Utility.harmonic(nth);
	}

}
