package fizzBuzz;

public class FizzBuzz {
	public static void main(String[] args){
		/**
		*This is an application that displays "Fizz" for multipliers of 3, "Buzz" for 5, "Copy" for 2" and "cat" for 10
		**/
		int i = 1;
		String output=null;
		do{
			boolean printNumber = true;
			output="";
			if(i%2==0){
				output+="Copy";
				printNumber = false;
			}
			if(i%3==0){
				output+="Fizz";
				printNumber = false;
			}
			if(i%5==0){
				output+="Buzz";
				printNumber = false;
			}
			if(i%10==0){
				output+="Cat";
				printNumber = false;
			}
			if(printNumber == true){
				output = String.valueOf(i);
			}
			System.out.println(output);
			

			i++;
		}while(i < 101);
	}


}