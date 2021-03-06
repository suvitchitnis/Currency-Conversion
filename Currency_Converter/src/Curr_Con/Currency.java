package Curr_Con;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Currency {
		public String baseUrl = "https://www.ofx.com/en-au/forex-news/historical-exchange-rates/yearly-average-rates/";
		WebDriver driver = null;

		@BeforeTest
		public void launchBrowser() {
			System.setProperty("webdriver.gecko.driver", "D:/New folder/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
		}

		@Test(priority = 0)
		public void verifyHomepageTitle1() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("AUD", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[3]/div/select/option[2]"))
					.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("AUD-USD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 1)
		public void verifyHomepageTitle2() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("AUD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GBP", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("AUD-GBP");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 2)
		public void verifyHomepageTitle3() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP",Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("INR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-INR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 3)
		public void verifyHomepageTitle4() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("PHP", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-PHP");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 4)
		public void verifyHomepageTitle5() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("THB", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-THB");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}


		@Test(priority = 5)
		public void verifyHomepageTitle6() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("SGD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-SGD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 6)
		public void verifyHomepageTitle7() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("EUR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-EUR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 7)
		public void verifyHomepageTitle8() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-USD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 8)
		public void verifyHomepageTitle9() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("IDR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-IDR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 9)
		public void verifyHomepageTitle10() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("AUD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-AUD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 10)
		public void verifyHomepageTitle11() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("MYR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-MYR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 11)
		public void verifyHomepageTitle12() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("TWD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-TWD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 12)
		public void verifyHomepageTitle13() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("GBP", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("HKD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("GBP-HKD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 13)
		public void verifyHomepageTitle14() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("HKD", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("HKD-USD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 14)
		public void verifyHomepageTitle15() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("HKD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GBP", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("HKD-GBP");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 15)
		public void verifyHomepageTitle16() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("SGD", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("SGD-USD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 16)
		public void verifyHomepageTitle17() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("INR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-INR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 17)
		public void verifyHomepageTitle18() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("EUR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-EUR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 18)
		public void verifyHomepageTitle19() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GBP", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-GBP");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 19)
		public void verifyHomepageTitle20() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("MYR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-MYR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 20)
		public void verifyHomepageTitle21() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("SGD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-SGD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 21)
		public void verifyHomepageTitle22() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("IDR", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-IDR");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 22)
		public void verifyHomepageTitle23() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("AUD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-AUD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 23)
		public void verifyHomepageTitle24() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("TWD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-TWD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 24)
		public void verifyHomepageTitle25() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("HKD", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-HKD");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 25)
		public void verifyHomepageTitle26() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("BRL", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-BRL");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 26)
		public void verifyHomepageTitle27() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("USD", Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("PHP", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[3]/div/select/option[2]"))
					.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("USD-PHP");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
			Thread.sleep(4000);
		}

		@Test(priority = 27)
		public void verifyHomepageTitle28() throws InterruptedException {
			driver.findElement(By
					.xpath("//*[@id=\"#main\"]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/span/span[1]/span/span[2]"))
					.click();
			driver.findElement(By.className("select2-search__field")).sendKeys("HKD", Keys.ARROW_DOWN, Keys.ENTER);
			driver.findElement(
					By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[1]/div/div/div[3]/span/span[1]/span"))
					.click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("CNY", Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div/div/div/div[5]/div/div/button")).click();
			System.out.println("HKD-CNY");
			String text = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[2]/div")).getText();
			System.out.println(text);
		}
	}
		