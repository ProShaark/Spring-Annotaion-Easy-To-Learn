package autowired;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {
		ApplicationContext acc = new ClassPathXmlApplicationContext("ByNameBeans.xml");
		Company company = acc.getBean("company", Company.class);

		company.compnayWork();
	}

}
