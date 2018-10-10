import javax.swing.JOptionPane;
public class matrixaxb
{
	public static void main(String[] args) {
        String message1 = "Rows"; 
        int b =  Integer.parseInt((JOptionPane.showInputDialog(message1)));

        message1 = "Collumns:"; 
        int a =  Integer.parseInt((JOptionPane.showInputDialog(message1)));

        for(int i=0; i<b; i++){
            for(int q = 0; q < a; q++){
                System.out.print(i + "," + q + " ");
            }
            System.out.println();
        }
	}
}