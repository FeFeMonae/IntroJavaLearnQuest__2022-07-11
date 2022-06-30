package calendar;

public class Runner {

	public static void main(String[] args) {

		
	int [] numdays = {31,28,31,30,31,30,31,31,30,31,30,312};
	for (int i = 1; i < 13; i++) {
		switch( numdays[i - 1]) {
		case 28:
			System.out.println("Feb");
			break;
		case 30:
			System.out.println("Apr Jun Sep Nov");
			break;
		case 31:
			System.out.println("All the rest");
			break;
		default:
			System.out.println("WTF?!");
			
		}
		}
	}
	}


