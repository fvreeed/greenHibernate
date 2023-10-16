package com.green.greenHibernate.controller;

import com.green.greenHibernate.dao.UserDAO;
import com.green.greenHibernate.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping()
    User create(@RequestBody User user) {
        return userDAO.create(user);
    }

    @GetMapping("/pagination")
    List<User> read(@RequestParam int limit, @RequestParam int offset) {
        return userDAO.read(limit, offset);
    }

    @PostMapping("/{id}")
    User update(@RequestBody User user, @PathVariable int id) {
        return userDAO.update(user);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        userDAO.delete(id);
    }

    @GetMapping("/{id}")
    Optional<User> findById(@PathVariable int id) {
        return userDAO.findById(id);
    }
}