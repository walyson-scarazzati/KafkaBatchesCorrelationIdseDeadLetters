package br.com.alura.ecommerce;

public class User {
	private final String uuid;

	public User(String uuid) {
		super();
		this.uuid = uuid;
	}

	public String getReportPath() {
		return "target/" + uuid + "-report.txt";
	}
	
	public String getUuid() {
		return uuid;
	}
}
