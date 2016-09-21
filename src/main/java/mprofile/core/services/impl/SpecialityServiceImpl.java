package mprofile.core.services.impl;

import mprofile.core.entity.Speciality;
import mprofile.core.services.SpecialityService;
import mprofile.repository.SpecialityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */


@Service
@Transactional
public class SpecialityServiceImpl implements SpecialityService{

    @Autowired
    private SpecialityDao speciality;

    @Override
    public Speciality getSpecialityById(int id) {
        return speciality.getSpecialityById(id);
    }
}
