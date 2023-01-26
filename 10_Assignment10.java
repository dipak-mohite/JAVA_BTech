import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Assignment10 {
    static void validate(int age) throws MyException {
        if(age < 18) 
            throw new MyException("Not valid age");
        else
            System.out.println("Welcome to vote");
    }

    public static void main(String args[]) {
        try {
			for(int i = 0;i<5;i++){
				System.out.print("Enter your age = ");
				Scanner sc = new Scanner(System.in);
				int myAge = sc.nextInt();
				validate(myAge);
			}
        } catch (MyException m) {
            System.out.println("Exception occured: " + m);
        }
    }
}