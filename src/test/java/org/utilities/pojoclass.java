package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends BaseClass{
	public pojoclass() {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='/account/login']) [1]")
	private WebElement btnlogin;
	
	@FindBy(xpath="(//input[@type='email']) [1]")
	private WebElement txtuser;
	
	@FindBy(xpath="(//input[@type='password']) [1]")
	private WebElement txtpass;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement clickbtn;
	
	@FindBy(xpath="(//a[@class='btn button_2']) [2]")
	private WebElement getMen;
	
	@FindBy(xpath="(//img[@class='hover  show_ navy']) [2]")
	private WebElement getMenShirt;
	
	
	@FindBy(xpath="(//a[@class='btn button_1']) [2]")
	private WebElement getWomen;
	
	@FindBy(xpath="(//img[@class='hover  show_ black']) [1]")
	private WebElement getwomanshirt;
	
	@FindBy(id="Path_3")
	private WebElement getBag;

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public WebElement getGetMen() {
		return getMen;
	}

	public WebElement getGetMenShirt() {
		return getMenShirt;
	}

	public WebElement getGetWomen() {
		return getWomen;
	}

	public WebElement getGetwomanshirt() {
		return getwomanshirt;
	}

	public WebElement getGetBag() {
		return getBag;
	}
}
