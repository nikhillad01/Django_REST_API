package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class UserIp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter useraname");
	String Uname=sc.nextLine();
	System.out.println("Enter First Name :");
	String fname=sc.nextLine();
	Utility.userIp(Uname,fname);
	
	}

}
