package movies.demo.service;

import movies.demo.model.Filmes;
import movies.demo.repository.FilmesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    private FilmesRepository repository;

    public FilmeService(FilmesRepository repository) {
                this.repository = repository;
    }

    public Filmes create(Filmes f){
        return repository.save(f);
    }

    public void delete(long id){

        repository.deleteById(id);
    }

    public Filmes update(Filmes f){

        return repository.saveAndFlush(f);// salvar e modificar = saveAndFlush
    }

    public Optional<Filmes> ListByid(long id){ //Optional: verifica se existe filmes ou não existe
        return repository.findById(id);

    }

    public List<Filmes> findAll(){
        return repository.findAll();
    }
}
