package edu.aku.hassannaqvi.amanhicovid_19study.models;

public class SyncModel {
    String tableName;
    int upLoadsize;
    String status;
    int statusID;
    String message;
    String select = null;
    String filter = null;

    public SyncModel(String tableName, int upLoadsize) {

        this.tableName = tableName;
        this.status = "";
        this.statusID = 0;
        this.message = "";
        this.upLoadsize = upLoadsize;


    }

    public SyncModel(String tableName, String select) {

        this.tableName = tableName;
        this.status = "";
        this.statusID = 0;
        this.message = "";
        this.select = select;
    }


    public SyncModel(String tableName, String select, String filter) {

        this.tableName = tableName;
        this.status = "";
        this.statusID = 0;
        this.message = "";
        if (select != null)
            this.select = select;
        if (filter != null)
            this.filter = filter;

    }

    public SyncModel(String tableName, String select, String filter, int toSync) {

        this.tableName = tableName;
        this.status = "";
        this.statusID = 0;
        this.message = "";
        this.upLoadsize = 0;
        if (select != null)
            this.select = select;
        if (filter != null)
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

    public String getFilter() {

        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSelect() {
        return select;
    }

    public int getUpLoadsize() {
        return upLoadsize;
    }

    public void setUpLoadsize(int upLoadsize) {
        this.upLoadsize = upLoadsize;
    }
}
