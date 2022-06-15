
public class B {

	public static void main(String[] args) {
		 
		A[] sd = new A[10];
		
		sd[0] = new A("홍길동", 100, 200, 30);
		sd[1] = new A("홍길동", 100, 200, 30);
		sd[2] = new A("홍길동", 100, 200, 30);
		sd[3] = new A("홍길동", 100, 200, 30);
		sd[4] = new A("홍길동", 100, 200, 30);
		sd[5] = new A("홍길동", 100, 200, 30);
		sd[6] = new A("홍길동", 100, 200, 30);
		sd[7] = new A("홍길동", 100, 200, 30);
		sd[8] = new A("홍길동", 100, 200, 30);
		sd[9] = new A("홍길동", 100, 200, 30);
		
		for(A A : sd) {
			 System.out.println(A.getN() +"\t"+ A.getK()+"\t" + A.getE()+"\t" + A.getM()+ "\t" + "|"+"\t" + A.s()+"\t" + A.x());			
		}
		

	}

}
