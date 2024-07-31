package DecoratorPatternExample;

public class TestClass {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        String message = "Hello, this is decorator pattern";

        System.out.println("Sending notifications via Email:");
        emailNotifier.send(message);

        System.out.println("\nSending notifications via Email and SMS:");
        smsNotifier.send(message);

        System.out.println("\nSending notifications via Email, SMS, and Slack:");
        slackNotifier.send(message);
    }
}
