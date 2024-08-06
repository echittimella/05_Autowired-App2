package in.chittimella;


import org.springframework.stereotype.Component;

@Component
public class MySqlUserDaoImpl implements UserDao {
	
	
	public MySqlUserDaoImpl() {
		System.out.println("MySqlUserDaoImpl:: Constructor");
	}


	
	public String getNameById(int id) {
		return "Eashwar from MySqlUserDaoImpl";
	}

}
