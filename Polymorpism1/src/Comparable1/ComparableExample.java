package Comparable1;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
	  TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
	  //내림차순으로 자동으로 정렬됨
	  treeSet.add(new Fruit("포도",3000));
	  treeSet.add(new Fruit("수박",10000));
	  treeSet.add(new Fruit("딸기",6000));
	  
	  Iterator<Fruit> iterator = treeSet.iterator();
	  while(iterator.hasNext()) {
		  Fruit fruit = iterator.next();
		  System.out.println(fruit.name + ":" + fruit.price);
	  }
	  
	  

	}

}
