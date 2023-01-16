

class Locators {

    public get input_username(): Promise<WebdriverIO.Element> {
        return $("#user-name");
    }

    public get input_password(): Promise<WebdriverIO.Element> {
        return $("#password");
    }

    public get button_login(): Promise<WebdriverIO.Element> {
        return $("#login-button");
    }

    public get title_products(): Promise<WebdriverIO.Element> {
        return $(".title");
    }

    public get search_google(): Promise<WebdriverIO.Element> {
        return $("[name='q']");
    }
}
export default new Locators();