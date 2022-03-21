import java.util.Scanner;

public class ProgramForDemo {

	public static void main(String[] args) {
	  Demo d=new Demo();
	  d.name="Udit";
	  d.age=21;
	  d.printValue(d.name);
	  d.printValue(d.age);
	}
	}

 class Demo{
	String name;
	int age;
	
	public  void printValue(String name) {
//		System.out.println(this.name+ " "+this.age);
		System.out.println(name);
	}
	public  void printValue(int age) {
//		System.out.println(this.name+ " "+this.age);
		System.out.println(age);
	}

}