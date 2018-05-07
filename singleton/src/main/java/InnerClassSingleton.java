public class InnerClassSingleton {

	private static class SingletonHolder {
		private static final InnerClassSingleton instance = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance() {
		return SingletonHolder.instance;
	}

}
