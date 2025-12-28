package testing;

import DAO.UserDAO;
import model.User;

public class TestUserDAOUpdate {
    public static void main(String[] args) {
//        // test update a single line
//        User user = new User(3, "Hoang", "Hoang@gmail.vn", "Hoangmeomeo123");
//        UserDAO.getInstance().update(user);

        // test update multiple lines
        for (int i = 1; i < 10000; i++) {
            User user = new User(i+3, "Testing_update_" + i , "testing@gmail.test_update_" + i, "123456");
            UserDAO.getInstance().update(user);
        }
    }
}
