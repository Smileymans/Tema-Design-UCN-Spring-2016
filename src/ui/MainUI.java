package ui;
import model.*;
import ctr.*;

public class MainUI {
private SingleInput si = new SingleInput();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainUI().start();
	}
	
	private void start(){
		boolean goOn = true;	
		ListChoice<Integer> mainMenu = new ListChoice<>();
		mainMenu.addOption("Close", 0);
		mainMenu.addOption("Friends", 1);
		mainMenu.addOption("DVDs", 2);
		mainMenu.addOption("Loan", 3);
		System.out.println();	
		
		while(goOn){
			Integer choice = mainMenu.input("*** Main menu ***\nChoose a option", false);
			switch(choice){
			case 0:
				goOn = false;
				exit();
				break;
			case 1:
				Person();
				break;
			case 2:
				DVD();
				break;
			case 3:
				Loan();
				break;
			default:
				break;
			}
			System.out.println();
			System.out.println();
		}
	}
		
		
		private void exit(){
			System.out.println("Closing the program...Goodbye!");
		}
		private void Person(){
			PersonUI pui = new PersonUI();
		}
		private void DVD(){
			DVDUI dui = new DVDUI();
		}
		private void Loan(){
			LoanUI lui = new LoanUI();
		}
		
	}

	