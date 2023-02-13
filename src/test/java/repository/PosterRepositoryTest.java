package repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    FilmPoster poster1 = new FilmPoster(23, "Бладшот");
    FilmPoster poster2 = new FilmPoster(14, "Вперёд");
    FilmPoster poster3 = new FilmPoster(4, "Отель 'Белград'");



   /* @Test
    public void test() {

        PosterRepository repo = new PosterRepository();

        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.findAll();



        //repo.removeById(poster2.getId());

        /*FilmPoster[] expected = {poster1, poster3};
        FilmPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);*/


        /*FilmPoster expected = poster1;
        FilmPoster actual = repo.findById(23);

        Assertions.assertEquals(expected, actual);*/

        /*repo.removeAll();

        FilmPoster[] expected = {};
        FilmPoster[] actual = repo.removeAll();

        Assertions.assertArrayEquals(expected, actual);*/
}
