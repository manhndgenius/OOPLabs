package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks;
	private static int nbDisc;
	
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		boolean found = false;
		for (Track t: tracks) {
			if (t.equals(track)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Already in tracks.");
		} else {
			tracks.add(track);
			System.out.println("Added successfully.");
		}
	}
	
	public void removeTrack(Track track) {
		boolean found = false;
		for (Track t: tracks) {
			if (t.equals(track)) {
				found = true;
				break;
			}
		}
		if (found) {
			tracks.remove(track);
			System.out.println("Removed successfully.");
		} else {
			System.out.println("Track is not in list of tracks");
		}
	}
	
	public int getLength() {
		int length = 0;
		for (Track t: tracks) {
			length += t.getLength();
		}
		return length;
	}
	
	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
		// TODO Auto-generated constructor stub
		super(++nbDisc, title, category, cost, length, director);
		this.artist = artist;
	}

	public void play() {
		for (Track t: tracks) {
			t.play();
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Id: ").append(nbDisc).append("\n")
        .append("Title: ").append(this.getTitle()).append("\n")
        .append("Category: ").append(this.getCategory()).append("\n")
        .append("Cost: ").append(this.getCost()).append("\n")
        .append("Length: ").append(this.getLength()).append("\n")
        .append("Director: ").append(this.getDirector()).append("\n")
        .append("Artist: ").append(this.artist).append("\n");
		for (Track t: tracks) {
			sb.append(t.toString());
		}
		return sb.toString();
	}
}
