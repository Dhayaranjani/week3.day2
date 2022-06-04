package week3.day2.Assignment1;

/*AbstractClass :MultipleLangauge
Methods   :python() and unimplemented method as ruby()*/

//Here abstract class impletements the Interface Language, TestTool
public abstract class MultipleLangauge implements Language,TestTool{

	public void python() {
		System.out.println("This is the method Python");
	}
	
	public abstract void ruby(); //unimplemented method
		
}
