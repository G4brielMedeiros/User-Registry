package gabrielmedeiros;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class UserRepositoryJPA {

    EntityManager eManager = Persistence.createEntityManagerFactory("Default").createEntityManager();
    

    public List<User> getAll(){
        return eManager.createQuery("SELECT a from User a", User.class).getResultList();
    }

    public User getById(int id){
        return eManager.find(User.class, id);
    }

    public void add(User entity) {

        var user = entity;

        eManager.getTransaction().begin();
        eManager.persist(user);
        eManager.getTransaction().commit();

    }

    public void delete(User entity) {
        eManager.getTransaction().begin();
        eManager.remove(entity);

        eManager.getTransaction().commit();
    }

    public void update(int id, User entity) {
        
        User user = eManager.find(User.class, id);
        eManager.getTransaction().begin();
        user.setEmail(entity.getEmail());
        user.setName(entity.getName());
        user.setPassword(entity.getPassword());

        
        user.getContacts().clear();
        user.getContacts().addAll(entity.getContacts());
        eManager.getTransaction().commit();
    }
    
}
