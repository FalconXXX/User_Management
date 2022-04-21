package test;

import model.User;
import model.UserException;

public class TestUser {

    public static void testUser()
    {
        User u1, u2,u3;

        try {
            u1 = new User("Aljjy","Pegg",24);
         //   u2 = new User("A","Pegg",24);
          //  u2 = new User("Al","G",24);
         //   u2 = new User("Al","Ge",15);
            u2 = new User("Al","Ge",70);
            System.out.println(u1);
            System.out.println(u2);
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
         TestUser.testUser();

    }
}

