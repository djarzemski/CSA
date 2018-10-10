import javax.swing.JOptionPane;

public class printinglines
{
	public static void main(String[] args) {
        String q = "";          //asking for the size of the grid
        int x = Integer.parseInt(JOptionPane.showInputDialog(q));

        int z = x;              //back-up initial value
        int y;                  //variable for loops

        while(x>0){
            x--;
            for(y = z-x; y>0; y--){         //printing +
                System.out.print("+");
            }
            for(y = x; y>0; y--){           //printing *
                System.out.print("*");
            }
            System.out.println();
        }
	}
}