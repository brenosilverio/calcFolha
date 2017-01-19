package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Users;

@Repository
@Transactional
public class UserDao {
    
    @PersistenceContext
    private EntityManager manager;

    public void save(Users users) {
        manager.persist(users);
    }
    
    /*public void gravaProduto(Produto produto) {
        manager.persist(produto);
    }*/
}
