package org.homework3.service;

import org.homework3.model.Admin;
import org.homework3.model.Support;
import org.homework3.model.User;

public class UserService {
    public void actionWithUser(User user) {
        if (user instanceof Admin) {
            user.write();
            ((Admin) user).deleteFile(((Admin) user).checkString(user.getInputText()));
            return;
        }
        if (user instanceof Support) {
            user.write();
            ((Support) user).checkString(user.getInputText());
            return;
        }
        user.write();
    }
}
