//Name : Dipak Mohite
//Roll : 236
//Class : DSY-Computer

class Assignment9
{
	public static void main(String args[])
	{
		try {
			//can't devide by Zero
			int a = 10, b = 0;
			int c = a/b;
			System.out.println ("Result = " + c);
		}
		catch(ArithmeticException e) {
			System.out.println ("Can't divide a number by 0");
		}
		try {
			//String Index Out of Bounds
            String a = "Welcome to MIT ACADEMY OF ENGINEERING";
            char c = a.charAt(50);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
		
		try {
            // "Dipak" is not a number
            int num = Integer.parseInt ("Dipak");
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
		 try{
			//Array Index Out of Bounds
            int a[] = new int[10];
            a[15] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
	}
}
