package LearningStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListExample {

	public static void main(String[] args) {
		Person nav = new Person("Navjot",25);
		Person deep = new Person("Kuldeep",24);
		Person man = new Person("Daman",29);
		Person vir = new Person("Manvir",34);
		List<Person> list = Arrays.asList(nav,deep,man,vir);
//		Stream<Person> streamList = Stream.of(nav,deep,man,vir);

		String name = getName(list, "j");
		System.out.println(name);

	}
	
	
	public static void getNameWithStream(Stream<Person> stream,String name) {
//		String pName = null;
	}
	
	
	
	
	
	//Using List
	public static String getName(List<Person> list,String name ) {
		String pName = null;
		for (Person person : list) {
			if(person.getName().contains(name)) {
				pName = person.getName();
			}
		}
		return pName;
	}
}
