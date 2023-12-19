class Triangle {
public static void main(String args[]) {
	Integer a = Integer.parseInt(args[0]);
	Integer b = Integer.parseInt(args[1]);
	Integer c = Integer.parseInt(args[2]);

	Boolean result = (((a+b)>c) && ((a+c>b)) && ((b+c)>a));
	
		System.out.println(a + ", " + b + ", " + c + ": " + result);

}
}