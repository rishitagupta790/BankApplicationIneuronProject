package com.iNeuron;

import java.sql.SQLException;
import java.util.Scanner;

class DbConnector {
	int id = 1;
	String pass = "Password";

	public int getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

}

class Access {
	Integer userId;
	String userPass;
	Scanner scan;

	void access() throws SQLException {
		DbConnector db = new DbConnector();
		scan = new Scanner(System.in);
		DbConnector ba = new DbConnector();
		System.out.println("Enter your id :: ");
		userId = scan.nextInt();
		System.out.println("Enter your Password :: ");
		userPass = scan.next();

		int id = ba.getId();
		System.out.println(id +" you detail "+ userId );// for checking 1
		
		String pass = ba.getPass();

		if (id == userId && pass.equals(userPass)) {
			System.out.println("Welcome \nStart your Further Procedure");

			ShowView sv = new ShowView();
			sv.display();

		} else {
			System.err.println("Wrong Password");

			System.err.println("\nTRY AGAIN");

		}

	}
}

public class BankApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Access ac = new Access();
		ac.access();

	}

}
