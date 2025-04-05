package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		//System.out.println("Inside EdgeBrowser class");
		Browser browserOptions = new Browser();
		browserOptions.launchBrowser("Testleaf");
		browserOptions.loadUrl();
	}

}
