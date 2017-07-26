package fizzBuzz;

public class FizzBuzz {
	public static void main(String[] args){
		for(int i = 0; i <= 100; i ++){

			output(i);
		}
	}

	public static void output (int input){
		if(input%3 ==0 && input%5 ==0){
			System.out.println("fizzbuzz");
		}else if(input%3==0){
			System.out.println("fizz");
		}
		else if(input%5==0){
			System.out.println("buzz");
		}else{
			System.out.println(input);
		}
	}
}