package movies.demo.repository;
import movies.demo.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;// jpa tem todos métodos de conexão com banco( métodos repository

public interface FilmesRepository extends JpaRepository<Filmes, Long> {

}