package com.example.pw_autorizacion_u4_aa.repo;

import com.example.pw_autorizacion_u4_aa.repo.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepo{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Usuario readByUserName(String userName) {
        TypedQuery<Usuario> myQuery=this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.nombre=:userName", Usuario.class);
        myQuery.setParameter("userName",userName);
        return myQuery.getSingleResult();
    }
}
