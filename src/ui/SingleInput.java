package ui;
import java.util.*;

public class SingleInput {
private Scanner scanner = new Scanner(System.in);

//Bruges til strings
public String inputString(String input){
	System.out.println(input);
	String tmpStr = scanner.nextLine();
	return tmpStr;
}
//Bruges til integers
public int inputInteger(String input){
	boolean succes = false;
	int tmpTal = 0;
	while(!succes){
		String str = inputString(input);
		try{
			tmpTal = Integer.parseInt(str);
			succes = true;
		}
		catch(NumberFormatException nfe){
			System.out.println("Only whole numbers! Try again!");
		}
	}
	return tmpTal;
}
//Bruges til booleans
public boolean inputBoolean(String input){
	String tmpStr = inputString(input + "(y/n ");
	if(tmpStr.equalsIgnoreCase("y")){
		return true;
	}
	else if(tmpStr.equalsIgnoreCase("n")){
		return false;
	}
	else{
		return inputBoolean(input);
	}
}

}