import domain.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import repository.FilmPoster;
import repository.PosterRepository;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    FilmPoster poster1 = new FilmPoster(23, "Бладшот");
    FilmPoster poster2 = new FilmPoster(14, "Вперёд");
    FilmPoster poster3 = new FilmPoster(4, "Отель 'Белград'");

    @Test
    public void shouldFindAll() {
        FilmPoster[] posters = {poster1, poster2, poster3};
        doReturn(posters).when(repo).findAll();

        FilmPoster[] expected = {poster1, poster2, poster3};
        FilmPoster[] actual = manager.show(posters);

        Assertions.assertArrayEquals(expected, actual);
    }
}