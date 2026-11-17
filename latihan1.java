
interface Notifier {
    void send(String message);
}

// Kelas Email
class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

// Kelas SMS
class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

// Kelas WhatsApp
class WhatsAppNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

// Kelas Telegram
class TelegramNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Telegram: " + message);
    }
}

// Service notifikasi
class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String message) {
        notifier.send(message);
    }
}

// Program utama
public class latihan1 {
    public static void main(String[] args) {

        NotificationService email =
            new NotificationService(new EmailNotifier());

        NotificationService sms =
            new NotificationService(new SMSNotifier());

        NotificationService whatsapp =
            new NotificationService(new WhatsAppNotifier());

        NotificationService telegram =
            new NotificationService(new TelegramNotifier());

        email.notify("Halo, ini email test!");
        sms.notify("Ini SMS test!");
        whatsapp.notify("Ini pesan WhatsApp test!");
        telegram.notify("Ini pesan Telegram test!");
    }
}
