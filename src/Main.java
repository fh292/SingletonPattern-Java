public class Main {
    public static void main(String[] args) {

        //Test Your Singleton:
        IPhoneSettings iphoneSettings = IPhoneSettings.getInstance();

        iphoneSettings.setBrightness(100);
        System.out.println("Brightness Level: "+ iphoneSettings.getBrightness());
        iphoneSettings.disableWiFi();
        iphoneSettings.enableWiFi();
    }
}