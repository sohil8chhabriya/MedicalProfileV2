package mprofile.repository.impl;

import mprofile.core.entity.Speciality;
import mprofile.repository.SpecialityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */
@Repository
public class SpecialityDaoImpl implements SpecialityDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Speciality getSpecialityById(int id) {
        return em.find(Speciality.class,id);
    }
}
