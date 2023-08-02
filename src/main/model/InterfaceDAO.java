package main.model;

import main.dominio.Socio;

public interface InterfaceDAO {


    public void create(Socio socio);
    public void read(Socio socio);
    public void update(Socio socio);
    public void delete(Socio socio);
    }

