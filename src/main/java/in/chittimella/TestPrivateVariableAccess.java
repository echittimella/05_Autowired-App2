package in.chittimella;

import java.lang.reflect.Field;

public class TestPrivateVariableAccess {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException, InstantiationException {
		// TODO Auto-generated method stub

		Class<?> clz = Class.forName("in.chittimella.User");
		Object newInstance = clz.newInstance();
		User user = (User) newInstance;

		Field declaredField = clz.getDeclaredField("age");
		declaredField.setAccessible(true);
		declaredField.set(user, 43);
		user.printAge();

	}

}
