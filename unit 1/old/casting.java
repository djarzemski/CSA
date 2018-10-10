import javax.swing.JOptionPane;
import java.io.*;

public class casting{
    public static void main(String[] args){
        String message1 = "x= "; 
        Double b = 0.0;
        try{
        b =  Double.parseDouble((JOptionPane.showInputDialog(message1)));
        } catch(NumberFormatException e){
            System.out.println("Something is wrong! " + e.getMessage());
        }

        System.out.print(3.0==b*(3.0/b));
    }
}