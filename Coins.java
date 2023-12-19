class Coins {
public static void main(String args[]) {
	Integer a = Integer.parseInt(args[0]);

	Integer num_quar = (a/25);
	Integer cents = (a%25);
		System.out.println("Use " + num_quar + " quarters " + "and "+ cents + " cents ");
}
}