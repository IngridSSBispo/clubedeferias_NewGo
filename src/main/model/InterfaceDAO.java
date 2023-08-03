package main.model;

import main.dominio.Socio;

import java.io.IOException;

public interface InterfaceDAO {


    public void create(Socio socio) throws IOException;
    public void read(String path, String name);
    public void update(Socio socio);
    public void delete(Socio socio);
    }

