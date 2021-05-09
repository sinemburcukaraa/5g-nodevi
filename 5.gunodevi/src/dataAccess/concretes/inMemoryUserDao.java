package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.userDao;
import entities.concretes.user;

public class inMemoryUserDao implements userDao{
	
	public List<user> users;

    public inMemoryUserDao() {
    	this.users=new ArrayList<user>();
	}
	@Override
	public void add(user user) {
       System.out.println("Kullan�c� eklendi : " +user.getFirstname());		
	}

	@Override
	public void update(user user) {
	       System.out.println("Kullan�c� g�ncellendi : " +user.getFirstname());		
		
	}

	@Override
	public void delete(user user) {
	       System.out.println("Kullan�c� silindi : " +user.getFirstname());		
		
	}

	@Override
	public List<user> getAll() {
		return null;
	}

}
