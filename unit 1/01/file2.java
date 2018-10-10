public class file2
{
	public static void main(String[] args) {
        String x = "123";
        String y = "3.0936";

        int i = Integer.parseInt(x);
        short s = Short.parseShort(x);
        double d = Double.parseDouble(y);

        System.out.println(i + "; " + s + "; " + d);
	}
}