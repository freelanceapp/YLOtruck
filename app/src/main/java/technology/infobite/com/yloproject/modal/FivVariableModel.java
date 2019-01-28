package technology.infobite.com.yloproject.modal;

import android.content.Intent;

public class FivVariableModel {

    private int image;
    private String truckname;
    private String truckid;
    private String charge;
    private String truckdate;
    private String trucktime;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTruckname() {
        return truckname;
    }

    public void setTruckname(String truckname) {
        this.truckname = truckname;
    }

    public String getTruckid() {
        return truckid;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public void setTruckid(String truckid) {
        this.truckid = truckid;
    }

    public String getTruckdate() {
        return truckdate;
    }

    public void setTruckdate(String truckdate) {
        this.truckdate = truckdate;
    }

    public String getTrucktime() {
        return trucktime;
    }

    public void setTrucktime(String trucktime) {
        this.trucktime = trucktime;
    }

    public FivVariableModel(int image, String truckname, String truckid,String charge, String truckdate, String trucktime) {
        this.image = image;
        this.truckname = truckname;
        this.truckid = truckid;
        this.charge = charge;
        this.truckdate = truckdate;
        this.trucktime = trucktime;

    }
}
