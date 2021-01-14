package com.imooc.service;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface UserService {

    public boolean queryUsernameIsExist(String username);

    public Users createUser(UserBO userBO);

    public Users queryUserForLogin(String username, String password);


}
