package edu.aku.hassannaqvi.amanhicovid_19study.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.threeten.bp.LocalDate;

import edu.aku.hassannaqvi.amanhicovid_19study.BR;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;

public class Form4mm extends BaseObservable {
    //Main Variables
    private String TAG = "Form4mm";
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = "";
    private String uid = "";
    private String userName = "";
    private String sysDate = "";
    private String studyid = "";
    private String dssid = "";
    private String week = "";
    private String deviceId = "";
    private String deviceTag = "";
    private String appver = "";
    private String gps = "";
    private String endTime = "";
    private String iStatus = "";
    private String iStatus96x = "";
    private String synced = "";
    private String syncDate = "";
    private String s02 = "";


    private String mmsid = "";
    private String mm0101 = "";

    private String mm0702_chklmp = "";

    public String getiStatus96x() {
        return iStatus96x;
    }

    private String mm0102 = "";
    private String mm0102a = "";

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getiStatus() {
        return iStatus;
    }

    private String mm0103 = "";
    private String mm0104 = "";

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getMm0702_chklmp() {
        return mm0702_chklmp;
    }

    private String mm0105 = "";
    private String mm0106 = "";
    private String mm0107 = "";
    private String mm0108 = "";
    private String mm0108a = "";
    private String mm0108b = "";
    private String mm0201 = "";
    private String mm202 = "";
    private String mm202077x = "";
    private String mm0301 = "";
    private String mm0302 = "";
    private String mm0303 = "";
    private String mm0304 = "";
    private String mm0305 = "";
    private String mm0306 = "";
    private String mm0307 = "";
    private String mm0308 = "";
    private String mm0309 = "";
    private String mm03010 = "";
    private String mm03011 = "";
    private String mm03012 = "";
    private String mm03013 = "";
    private String mm03014 = "";
    private String mm03015 = "";
    private String mm03016 = "";
    private String mm03017 = "";
    private String mm03018 = "";
    private String mm03019 = "";
    private String mm03020 = "";
    private String mm03021 = "";
    private String mm03022 = "";
    private String mm03023 = "";
    private String mm03024 = "";
    private String mm03025 = "";
    private String mm03026 = "";
    private String mm03027 = "";
    private String mm03028 = "";
    private String mm03029 = "";
    private String mm03030 = "";
    private String mm03031 = "";
    private String mm03032 = "";
    private String mm03033 = "";
    private String mm03034 = "";
    private String mm03035 = "";
    private String mm03036 = "";
    private String mm03037 = "";
    private String mm03038 = "";
    private String mm03039 = "";
    private String mm03040 = "";
    private String mm03041 = "";
    private String mm03042 = "";
    private String mm03043 = "";
    private String mm03044 = "";
    private String mm03045 = "";
    private String mm03046 = "";
    private String mm03047 = "";
    private String mm03048 = "";
    private String mm03049 = "";
    private String mm0401 = "";
    private String mm0402 = "";
    private String mm0403 = "";
    private String mm0404 = "";
    private String mm0405 = "";
    private String mm0406 = "";
    private String mm0407 = "";
    private String mm0408 = "";
    private String mm0409 = "";
    private String mm04010 = "";
    private String mm04011 = "";
    private String mm04012 = "";
    private String mm0501 = "";
    private String mm0502 = "";
    private String mm0503 = "";
    private String mm0504 = "";
    private String mm0505 = "";
    private String mm0506 = "";
    private String mm0507 = "";
    private String mm0508 = "";
    private String mm0508015x = "";
    private String mm05010 = "";
    private String mm05011 = "";
    private String mm05012 = "";
    private String mm05013 = "";
    private String mm0601 = "";
    private String mm0602 = "";
    private String mm0603 = "";
    private String mm0604 = "";
    private String mm0701 = "";
    private String mm0702 = "";

    public void setMm0702_chklmp(String mm0702_chklmp) {
        this.mm0702_chklmp = mm0702_chklmp;
    }
    private String mm0703 = "";

    //Not saving in DB
    private LocalDate localDate = null;

    public Form4mm() {

    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setForm4mm(String userName, String sysDate, String deviceId, String deviceTag, String appver, String gps) {
        this.userName = userName;
        this.sysDate = sysDate;
        this.deviceId = deviceId;
        this.deviceTag = deviceTag;
        this.appver = appver;
        this.gps = gps;
    }


    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }


