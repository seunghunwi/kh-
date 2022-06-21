package Exception;

public class AccountExample {

	public static void main(String[] args) {
        Account a = new Account();
        //예금하기
        a.deposit(100000);
        System.out.println("예금액"+ a.getbalance());
        //출금하기
        try {
        	a.withdraw(30000);
        	
        }catch (BalanceinsufficientException e) {
			String m = e.getMessage();
			System.out.println(m);
			System.out.println();
			e.printStackTrace();
		}

	}

}
