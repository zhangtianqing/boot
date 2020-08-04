package com.soft.boot.mapperTest;

import com.soft.boot.BootApplication;
import com.soft.boot.mapper.SysRoleDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BootApplication.class)
public class MapperTest {
    @Autowired
    SysRoleDAO sysRoleDAO;

    @Test
    public void testROle(){
        System.out.println(sysRoleDAO.findRolesOfResource(6));
        System.out.println(sysRoleDAO.findRolesOfUser("admin"));

    }
}
