import javax.swing.JOptionPane;

public class testcomparison
{
	public static void main(String[] args) {
        String x = "type!";
    
        String a = "a";
   //     a = JOptionPane.showInputDialog(x);

        if (a == "a"){
            a = "empty";
        }else{
            a = "failed";
        }
        JOptionPane.showMessageDialog(null, a);
	}
}