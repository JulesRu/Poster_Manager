package repository;

public class PosterRepository {

    private FilmPoster[] posters = new FilmPoster[0];

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

    public FilmPoster findById(int id) {
        FilmPoster tmp = new FilmPoster(0, null);
        for (FilmPoster poster : posters) {
            if (poster.getId() == id) {
                tmp = poster;
            }
        }
        if (tmp.getId() == 0) {
            return null;
        } else {
            return tmp;
        }
    }

    public void removeById(int id) {
        FilmPoster[] tmp = new FilmPoster[posters.length - 1];
        int copyToIndex = 0;
        for (FilmPoster poster : posters) {
            if (poster.getId() != id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        posters = tmp;
    }

    public FilmPoster[] removeAll() {
        FilmPoster[] tmp = new FilmPoster[0];
        posters = tmp;
        return posters;
    }
}
