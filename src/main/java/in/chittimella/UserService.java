package in.chittimella;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	
	public UserService() {
		System.out.println("UserService:: Constructor");
	}
	
	
	@Autowired
	private UserDao uDao;
	
	public String getUserName(int id) {
		return uDao.getNameById(id);
		
		
	}
	
	
	
}
