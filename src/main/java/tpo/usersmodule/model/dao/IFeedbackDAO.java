package tpo.usersmodule.model.dao;

import tpo.usersmodule.model.entity.Feedback;

import java.util.List;

public interface IFeedbackDAO {

    public Feedback findById(int id);
    public List<Feedback> findAll();
    public List<Feedback> findAllByDni(int dni);
    public int save(Feedback feedback);
    public void deleteById(int id) ;


}