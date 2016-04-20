package model;
import java.util.*;
 
public class DvdContainer {
	private static DvdContainer instance;
	private ArrayList<DVD> dvds;
	
	public static DvdContainer getInstance(){
	    if(instance == null)
	    {
	    	DvdContainer.instance = new DvdContainer();
	    	
	    }
	    return instance;
	    
	}
	
	private DvdContainer(){
		this.dvds = new ArrayList<>();
	}

	public void addDvd(DVD p)
	{
		this.dvds.add(p);
	}
	public ArrayList<DVD> getAll(){
		return dvds;
	}
	public DVD findDvdByTitle(String title){
		DVD p = null;
		for(int i = 0; i < dvds.size() && p == null; i++){
			if(dvds.get(i).getTitle().equals (title)){
				p = dvds.get(i);
			}
		}
		return p;
	}
	public void removeDvd(int index){
		dvds.remove(index);
	}

}