    @Bindable
    public String getStudyID() {
        return studyid;
    }

    public void setStudyID(String studyid) {
        this.studyid = studyid;
    }


    @Bindable
    public String getDssID() {
        return dssid;
    }

    public void setDssID(String dssid) {
        this.dssid = dssid;
    }


    public String getMm0603() {
        return mm0603;
    }

    public void setMm0603(String mm0603) {
        this.mm0603 = mm0603;
    }

    public String getMm0604() {
        return mm0604;
    }

    public void setMm0604(String mm0604) {
        this.mm0604 = mm0604;
    }

    public String getMm0701() {
        return mm0701;
    }

    public void setMm0701(String mm0701) {
        this.mm0701 = mm0701;
    }

    public String getMm0702() {
        return mm0702;
    }

    public void setMm0702(String mm0702) {
        this.mm0702 = mm0702;
    }

    public String getMm0703() {
        return mm0703;
    }

    public void setMm0703(String mm0703) {
        this.mm0703 = mm0703;
    }


    @Bindable
    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }


    @Bindable
    public String getUid() {
        return uid;
    }

    public Form4mm setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form4mm setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form4mm setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form4mm setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form4mm setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form4mm setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getGps() {
        return gps;
    }

    public Form4mm setGps(String gps) {
        this.gps = gps;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form4mm setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form4mm setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form4mm setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    @Bindable
    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        this.iStatus = iStatus;
        notifyPropertyChanged(BR.iStatus);
    }

    @Bindable
    public String getIStatus96x() {
        return iStatus96x;
    }

    public void setIStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        notifyPropertyChanged(BR.iStatus96x);
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid;
    }

    public String getDssid() {
        return dssid;
    }

    public void setDssid(String dssid) {
        this.dssid = dssid;
    }


    public String getS02() {
        return s02;
    }

    public void setS02(String s02) {
        this.s02 = s02;
    }

    public String getMmsid() {
        return mmsid;
    }

    public void setMmsid(String mmsid) {
        this.mmsid = mmsid;
    }

    public String getMm0101() {
        return mm0101;
    }

    public void setMm0101(String mm0101) {
        this.mm0101 = mm0101;
    }

    public String getMm0102() {
        return mm0102;
    }

    public void setMm0102(String mm0102) {
        this.mm0102 = mm0102;
    }

    public String getMm0102a() {
        return mm0102a;
    }

    public void setMm0102a(String mm0102a) {
        this.mm0102a = mm0102a;
    }

    public String getMm0103() {
        return mm0103;
    }

    public void setMm0103(String mm0103) {
        this.mm0103 = mm0103;
    }

    public String getMm0104() {
        return mm0104;
    }

    public void setMm0104(String mm0104) {
        this.mm0104 = mm0104;
    }

    public String getMm0105() {
        return mm0105;
    }

    public void setMm0105(String mm0105) {
        this.mm0105 = mm0105;
    }

    public String getMm0106() {
        return mm0106;
    }

    public void setMm0106(String mm0106) {
        this.mm0106 = mm0106;
    }

    public String getMm0107() {
        return mm0107;
    }

    public void setMm0107(String mm0107) {
        this.mm0107 = mm0107;
    }

    public String getMm0108() {
        return mm0108;
    }

    public void setMm0108(String mm0108) {
        this.mm0108 = mm0108;
    }

    public String getMm0108a() {
        return mm0108a;
    }

    public void setMm0108a(String mm0108a) {
        this.mm0108a = mm0108a;
    }

    public String getMm0108b() {
        return mm0108b;
    }

    public void setMm0108b(String mm0108b) {
        this.mm0108b = mm0108b;
    }

    public String getMm0201() {
        return mm0201;
    }

    public void setMm0201(String mm0201) {
        this.mm0201 = mm0201;
    }

    public String getMm202() {
        return mm202;
    }

    public void setMm202(String mm202) {
        this.mm202 = mm202;
    }

    public String getMm202077x() {
        return mm202077x;
    }

    public void setMm202077x(String mm202077x) {
        this.mm202077x = mm202077x;
    }

    public String getMm0301() {
        return mm0301;
    }

    public void setMm0301(String mm0301) {
        this.mm0301 = mm0301;
    }

    public String getMm0302() {
        return mm0302;
    }

    public void setMm0302(String mm0302) {
        this.mm0302 = mm0302;
    }

    public String getMm0303() {
        return mm0303;
    }

    public void setMm0303(String mm0303) {
        this.mm0303 = mm0303;
    }

    public String getMm0304() {
        return mm0304;
    }

    public void setMm0304(String mm0304) {
        this.mm0304 = mm0304;
    }

    public String getMm0305() {
        return mm0305;
    }

    public void setMm0305(String mm0305) {
        this.mm0305 = mm0305;
    }

    public String getMm0306() {
        return mm0306;
    }

    public void setMm0306(String mm0306) {
        this.mm0306 = mm0306;
    }

    public String getMm0307() {
        return mm0307;
    }

    public void setMm0307(String mm0307) {
        this.mm0307 = mm0307;
    }

    public String getMm0308() {
        return mm0308;
    }

    public void setMm0308(String mm0308) {
        this.mm0308 = mm0308;
    }

    public String getMm0309() {
        return mm0309;
    }

    public void setMm0309(String mm0309) {
        this.mm0309 = mm0309;
    }

    public String getMm03010() {
        return mm03010;
    }

    public void setMm03010(String mm03010) {
        this.mm03010 = mm03010;
    }

    public String getMm03011() {
        return mm03011;
    }

    public void setMm03011(String mm03011) {
        this.mm03011 = mm03011;
    }

    public String getMm03012() {
        return mm03012;
    }

    public void setMm03012(String mm03012) {
        this.mm03012 = mm03012;
    }

    public String getMm03013() {
        return mm03013;
    }

    public void setMm03013(String mm03013) {
        this.mm03013 = mm03013;
    }

    public String getMm03014() {
        return mm03014;
    }

    public void setMm03014(String mm03014) {
        this.mm03014 = mm03014;
    }

    public String getMm03015() {
        return mm03015;
    }

    public void setMm03015(String mm03015) {
        this.mm03015 = mm03015;
    }

    public String getMm03016() {
        return mm03016;
    }

    public void setMm03016(String mm03016) {
        this.mm03016 = mm03016;
    }

    public String getMm03017() {
        return mm03017;
    }

    public void setMm03017(String mm03017) {
        this.mm03017 = mm03017;
    }

    public String getMm03018() {
        return mm03018;
    }

    public void setMm03018(String mm03018) {
        this.mm03018 = mm03018;
    }

    public String getMm03019() {
        return mm03019;
    }

    public void setMm03019(String mm03019) {
        this.mm03019 = mm03019;
    }

    public String getMm03020() {
        return mm03020;
    }

    public void setMm03020(String mm03020) {
        this.mm03020 = mm03020;
    }

    public String getMm03021() {
        return mm03021;
    }

    public void setMm03021(String mm03021) {
        this.mm03021 = mm03021;
    }

    public String getMm03022() {
        return mm03022;
    }

    public void setMm03022(String mm03022) {
        this.mm03022 = mm03022;
    }

    public String getMm03023() {
        return mm03023;
    }

    public void setMm03023(String mm03023) {
        this.mm03023 = mm03023;
    }

    public String getMm03024() {
        return mm03024;
    }

    public void setMm03024(String mm03024) {
        this.mm03024 = mm03024;
    }

    public String getMm03025() {
        return mm03025;
    }

    public void setMm03025(String mm03025) {
        this.mm03025 = mm03025;
    }

    public String getMm03026() {
        return mm03026;
    }

    public void setMm03026(String mm03026) {
        this.mm03026 = mm03026;
    }

    public String getMm03027() {
        return mm03027;
    }

    public void setMm03027(String mm03027) {
        this.mm03027 = mm03027;
    }

    public String getMm03028() {
        return mm03028;
    }

    public void setMm03028(String mm03028) {
        this.mm03028 = mm03028;
    }

    public String getMm03029() {
        return mm03029;
    }

    public void setMm03029(String mm03029) {
        this.mm03029 = mm03029;
    }

    public String getMm03030() {
        return mm03030;
    }

    public void setMm03030(String mm03030) {
        this.mm03030 = mm03030;
    }

    public String getMm03031() {
        return mm03031;
    }

    public void setMm03031(String mm03031) {
        this.mm03031 = mm03031;
    }

    public String getMm03032() {
        return mm03032;
    }

    public void setMm03032(String mm03032) {
        this.mm03032 = mm03032;
    }

    public String getMm03033() {
        return mm03033;
    }

    public void setMm03033(String mm03033) {
        this.mm03033 = mm03033;
    }

    public String getMm03034() {
        return mm03034;
    }

    public void setMm03034(String mm03034) {
        this.mm03034 = mm03034;
    }

    public String getMm03035() {
        return mm03035;
    }

    public void setMm03035(String mm03035) {
        this.mm03035 = mm03035;
    }

    public String getMm03036() {
        return mm03036;
    }

    public void setMm03036(String mm03036) {
        this.mm03036 = mm03036;
    }

    public String getMm03037() {
        return mm03037;
    }

    public void setMm03037(String mm03037) {
        this.mm03037 = mm03037;
    }

    public String getMm03038() {
        return mm03038;
    }

    public void setMm03038(String mm03038) {
        this.mm03038 = mm03038;
    }

    public String getMm03039() {
        return mm03039;
    }

    public void setMm03039(String mm03039) {
        this.mm03039 = mm03039;
    }

    public String getMm03040() {
        return mm03040;
    }

    public void setMm03040(String mm03040) {
        this.mm03040 = mm03040;
    }

    public String getMm03041() {
        return mm03041;
    }

    public void setMm03041(String mm03041) {
        this.mm03041 = mm03041;
    }

    public String getMm03042() {
        return mm03042;
    }

    public void setMm03042(String mm03042) {
        this.mm03042 = mm03042;
    }

    public String getMm03043() {
        return mm03043;
    }

    public void setMm03043(String mm03043) {
        this.mm03043 = mm03043;
    }

    public String getMm03044() {
        return mm03044;
    }

    public void setMm03044(String mm03044) {
        this.mm03044 = mm03044;
    }

    public String getMm03045() {
        return mm03045;
    }

    public void setMm03045(String mm03045) {
        this.mm03045 = mm03045;
    }

    public String getMm03046() {
        return mm03046;
    }

    public void setMm03046(String mm03046) {
        this.mm03046 = mm03046;
    }

    public String getMm03047() {
        return mm03047;
    }

    public void setMm03047(String mm03047) {
        this.mm03047 = mm03047;
    }

    public String getMm03048() {
        return mm03048;
    }

    public void setMm03048(String mm03048) {
        this.mm03048 = mm03048;
    }

    public String getMm03049() {
        return mm03049;
    }

    public void setMm03049(String mm03049) {
        this.mm03049 = mm03049;
    }

    public String getMm0401() {
        return mm0401;
    }

    public void setMm0401(String mm0401) {
        this.mm0401 = mm0401;
    }

    public String getMm0402() {
        return mm0402;
    }

    public void setMm0402(String mm0402) {
        this.mm0402 = mm0402;
    }

    public String getMm0403() {
        return mm0403;
    }

    public void setMm0403(String mm0403) {
        this.mm0403 = mm0403;
    }

    public String getMm0404() {
        return mm0404;
    }

    public void setMm0404(String mm0404) {
        this.mm0404 = mm0404;
    }

    public String getMm0405() {
        return mm0405;
    }

    public void setMm0405(String mm0405) {
        this.mm0405 = mm0405;
    }

    public String getMm0406() {
        return mm0406;
    }

    public void setMm0406(String mm0406) {
        this.mm0406 = mm0406;
    }

    public String getMm0407() {
        return mm0407;
    }

    public void setMm0407(String mm0407) {
        this.mm0407 = mm0407;
    }

    public String getMm0408() {
        return mm0408;
    }

    public void setMm0408(String mm0408) {
        this.mm0408 = mm0408;
    }

    public String getMm0409() {
        return mm0409;
    }

    public void setMm0409(String mm0409) {
        this.mm0409 = mm0409;
    }

    public String getMm04010() {
        return mm04010;
    }

    public void setMm04010(String mm04010) {
        this.mm04010 = mm04010;
    }

    public String getMm04011() {
        return mm04011;
    }

    public void setMm04011(String mm04011) {
        this.mm04011 = mm04011;
    }

    public String getMm04012() {
        return mm04012;
    }

    public void setMm04012(String mm04012) {
        this.mm04012 = mm04012;
    }

    public String getMm0501() {
        return mm0501;
    }

    public void setMm0501(String mm0501) {
        this.mm0501 = mm0501;
    }

    public String getMm0502() {
        return mm0502;
    }

    public void setMm0502(String mm0502) {
        this.mm0502 = mm0502;
    }

    public String getMm0503() {
        return mm0503;
    }

    public void setMm0503(String mm0503) {
        this.mm0503 = mm0503;
    }

    public String getMm0504() {
        return mm0504;
    }

    public void setMm0504(String mm0504) {
        this.mm0504 = mm0504;
    }

    public String getMm0505() {
        return mm0505;
    }

    public void setMm0505(String mm0505) {
        this.mm0505 = mm0505;
    }

    public String getMm0506() {
        return mm0506;
    }

    public void setMm0506(String mm0506) {
        this.mm0506 = mm0506;
    }

    public String getMm0507() {
        return mm0507;
    }

    public void setMm0507(String mm0507) {
        this.mm0507 = mm0507;
    }

    public String getMm0508() {
        return mm0508;
    }

    public void setMm0508(String mm0508) {
        this.mm0508 = mm0508;
    }

    public String getMm0508015x() {
        return mm0508015x;
    }

    public void setMm0508015x(String mm0508015x) {
        this.mm0508015x = mm0508015x;
    }

    public String getMm05010() {
        return mm05010;
    }

    public void setMm05010(String mm05010) {
        this.mm05010 = mm05010;
    }

    public String getMm05011() {
        return mm05011;
    }

    public void setMm05011(String mm05011) {
        this.mm05011 = mm05011;
    }

    public String getMm05012() {
        return mm05012;
    }

    public void setMm05012(String mm05012) {
        this.mm05012 = mm05012;
    }

    public String getMm05013() {
        return mm05013;
    }

    public void setMm05013(String mm05013) {
        this.mm05013 = mm05013;
    }

    public String getMm0601() {
        return mm0601;
    }

    public void setMm0601(String mm0601) {
        this.mm0601 = mm0601;
    }

    public String getMm0602() {
        return mm0602;
    }

    public void setMm0602(String mm0602) {
        this.mm0602 = mm0602;
    }


    public Form4mm Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_ID);
        this.uid = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_UID);

        this.userName = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_SYSDATE);
        this.deviceId = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_DEVICETAGID);

        this.studyid = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_STUDYID);
        this.dssid = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_DSSID);
        this.week = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_WEEK);


        this.appver = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_APPVERSION);
        this.gps = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_GPS);
        this.endTime = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x);
        this.iStatus96x = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_SYNCED_DATE);

        this.s02 = jsonObject.getString(Forms4mmContract.Forms4MMTable.COLUMN_S02);

        return this;

    }


    public Form4mm Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_SYSDATE));

        this.studyid = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_STUDYID));
        this.dssid = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_DSSID));
        this.week = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_WEEK));


        this.deviceId = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_APPVERSION));
        this.gps = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_GPS));
        this.endTime = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_SYNCED_DATE));

        //For childCount
        this.s02 = cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_S02));

        s02Hydrate(cursor.getString(cursor.getColumnIndex(Forms4mmContract.Forms4MMTable.COLUMN_S02)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form4mm.class);
    }

    public String s02toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("mmsid", mmsid)
                    .put("mm0101", mm0101)
                    .put("mm0102", mm0102)
                    .put("mm0102a", mm0102a)
                    .put("mm0103", mm0103)
                    .put("mm0104", mm0104)
                    .put("mm0105", mm0105)
                    .put("mm0106", mm0106)
                    .put("mm0107", mm0107)
                    .put("mm0108", mm0108)
                    .put("mm0108a", mm0108a)
                    .put("mm0108b", mm0108b)
                    .put("mm0201", mm0201)
                    .put("mm202", mm202)
                    .put("mm202077x", mm202077x)
                    .put("mm0301", mm0301)
                    .put("mm0302", mm0302)
                    .put("mm0303", mm0303)
                    .put("mm0304", mm0304)
                    .put("mm0305", mm0305)
                    .put("mm0306", mm0306)
                    .put("mm0307", mm0307)
                    .put("mm0308", mm0308)
                    .put("mm0309", mm0309)
                    .put("mm03010", mm03010)
                    .put("mm03011", mm03011)
                    .put("mm03012", mm03012)
                    .put("mm03013", mm03013)
                    .put("mm03014", mm03014)
                    .put("mm03015", mm03015)
                    .put("mm03016", mm03016)
                    .put("mm03017", mm03017)
                    .put("mm03018", mm03018)
                    .put("mm03019", mm03019)
                    .put("mm03020", mm03020)
                    .put("mm03021", mm03021)
                    .put("mm03022", mm03022)
                    .put("mm03023", mm03023)
                    .put("mm03024", mm03024)
                    .put("mm03025", mm03025)
                    .put("mm03026", mm03026)
                    .put("mm03027", mm03027)
                    .put("mm03028", mm03028)
                    .put("mm03029", mm03029)
                    .put("mm03030", mm03030)
                    .put("mm03031", mm03031)
                    .put("mm03032", mm03032)
                    .put("mm03033", mm03033)
                    .put("mm03034", mm03034)
                    .put("mm03035", mm03035)
                    .put("mm03036", mm03036)
                    .put("mm03037", mm03037)
                    .put("mm03038", mm03038)
                    .put("mm03039", mm03039)
                    .put("mm03040", mm03040)
                    .put("mm03041", mm03041)
                    .put("mm03042", mm03042)
                    .put("mm03043", mm03043)
                    .put("mm03044", mm03044)
                    .put("mm03045", mm03045)
                    .put("mm03046", mm03046)
                    .put("mm03047", mm03047)
                    .put("mm03048", mm03048)
                    .put("mm03049", mm03049)
                    .put("mm0401", mm0401)
                    .put("mm0402", mm0402)
                    .put("mm0403", mm0403)
                    .put("mm0404", mm0404)
                    .put("mm0405", mm0405)
                    .put("mm0406", mm0406)
                    .put("mm0407", mm0407)
                    .put("mm0408", mm0408)
                    .put("mm0409", mm0409)
                    .put("mm04010", mm04010)
                    .put("mm04011", mm04011)
                    .put("mm04012", mm04012)
                    .put("mm0501", mm0501)
                    .put("mm0502", mm0502)
                    .put("mm0503", mm0503)
                    .put("mm0504", mm0504)
                    .put("mm0505", mm0505)
                    .put("mm0506", mm0506)
                    .put("mm0507", mm0507)
                    .put("mm0508", mm0508)
                    .put("mm0508015x", mm0508015x)
                    .put("mm05010", mm05010)
                    .put("mm05011", mm05011)
                    .put("mm05012", mm05012)
                    .put("mm05013", mm05013)
                    .put("mm0601", mm0601)
                    .put("mm0602", mm0602)
                    .put("mm0603", mm0603)
                    .put("mm0604", mm0604)
                    .put("mm0701", mm0701)
                    .put("mm0702", mm0702)
                    .put("mm0702_chklmp", mm0702_chklmp)
                    .put("mm0703", mm0703);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);

            json.put(Forms4mmContract.Forms4MMTable.COLUMN_STUDYID, this.studyid == null ? JSONObject.NULL : this.studyid);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_DSSID, this.dssid == null ? JSONObject.NULL : this.dssid);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_WEEK, this.week == null ? JSONObject.NULL : this.week);


            json.put(Forms4mmContract.Forms4MMTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_GPS, this.gps == null ? JSONObject.NULL : this.gps);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(Forms4mmContract.Forms4MMTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);

            json.put(Forms4mmContract.Forms4MMTable.COLUMN_S02, new JSONObject(s02toString()));


            if (this.s02 != null && !this.s02.equals("")) {
                json.put(Forms4mmContract.Forms4MMTable.COLUMN_S02, new JSONObject(this.s02));
            }


            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void s02Hydrate(String string) {
        if (string != null) {
            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.mmsid = json.getString("mmsid");
                this.mm0101 = json.getString("mm0101");
                this.mm0102 = json.getString("mm0102");
                this.mm0102a = json.getString("mm0102a");
                this.mm0103 = json.getString("mm0103");
                this.mm0104 = json.getString("mm0104");
                this.mm0105 = json.getString("mm0105");
                this.mm0106 = json.getString("mm0106");
                this.mm0107 = json.getString("mm0107");
                this.mm0108 = json.getString("mm0108");
                this.mm0108a = json.getString("mm0108a");
                this.mm0108b = json.getString("mm0108b");
                this.mm0201 = json.getString("mm0201");
                this.mm202 = json.getString("mm202");
                this.mm202077x = json.getString("mm202077x");
                this.mm0301 = json.getString("mm0301");
                this.mm0302 = json.getString("mm0302");
                this.mm0303 = json.getString("mm0303");
                this.mm0304 = json.getString("mm0304");
                this.mm0305 = json.getString("mm0305");
                this.mm0306 = json.getString("mm0306");
                this.mm0307 = json.getString("mm0307");
                this.mm0308 = json.getString("mm0308");
                this.mm0309 = json.getString("mm0309");
                this.mm03010 = json.getString("mm03010");
                this.mm03011 = json.getString("mm03011");
                this.mm03012 = json.getString("mm03012");
                this.mm03013 = json.getString("mm03013");
                this.mm03014 = json.getString("mm03014");
                this.mm03015 = json.getString("mm03015");
                this.mm03016 = json.getString("mm03016");
                this.mm03017 = json.getString("mm03017");
                this.mm03018 = json.getString("mm03018");
                this.mm03019 = json.getString("mm03019");
                this.mm03020 = json.getString("mm03020");
                this.mm03021 = json.getString("mm03021");
                this.mm03022 = json.getString("mm03022");
                this.mm03023 = json.getString("mm03023");
                this.mm03024 = json.getString("mm03024");
                this.mm03025 = json.getString("mm03025");
                this.mm03026 = json.getString("mm03026");
                this.mm03027 = json.getString("mm03027");
                this.mm03028 = json.getString("mm03028");
                this.mm03029 = json.getString("mm03029");
                this.mm03030 = json.getString("mm03030");
                this.mm03031 = json.getString("mm03031");
                this.mm03032 = json.getString("mm03032");
                this.mm03033 = json.getString("mm03033");
                this.mm03034 = json.getString("mm03034");
                this.mm03035 = json.getString("mm03035");
                this.mm03036 = json.getString("mm03036");
                this.mm03037 = json.getString("mm03037");
                this.mm03038 = json.getString("mm03038");
                this.mm03039 = json.getString("mm03039");
                this.mm03040 = json.getString("mm03040");
                this.mm03041 = json.getString("mm03041");
                this.mm03042 = json.getString("mm03042");
                this.mm03043 = json.getString("mm03043");
                this.mm03044 = json.getString("mm03044");
                this.mm03045 = json.getString("mm03045");
                this.mm03046 = json.getString("mm03046");
                this.mm03047 = json.getString("mm03047");
                this.mm03048 = json.getString("mm03048");
                this.mm03049 = json.getString("mm03049");
                this.mm0401 = json.getString("mm0401");
                this.mm0402 = json.getString("mm0402");
                this.mm0403 = json.getString("mm0403");
                this.mm0404 = json.getString("mm0404");
                this.mm0405 = json.getString("mm0405");
                this.mm0406 = json.getString("mm0406");
                this.mm0407 = json.getString("mm0407");
                this.mm0408 = json.getString("mm0408");
                this.mm0409 = json.getString("mm0409");
                this.mm04010 = json.getString("mm04010");
                this.mm04011 = json.getString("mm04011");
                this.mm04012 = json.getString("mm04012");
                this.mm0501 = json.getString("mm0501");
                this.mm0502 = json.getString("mm0502");
                this.mm0503 = json.getString("mm0503");
                this.mm0504 = json.getString("mm0504");
                this.mm0505 = json.getString("mm0505");
                this.mm0506 = json.getString("mm0506");
                this.mm0507 = json.getString("mm0507");
                this.mm0508 = json.getString("mm0508");
                this.mm0508015x = json.getString("mm0508015x");
                this.mm05010 = json.getString("mm05010");
                this.mm05011 = json.getString("mm05011");
                this.mm05012 = json.getString("mm05012");
                this.mm05013 = json.getString("mm05013");
                this.mm0601 = json.getString("mm0601");
                this.mm0602 = json.getString("mm0602");
                this.mm0603 = json.getString("mm0603");
                this.mm0604 = json.getString("mm0604");
                this.mm0701 = json.getString("mm0701");
                this.mm0702 = json.getString("mm0702");
                this.mm0702_chklmp = json.getString("mm0702_chklmp");
                this.mm0703 = json.getString("mm0703");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}