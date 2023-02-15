package com.controller;


import com.info.controllerinfo;
import com.deo.Deo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.Bean.bean;

public class Controller implements controllerinfo{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Controller co = new Controller();
		do {
		System.out.println("\n\nEnter your  choise:\n");
		System.out.println(" 1.To Retrive a Student Details \n 2.To Retrive all Studen Details\n 3.Insert\n 4.Update\n 5.Delete\n");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:co.oneStudent();
		break;
		case 2:co.allStudent();
		break;
		case 3:co.insertStudent();
		break;
		case 4:co.updateStudent();
		break;
		case 5:co.deleteStudent();
		break;
		default:System.out.println("\n\nInvalid: Please enterq valid choise!!!\n\n");
		}
		}while(true);
	}

	@Override
	public void oneStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll No:\n");
		int oneUser=sc.nextInt();
		Deo deo = new Deo(); bean be= null;
		try {
			be = deo.OneStu(oneUser);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Roll_no:"+be.rule_no+" Name:"+be.name);
		
	}

	@Override
	public void allStudent() {
	Deo deo = null;
	deo = new Deo();
	bean be=null;
	ArrayList<bean> arr= null;
	System.out.println("\nAll Student Details:\n");
	try {
		arr=deo.allStu();
		Iterator<bean> it =arr.iterator();
		while(it.hasNext()) {
			be=it.next();
			System.out.println("Roll_no:"+be.rule_no+" Name:"+be.name);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	private Deo Deo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertStudent() {
		Scanner sc = new Scanner(System.in);
		Deo  deo =  new Deo();
		System.out.println("Enter roll no and name\n");
		int roll_no=sc.nextInt();
		String name=sc.next();
		try {
			deo.insertStu(roll_no , name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void updateStudent() {
		
		Scanner sc = new Scanner(System.in);
		Deo  deo =  new Deo();
		System.out.println("Enter roll no as primary key");
		int roll_no=sc.nextInt();
		System.out.println("Enter name to  update\n");
		String name=sc.next();
		deo.updateStu(name, roll_no);
	}

	@Override
	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		Deo  deo =  new Deo();
		System.out.println("Enter roll noto  delete\n");
		int roll_no=sc.nextInt();
		deo.deleteStu(roll_no);

		
	}
}
