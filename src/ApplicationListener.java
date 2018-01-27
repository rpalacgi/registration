
import java.util.HashMap;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ApplicationListener() {
		// TODO Auto-generated constructor stub
	}

	public void contextDestroyed(ServletContextEvent arg0) {
	}

	public void contextInitialized(ServletContextEvent sce) {

		Map<String, String> colors = new HashMap<String, String>();
		colors.put("Blue", "BLUE");
		colors.put("Red", "RED");
		colors.put("Green", "GREEN");
		colors.put("White", "WHITE");

		Map<String, String> hobbies = new HashMap<String, String>();

		hobbies.put("violin", "Violin");
		hobbies.put("programming", "Programing");
		hobbies.put("electronics", "Electronics");
		hobbies.put("web", "Web Design");

		ServletContext servletContex = sce.getServletContext();
		servletContex.setAttribute("appListColors", colors);
		servletContex.setAttribute("appListHobbies", hobbies);

	}

}
