package mprofile.repository.impl;

import mprofile.core.entity.Logincredentails;
import mprofile.repository.AuthDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Sohil.Chhabriya on 25-Sep-16.
 */
@Repository
public class AuthDaoImpl implements AuthDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Logincredentails getUserAuth(int id) {
        Logincredentails lc = em.find(Logincredentails.class,id);
        if(lc != null){
            System.out.println(lc.getPassword());
        }
        else{
            System.out.println("lc null");
        }
        return lc;
    }
}
