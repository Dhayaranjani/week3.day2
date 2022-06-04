package week3.day2.Assignment1;
/*Assignment1: on Abstraction
===========
Interface :Language
     Methods   :Java()
Interface :TestTool
     Methods   :Selenium()
AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/

//Automation class Inherits the MutilpleLanguage class 
public class Automation extends MultipleLangauge{

	public static void main(String[] args) {
		Automation myAuto = new Automation();
		myAuto.Java();
		myAuto.Selenium();
		myAuto.python();
		myAuto.ruby();
	}

	public void Java() {
		System.out.println("This is method Java");
	}

	public void Selenium() {
		System.out.println("This is method Selenium");	
	}

	@Override
	public void ruby() {
		System.out.println("This is method Ruby");
		
	}

}
