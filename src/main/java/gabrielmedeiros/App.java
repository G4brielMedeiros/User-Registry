package gabrielmedeiros;

public class App 
{
    public static void main( String[] args )
	{
    	UserRepository repo = new UserRepository();


		repo.getAll().stream().forEach(System.out::println);

		User toUpdate = repo.getById(2);

		toUpdate.setEmail("john_man@email.com");

		repo.update(toUpdate);

		
    }
}
