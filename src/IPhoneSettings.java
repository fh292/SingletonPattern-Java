//Define the Singleton Class:
public class IPhoneSettings {

    //Declare private variables
    private int brightness;
    private boolean wifi;

    //Create a Static Instance:
    private static IPhoneSettings instance;

    //Make the constructor private
    private IPhoneSettings() {
        setBrightness(brightness);
    }

    //Public Static Access Method:
    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }

    //Add Settings Methods:
    public void setBrightness(int brightness) {
        if (brightness>=0 && brightness<=100) {
            this.brightness = brightness;
        }else {
            System.out.println("Invalid Brightness Range");
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void enableWiFi(){
        wifi = true;
        System.out.println("WiFi Enabled");
    }

    public void disableWiFi(){
        wifi = false;
        System.out.println("WiFi Disabled");

    }
}
