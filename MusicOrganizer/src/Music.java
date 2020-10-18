/**
 * The Music class stores information of a song.
 * @author Asma
 */
public class Music {
    private String fileName;
    private String singerName;
    private String releasedYear;

    /**
     * Create a new song.
     * @param fileName   song name
     * @param singerName  singer name
     */
    public Music(String fileName, String singerName){
        this.fileName = fileName;
        this.singerName = singerName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }

    public void printInfo(){
        System.out.println("Music name:  " + fileName);
        System.out.println("Singer name:  " + singerName);
        if (releasedYear != null) System.out.println("Released year  " + releasedYear);
    }

    public void setSingerName(String singerName){
        this.singerName = singerName;
    }

    public String getSingerName(){
        return singerName;
    }

    public void setReleasedYear(String releasedYear){
        this.releasedYear = releasedYear;
    }

    public String getReleasedYear(){
        return releasedYear;
    }

    /**
     * Determine if two songs are the same (have the same file name and singer name).
     * @param music
     * @return  if two songs are the same return true, if not return false.
     */
    public boolean equals(Music music){
        System.out.println(music.getFileName());
        if (this.fileName.equals(music.getFileName())){
            if (this.singerName.equals(music.getSingerName())) return true;
        }
        return false;
    }
}
