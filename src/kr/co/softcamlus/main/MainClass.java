package kr.co.softcamlus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldEn();
		callMethod(hello1);
		HelloWorld hello2 = new HelloWorldKo();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
