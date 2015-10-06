
public class Song {
	private String name;
	private String album;
	private int duration;
	private String genre;
	private static int numberOfSongs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	public void print(){
		System.out.print(name + " " + album + " " + duration + " " + genre);
	}
	
}
