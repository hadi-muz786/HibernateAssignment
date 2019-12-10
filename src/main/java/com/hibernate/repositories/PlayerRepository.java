package com.hibernate.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entities.PlayerEntity;

public class PlayerRepository {

	private SessionFactory sessionFactory;

	public void save(PlayerEntity player) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(player);

		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
