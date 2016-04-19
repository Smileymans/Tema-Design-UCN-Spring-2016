package model;
import java.util.*;

public class PersonContainer {
	private static PersonContainer instance;
	private ArrayList<Person> persons;
	
	
	
public static PersonContainer getInstance(){
    if(instance == null)
    {
    	PersonContainer.instance = new PersonContainer();
    	
    }
    return instance;
    
}

private PersonContainer(){
	this.persons = new ArrayList<>();
}

public void addPerson(Person p)
{
	this.persons.add(p);
}
public ArrayList<Person> getAll(){
	return persons;
}
public Person findPersonByPhone(String phone){
	Person p = null;
	for(int i = 0; i < persons.size() && p == null; i++){
		if(persons.get(i).getPhone() == phone){
			p = persons.get(i);
		}
	}
	return p;
}
public void removePerson(int index){
	persons.remove(index);
}
}
