package NewInstance;

public class NEwInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("NewInstance.ReceiveAcion");
			Action action = (Action)clazz.newInstance();
			action.execute();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}



	}

}
