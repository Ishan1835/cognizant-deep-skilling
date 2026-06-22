public abstract class NotifierDecorator implements Notifier {

    protected final Notifier wrappedNotifier;

    protected NotifierDecorator(Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}
