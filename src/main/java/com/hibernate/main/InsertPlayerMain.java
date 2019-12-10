package com.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.entities.PlayerEntity;
import com.hibernate.repositories.PlayerRepository;

public class InsertPlayerMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		PlayerRepository playerRepository = (PlayerRepository) ctx.getBean("playerRepository");

		PlayerEntity p = new PlayerEntity();
		p.setName("CR7");
		p.setPosition("Attacker");
		p.setAge("34");
		p.setTotalgoal("789");

		playerRepository.save(p);

	}

}
