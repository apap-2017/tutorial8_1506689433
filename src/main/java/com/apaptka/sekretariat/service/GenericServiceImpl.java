package com.apaptka.sekretariat.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by AufaHR on 10/21/2017.
 */
@Service
public abstract class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K> {

    private JpaRepository<E, K> jpaRepository;

    public GenericServiceImpl(JpaRepository<E, K> jpa) {
        this.jpaRepository = jpa;
    }

    public GenericServiceImpl() {
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<E> getAll() {
        return jpaRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public E get(K id) {
        return jpaRepository.findOne(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateOrCreate(E entity) {
        jpaRepository.save(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E entity) {
        jpaRepository.delete(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(K id) {
        jpaRepository.delete(id);
    }
}