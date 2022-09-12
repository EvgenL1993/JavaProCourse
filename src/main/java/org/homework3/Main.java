package org.homework3;

import org.homework3.model.Admin;
import org.homework3.model.Support;
import org.homework3.model.User;
import org.homework3.service.UserService;
import org.homework3.userDataFectory.CreateUserModel;


public class Main {
    public static void main(String[] args) {
        CreateUserModel createUserModel = new CreateUserModel();
        UserService userService = new UserService();

        final User user = createUserModel.createDefaultUser();
        final Support support = createUserModel.createDefaultSupport();
        final Admin admin = createUserModel.createDefaultAdmin();

        userService.actionWithUser(user);
        userService.actionWithUser(support);
        userService.actionWithUser(admin);
    }

}
