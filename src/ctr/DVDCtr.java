package ctr;
import java.util.List;
 
import model.*;

public class DVDCtr {

	public DVD createDvd(String barcode, String title, String artist, String publicationDate, String genre)
	{
		DVD p = new DVD(barcode, title, artist, publicationDate, genre);
		DvdContainer.getInstance().addDvd(p);
		return p;	
	}
	public void updateDvd(String currentName, String barcode, String title, String artist, String publicationDate, String genre)
	{
		DVD p = DvdContainer.getInstance().findDvdByTitle(currentName);
		
		if(p != null){
			
		
		String currentBarcode = p.getBarcode();
		if(!currentBarcode.equals(barcode)){
		p.setBarcode(barcode);
		}
		String currentTitle = p.getTitle();
		if(!currentTitle.equals(title)){
	    p.setTitle(title);
		}
		String currentArtist = p.getArtist();
		if(!currentArtist.equals(artist)){
		p.setArtist(artist);
		}
		String currentPublicationDate = p.getPublicationDate();
		if(!currentPublicationDate.equals(publicationDate)){
		p.setPublicationDate(publicationDate);
		}
		String currentGenre = p.getGenre();
		if(!currentGenre.equals(genre)){
		p.setGenre(genre);
		}
		}
	}
	public List<DVD> getAll(){
		return DvdContainer.getInstance().getAll();
	}
	public DVD findDvd(String title){
		DVD p = DvdContainer.getInstance().findDvdByTitle(title);
		return p;
	}
	public void deleteDVD(String title){
		DvdContainer.getInstance().removeDvd(DvdContainer.getInstance().findDvdByTitle(title));
		
	}
}
