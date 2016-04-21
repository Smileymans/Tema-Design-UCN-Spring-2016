package ui;
import java.util.*;
import ctr.*;
import model.*;

public class PersonUI {
private PersonCtr pCtr;
private SingleInput si;

public PersonUI(){
	pCtr = new PersonCtr();
	si = new SingleInput();
	start();
}

private void start(){
	boolean goOn = true;
	ListChoice<Integer> mainMenu = new ListChoice<>();
	mainMenu.addOption("Close", 0); //Skal ændres til "back"
	mainMenu.addOption("Add person", 1); //Tilføj ny person
	mainMenu.addOption("View persons", 2); //Liste over alle personer
	mainMenu.addOption("Update persons", 3); //Opdater personer
	mainMenu.addOption("Delete person", 4); //Slet en person
	
	while(goOn){
		Integer choice = mainMenu.input("Choose option", false); //showCancelOption bruges til false
		if(choice == null){
			choice = 0;
		}
		switch(choice){
		case 0:
			goOn = false;
			exit();
			break;
		case 1:
			addPerson();
			break;
		case 2:
			viewPersons();
			break;
		case 3:
			updatePersons();
			break;
		case 4:
			deletePersons();
			break;
		default:
			break;
		}
	}
}
	private void exit(){
		System.out.println("Test af exit");
	}
	
	private void addPerson(){
		System.out.println("Add person:");
		String name = si.inputString(" Name: ");
		String address = si.inputString(" Address: ");
		String postalCode = si.inputString(" Postalcode: ");
		String city = si.inputString(" City: ");
		String phone = si.inputString(" Phone: ");
		String email = si.inputString(" Email: ");
		Person p = pCtr.createPerson(name, address, postalCode, city, phone, email);
		viewPerson(p);
		System.out.println();
	}
	private void viewPerson(Person p){
		System.out.println("Person: " + p.toString());
	}
	
	private void viewPersons(){
		System.out.println("All persons in the system: ");
		List<Person> persons = pCtr.getAll();
		for(Person p : persons){
			System.out.println(" " + p);
		}
		System.out.println();
	}
	//Metoden skal skrives hvis ikke currentnumber eksistere...
	private void updatePersons(){
		String currentPhone = si.inputString("enter phonenumber of the person from the list you want to update.");
		System.out.println(currentPhone);
		String name = si.inputString(" Name: ");
		String address = si.inputString(" Address: ");
		String postalCode = si.inputString(" Postalcode: ");
		String city = si.inputString(" City: ");
		String phone = si.inputString(" Phone: ");
		String email = si.inputString(" Email: ");
		PersonCtr myPersonCtr = new PersonCtr();
		myPersonCtr.updatePerson(currentPhone, name, address, postalCode, city, phone, email);
	}
	
	private void deletePersons(){
		String phone = si.inputString(" Choose which person to delete by writing their phonenumber: ");
		pCtr.deletePerson(phone);
	}

}
