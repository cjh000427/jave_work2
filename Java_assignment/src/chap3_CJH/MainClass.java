package chap3_CJH;

public class MainClass {

	public static void main(String[] args) {
		
		Product tv = new Tv();
		Product radio = new Radio();
		Product com = new Computer();
		
		MyCart c = new MyCart(2100);
		
		c.buy(tv);
		c.buy(radio);
		c.buy(com);
		
		c.info();
		
		MyCart a = new MyCart(1500);
		
		a.buy(tv);
		a.buy(radio);
		a.buy(com);
		
		a.info();
	}

}