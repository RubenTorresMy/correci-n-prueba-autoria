package org.example.DAO;

import org.example.motores.MotorSQL;

import java.util.ArrayList;

public class SateliteDAOImpl
        extends AbstractDAO{
    public SateliteDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }

    @Override
    public ArrayList findByGenero(String genero) {
        return null;
    }

    @Override
    public ArrayList findByDirector(String director) {
        return null;
    }

    @Override
    public void add(Object object) {

    }

    @Override
    public void update(int id, Object object) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Object find(int id) {
        return null;
    }

    @Override
    public ArrayList findAll() {
        return null;
    }
}
