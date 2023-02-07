package com.PDCase.erp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.PDCase.erp.model.Empresa;

public class SchemaGeneration {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PDCasePU");

		EntityManager em = emf.createEntityManager();

		List<Empresa> lista = em.createQuery("from Empresa", Empresa.class).getResultList();

		System.out.println(lista);

		em.close();
		emf.close();
	}

}
