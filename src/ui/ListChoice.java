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
 * Displays the options and prompts the user to choose an aption.<br>
 * @param title - Specifies what the title above the option list should be
 * @param showCancelOptions - when <code>true</code>, option <code>0</code> becomes "Cancel"
 * @return The object that corresponds to the option selected by the user. If showCancelOption was true, a returned null value indicates that "Cancel" was selected
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
