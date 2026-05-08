package org.entity.practice1;

public class Main1 {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = userService.findById(3L);
        if (user != null) {
            System.out.println(user.toString());
        } else {
            System.out.println("User not found");
        }
    }
}