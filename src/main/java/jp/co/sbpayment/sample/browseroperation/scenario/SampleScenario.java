package jp.co.sbpayment.sample.browseroperation.scenario;

import static com.codeborne.selenide.Selenide.open;

import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import org.springframework.stereotype.Component;

@Component
public class SampleScenario {

    static {
        // Selenide
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.headless = false;
        Configuration.browserSize = "1024x768";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }

    public void exec() {
        open("https://www.google.co.jp");

        try {
            TimeUnit.SECONDS.sleep(5L);
        } catch(InterruptedException ex) {
            // 何もしない
        }
    }
}