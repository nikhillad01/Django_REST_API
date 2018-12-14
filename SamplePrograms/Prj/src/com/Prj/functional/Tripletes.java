package com.Prj.functional;
import java.util.*;

import com.Prj.utilities.Utility;
public class Tripletes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total numbers ");
		int tn=sc.nextInt();
		int arr[] = new int[tn];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: " + (i+1) + " : ");
                arr[i] = sc.nextInt();
        }
            
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("array element" + (i+1) + " : ");
                System.out.print(arr[i] + "\n");
		int n_length=arr.length;
		Utility.triplets(arr, n_length);
		
	}

}
}
