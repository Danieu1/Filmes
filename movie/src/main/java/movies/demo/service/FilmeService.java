package movies.demo.service;

import movies.demo.model.Filmes;
import movies.demo.repository.FilmesRepository;

import java.util.List;
import java.util.Optional;

public class FilmeService {

    private FilmesRepository repository;

    public FilmeService(FilmesRepository repository) {
        this.repository = repository;
    }

    public Filmes create(Filmes f){
        return repository.save(f);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Filmes update(Filmes f){
        return repository.saveAndFlush(f);
    }

    public Filmes findById(Long id){

        Optional<Filmes> produtoOptional = repository.findById(id);
        if (produtoOptional.isPresent()){
            return produtoOptional.get();
        }else{
            return null;
        }
    }

    public List<Filmes> findAll(){
        return repository.findAll();
    }
}
