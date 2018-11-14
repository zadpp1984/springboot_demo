package org.cay.demo.jpa.dao;

import static org.junit.Assert.assertTrue;

import org.cay.demo.jpa.bean.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {

    @Autowired
    RoleDao roleDao;

    @Test
    // @Rollback
    public void testSave() {
        for (int i = 0; i < 5; i++) {
            Role r = new Role();
            r.setId(i);
            r.setRolename("LEVEL" + i);
            r.setLevel(i);
            roleDao.save(r);
        }

        assertTrue(roleDao.count() == 5);
    }

    @Test
    public void testFindById() {}

    @Test
    public void testCount() {}

}
