package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of times coin flipped ");
	double flp=sc.nextInt();
	Utility.coinflip(flp);
	}

}
