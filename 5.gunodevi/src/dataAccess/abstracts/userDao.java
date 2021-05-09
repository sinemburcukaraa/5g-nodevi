package dataAccess.abstracts;

import java.util.List;

import entities.concretes.user;

public interface userDao {
   void add(user user);
   void update(user user);
   void delete(user user);
   
   List<user> getAll(); 

}
