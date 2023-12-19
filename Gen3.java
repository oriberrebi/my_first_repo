import java.util.concurrent.ThreadLocalRandom;

class Gen3 {
public static void main(String args[]) {
	Integer a = Integer.parseInt(args[0]);
	Integer b = Integer.parseInt(args[1]);

	Integer random_number1 = ThreadLocalRandom.current().nextInt(a,(b-1));
	Integer random_number2 = ThreadLocalRandom.current().nextInt(a,(b-1));
	Integer random_number3 = ThreadLocalRandom.current().nextInt(a,(b-1));
	
	Integer min_num1 = Math.min(random_number1, random_number2);
	Integer min_num2 = Math.min(random_number2, random_number3);

	Integer min_num = Math.min(min_num1, min_num2);

		System.out.println(random_number1);
		System.out.println(random_number2);
		System.out.println(random_number3);
		System.out.println("The minimal generated number was " + min_num);
}
}