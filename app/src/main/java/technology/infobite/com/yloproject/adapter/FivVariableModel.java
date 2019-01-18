package technology.infobite.com.yloproject.adapter;

import android.content.Intent;

public class FivVariableModel {

    private int image;
    private String truckname;
    private String truckid;
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

    public FivVariableModel(int image, String truckname, String truckid, String truckdate, String trucktime) {
        this.image = image;
        this.truckname = truckname;
        this.truckid = truckid;
        this.truckdate = truckdate;
        this.trucktime = trucktime;

    }
}
