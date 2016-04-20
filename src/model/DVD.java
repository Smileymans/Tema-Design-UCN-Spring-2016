package model;
import java.util.*;

public class DVD {
	private String barcode;
	private String title;
	private String artist;
	private String publicationDate;
	private String genre;
	
	public DVD(String barcode, String title, String artist, String publicationDate, String genre){
		this.setBarcode(barcode);
		this.setTitle(title);
		this.setArtist(artist);
		this.setPublicationDate(publicationDate);
		this.setGenre(genre);
		
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String toString(){
		return "barcode: " + barcode + ", title: " + title + ", artist: " + artist + ", publicationDate: " + publicationDate + ", genre: " + genre;
	}
	
}

