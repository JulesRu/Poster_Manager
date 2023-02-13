package domain;

import repository.FilmPoster;
import repository.PosterRepository;

public class PosterManager {
    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {

        this.repo = repo;
    }

    public void add(FilmPoster poster) {

        repo.save(poster);
    }


    public FilmPoster[] show(FilmPoster[] posters) {
        repo.findAll();
        return posters;
    }
}
