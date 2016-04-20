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
	public void updatedvd(String barcode, String title, String artist, String publicationDate, String genre)
	{
		DVD p = DvdContainer.getInstance().findDvdByTitle(title);
		
		if(p != null){
	    p.setBarcode(barcode);
		p.setTitle(title);
		p.setArtist(artist);
		p.setPublicationDate(publicationDate);
		p.setGenre(genre);

		}
	}
	public List<DVD> getAll(){
		return DvdContainer.getInstance().getAll();
	}
	public DVD findDvd(String title){
		DVD p = DvdContainer.getInstance().findDvdByTitle(title);
		return p;
	}
}
