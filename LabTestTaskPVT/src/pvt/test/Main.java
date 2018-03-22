package pvt.test;

public class Main {

	public static void main(String[] args) {
		Dancer dancer = new Dancer();
		dancer.setDancerSequance(new DataInput().sequenceReading());
		System.out.println(dancer.dance());
	}

}
