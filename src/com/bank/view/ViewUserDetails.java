package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.bank.model.User;



public class ViewUserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\VJIT\\\\Desktop\\\\CapgPrograms\\\\BankListObjects.txt");
			ObjectInputStream in = new ObjectInputStream(f1);
			ArrayList<User> al = (ArrayList<User>)in.readObject();
			
			User u = new User();
			u = al.get(1);
			
			System.out.println(u.getFirstName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
