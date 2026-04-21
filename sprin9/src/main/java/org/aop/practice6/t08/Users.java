package org.aop.practice6.t08;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Users {
    public List<String> getUsers () {
        return List.of("anna", "nana");
    }
}
