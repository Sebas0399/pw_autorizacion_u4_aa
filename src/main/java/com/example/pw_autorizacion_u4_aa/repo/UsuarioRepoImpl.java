package com.example.pw_autorizacion_u4_aa.repo;

import com.example.pw_autorizacion_u4_aa.repo.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepo{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Usuario readByUserName(String userName) {
        TypedQuery<Usuario>myQuery=this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.nombre:=userName", Usuario.class);
        myQuery.setParameter("userName",userName);
        return myQuery.getSingleResult();
    }
}
