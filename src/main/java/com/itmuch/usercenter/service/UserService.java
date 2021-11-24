package com.itmuch.usercenter.service;

import com.itmuch.usercenter.dao.user.UserMapper;
import com.itmuch.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    @Autowired
    private final UserMapper userMapper;

    public User findById(Integer id){
        return this.userMapper.selectByPrimaryKey(id);
    }


}
