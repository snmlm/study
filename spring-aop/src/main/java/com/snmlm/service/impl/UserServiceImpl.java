package com.snmlm.service.impl;

import com.snmlm.service.UserService;

/**
 * @author: snmlm
 * @create: 2021-05-11
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add a User");
    }

    @Override
    public void delete() {
        System.out.println("delete a User");
    }

    @Override
    public void update() {
        System.out.println("update a User");
    }

    @Override
    public void select() {
        System.out.println("select a User");
    }
}
