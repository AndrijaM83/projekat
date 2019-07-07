package start;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\win7\\Desktop\\ChromeD\\chromedriver.exe");
			Testiranje.testIzlet();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}