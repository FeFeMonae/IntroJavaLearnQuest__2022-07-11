package exp;

public class Runner {

	public static void main(String[] args) throws Exception {
		Tester t = new Tester();
		try {
			//code to open file
			t.f();
			
		} catch (MyException2 e) {
			System.out.println(e);
			
		} catch (Exception e) {
			System.out.println("Caught unknows exception " + e);
			
		}  finally {
			// code to close file
			System.out.println("Finally");
		}
  
       }
}
class Tester {
	
	void f() throws MyException2, Exception {

		
		System.out.println("I'm function tester.f()");
		//throw new Exception("This a message");
	}

}

class MyException1 extends Exception{}
class MyException2 extends Exception{};
class MyUncheckedException extends RuntimeException{}
