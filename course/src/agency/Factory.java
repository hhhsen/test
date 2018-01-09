package agency;

public class Factory {
	public static Subject getInstance(String className){
		try {
			Class<?>clz = Class.forName(className);
			Subject subject = (Subject)clz.newInstance();
			return subject;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
