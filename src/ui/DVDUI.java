package ui;
import java.util.*;
import ctr.*;
import model.*;
 

public class DVDUI {

	private DVDCtr pCtr;
	private SingleInput si;
	
	public DVDUI(){
		pCtr = new DVDCtr();
		si = new SingleInput();
		start();
	}
	
	
	private void start(){
		boolean goOn = true;
		ListChoice<Integer> mainMenu = new ListChoice<>();
		mainMenu.addOption("back", 0); //går til MainMenu
		mainMenu.addOption("Add dvd", 1); //Tilføj ny dvd
		mainMenu.addOption("View dvds", 2); //Liste over alle dvd
		mainMenu.addOption("Update dvds", 3); //Opdater dvd
		mainMenu.addOption("Delete dvd", 4); //Slet en dvd
		
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
				addDvd();
				break;
			case 2:
				viewDvds();
				break;
			case 3:
				updateDvds();
				break;
			case 4:
				deleteDVD();
				break;
			default:
				break;
			}
		}
	}
		private void exit(){
			System.out.println("Test af exit");
		}
		
		private void addDvd(){
			System.out.println("Add dvd:");
			String barcode = si.inputString(" Barcode: ");
			String title = si.inputString(" Title: ");
			String artist = si.inputString(" Artist: ");
			String publicationDate = si.inputString(" PublicationDate: ");
			String genre = si.inputString(" Genre: ");
			DVD p = pCtr.createDvd(barcode, title, artist, publicationDate, genre);
			viewDVD(p);
			System.out.println();
		}
		private void viewDVD(DVD p){
			System.out.println("DVD: " + p.toString());
		}
		
		private void viewDvds(){
			System.out.println("All dvds in the system: ");
			List<DVD> dvds = pCtr.getAll();
			for(DVD p : dvds){
				System.out.println(" " + p);
			}
			System.out.println();
		}
		
		private void updateDvds(){
			String currentTitle = si.inputString("enter title of the DVD from the list you want to update.");
			System.out.println(currentTitle);
			String barcode = si.inputString(" Barcode: ");
			String title = si.inputString(" Title: ");
			String artist = si.inputString(" Artist: ");
			String publicationDate = si.inputString(" Publication Date: ");
			String genre = si.inputString(" Genre: ");
			DVDCtr myDvdCtr = new DVDCtr();
			myDvdCtr.updateDvd(currentTitle, barcode, title, artist, publicationDate, genre);
		
		}
		
		private void deleteDVD(){
			String phone = si.inputString(" Phone: ");
			pCtr.deleteDVD(phone);
		}
	
}
