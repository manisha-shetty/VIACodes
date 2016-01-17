/* introduce exclubmember later
 */ 

package com.corejava.module9;
 

import java.io.IOException;
import java.util.Date;


public class ClubMember {

	int id;
	String name;
	int age;
	static int count=0;
	
	void register(String n, int a) throws UnderAgeException, IOException{
		if(a<18)
				throw new UnderAgeException(a);
		id=++count;
		name=n;
		age=a;
		System.out.println("You are a member now!");
		login();
		
	}
	
	void login() throws IOException{
		System.out.println("Please wait.. we are verifying .. You are logged in");
		//throw new IOException();
		//throw new ArithmeticException();
	}
	
	
	
	public static void main(String[] args) {
		ClubMember cm=new ClubMember();
		ExClubMember ecm=new ExClubMember();

		try {
			cm.register("manisha",25);
			ecm.login(); 
		} catch(ArithmeticException e){
			System.out.println("Caught Arithmetic exception");
		}catch (UnderAgeException e) {
			e.disallow();
		} catch (IOException e) {
			System.out.println("Caught IO exception");
		}
		
	}

}


class ExClubMember extends ClubMember{
	Date leftDate;
	
	void login()throws IOException{
		System.out.println("Sorry you are an ex member");
		
	}
}