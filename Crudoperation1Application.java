package com.example.demo;
import java.util.ArrayList;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Crudoperation1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Crudoperation1Application.class, args);
		Scanner s=new Scanner(System.in);
		int ch;
		Operation o=new Operation();
		do {
			System.out.println("1. INSERT");
			System.out.println("2. READ");
			System.out.println("3. DELETE");
			System.out.println("4. UPDATE");
			System.out.println("0. STOP");
			System.out.print("Enter the code to perform operation: ");
			ch=s.nextInt();
			
			switch(ch) {
			case 1: o.addData();
				System.out.println("----------------");
			break;
			case 2: o.readData();
				System.out.println("----------------");
			break;
			case 3: o.deleteData();
				System.out.println("----------------");
			break;
			case 4: o.updateData();
				System.out.println("-----------------");
			break;
			
			}
		}while(ch!=0);
			
		}
	}
