package org.neuedu.his01.service;

import org.neuedu.his01.mapper.UserMapper;
import org.neuedu.his01.model.RespBean;
import org.neuedu.his01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public RespBean getUserByIdAndPass(User user) {
        User user1=userMapper.getUserByIdAndPass(user);
        if (user1==null){
            RespBean error = RespBean.error("查无此人");
            return error;
        }else {
            RespBean ok = RespBean.ok("登陆成功",user1);
            return ok;
        }
    }
}
