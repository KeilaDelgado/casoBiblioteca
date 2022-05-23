/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.autores.serviceImpl;

import com.example.autores.dao.AutorDao;
import com.example.autores.model.Autor;
import com.example.autores.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KEILA
 */
@Service

public class AutorServiceImpl implements AutorService {
    @Autowired
    private AutorDao autorDao;
    @Override
    public int create(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Autor autor) {
        return autorDao.update(autor);
    }

    @Override
    public int delete(int id) {
         return autorDao.delete(id);
    }

    @Override
    public Autor read(int id) {
        return autorDao.read(id);
    }

    @Override
    public List<Autor> readAll() {
        return autorDao.readAll();
    }
    
}
