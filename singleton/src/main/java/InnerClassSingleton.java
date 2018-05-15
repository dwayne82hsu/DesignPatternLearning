public class InnerClassSingleton {

	private static final class SingletonHolder {
		private static final InnerClassSingleton instance = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance() {
		return SingletonHolder.instance;
	}

}
