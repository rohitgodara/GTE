package ioc.bean.di.three.config;

public class DataSource {

	private String className;
	private int maxConnection;
	private boolean isActive;
	private int minConnection;
	private String dbName;

	public DataSource(String className, int maxConnection, boolean isActive, int minConnection, String dbName) {
		super();
		this.className = className;
		this.maxConnection = maxConnection;
		this.isActive = isActive;
		this.minConnection = minConnection;
		this.dbName = dbName;
	}

	public String getClassName() {
		return className;
	}

	public int getMaxConnection() {
		return maxConnection;
	}

	public boolean isActive() {
		return isActive;
	}

	public int getMinConnection() {
		return minConnection;
	}

	public String getDbName() {
		return dbName;
	}

}
