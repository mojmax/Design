package proxy;

import java.io.IOException;

public class TestProxy {
	public static void main(String[] args) {
		CommandExecutorProxy proxy = new CommandExecutorProxy("moj");
		try {
			proxy.runCommand("cmd /C start ./src/proxy/CV-Europass-20190220-Mojetta-EN.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}
}
