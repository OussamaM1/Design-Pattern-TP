package home;

import invoker.RemoteControl;

public class SmartHome {

    private final String homeName; //required
    private final int zip; // required
    private final Adresse adresse;
    private final RemoteControl remoteControl;

    public SmartHome(ConcretSmartHomeBuilder smartHomeBuilder) {
        this.adresse = smartHomeBuilder.adresse;
        this.homeName = smartHomeBuilder.homeName;
        this.remoteControl = smartHomeBuilder.remoteControl;
        this.zip = smartHomeBuilder.zip;
    }

    // All getter, and NO setter to provde immutability

    public String getHomeName() {
        return homeName;
    }

    public int getZip() {
        return zip;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    /**
     * @return le rapport de l'utilisation du RemoteController
     */
    public String report() {
        return remoteControl.getReport();
    }


    public static class ConcretSmartHomeBuilder {
        private final String homeName; //required
        private final int zip; // required
        private Adresse adresse;
        private RemoteControl remoteControl;

        public ConcretSmartHomeBuilder(String homeName, int zip) {
            this.homeName = homeName;
            this.zip = zip;
        }

        public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
            this.remoteControl = remoteControl;
            return this;
        }

        public SmartHome build() {
            SmartHome smartHome = new SmartHome(this);
            return smartHome;
        }

    }


}
