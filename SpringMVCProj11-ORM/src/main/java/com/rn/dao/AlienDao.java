package com.rn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rn.model.Alien;

@Component("dao")
public class AlienDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Alien> getAlies() {
		Session session = sessionFactory.getCurrentSession();
		List<Alien> list = session.createQuery("from Alien", Alien.class).list();
		return list;
	}

	@Transactional
	public Alien getAlienById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Alien a = session.get(Alien.class, id);
		return a;
	}

	@Transactional
	public void insertAlien(Alien alien) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(alien);
	}

}
