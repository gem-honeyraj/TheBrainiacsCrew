import locator from "../locators/locator";
// import { expect as chaiExpect } from "chai";
import * as action from "gem-webdriver-io/generic/web-actions";


class LoginPage {

    public async launchApplication () {
        // without gem-wdio
        // await browser.url("");
        // await browser.maximizeWindow();
        // await browser.setTimeout({ 'implicit': 20000 });

        // with gem-wdio
        await action.open();
        await action.maximizeWindow();
        await action.setImplicitTimeout(20);
    }

    public async login (username: string, password: string) {
        // without gem-wdio
        // await (await locator.input_username).setValue(username);
        // await (await locator.input_password).setValue(password);
        // await (await locator.button_login).click();

        // with gem-wdio
        await action.typeText(locator.input_username, username);
        await action.typeText(locator.input_password, password, "password");
        await action.clickOn(locator.button_login, "login");
    }

    public async verifyTitle (title: string) {
        // without gem-wdio
        // const actualTitle:string = await (await locator.title_products).getText();
        // chaiExpect(actualTitle).equal(title);

        // with gem-wdio
        const actualTitle:string = await action.getElementText(locator.title_products);
        action.verifyEquals(title, actualTitle, "Title");
    }

}

export default new LoginPage();
