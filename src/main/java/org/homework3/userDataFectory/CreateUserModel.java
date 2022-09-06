package org.homework3.userDataFectory;

import org.homework3.model.Admin;
import org.homework3.model.Support;
import org.homework3.model.User;

public class CreateUserModel {

    public User createDefaultUser() {
        return new User("Evgen", "Lyashenko", "evgen@meil.ru", "12324", true, "Uk");
    }

    public Support createDefaultSupport() {
        return new Support("Sergey", "Lyashenko", "sergey@meil.ru", "12324", true, "Uk");
    }

    public Admin createDefaultAdmin() {
        return new Admin("Admin", "Admin", "admin@meil.ru", "12324", false, "Uk");
    }
}
