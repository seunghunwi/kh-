
public class A {
	private String n;
	private int k;
	private int e;
	private int m;
	
	 public A(String n, int k, int e, int m) {
		 
		 this.n = n;
		 this.k = k;
		 this.e = e;
		 this.m = m;
		  }

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	public int s() {
		return k + e + m;
		
	}
	public double x() {
		return (k + e + m) /3;
		
	}

}
