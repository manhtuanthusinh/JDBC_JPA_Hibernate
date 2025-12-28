package testing;

import DAO.UserDAO;
import model.User;

public class TestUserDAOInsert {
    public static void main(String[] args) {
        //  test insert
        User user1 = new User("Tuan", "tuanlai@abc", "123456");
        User user2 = new User("QA", "QAcute@xyz", "456789");

        // test insert many lines for loop
        for (int i = 0; i < 10000; i++) {
            User user = new User("Testing_" + i, "testing@gmail.test_" + i, "abc_"+ i );
            UserDAO.getInstance().insert(user);
        }
    }
}
