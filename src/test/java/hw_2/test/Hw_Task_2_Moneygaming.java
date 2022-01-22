package hw_2.test;

import hw_2.page.NavigateToWebPageAndLogin;
import hw_2.page.WarningMessage;
import hw_2.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hw_Task_2_Moneygaming extends TestBase{
        @Test
        public void Test() {
                NavigateToWebPageAndLogin navigate = new NavigateToWebPageAndLogin();


                navigate.signIn();

                WarningMessage warn = new WarningMessage();
                String actualResult = warn.getMessage();
                String expectedResult = ConfigurationReader.get("expectedMessage");
                Assert.assertEquals(actualResult,expectedResult,"warning message is not equal");




        }





        }
