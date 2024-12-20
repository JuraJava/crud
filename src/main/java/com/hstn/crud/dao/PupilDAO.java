package com.hstn.crud.dao;

import com.hstn.crud.entity.Pupil;

import java.util.List;

public interface PupilDAO {
    void save(Pupil pupil);

    Pupil findById(int id);
    List<Pupil> findAll();

    List<Pupil> findPupilByLastName(String lastName);

    void update(Pupil pupil);

    void delete(int id);
    // или так как ниже
    // void delete(Pupil pupil);

    int deleteAllPupils();

    List<Pupil> findPupilByFirstName(String firstName);

}
