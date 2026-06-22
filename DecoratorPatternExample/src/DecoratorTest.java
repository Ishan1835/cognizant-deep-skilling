public class DecoratorTest {

    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();

        Notifier emailAndSms = new SMSNotifierDecorator(basicNotifier);

        Notifier emailSmsAndSlack = new SlackNotifierDecorator(new SMSNotifierDecorator(basicNotifier));

        System.out.println("-- Basic notifier --");
        basicNotifier.send("Server CPU usage is high");

        System.out.println("-- Email + SMS --");
        emailAndSms.send("Deployment finished successfully");

        System.out.println("-- Email + SMS + Slack --");
        emailSmsAndSlack.send("Production outage detected");
    }
}
