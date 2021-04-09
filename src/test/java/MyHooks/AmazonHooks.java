package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {


@Before("@Smoke")
	public void setUp_browser(Scenario sc)
{
	System.out.println("launch the browser");
	System.out.println(sc.getName());
}	

//@Before(order=1)
//public void setUp_url()
//{
//System.out.println("launch the url");
//}
//
//@After(order=1)
//public void tearDown_close()
//{
//	System.out.println("close the browser");
//}

@After("@Smoke")
public void tearDown_logout()
{
	System.out.println("logout form application");
}
//@BeforeStep
//public void takescreenshot()
//{
//	System.out.println("takes the screenshot");
//}
//
//@AfterStep
//public void refresh()
//{
//	System.out.println("refresh the page");
//}
}
