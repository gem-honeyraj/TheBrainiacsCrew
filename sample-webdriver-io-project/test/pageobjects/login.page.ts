import locator from "../locators/locator";
import * as action from "gem-webdriver-io/generic/web-actions";

class LoginPage {

    public async launchApplication () {
        await action.open();
        await action.maximizeWindow();
        await action.setImplicitTimeout(20);
    }

    public async login (username: string, password: string) {
        await action.typeText(locator.input_username, username);
        await action.typeText(locator.input_password, password, "password");
        await action.clickOn(locator.button_login, "login");
    }

    public async verifyTitle (title: string) {
        const actualTitle:string = await action.getElementText(locator.title_products);
        action.verifyEquals(title, actualTitle, "Title");
    }

}

export default new LoginPage();
