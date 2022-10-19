package com.example.hito1_ad_crud.service;

import com.example.hito1_ad_crud.entity.Libro;
import com.example.hito1_ad_crud.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroService implements LibroRepository {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public List<Libro> listAll() {
        return libroRepository.listAll();
    }

    @Override
    public Libro save(Libro object) {
        return libroRepository.save();
    }

    @Override
    public Libro updateById(Integer idObject) {
        return libroRepository.updateById();
    }

    @Override
    public Libro deleteById(Integer idObject) {
        return libroRepository.deleteById();
    }

    @Override
    public Libro listById(Integer idObject) {
        return libroRepository.listById();
    }
}
