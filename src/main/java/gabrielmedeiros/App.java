package gabrielmedeiros;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
	{
    	
		// var emf = Persistence.createEntityManagerFactory("Default");
        // var entityManager = emf.createEntityManager();
        
        
        var homeNumber = new PhoneNumber(81, "99999-9999", "home");
        var workNumber = new PhoneNumber(55, "11111-1111", "work");
        var phones = new ArrayList<PhoneNumber>();
        phones.add(homeNumber);
        phones.add(workNumber);
        var user = new User("gabriel", "gabriel@some.place", "passpass", phones);

        
        var homeNumber2 = new PhoneNumber(81, "22222-2222", "home2");
        var workNumber2 = new PhoneNumber(55, "22222-2121", "work2");
        var phones2 = new ArrayList<PhoneNumber>();
        phones2.add(homeNumber2);
        phones2.add(workNumber2);  
        var user2 = new User("john", "john@some.place", "paspasssspass", phones2);


        var homeNumber3 = new PhoneNumber(81, "33333-3333", "home3");
        var workNumber3 = new PhoneNumber(55, "33333-4141", "work3");
        var phones3 = new ArrayList<PhoneNumber>();
        phones3.add(homeNumber3);
        phones3.add(workNumber3);
        var user3 = new User("thirdman", "third@some.place", "thethirddude", phones3);

        var repo = new UserRepositoryJPA();

        repo.add(user);
        repo.add(user2);
        repo.add(user3);

        repo.delete(user2);

        var homeNumber4 = new PhoneNumber(81, "44444-9999", "home");
        var workNumber4 = new PhoneNumber(55, "44444-1111", "work");
        var phones4 = new ArrayList<PhoneNumber>();
        phones4.add(homeNumber4);
        phones4.add(workNumber4);
        var user4 = new User("john444", "john444@some.place", "paspa4444sssspass", phones4);

        repo.update(3, user4);


        
        

        // entityManager.getTransaction().begin();

        
        // entityManager.persist(user);
        // entityManager.persist(user2);
        // entityManager.persist(homeNumber);
        // entityManager.persist(workNumber);

        // entityManager.persist(user2);
        // entityManager.persist(homeNumber2);
        // entityManager.persist(workNumber2);

        //  entityManager.getTransaction().commit()

        // var gabriel = entityManager.find(User.class, 1);

        // System.out.println(gabriel);

        // entityManager.getTransaction().begin();

        // gabriel.setEmail("gabrielcool@newplace.here");

        // entityManager.getTransaction().commit();

        // System.out.println(entityManager.find(User.class, 1));

        // entityManager.getTransaction().begin();
        
        // entityManager.remove(gabriel);
        // entityManager.remove(workNumber);
        // entityManager.remove(homeNumber);
        // entityManager.getTransaction().commit();

		
    }
}
