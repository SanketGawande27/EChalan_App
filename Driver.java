package com.echalanApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

import com.echalanApp.data.VehicleData;

public class Driver {

	Scanner sc = new Scanner(System.in);
 void VehicleInfo() {
		 String bike_no;
		 List<String> header = new ArrayList<String>();
		 header.add("Full Name : ");
		 header.add("Mobile No : ");
		 header.add("Bike No : ");
		 header.add("Type of Vehicle : ");
		 header.add("Address : ");
		 List<String> vehicle_data = new ArrayList<String>();
			
			vehicle_data.add("Sanket Gawande");
			vehicle_data.add("1234567890");
			vehicle_data.add("MH12AR1234");
			vehicle_data.add("2 Wheeler");
			vehicle_data.add("Pune, Maharashtra");
			//System.out.println(vehicle_data);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("|  Enter Bike no :    ");
			bike_no = sc.next();
			boolean result = vehicle_data.contains(bike_no);
			  if(result) {
				 /* for(int i=0;i<vehicle_data.size();i++) {
					  System.out.println(vehicle_data[i]);
				  }*/
				  System.out.println("|-------------------------------------");
				  System.out.println("|  Complete Information	");
				  System.out.println("|-------------------------------------");
				  //for(String headernames: header) {
					//  System.out.println(headernames);
					  
				  for(String name: vehicle_data ) {
					  System.out.println("|  "+name);
					  
				  }
				  System.out.println("|-------------------------------------");
				
			  }else {
				  System.out.println("No Data Found");
			  }
			
			}
	public void DueType() {
		 int without_healmate = 500;
		 int drinkanddrive = 1000;
		 int without_seatbalt = 500;
		 int overtake = 1000;
		 int overspeed = 500;
		 int fine=0;
		 boolean whilecondition = true;
		 
		 
		 System.out.println("|  1 for without_healmate 500 rs \n|  2 for drinkanddrive 1000 rs \n|  "
		 		+ "3 for without_setbalt 500 rs \n|  4 for overtake 1000 rs \n|  5 for overspeed 500 rs\n|  6 for Confirm Fine \n");
		 
		 while(whilecondition) {
		 int choice = sc.nextInt();
		 
		 switch (choice) {
		case 1:
			fine = fine+without_healmate;
			break;
			
		case 2:
			fine = fine+drinkanddrive;
			break;
		case 3:
			fine = fine+without_seatbalt;
			break;
		case 4:
			fine = fine+overtake;
			break;
		case 5:
			fine = fine+overspeed;
			break;
		case 6:
			System.out.println("|-------------------------------------");
			System.out.println("|       Total Fine of : " +fine + "rs/-");
			System.out.println("|-------------------------------------");
			whilecondition = false;
			break;
		default:
			System.out.println("Please Select Correct Choice");
			break;
			
		}
		 }
		 
	}
	public static void main(String[] args) {
		Driver d = new Driver();
		//VehicleData VD = new VehicleData();
		Scanner sc = new Scanner(System.in);
		final String username = "admin", password="admin111";
		String bike_no;
		System.out.println("|-------------------------------------");
		System.out.println("|        Welcome to Echalan App       ");
		System.out.println("|-------------------------------------");
		System.out.println("| Enter Credentails                   ");
		System.out.print("|  Username :  ");
		String user = sc.next();
		System.out.print("|  Password :  ");
		String pass = sc.next();
		
		if(user.equals(username) && pass.equals(password)) {
			
			d.VehicleInfo();
			System.out.println("|  Chanal List   ");
			d.DueType();
			
			
		}else {
			System.out.println("|  Invalid Username and Password  ");
		}
		

	}

}
