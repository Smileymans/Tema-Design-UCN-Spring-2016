package ui;
import java.util.*;

public class ListChoice<T> {
private List<String> options;
private List<T> values;

public ListChoice(){
	this.options = new ArrayList<>();
	this.values = new ArrayList<T>();
}

public void addOption(String text, T value){
	this.options.add(text);
	this.values.add(value);
}

/**
 * Displays the options and prompts the user to choose an option.
 * @param
 * @param 
 * @return 
 */
public T input(String title, boolean showCancelOption){
	System.out.println(title);
	if(showCancelOption){
		System.out.println(" 0\t - Cancel");
	}
	for(int i = 0; i < options.size(); i++){
		System.out.println(" " + (showCancelOption ? (i+1) : i) + "\t - " + this.options.get(i));
	}
	int choice = new SingleInput().inputInteger("Pick an option between 0 and " + (showCancelOption ? options.size() : options.size() - 1) + ": ");
	if(showCancelOption && choice == 0){
		return null;
	}
	if(showCancelOption){
		choice--;
	}
	if(choice >=0 && choice < options.size()){
		return values.get(choice);
	}
	else{
		return input(title, showCancelOption);
	}
}




}
