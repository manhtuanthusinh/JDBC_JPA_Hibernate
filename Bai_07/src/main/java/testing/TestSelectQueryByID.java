package testing;

import DAO.UserDAO;
import model.User;

public class TestSelectQueryByID {
    public static void main(String[] args) {
        User find = new User();
        find.setId(3);
        User user1 = UserDAO.getInstance().SelectByID(find);
        System.out.println(user1);
    }
}
