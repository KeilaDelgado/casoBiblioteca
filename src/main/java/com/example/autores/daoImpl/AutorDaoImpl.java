/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.autores.daoImpl;

import com.example.autores.dao.AutorDao;
import com.example.autores.model.Autor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KEILA
 */
@Repository
public class AutorDaoImpl implements AutorDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Autor autor) {
        String SQL ="INSERT INTO autor(nombre, apellido) VALUES(?,?)";
        return jdbcTemplate.update(SQL,new Object[]{autor.getNombre(),autor.getApellido()});
    }

    @Override
    public int update(Autor autor) {
        String SQL ="UPDATE post SET titulo=?, descripcion=? WHERE idpost=?";                 
        return jdbcTemplate.update(SQL,new Object[]{autor.getNombre(), autor.getApellido(), autor.getIdautor()});
    }

    @Override
    public int delete(int id) {
        String SQL ="DELETE FROM post WHERE idautor=?"; 
        return jdbcTemplate.update(SQL,id);
    }

    @Override
    public Autor read(int id) {
        String SQL ="SELECT *FROM autor WHERE idautor=?";
        try {
            Autor autor = jdbcTemplate.queryForObject(SQL, BeanPropertyRowMapper.newInstance(Autor.class),id);
            return autor;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Autor> readAll() {
        return jdbcTemplate.query("select * from autor", BeanPropertyRowMapper.newInstance(Autor.class));
    }
    
}
