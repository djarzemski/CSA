import javax.swing.JOptionPane;

public class file3
{
	public static void main(String[] args) {
        String message1 = "Tell me the time of the free fall: "; 

        double t =  Double.parseDouble((JOptionPane.showInputDialog(message1)));
        double g = 9.80655;
        double d = t*t*g/2;

        System.out.println("Distance: " + d);
	}
}