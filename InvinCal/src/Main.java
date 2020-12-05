import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("===============================================================");
		System.out.println("                        InvinCal �W�ŭp���                       ");
		System.out.println("===============================================================");                                                         
		System.out.println("  Avaliable Functions ���m�ƾǨ��:                                ");
		System.out.println("      1. reciprocal(x) �˼�       2. negative(x) �t��             ");
		System.out.println("      3. factorial(x) ����        4. combination(n,r) �զX        ");
		System.out.println("      5. pow(x,y) ����            6. pow10(x) �Q������              ");
		System.out.println("===============================================================");
		
		
		String string = "";
		
		while(!string.equals("exit"))
		{
			Scanner s = new Scanner(System.in);
			
			System.out.print("Input: ");
			
			string = s.nextLine();
			
			if(!string.equals("exit"))
			{
				Element e = Interpreter.interpret(Standardizer.standardize(string));
				
				System.out.println("Answer: " + e.getValue());
			}
			
			System.out.print("\n");
		}
			
	}
}
