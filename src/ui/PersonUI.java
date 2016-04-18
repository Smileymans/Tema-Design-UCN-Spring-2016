package ui;
import model.*;
import ctr.*;
import java.util.*; 
public class PersonUI 
{
	private PersonCtr pCtr;
	private SingleInput si;
	
public PersonUI()
{
	pCtr = new PersonCtr();
	si = new SingleInput();
	start();
}

private void start()
{
boolean goOn = true;
ListChoice<integer>mainMenu = new ListChoice<>();
mainMenu.addOption("Create person",0);
mainMenu.addOption("List person",1);
mainMenu.addOption("Update person",2);
mainMenu.addOption("Delete person",3);
mainMenu.addOption("Exit",4);

while(goOn){
	Integer choice = mainMenu.prompt("Choose option", false);
	if(choice == null){
		choice = 0;
	}
	switch(choice){
	case 0:
		createPerson();
	}
	
}
}
}
}
