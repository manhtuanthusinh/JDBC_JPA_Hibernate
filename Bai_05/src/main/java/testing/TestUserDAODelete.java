package testing;

import DAO.UserDAO;
import model.User;

public class TestUserDAODelete {
    public static void main(String[] args) {

        for (int i = 4; i < 10000; i++) {
            User user = new User(i, "abc", "xyz", "333");
            UserDAO.getInstance().delete(user);
        }

    }
}
