package jp.co.sbpayment.sample.browseroperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jp.co.sbpayment.sample.browseroperation.scenario.SampleScenario;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class Application {

    private final SampleScenario scenario;

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
            Application app = ctx.getBean(Application.class);
            app.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run(String[] args) {
        scenario.exec();
    }
}