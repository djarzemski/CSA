import javax.swing.JOptionPane;

public class fib
{
	public static void main(String[] args) {
        long a = 0L;          //ints for fibonacci sequence algorithm
        long b = 1L;
        long c;

        String q = "How many fibonacci numbers should I print?";    //asking for amount of numbers
        int x = Integer.parseInt(JOptionPane.showInputDialog(q));

        System.out.println(1);      //print the first fibonacci number
        for(int d = 1; d <x; d++){      //algorithm
            c = a + b;                  //generate the fibonacci number
            System.out.println(c);      //print it

            a = b;                      //second number becomes the first one
            b = c;                      //third number becomes the second one
        }
	}
}