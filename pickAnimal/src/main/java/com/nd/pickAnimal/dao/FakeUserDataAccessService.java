package com.nd.pickAnimal.dao;
import com.nd.pickAnimal.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao{

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user){
        DB.add(new User(id, user.getName()));
        return 1;
    }

    @Override
    public List<User> selectAllPeople(){
        return DB;
    }
}
