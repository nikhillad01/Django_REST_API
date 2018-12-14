package com.Prj.utilities;
import java.util.*;
public class Utility {
	public static void add(int a, int b) {
		int c;
		c= a+b;
		System.out.println(c);
		//System.out.println(a+b);
		// TODO Auto-generated method stub

	}
	public static void userIp(String un,String fname) {
		if(un.length()>=3) {
			String s1="Hello <<Username>>, How are you !";
			String new1=s1.replace("<<Username>>", fname);
		System.out.println(new1);
	}
		else {
			System.out.println("Username should have three characters");
		}
	}
//*****************************Coin Flip*********************************
	public static void coinflip(double flip) {
		
		double count = 0;
		double head=0;
		double tail=0;
		
		while (count<flip) {
			double head_tail=(float)Math.random();
			if (head_tail<.5) {
				tail++;
			}
			else {
				head++;
				}
			count++;
		}
		System.out.println("Number of heads: "+head+" Number of atails: "+tail);
		double headpercentage=(head/flip)*100;
		System.out.println("Heads percentage ="+headpercentage);
		System.out.println("Tails percentage ="+(tail/flip)*100);
		
	}
	//************************************ Leap year**********************************
	public static void LeapYear(String year) {
		        //int year = 1900;
		        boolean leap = false;
		       if(year.length()<4) {
		    	   System.out.println("Year should be four digit");
		       }
		       else {
		    	int yer = Integer.parseInt(year);	
		    	if((yer % 400 == 0) || ((yer % 4 == 0) && (yer % 100 != 0))) {
					System.out.println("Year " + yer + " is a leap year");
		    	} 
				else
					System.out.println("Year " + yer + " is not a leap year");
			}
			       
		       }
	
		        
	//**********************Power of 2*******************************
	public static void poweroftwo(int n) {
		double two=2;
		if(n<31) {
        for(double i=1; i <= n; i++) {
        	System.out.println(Math.pow(two, i));
        }
		}
		else {
			System.out.println("2^31 overflows ");
		}
			
		}
	
//***************************** Harmonic ***************************
	public static void harmonic(int n) {
		float sum=0;
		int i;
		for(i=1;i<=n;i++) {
			sum += 1.0 / i;
		
		
	}
		System.out.println(sum);
	}
//******************************Factors*******************************
	public static void pfactors(int num) {
        // TODO Auto-generated method stub
        

        
        for (long factor = 2; factor*factor <= num; factor++) {

            // if factor is a factor of n, repeatedly divide it out
            while (num % factor == 0) {
                System.out.print(factor + " ");
              num = (int) (num / factor);
            }
        }

        // if biggest factor occurs only once, n > 1
        if (num > 1)
            {System.out.println(num);}
        else       {
        	System.out.println();}
    }
//******************************Gambler**********************************
	public static void gambler(int stake,int trial,int goal) {
		int wins=0;
		int bet=0;
		int cash=stake;
		while(cash>0&&cash<goal) {
			bet++;
			if (Math.random()<0.5) {
				cash++;
			}
			else {
				cash--;
			}
		if(cash==goal) {
			wins++;
		}
		
		}
		System.out.println(wins + " wins of " + trial);
        System.out.println("Percent of games won = " + 100.0 * wins / trial);
        System.out.println("Avg # bets           = " + 1.0 * bet / trial);
	} 
//**********************************Coupon***********************************
	
	public static void coupoun() {
		char[] chars="0123456789".toCharArray();
		int max=1000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode); 
	}

	




//**************************************Triplets*****************************************
	public static void triplets(int a[],int n_length) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Number of elements");
		
		boolean found = true; 
	    for (int i=0; i<n_length-2; i++) 
	    { 
	        for (int j=i+1; j<n_length-1; j++) 
	        { 
	            for (int k=j+1; k<n_length; k++) 
	            { 
	                if (a[i]+a[j]+a[k] == 0) 
	                { 
	                    System.out.print(a[i]); 
	                    System.out.print(" "); 
	                    System.out.print(a[j]); 
	                    System.out.print(" "); 
	                    System.out.print(a[k]); 
	                    System.out.print("\n"); 
	                    found = true; 
	                } 
	            } 
	        } 
	    } 
}
	//*****************Euclidien ******************************
	public static void euclidien(int x,int y ){
		
		//double a=;
		double r=(x*x)+(y*y);
				
		double distance=Math.pow(r, 0.5);
		System.out.println("Euclidien distance between points "+x+" "+y);
		System.out.println(distance);
	}
//********************Quadratic****************************
	public static void quadratic(int a,int b,int c) {
		double delta = b*b-4*a*c;
				//Root 1 of x = (­b + sqrt(delta))/(2*a)
			//double r1=(-b+Math.sqrt(delta))/(2*a);
						//Root 2 of x = (­b ­ sqrt(delta))/(2*a);
			//double r2=(-b-Math.sqrt(delta))/(2*a);
		double r1=(-b + Math.sqrt(delta))/(2*a);
        double r2=(-b - Math.sqrt(delta))/(2*a);
			System.out.println("Root 1 of x :"+r1);
			System.out.println("Root 2 of x :"+r2);
	}
//**************************Wind Chill *******************************
	
	public static void wind(double t,double v) {
		if(t<=50 || v>120 || v<3) {
		double w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v, 0.16));
		System.out.println("Wind Chill :"+w);
	}
		else {
			System.out.println("Incorrect Parameters");
		}
		}
	
}
