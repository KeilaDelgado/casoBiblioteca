/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.autores.service;

import com.example.autores.model.Autor;
import java.util.List;

/**
 *
 * @author KEILA
 */
public interface AutorService {
    int create(Autor autor);
    int update(Autor autor);
    int delete(int id);
    Autor read(int id);
    List<Autor> readAll();
}
