package Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		//나이 값으로 오름차순으로 자동 저장됨.
		treeSet.add(new Person("베컴", 45));
		treeSet.add(new Person("메시", 25));
		treeSet.add(new Person("리알", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) { 
			Person person = iterator.next();
			System.out.println(person.name + ":"+ person.age);
			
		}

	}

}
