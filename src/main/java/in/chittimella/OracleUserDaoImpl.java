package in.chittimella;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OracleUserDaoImpl implements UserDao {
	
	
	public OracleUserDaoImpl() {
		System.out.println("OracleUserDaoImpl:: Constructor");
	}


	
	public String getNameById(int id) {
		return "Eashwar from OracleUserDaoImpl";
	}

}
