package MOd;

public class Controls {
    private String manual;
    private String automatic;

    Controls(String manual, String automatic) {
        this.manual = manual;
        this.automatic = automatic;
    }

    public String getManual() {
        return manual;
    }

    public String getAutomatic() {
        return automatic;
    }
}
