package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculating sum ofArrays
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("Sum of Array:"+sum);
		int sum1=0;
		//Reading Input
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Size of an Array:");
		int size=input.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements of an Array");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
			sum1=sum1+arr[i];
		}
		System.out.println("Array Elements:"+Arrays.toString(arr));
		System.out.println("The sum Of Array Elements is:"+sum1);
		
		
		
		//Array list
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.remove(0);
		    System.out.println("ArrayList"+cars);
		}
	}


