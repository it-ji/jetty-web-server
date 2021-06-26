package itji.example.jetty.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class MyServer {

	public static void main(String[] args) throws Exception {
		new MyServer().start();
	}

	private void start() throws Exception{
		Server server = new Server();
		ServerConnector httpConector = new ServerConnector(server);
		httpConector.setHost("127.0.0.1");
		httpConector.setPort(8080);
		server.addConnector(httpConector);
		
		ServletHandler servletHandler = new ServletHandler();
		servletHandler.addServletWithMapping(MyServlet.class, "/");
		server.setHandler(servletHandler);
		
		server.start();
		server.join();
		
	}
	
}
