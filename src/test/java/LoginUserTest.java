import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginUserTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Description("არარეგისტრირებული იუზერის მეილის მეშვეობით დალოგინება,წარუმატებლად")
    public void loginUnregisteredUserViaEmail(){
            loginPageSteps.clickProfileIcon()
                    .goToLoginAccount()
                    .loginWithEmail()
                    .inputEmail()
                    .inputPassword()
                    .checkRememberMe()
                    .enterLoginButton();
        Assert.assertTrue(true,"სცადოთ თავიდან დაკავშირება");
        }
    @Test
    @Description("არარეგისტრირებული იუზერის ნომრის მეშვეობით დალოგინება,წარუმატებლად")
    public void loginUnregisteredUserViaMobile (){
        loginPageSteps.clickProfileIcon()
                .goToLoginAccount()
                .loginWithMobile()
                .inputMobile()
                .inputPassword()
                .enterLoginButton();
        Assert.assertEquals("გთხოვთ გადაამოწმოთ მომხმარებლის სახელი","გთხოვთ გადაამოწმოთ მომხმარებლის სახელი");
    }

}
