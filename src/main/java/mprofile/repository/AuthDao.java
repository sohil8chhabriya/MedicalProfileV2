package mprofile.repository;

import mprofile.core.entity.Logincredentails;

/**
 * Created by Sohil.Chhabriya on 25-Sep-16.
 */
public interface AuthDao {
    public Logincredentails getUserAuth(int id);
}