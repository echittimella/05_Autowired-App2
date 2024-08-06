package in.chittimella;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {
	public String getNameById(int id);
}
