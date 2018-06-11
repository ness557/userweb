package simple.microservices.userweb.service;

import simple.microservices.userweb.model.UserInfo;

import java.util.List;

public interface UserInfoService {

    Status SaveUserInfo(UserInfo userInfo);
    Status removeUserInfo(UserInfo userInfo);
    Status removeUserInfo(int id);
    UserInfo getUserInfoById(int id);
    List<UserInfo> getUserInfoList();
}
