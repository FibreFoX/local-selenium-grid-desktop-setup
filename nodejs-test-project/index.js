var webdriver = require('selenium-webdriver');

// Input capabilities
var capabilities = {
    // "firefox" does not work with CURRENT version of webdriver?!?
    // https://github.com/SeleniumHQ/selenium/issues/3115
    // http://stackoverflow.com/a/40650113/815139
    'browserName' : 'chrome'
}

var driver = new webdriver.Builder().
    usingServer('http://localhost:4444/wd/hub').
    withCapabilities(capabilities).
    build();

driver.get('http://www.google.com');
driver.findElement(webdriver.By.name('q')).sendKeys('BrowserStack');
driver.findElement(webdriver.By.name('btnG')).click();

driver.getTitle().then(function(title) {
  // do some testing here
});


// https://www.browserstack.com/automate/node
var fs = require('fs');

webdriver.WebDriver.prototype.saveScreenshot = function(filename) {
    return driver.takeScreenshot().then(function(data) {
        fs.writeFile(filename, data.replace(/^data:image\/png;base64,/,''), 'base64', function(err) {
            if(err) throw err;
        });
    })
};

driver.saveScreenshot('snapshot1.png');

// do always QUIT
driver.quit();
