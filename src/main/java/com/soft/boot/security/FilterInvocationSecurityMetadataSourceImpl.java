package com.soft.boot.security;

import com.soft.boot.domain.SysResource;
import com.soft.boot.domain.SysRole;
import com.soft.boot.mapper.SysResourceDAO;
import com.soft.boot.mapper.SysRoleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class FilterInvocationSecurityMetadataSourceImpl implements FilterInvocationSecurityMetadataSource {

    @Autowired
    SysRoleDAO sysRoleDAO;

    @Autowired
    SysResourceDAO sysResourceDAO;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {

        String requestUrl=((FilterInvocation) object) .getRequestUrl();
        System.out.println("用户请求的地址是："+requestUrl);
        if("/login".equals(requestUrl)){
            return null;
        }
        SysResource sysResource=sysResourceDAO.selectByUrl(requestUrl);
        if(sysResource==null){
            return SecurityConfig.createList("ROLE_LOGIN");
        }

        List<SysRole> roleList=sysRoleDAO.findRolesOfResource(sysResource.getRESOURCE_ID());

        String[] values=new String[roleList.size()];
        for (int i = 0; i < roleList.size(); i++) {
            values[i]=roleList.get(i).getROLE_NAME();
        }

        return SecurityConfig.createList(values);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }
}
