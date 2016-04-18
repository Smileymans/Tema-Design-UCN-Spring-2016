package model;
import java.util.*;


public class PersonContainer {
	private static PersonContainer instance;
	private ArrayList<Person> Persons;
	
	
	
public static PersonContainer getInstance(){
    if(instance == null)
    {
    	PersonContainer.instance = new PersonContainer();
    	
    }
    return instance;
}

public void addPerson(Person p)
{
	Persons.add(p);
}
}
