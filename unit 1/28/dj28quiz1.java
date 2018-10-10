import javax.swing.JOptionPane;

public class dj28quiz1
{
	public static void main(String[] args) {
		String message1 = "Lower barrier"; 				//getting boundaries
		int lower =  Integer.parseInt((JOptionPane.showInputDialog(message1)));
		
		message1 = "Higher barrier"; 
		int higher =  Integer.parseInt((JOptionPane.showInputDialog(message1)));

		if(lower<higher){		//check if I can write anything
		for(int y = lower; y<=higher; y++){
			checkIfPrime(y);
		}
		}else{
			System.out.println("Cannot write anything, wrong interval!");
		}
}

public static void checkIfPrime(int q){		//checking if prime
	int z = q;
	int a = 0;
	boolean isPrime=true;
	for(int p = 2; p<z; p++){		//check each number from 2 to x-1 if it can be divided by x (if it's prime)
		a = z%p;
		if(a==0){
			isPrime = false;
		}
	}
	if(isPrime==true){System.out.println(q);
	}

	}
}