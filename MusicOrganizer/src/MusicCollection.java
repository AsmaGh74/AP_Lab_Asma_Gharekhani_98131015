import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;
    //An ArrayList for storing the favorite file names of music files.
    private ArrayList<Music> favoriteFiles;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        favoriteFiles = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        files.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println("Music information:");
        files.get(index).printInfo();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        System.out.println("Music list: ");
        for (Music ele:files) {
            ele.printInfo();
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getFileName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if (index >= 0 && index < files.size()) return true;
        else return false;
    }

    /**
     * Add a song to favorite list.
     * @param music song to be added
     */
    public void addToFavoriteList(Music music){
        boolean existence = false;
        for (Music ele:favoriteFiles) {
            if (ele.equals(music)){
                existence = true;
                System.out.println("You already added this song to favorite list!");
            }
        }
        if (!existence) {
            favoriteFiles.add(music);
            music.printInfo();
            System.out.println("َAdded successfully to favorite list.");
        }
    }

    /**
     * Remove a song from favorite list.
     * @param music   song to be removed
     */
    public void removeFromFavoriteList(Music music){
        boolean existence = false;
        for (int i = 0; i < favoriteFiles.size(); i++){
            if (favoriteFiles.get(i).equals(music)){
                favoriteFiles.get(i).printInfo();
                System.out.println("Removed successfully.");
                existence = true;
                favoriteFiles.remove(music);
            }
        }
        if (!existence) System.out.println("There is not such song in favorite list!");
    }

    /**
     * List songs that are in the favorite songs list.
     */
    public void printFavoriteList(){
        System.out.println("Favorite songs list: ");
        for (Music ele:favoriteFiles) {
            ele.printInfo();
        }
    }

    /**
     * Search and print the songs that have specified file name or singer name.
     * @param name  file name or singer name of a song
     */
    public void search(String name){
        System.out.println("Results based on song name and singer name");
        for (Music ele:files) {
            if (ele.getFileName().equals(name)){
                ele.printInfo();
            } else if (ele.getSingerName().equals(name)) ele.printInfo();
        }
    }
}