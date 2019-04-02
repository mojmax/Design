package singleton;

public class ThreadSafeDoubleLocking {

	private static ThreadSafeDoubleLocking instance;

	private ThreadSafeDoubleLocking() {
	}

	public static ThreadSafeDoubleLocking getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeDoubleLocking.class) {
				if (instance == null) {
					instance = new ThreadSafeDoubleLocking();
				}
			}
		}
		return instance;
	}
}
