/*
Write a Java program to show that private member of a super class cannot be accessed from
derived classes.
*/

class MySuperClass{
	private int secretKey = 10;

	void printSecretKey(){
		System.out.println(secretKey);
	}
}

class MyDerivedClass extends MySuperClass{

	void changeSecretKey(){
		secretKey = 11;
	}
}

public class PrivateIsPrivate{

	public static void main(String args[]){

		MyDerivedClass obj = new MyDerivedClass();
		System.out.println(obj.secretKey);
		obj.changeSecretKey();
	}
}