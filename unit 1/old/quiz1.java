public class quiz1
{
	public static void main(String[] args) {
        int radiusx = 4;
        int weightx = 80;
        int heightx = 180;
        int v = 230;
        int r = 10;
        boolean a = true;
        boolean b = false;


        double circumference = radiusx*2*Math.PI;
        double bmi = weightx/(Math.pow(heightx, 2));
        double ohm = (double)(r/v);
        boolean result = !a && ((a&&b)||!b);

        System.out.println("circumference: " + circumference);
        System.out.println("bmi " + bmi);
        System.out.println("A: " + ohm);
        System.out.println("the statement has the result: " + result);
	}
}