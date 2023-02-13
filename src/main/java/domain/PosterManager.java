public class PosterManager {

    private FilmPoster[] posters = new FilmPoster[0];
    private int maxPostersAmount;


    public PosterManager() {
        maxPostersAmount = 10;
    }

    public PosterManager(int maxPostersAmount) {
        this.maxPostersAmount = maxPostersAmount;
    }

    public void save(FilmPoster poster) {

        FilmPoster[] tmp = new FilmPoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public FilmPoster[] findAll() {
        return posters;
    }

    public FilmPoster[] findLast() {

        int resultLength;

        if (maxPostersAmount > posters.length) {
            resultLength = posters.length;
        } else {
            resultLength = maxPostersAmount;
        }

        FilmPoster[] reversed = new FilmPoster[resultLength];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }

}
