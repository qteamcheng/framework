package org.naruto.framework.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/user/register", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity<User> register(@RequestBody User user){
        user.setId("1");
        return ResponseEntity.ok(user);
    }
}
