public class Main {
    public static void main(String[] args){
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        Music pop1 = new Music("pop1" , "singer1");
        Music pop2 = new Music("pop2" , "singer1");
        Music pop3 = new Music("pop3" , "singer2");
        Music pop4 = new Music("pop4" , "singer3");

        pop.addFile(pop1);
        pop.addFile(pop2);
        pop.addFile(pop3);
        pop.addFile(pop4);

        pop.addToFavoriteList(pop1);
        pop.addToFavoriteList(pop2);
        pop.addToFavoriteList(pop3);
        pop.removeFromFavoriteList(pop2);

        pop.search("singer1");

        int numberOfFiles = pop.getNumberOfFiles();
        System.out.println("Number of files =  " + numberOfFiles);

        pop.listAllFiles();
        pop.printFavoriteList();







    }
}
