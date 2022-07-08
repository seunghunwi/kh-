package IsAKindOf;

@SuppressWarnings("hiding")
public class Stack<String> extends Vector<String>{
   private  Vector<String> vec = this;
   
   void add(String name)	{
	   push(name);
   }
   public void remove(String a) {
	   remove(a);
   }
}
