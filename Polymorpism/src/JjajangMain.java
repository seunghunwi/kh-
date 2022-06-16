

public class JjajangMain {

	public static void main(String[] args) {
		Jjajang jj = new Jjajang("본점", "8,000원","8,000원","12,000원", "3,000원", "1000원");
		Jjajang jj1 = new JjajangOne("매장1호점", "7,000원","8,000원","12,000원", "판매하지 않음", "1000원");
		Jjajang jj2 = new JjajangTwo("매장2호점", "5,000원","5,000원","10,000원", "3,000원", "무료입니다");
		Jjajang jj3 = new JjajangThree("매장3호점", "7,000원","7,000원","12,000원", "3,000원", "1000원");
		
			
	jj.bon();
	jj1.bon();
	jj2.bon();
	jj3.bon();

}
}