public class programtest1
{
    public static void main(String Args[]){
        double x=2;
        double sum=0;
        double z=0;

        for(double y=0; y<64; y++){
            z=Math.pow(x, y);
            System.out.println(z);
            sum = sum + z;
        }

        System.out.println();
        System.out.println("sum: " + sum);
    }
}