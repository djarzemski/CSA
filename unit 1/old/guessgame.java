import javax.swing.JOptionPane;

public class guessgame
{
	public static void main(String[] args) {
        String message0 = "Define the upper bound: ";  //making an upper bound
        
        int q = 0;
        boolean shouldIRepeat = false;
        while(shouldIRepeat == false){
        try{
            q = Integer.parseInt((JOptionPane.showInputDialog(message0)));
            if(q<1){
                throw new NumberFormatException(" For this game, the number has to be positive. The range of the generated number is from zero to your upper bound");
            }
            shouldIRepeat = true;
        }catch(NumberFormatException e){
            message0 = "Wrong number format! Try again!" + e.getMessage();
            JOptionPane.showMessageDialog(null, message0);
            shouldIRepeat = false;
            message0 = "Define the upper bound: ";
        }
    }
        int x = (int)(Math.random()*q +1);  //generating the random number
        int a = 0;

        for(int y = 1; y != 0; y++){    //running the game
            String message1 = "Guess the value: "; 
            a =  Integer.parseInt((JOptionPane.showInputDialog(message1)));
            if(y>9){    //checking if the player has not lost
                message1 = "You lost!"; 
                JOptionPane.showMessageDialog(null, message1);
                break; 
            }else if(a<x){  //if it's too small
                message1 = "My number is higher. Guess again"; 
                JOptionPane.showMessageDialog(null, message1);
            }else  if(a>x ){   //if it's too big
                message1 = "My number is lower. Guess again"; 
                JOptionPane.showMessageDialog(null, message1);

            }else if(a==x){ //when you win
                message1 = "You won! Attempts: "; 
                JOptionPane.showMessageDialog(null, message1 + y);
                break; 
            }
         }
	}
}