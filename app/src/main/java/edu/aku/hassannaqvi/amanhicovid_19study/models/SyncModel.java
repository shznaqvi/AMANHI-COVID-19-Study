package edu.aku.hassannaqvi.amanhicovid_19study.models;

public class SyncModel {
    String tableName;
    String status;
    int statusID;
    String message;
    String select = null;
    String filter = null;

    public SyncModel(String tableName) {

        this.tableName = tableName;
        this.status = "";
        this.statusID = 0;
        this.message = "";


    }

    public SyncModel(String tableName, String select, String filter) {

        this.tableName = tableName;
        this.status = "";
        this.statusID = 0;
        this.message = "";
        this.select = select;
        this.filter = filter;


    }


    public String gettableName() {
        return tableName;
    }

    public void settableName(String tableName) {
        this.tableName = tableName;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public int getstatusID() {
        return statusID;
    }

    public void setstatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }
}
