package sg.edu.rp.c346.id22021506.demoandroidlist;

public class AndroidVersion {
    private String name;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }



    public void setVersion(String version) {
        this.version = version;
    }


    private String version;

    @Override
    public String toString(){
        return "AndroidVersion{"+
                "name='" +name + '\''+
                ", version'" +version +'\''+
                ')';
    }
}
