interface WiFiEnabled {
    void connectWiFi();
}

interface VoiceControlled {
    void voiceCommand(String command);
}

interface MusicPlayer {
    void playMusic();
}

interface VideoStreaming {
    void streamVideo();
}

interface TemperatureMonitor {
    void showTemperature();
}


// Smart TV
class SmartTV implements WiFiEnabled,
        VoiceControlled,
        MusicPlayer,
        VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart TV connected to Wi-Fi.");
    }

    public void voiceCommand(String command) {
        System.out.println("TV voice command: " + command);
    }

    public void playMusic() {
        System.out.println("Smart TV playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart TV streaming video.");
    }
}


// Smart Phone
class SmartPhone implements WiFiEnabled,
        VoiceControlled,
        MusicPlayer {

    public void connectWiFi() {
        System.out.println("Smart Phone connected to Wi-Fi.");
    }

    public void voiceCommand(String command) {
        System.out.println("Phone voice command: " + command);
    }

    public void playMusic() {
        System.out.println("Smart Phone playing music.");
    }
}


// Smart AC
class SmartAC implements WiFiEnabled,
        VoiceControlled,
        TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Smart AC connected to Wi-Fi.");
    }

    public void voiceCommand(String command) {
        System.out.println("AC voice command: " + command);
    }

    public void showTemperature() {
        System.out.println("Current temperature: 24°C");
    }
}


// Smart Speaker
class SmartSpeaker implements WiFiEnabled,
        VoiceControlled,
        MusicPlayer {

    public void connectWiFi() {
        System.out.println("Smart Speaker connected to Wi-Fi.");
    }

    public void voiceCommand(String command) {
        System.out.println("Speaker voice command: " + command);
    }

    public void playMusic() {
        System.out.println("Smart Speaker playing music.");
    }
}


// Smart Car
// Added without modifying any existing interface
class SmartCar implements WiFiEnabled,
        VoiceControlled,
        MusicPlayer,
        VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart Car connected to Wi-Fi.");
    }

    public void voiceCommand(String command) {
        System.out.println("Smart Car voice command: " + command);
    }

    public void playMusic() {
        System.out.println("Smart Car playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart Car streaming video.");
    }
}


// Main class
public class SmartDeviceControl {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        SmartPhone phone = new SmartPhone();

        SmartAC ac = new SmartAC();

        SmartSpeaker speaker = new SmartSpeaker();

        SmartCar car = new SmartCar();

        System.out.println("===== SMART DEVICE CONTROL SYSTEM =====");

        System.out.println("\n--- Smart TV ---");
        tv.connectWiFi();
        tv.voiceCommand("Open YouTube");
        tv.playMusic();
        tv.streamVideo();

        System.out.println("\n--- Smart Phone ---");
        phone.connectWiFi();
        phone.voiceCommand("Call Albin");
        phone.playMusic();

        System.out.println("\n--- Smart AC ---");
        ac.connectWiFi();
        ac.voiceCommand("Set temperature to 22");
        ac.showTemperature();

        System.out.println("\n--- Smart Speaker ---");
        speaker.connectWiFi();
        speaker.voiceCommand("Play music");
        speaker.playMusic();

        System.out.println("\n--- Smart Car ---");
        car.connectWiFi();
        car.voiceCommand("Play my playlist");
        car.playMusic();
        car.streamVideo();
    }
}