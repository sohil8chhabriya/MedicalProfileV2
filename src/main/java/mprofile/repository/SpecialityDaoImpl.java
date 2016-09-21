package mprofile.repository;

import mprofile.core.entity.Speciality;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */
public class SpecialityDaoImpl implements SpecialityDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Speciality getSpecialityById(int id) {
        return em.find(Speciality.class,id);
    }
}
