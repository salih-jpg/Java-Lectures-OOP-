package jar;

public class Main {

	public static void main(String[] args) {
		Jar myJar = new Jar(10);
		myJar.openLid();
		myJar.addMarbel(5);
		myJar.addMarbel(5);
		myJar.addMarbel(1);
		myJar.closeLid();
		myJar.remove(10);
		myJar.openLid();
		myJar.remove(10);
	}

}
