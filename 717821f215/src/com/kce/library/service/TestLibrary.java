package com.kce.library.service;
// name, int age, String email, String userId
import com.kce.library.bean.*;
import java.util.*;

import com.kce.library.dao.DBConnectivity;

public class TestLibrary {
 public static void main(String[] args) {
	 try {
	Scanner in=new Scanner(System.in);
	System.out.println("\t\t\tWelcome to Library Management System\t\t\t\n");
	while(true) {
		System.out.println("Press 1 for Library details");
		System.out.println("Press 2 for User details");
		System.out.println("Press 3 for MemberShip details");
		int n=in.nextInt();
	switch(n) {
	case 1:
		while(true) {
			System.out.println("press 1 to Add books");
			System.out.println("press 2 for Ordering the Books");
			System.out.println("press 3 for updating the book details");
			System.out.println("press 4 to viewing book");
			int a=in.nextInt();
			switch(a) {
			case 1:
				System.out.println("Please enter Book details: ");
				System.out.println("Enter Book Id: ");
				int bid=in.nextInt();
				in.nextLine();
				System.out.println("Enter Book Name: ");
				String bname=in.nextLine();
			    System.out.println("Enter Book Author: ");
			    String bAuthor=in.nextLine();
			    System.out.println("Enter Book Genre: ");
			    String bgenre=in.nextLine();
			    System.out.println("Enter cost of Book: ");
			    int bcost=in.nextInt();
			    LibraryBean book=new LibraryBean(bname,bid,bAuthor,bgenre,bcost);
			    if(DBConnectivity.addBooks(book)) {
			    	System.out.println("\nBook details added successfully");
			    }
			    else {
			    	System.out.println("\n Book details already exists");
			    }
			    break;
			case 2:
				System.out.println("Ordering the books");
				System.out.println(DBConnectivity.OrderBooks());
				break;
			case 3:
				System.out.println("Updating details: ");
                System.out.println("Enter a number: ");
                int z=in.nextInt();
				DBConnectivity.updateBook();
			case 4:
				System.out.println("Viewing the Book");
				List<LibraryBean> list=new ArrayList<>();
	              list=DBConnectivity.viewBook();
	              for(LibraryBean u:list) {
	            	  System.out.println(u);
	              }
		}
		}
	case 2:
		while(true) {
			System.out.println("press 1 to Add users");
			System.out.println("press 2 for Viewing the users");
			System.out.println("press 3 to update User details");
			System.out.println("press 4 to order users based on their name");
			int s=in.nextInt();
			switch(s) {
			case 1:
		System.out.println("User details");
		System.out.println("Enter User Id: ");
		String userId=in.nextLine();
		in.nextLine();
			System.out.println("Enter the User Name: ");
		String Uname=in.nextLine();
	
	    System.out.println("Enter User age: ");
	    int Uage=in.nextInt();
	    System.out.println("Enter User email: ");
	    String Uemail=in.next();
	    System.out.println("Enter user Library Id: ");
	    String userId1=in.next();
	  UserLibrary use=new UserLibrary(Uname,Uage,Uemail,userId1);
	  if(DBConnectivity.UserDetails(use)) {
		  System.out.println("User details inseted successfully");
	  }
	  else {
		  System.out.println("User details already exists");
	  }
	  break;
			case 2:
				System.out.println("Viewing the Users");
				List<UserLibrary> list=new ArrayList<>();
              list=DBConnectivity.viewUsers();
              for(UserLibrary u:list) {
            	  System.out.println(u);
              }
               break;
			case 3:
				System.out.println("Updating details: ");
				DBConnectivity.UpdateUser();
			    break;
			case 4:
				System.out.println("Ordering the books");
				System.out.println(DBConnectivity.OrderUsers());
				break;
	}
		}
	case 3:
		while(true) {
			System.out.println("press 1 to Add members");
			System.out.println("press 2 to viewing members");
			System.out.println("press 3 to Update Details");
			System.out.println("press 4 to View Single Member");
			int b=in.nextInt();
			switch(b) {
			case 1:
				System.out.println("Please enter Member details: ");
				System.out.println("Enter Member Age: ");
				int mAge=in.nextInt();
				in.nextLine();
				System.out.println("Enter the Member Name: ");
				String mName=in.next();
				in.nextLine();
//				System.out.println("Enter Member Age: ");
//				int mAge=in.nextInt();
			    System.out.println("Enter Member Id: ");
			    String mId=in.nextLine();
//			    in.nextLine();
			    System.out.println("Enter Member Email: ");
			    String mEmail=in.nextLine();
			    System.out.println("Enter Annual Subcription: ");
			    int annualSub=in.nextInt();
			    MemberShipLibrarian member=new MemberShipLibrarian(mName,mAge,mId,mEmail,annualSub);
			    if(DBConnectivity.addMembers(member)) {
			    	System.out.println("\nMember details added successfully");
			    }
			    else {
			    	System.out.println("\n Member details already exists");
			    }
			    break;
			case 2:
				System.out.println("Viewing the Users");
				List<MemberShipLibrarian> list=new ArrayList<>();
              list=DBConnectivity.viewMembers();
              for(MemberShipLibrarian u:list) {
            	  System.out.println(u);
              }
	              break;
			case 3:
				System.out.println("Updating details: ");
				DBConnectivity.updateMember();
			      break;
			case 4:
				System.out.println("Viewing single member :");
				DBConnectivity.ViewSingleMember();
	}
	}
	}
	}
 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
}
}
