package mprofile.repository.impl;

import mprofile.repository.UserInfoDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/business-config.xml")
public class UserInfoDaoImplTest {

    @SuppressWarnings("unused")
	@Autowired
    private UserInfoDao user;
    @Before
    @Transactional
    @Rollback(false)

    @Test
    public void test(){

    }
}