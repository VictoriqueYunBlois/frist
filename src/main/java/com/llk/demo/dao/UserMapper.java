package com.llk.demo.dao;

import com.llk.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selByName(String name);
}
