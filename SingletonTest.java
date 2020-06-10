package no5;

public class SingletonTest {

	public static void main(String[] args)
	{
	Renban renbanA = Renban.getInstance();
	Renban renbanB = Renban.getInstance();

	System.out.println(renbanA.getNumber());
	System.out.println(renbanB.getNumber());
	System.out.println(renbanB.getNumber());
	System.out.println(renbanA.getNumber());
	System.out.println(renbanB.getNumber());

	}
}

class Renban{

	private static Renban renban = new Renban();

	int n = 0;

	public static Renban getInstance(){
		return renban;
	}

	public String getNumber(){

		n++;
		String aa = String.format("%04d", n);
		if(n < 10000) {
			return aa;
		}
		return "err";
	}

}