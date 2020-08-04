package com.soft.boot.service;


import com.soft.boot.annotation.SysLogAnnotation;
import com.soft.boot.domain.SysRole;
import com.soft.boot.domain.SysUser;
import com.soft.boot.mapper.SysRoleDAO;
import com.soft.boot.mapper.SysUserDAO;
import com.soft.boot.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service()
public class UserService implements UserDetailsService, BaseService<SysUser, Long> {

    @Autowired
    SysUserDAO sysUserDAO;

    @Autowired
    SysRoleDAO sysRoleDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("开始查找用户:"+username);
        SysUser sysUser=getByUsername(username);
        if (sysUser==null){
            throw new UsernameNotFoundException("没有该用户");
        }
        //查到User后将其封装为UserDetails的实现类的实例供程序调用
        //用该User和它对应的Role实体们构造UserDetails的实现类
        return new UserDetailsImpl(sysUser,sysRoleDAO.findRolesOfUser(sysUser.getUSERNAME()));
    }

    public SysUser getByUsername(String username){
        return sysUserDAO.selectByUsername(username);
    }

    @Transactional
    @Override
    public List<SysUser> getList() {
        return sysUserDAO.selectALL();
    }
    @Override
    public SysUser getByKey(Long aLong) {
        return sysUserDAO.selectByPrimaryKey(aLong);
    }
    @Override
    public int updateByPK(SysUser sysRole) {
        return 0;
    }
    @Override
    public int deleteByPK(Long aLong) {
        return 0;
    }
    @Override
    public int create(SysUser sysUser) {
        if(getByUsername(sysUser.getUSERNAME())!=null){
            return 0;//false
        }
        System.out.println("createUser:"+sysUser);
        sysUser.setUSER_ID(null);
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        sysUser.setPASSWORD(encoder.encode(sysUser.getPASSWORD().trim()));
        return sysUserDAO.insertSelective(sysUser);
    }

//    public int login(SysUser sysUser){
//        SysUser dataUser=getByUsername(sysUser.getUSERNAME());
//        if (dataUser==null){
//            return 0;//false
//        }
//        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
//        if(encoder.matches(sysUser.getPASSWORD(),dataUser.getPASSWORD())){
//            return 1;
//        }
//        return 0;
//    }
}
