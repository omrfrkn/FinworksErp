package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ybilgin
 * @project Template
 */


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    
}
