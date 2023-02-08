import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    FilmPoster poster1 = new FilmPoster(23, "Бладшот");
    FilmPoster poster2 = new FilmPoster(14, "Вперёд");
    FilmPoster poster3 = new FilmPoster(4, "Отель 'Белград'");
    FilmPoster poster4 = new FilmPoster(1, "Гарри Поттер и философский камень");
    FilmPoster poster5 = new FilmPoster(2, "Гарри Поттер и тайная комната");
    FilmPoster poster6 = new FilmPoster(3, "Гарри Поттер и узник Азкабана");
    FilmPoster poster7 = new FilmPoster(4, "Гарри Поттер и кубок огня");
    FilmPoster poster8 = new FilmPoster(5, "Гарри Поттер и орден Феникса");
    FilmPoster poster9 = new FilmPoster(6, "Гарри Поттер и принц-полукровка");
    FilmPoster poster10 = new FilmPoster(7, "Гарри Поттер и дары смерти");
    FilmPoster poster11 = new FilmPoster(8, "Гарри Поттер и проклятое дитя");
    FilmPoster poster12 = new FilmPoster(9, "Фантастические твари и где они обитают");
    FilmPoster poster13 = new FilmPoster(10, "Чародеи");
    FilmPoster poster14 = new FilmPoster(11, "Я предпочитаю рай");
    FilmPoster poster15 = new FilmPoster(12, "Безумные соседи");

    /*@BeforeEach
    public void setup() {
        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);
        poster.save(poster4);
        poster.save(poster5);
        poster.save(poster6);
        poster.save(poster7);
        poster.save(poster8);
        poster.save(poster9);
        poster.save(poster10);
        poster.save(poster11);
        poster.save(poster12);
        poster.save(poster13);
        poster.save(poster14);
        poster.save(poster15);
    }*/


    @Test
    public void saveNewPosters() {

        PosterManager poster = new PosterManager();

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);

        FilmPoster[] expected = {poster1, poster2, poster3};
        FilmPoster[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversedByDefaultLimit() {

        PosterManager poster = new PosterManager();

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);
        poster.save(poster4);
        poster.save(poster5);
        poster.save(poster6);
        poster.save(poster7);
        poster.save(poster8);
        poster.save(poster9);
        poster.save(poster10);

        FilmPoster[] expected = {poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        FilmPoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void reversedByDefaultOverLimit() {

        PosterManager poster = new PosterManager();

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);
        poster.save(poster4);
        poster.save(poster5);
        poster.save(poster6);
        poster.save(poster7);
        poster.save(poster8);
        poster.save(poster9);
        poster.save(poster10);
        poster.save(poster11);

        FilmPoster[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};
        FilmPoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void reversedByDefaultUnderLimit() {

        PosterManager poster = new PosterManager();

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);
        poster.save(poster4);
        poster.save(poster5);
        poster.save(poster6);
        poster.save(poster7);
        poster.save(poster8);
        poster.save(poster9);

        FilmPoster[] expected = {poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        FilmPoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void reversedRandomLimit() {

        PosterManager poster = new PosterManager(4);

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);
        poster.save(poster4);


        FilmPoster[] expected = {poster4, poster3, poster2, poster1};
        FilmPoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversedOverRandomLimit() {

        PosterManager poster = new PosterManager(4);

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);
        poster.save(poster4);
        poster.save(poster5);


        FilmPoster[] expected = {poster5, poster4, poster3, poster2};
        FilmPoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reversedUnderRandomLimit() {

        PosterManager poster = new PosterManager(4);

        poster.save(poster1);
        poster.save(poster2);
        poster.save(poster3);


        FilmPoster[] expected = {poster3, poster2, poster1};
        FilmPoster[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
