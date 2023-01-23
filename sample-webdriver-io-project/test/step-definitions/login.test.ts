import { Given, When, Then } from '@wdio/cucumber-framework';

import loginPage from '../pageobjects/login.page';


Given(/^I am on the (\w+) page$/, async (page:string) => {
    await loginPage.launchApplication();
});

When(/^I login with (\w+) and (.+)$/, async (username:string, password:string) => {
    await loginPage.login(username, password);
});

Then(/^I should navigate to product page with title (\w+)$/, async (title:string) => {
    await loginPage.verifyTitle(title);
    await browser.pause(2000);
});

