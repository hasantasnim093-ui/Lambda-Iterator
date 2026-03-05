package folder;

import java.util.ArrayList;
import java.util.Iterator;

interface additer{
	int add(int a,int b);
}
interface additerDouble{
	double add(double a,double b);
}



interface print{
	void forEach(int num);
}
interface printSuffix{
	void forEach(String prefix);
}
interface space{
	void printSpace();
}
interface DoubleSpace{
	void printSpace();
}
interface TripleSpace{
	void printSpace();
}
interface printHi{
	void print();
}
interface greeting {
	void printGreet();
}
interface friend {
	void printGreetFriend();
}









public class lambdaFunction {
	static void printHi(String name){
		printHi h = () -> System.out.println(name + " hi" ); 
		h.print();
	}
	static void greetings(String name) {
		greeting g = () -> System.out.println(name + " ,greetings!!!");
		g.printGreet();
	}
	static void greetingsToFriend(String name) {
		friend f = () -> System.out.println(name + " ,greetings!!! best friend");
		f.printGreetFriend();
	}
	
	
	
	
	
	static void printSpace() {
		space s = () -> System.out.println();
		s.printSpace();
	}
	static void printDoubleSpace() {
		DoubleSpace s = () ->
			 System.out.println(); System.out.println();
		
		s.printSpace();
	}
	static void printTripleSpace() {
		TripleSpace s = () ->
			 System.out.println(); System.out.println();System.out.println();
		
		s.printSpace();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(19);list.add(50); list.add(20);list.add(23);list.add(87);list.add(1);list.add(6);
		
		listPrint(list);
		
		
		printadditer(6,7 , list);

	}
	


static void listPrint(ArrayList<Integer> list){
	list.forEach(num -> System.out.println(num));
	
	System.out.println();System.out.println("Iterator");
	
	Iterator<Integer> it = list.iterator();
	
	while(it.hasNext()) {
		Integer element = it.next();
		System.out.println(element);
	}
	

}
static void printSuffix(String word, ArrayList<String> list) {
	printSuffix p = (prefix) -> System.out.println(prefix+" "+word);
	p.forEach("son");
	
Iterator<String> it = list.iterator();
	
	while(it.hasNext()) {
		String element = it.next();
		if(element.equalsIgnoreCase(word)) {
			System.out.println(p + " " +word);
		}
	}
	
}
static void printPrefix(String word, ArrayList<String> list) {
	printSuffix p = (Suffix) -> System.out.println(word + " " + Suffix);
	p.forEach("friend");
Iterator<String> it = list.iterator();
	
	while(it.hasNext()) {
		String element = it.next();
		if(element.equalsIgnoreCase(word)) {
			System.out.println(word + " " + p);
		}
	}
	
}
static void printadditer(int a , int b, ArrayList<Integer> list) {
	additer add = (a1,b1) -> a1+b1;
	System.out.println(add.add(a, b));
Iterator<Integer> it = list.iterator();

	while(it.hasNext()) {
		Integer element = it.next();
	   
		if(element == a) {
			System.out.println(element + b);
			break;
		}
		
		if(element == b) {
			System.out.println(element + a);
			break;
		}
	
		
		
	}
	
}
static void printadditerDouble(Double a , Double b, ArrayList<Double> list) {
	additerDouble add = (a1,b1) -> a1+b1;
	System.out.println(add.add(a, b));
Iterator<Double> it = list.iterator();

	while(it.hasNext()) {
		Double element = it.next();
	   
		if(element == a) {
			System.out.println(element + b);
			break;
		}
		
		if(element == b) {
			System.out.println(element + a);
			break;
		}
	
		
		
	}
	
}







	
	
	
	
	
	
	
	

}
