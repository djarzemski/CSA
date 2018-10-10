import javax.swing.JOptionPane;

/**
 * This is a dumb-proof version of the staircase problem. And yes, I made a typo in the name of the function and I like it that way.
 * I know I can change it, but it would loose its charm.
 */
/**
 * are you also dumbproof? :))))))
 * bc i think you are
 */
public class starcase
{
	public static void main(String[] args) {
        int numberOfStairs = getTheValue(); //how many stairs should I print?
        for(int a = 1; a<=numberOfStairs; a++){ //printing each line
            printTheLine(a, numberOfStairs);
        }
	}



/**
     * Asks for an integer
     *  @return Number of stairs.
     */
    public static int getTheValue(){
        boolean repeat = false;
        int a = 0;                  //our returning value
        while(repeat == false){     //will repeat until we have the correct value
            try{                    //try to get the proper value
                String message = "How many stairs should I type?";
                a = Integer.parseInt(JOptionPane.showInputDialog(message));
                if(a < 1){          //if negative, throw an exception
                    throw new NumberFormatException(" Your number has to be positive. I cannot print out negative number of stairs!");
                }
                repeat = true;

            }catch(NumberFormatException q){    //print out the error and run the loop again
                    String message0 = "Wrong number format! Try again!" + q.getMessage();
                    JOptionPane.showMessageDialog(null, message0);
                    repeat = false;

                    }
                }
            return a;
    }

    /**
     * 
     * @param a Defines how many stairs should be printed in this line.
     * @param z Defines what is the total amount of stairs.
     */
    public static void printTheLine(int a, int z){
        for(int x = z; x>a; x--){
            System.out.print(" ");
        }
        for(int q = 0; q<a; q++){
            System.out.print("#");
        }
        System.out.println();
    }
    
}
    

