package testing;

import DAO.UserDAO;
import model.User;

import java.util.ArrayList;

public class TestSelectQueryUser {
    public static void main(String[] args) {
        ArrayList<User> listUser = UserDAO.getInstance().SelectAll();
        for (User user : listUser) {
            System.out.println(user.toString());
        }
    }
}
