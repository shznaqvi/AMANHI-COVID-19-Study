package edu.aku.hassannaqvi.amanhicovid_19study.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.threeten.bp.LocalDate;

import edu.aku.hassannaqvi.amanhicovid_19study.BR;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms21cmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;


public class Form21cm extends BaseObservable {

    //Main Variables
    private String TAG = "Form21cm";
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

    private String cmsid = "";
    private String cm0101 = "";
    private String cm0102 = "";
    private String cm0102a = "";
    private String cm0103 = "";
    private String cm0104 = "";
    private String cm0105 = "";
    private String cm0106 = "";
    private String cm0107 = "";
    private String cm0108 = "";
    private String cm0109 = "";
    private String cm0109mx = "";
    private String cm0110 = "";
    private String cm0111 = "";
    private String cm0112 = "";
    private String cm0201 = "";
    private String cm0202 = "";
    private String cm020277x = "";
    private String cm0301 = "";
    private String cm0302 = "";
    private String cm0303 = "";
    private String cm0304 = "";
    private String cm0305 = "";
    private String cm0306 = "";
    private String cm0307 = "";
    private String cm0308 = "";
    private String cm0309 = "";
    private String cm03010 = "";
    private String cm03011 = "";
    private String cm03012 = "";
    private String cm03013 = "";
    private String cm03014 = "";
    private String cm03015 = "";
    private String cm03016 = "";
    private String cm03017 = "";
    private String cm03018 = "";
    private String cm03019 = "";
    private String cm03020 = "";
    private String cm03021 = "";
    private String cm03022 = "";
    private String cm03023 = "";
    private String cm03024 = "";
    private String cm03025 = "";
    private String cm03026 = "";
    private String cm03027 = "";
    private String cm03028 = "";
    private String cm03029 = "";
    private String cm03030 = "";
    private String cm03031 = "";
    private String cm03032 = "";
    private String cm03033 = "";
    private String cm03034 = "";
    private String cm03035 = "";
    private String cm03036 = "";
    private String cm03037 = "";
    private String cm03038 = "";
    private String cm03039 = "";
    private String cm03040 = "";
    private String cm03041 = "";
    private String cm03042 = "";
    private String cm03043 = "";
    private String cm03044 = "";
    private String cm03045 = "";
    private String cm03046 = "";
    private String cm03047 = "";
    private String cm03048 = "";
    private String cm03049 = "";
    private String cm03050 = "";
    private String cm03051 = "";
    private String cm0401 = "";
    private String cm0402 = "";
    private String cm0403 = "";
    private String cm0404 = "";
    private String cm0405 = "";
    private String cm0406 = "";
    private String cm0407 = "";
    private String cm0408 = "";
    private String cm0408015x = "";
    private String cm04010 = "";
    private String cm04011 = "";
    private String cm04012 = "";
    private String cm04013 = "";
    private String cm0501 = "";
    private String cm0502 = "";
    private String cm0503 = "";
    private String cm0504 = "";
    private String cm0505 = "";
    private String cm0506 = "";
    private String cm0507 = "";
    private String cm0508 = "";
    private String cm0509 = "";
    private String cm050901x = "";
    private String cm05011 = "";
    private String cm05012 = "";
    private String cm05013 = "";
    private String cm0501301x = "";
    private String cm05015 = "";
    private String cm05016 = "";
    private String cm0501601x = "";
    private String cm05018 = "";
    private String cm0501801x = "";
    private String cm05020 = "";
    private String cm0601 = "";
    private String cm0602 = "";
    private String cm0603 = "";
    private String cm0604 = "";
    private String cm0605 = "";
    private String cm0606 = "";
    private String cm0607 = "";
    private String cm0608 = "";
    private String cm0609 = "";

    private String cm0701 = "";
    private String cm0702 = "";
    private String cm070277x = "";
    private String cm0703a = "";
    private String cm0703b = "";
    private String chkvaccdta = "";
    private String chkvaccdtb = "";


    // SECTION VARIABLES
    private String s02cm = "";
    private String s03cm = "";
    private String s04cm = "";
    private String s05cm = "";
    private String s06cm = "";

    //Not saving in DB
    private LocalDate localDate = null;

    public Form21cm() {

    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setForm(String userName, String sysDate, String deviceId, String deviceTag, String appver, String gps) {
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

    public Form21cm setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form21cm setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form21cm setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form21cm setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form21cm setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form21cm setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getGps() {
        return gps;
    }

    public Form21cm setGps(String gps) {
        this.gps = gps;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form21cm setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
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

    public String getCm0701() {
        return cm0701;
    }

    public void setCm0701(String cm0701) {
        this.cm0701 = cm0701;
    }

    public String getCm0702() {
        return cm0702;
    }

    public void setCm0702(String cm0702) {
        this.cm0702 = cm0702;
    }

    public String getCm070277x() {
        return cm070277x;
    }

    public void setCm070277x(String cm070277x) {
        this.cm070277x = cm070277x;
    }

    public String getCm0703a() {
        return cm0703a;
    }

    public void setCm0703a(String cm0703a) {
        this.cm0703a = cm0703a;
    }

    public String getCm0703b() {
        return cm0703b;
    }

    public void setCm0703b(String cm0703b) {
        this.cm0703b = cm0703b;
    }

    public String getChkvaccdta() {
        return chkvaccdta;
    }

    public void setChkvaccdta(String chkvaccdta) {
        this.chkvaccdta = chkvaccdta;
    }

    public String getChkvaccdtb() {
        return chkvaccdtb;
    }

    public void setChkvaccdtb(String chkvaccdtb) {
        this.chkvaccdtb = chkvaccdtb;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form21cm setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form21cm setSyncDate(String syncDate) {
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

    public String getS02() {
        return s02;
    }

    public void setS02(String s02) {
        this.s02 = s02;
    }


    public String getCmsid() {
        return cmsid;
    }

    public void setCmsid(String cmsid) {
        this.cmsid = cmsid;
    }

    public String getCm0101() {
        return cm0101;
    }

    public void setCm0101(String cm0101) {
        this.cm0101 = cm0101;
    }

    public String getCm0102() {
        return cm0102;
    }

    public void setCm0102(String cm0102) {
        this.cm0102 = cm0102;
    }

    public String getCm0102a() {
        return cm0102a;
    }

    public void setCm0102a(String cm0102a) {
        this.cm0102a = cm0102a;
    }

    public String getCm0103() {
        return cm0103;
    }

    public void setCm0103(String cm0103) {
        this.cm0103 = cm0103;
    }

    public String getCm0104() {
        return cm0104;
    }

    public void setCm0104(String cm0104) {
        this.cm0104 = cm0104;
    }

    public String getCm0105() {
        return cm0105;
    }

    public void setCm0105(String cm0105) {
        this.cm0105 = cm0105;
    }

    public String getCm0106() {
        return cm0106;
    }

    public void setCm0106(String cm0106) {
        this.cm0106 = cm0106;
    }

    public String getCm0107() {
        return cm0107;
    }

    public void setCm0107(String cm0107) {
        this.cm0107 = cm0107;
    }

    public String getCm0108() {
        return cm0108;
    }

    public void setCm0108(String cm0108) {
        this.cm0108 = cm0108;
    }

    public String getCm0109() {
        return cm0109;
    }

    public void setCm0109(String cm0109) {
        this.cm0109 = cm0109;
    }

    public String getCm0109mx() {
        return cm0109mx;
    }

    public void setCm0109mx(String cm0109mx) {
        this.cm0109mx = cm0109mx;
    }

    public String getCm0110() {
        return cm0110;
    }

    public void setCm0110(String cm0110) {
        this.cm0110 = cm0110;
    }

    public String getCm0111() {
        return cm0111;
    }

    public void setCm0111(String cm0111) {
        this.cm0111 = cm0111;
    }

    public String getCm0112() {
        return cm0112;
    }

    public void setCm0112(String cm0112) {
        this.cm0112 = cm0112;
    }

    public String getCm0201() {
        return cm0201;
    }

    public void setCm0201(String cm0201) {
        this.cm0201 = cm0201;
    }

    public String getCm0202() {
        return cm0202;
    }

    public void setCm0202(String cm0202) {
        this.cm0202 = cm0202;
    }

    public String getCm020277x() {
        return cm020277x;
    }

    public void setCm020277x(String cm020277x) {
        this.cm020277x = cm020277x;
    }

    public String getCm0301() {
        return cm0301;
    }

    public void setCm0301(String cm0301) {
        this.cm0301 = cm0301;
    }

    public String getCm0302() {
        return cm0302;
    }

    public void setCm0302(String cm0302) {
        this.cm0302 = cm0302;
    }

    public String getCm0303() {
        return cm0303;
    }

    public void setCm0303(String cm0303) {
        this.cm0303 = cm0303;
    }

    public String getCm0304() {
        return cm0304;
    }

    public void setCm0304(String cm0304) {
        this.cm0304 = cm0304;
    }

    public String getCm0305() {
        return cm0305;
    }

    public void setCm0305(String cm0305) {
        this.cm0305 = cm0305;
    }

    public String getCm0306() {
        return cm0306;
    }

    public void setCm0306(String cm0306) {
        this.cm0306 = cm0306;
    }

    public String getCm0307() {
        return cm0307;
    }

    public void setCm0307(String cm0307) {
        this.cm0307 = cm0307;
    }

    public String getCm0308() {
        return cm0308;
    }

    public void setCm0308(String cm0308) {
        this.cm0308 = cm0308;
    }

    public String getCm0309() {
        return cm0309;
    }

    public void setCm0309(String cm0309) {
        this.cm0309 = cm0309;
    }

    public String getCm03010() {
        return cm03010;
    }

    public void setCm03010(String cm03010) {
        this.cm03010 = cm03010;
    }

    public String getCm03011() {
        return cm03011;
    }

    public void setCm03011(String cm03011) {
        this.cm03011 = cm03011;
    }

    public String getCm03012() {
        return cm03012;
    }

    public void setCm03012(String cm03012) {
        this.cm03012 = cm03012;
    }

    public String getCm03013() {
        return cm03013;
    }

    public void setCm03013(String cm03013) {
        this.cm03013 = cm03013;
    }

    public String getCm03014() {
        return cm03014;
    }

    public void setCm03014(String cm03014) {
        this.cm03014 = cm03014;
    }

    public String getCm03015() {
        return cm03015;
    }

    public void setCm03015(String cm03015) {
        this.cm03015 = cm03015;
    }

    public String getCm03016() {
        return cm03016;
    }

    public void setCm03016(String cm03016) {
        this.cm03016 = cm03016;
    }

    public String getCm03017() {
        return cm03017;
    }

    public void setCm03017(String cm03017) {
        this.cm03017 = cm03017;
    }

    public String getCm03018() {
        return cm03018;
    }

    public void setCm03018(String cm03018) {
        this.cm03018 = cm03018;
    }

    public String getCm03019() {
        return cm03019;
    }

    public void setCm03019(String cm03019) {
        this.cm03019 = cm03019;
    }

    public String getCm03020() {
        return cm03020;
    }

    public void setCm03020(String cm03020) {
        this.cm03020 = cm03020;
    }

    public String getCm03021() {
        return cm03021;
    }

    public void setCm03021(String cm03021) {
        this.cm03021 = cm03021;
    }

    public String getCm03022() {
        return cm03022;
    }

    public void setCm03022(String cm03022) {
        this.cm03022 = cm03022;
    }

    public String getCm03023() {
        return cm03023;
    }

    public void setCm03023(String cm03023) {
        this.cm03023 = cm03023;
    }

    public String getCm03024() {
        return cm03024;
    }

    public void setCm03024(String cm03024) {
        this.cm03024 = cm03024;
    }

    public String getCm03025() {
        return cm03025;
    }

    public void setCm03025(String cm03025) {
        this.cm03025 = cm03025;
    }

    public String getCm03026() {
        return cm03026;
    }

    public void setCm03026(String cm03026) {
        this.cm03026 = cm03026;
    }

    public String getCm03027() {
        return cm03027;
    }

    public void setCm03027(String cm03027) {
        this.cm03027 = cm03027;
    }

    public String getCm03028() {
        return cm03028;
    }

    public void setCm03028(String cm03028) {
        this.cm03028 = cm03028;
    }

    public String getCm03029() {
        return cm03029;
    }

    public void setCm03029(String cm03029) {
        this.cm03029 = cm03029;
    }

    public String getCm03030() {
        return cm03030;
    }

    public void setCm03030(String cm03030) {
        this.cm03030 = cm03030;
    }

    public String getCm03031() {
        return cm03031;
    }

    public void setCm03031(String cm03031) {
        this.cm03031 = cm03031;
    }

    public String getCm03032() {
        return cm03032;
    }

    public void setCm03032(String cm03032) {
        this.cm03032 = cm03032;
    }

    public String getCm03033() {
        return cm03033;
    }

    public void setCm03033(String cm03033) {
        this.cm03033 = cm03033;
    }

    public String getCm03034() {
        return cm03034;
    }

    public void setCm03034(String cm03034) {
        this.cm03034 = cm03034;
    }

    public String getCm03035() {
        return cm03035;
    }

    public void setCm03035(String cm03035) {
        this.cm03035 = cm03035;
    }

    public String getCm03036() {
        return cm03036;
    }

    public void setCm03036(String cm03036) {
        this.cm03036 = cm03036;
    }

    public String getCm03037() {
        return cm03037;
    }

    public void setCm03037(String cm03037) {
        this.cm03037 = cm03037;
    }

    public String getCm03038() {
        return cm03038;
    }

    public void setCm03038(String cm03038) {
        this.cm03038 = cm03038;
    }

    public String getCm03039() {
        return cm03039;
    }

    public void setCm03039(String cm03039) {
        this.cm03039 = cm03039;
    }

    public String getCm03040() {
        return cm03040;
    }

    public void setCm03040(String cm03040) {
        this.cm03040 = cm03040;
    }

    public String getCm03041() {
        return cm03041;
    }

    public void setCm03041(String cm03041) {
        this.cm03041 = cm03041;
    }

    public String getCm03042() {
        return cm03042;
    }

    public void setCm03042(String cm03042) {
        this.cm03042 = cm03042;
    }

    public String getCm03043() {
        return cm03043;
    }

    public void setCm03043(String cm03043) {
        this.cm03043 = cm03043;
    }

    public String getCm03044() {
        return cm03044;
    }

    public void setCm03044(String cm03044) {
        this.cm03044 = cm03044;
    }

    public String getCm03045() {
        return cm03045;
    }

    public void setCm03045(String cm03045) {
        this.cm03045 = cm03045;
    }

    public String getCm03046() {
        return cm03046;
    }

    public void setCm03046(String cm03046) {
        this.cm03046 = cm03046;
    }

    public String getCm03047() {
        return cm03047;
    }

    public void setCm03047(String cm03047) {
        this.cm03047 = cm03047;
    }

    public String getCm03048() {
        return cm03048;
    }

    public void setCm03048(String cm03048) {
        this.cm03048 = cm03048;
    }

    public String getCm03049() {
        return cm03049;
    }

    public void setCm03049(String cm03049) {
        this.cm03049 = cm03049;
    }

    public String getCm03050() {
        return cm03050;
    }

    public void setCm03050(String cm03050) {
        this.cm03050 = cm03050;
    }

    public String getCm03051() {
        return cm03051;
    }

    public void setCm03051(String cm03051) {
        this.cm03051 = cm03051;
    }

    public String getCm0401() {
        return cm0401;
    }

    public void setCm0401(String cm0401) {
        this.cm0401 = cm0401;
    }

    public String getCm0402() {
        return cm0402;
    }

    public void setCm0402(String cm0402) {
        this.cm0402 = cm0402;
    }

    public String getCm0403() {
        return cm0403;
    }

    public void setCm0403(String cm0403) {
        this.cm0403 = cm0403;
    }

    public String getCm0404() {
        return cm0404;
    }

    public void setCm0404(String cm0404) {
        this.cm0404 = cm0404;
    }

    public String getCm0405() {
        return cm0405;
    }

    public void setCm0405(String cm0405) {
        this.cm0405 = cm0405;
    }

    public String getCm0406() {
        return cm0406;
    }

    public void setCm0406(String cm0406) {
        this.cm0406 = cm0406;
    }

    public String getCm0407() {
        return cm0407;
    }

    public void setCm0407(String cm0407) {
        this.cm0407 = cm0407;
    }

    public String getCm0408() {
        return cm0408;
    }

    public void setCm0408(String cm0408) {
        this.cm0408 = cm0408;
    }

    public String getCm0408015x() {
        return cm0408015x;
    }

    public void setCm0408015x(String cm0408015x) {
        this.cm0408015x = cm0408015x;
    }

    public String getCm04010() {
        return cm04010;
    }

    public void setCm04010(String cm04010) {
        this.cm04010 = cm04010;
    }

    public String getCm04011() {
        return cm04011;
    }

    public void setCm04011(String cm04011) {
        this.cm04011 = cm04011;
    }

    public String getCm04012() {
        return cm04012;
    }

    public void setCm04012(String cm04012) {
        this.cm04012 = cm04012;
    }

    public String getCm04013() {
        return cm04013;
    }

    public void setCm04013(String cm04013) {
        this.cm04013 = cm04013;
    }

    public String getCm0501() {
        return cm0501;
    }

    public void setCm0501(String cm0501) {
        this.cm0501 = cm0501;
    }

    public String getCm0502() {
        return cm0502;
    }

    public void setCm0502(String cm0502) {
        this.cm0502 = cm0502;
    }

    public String getCm0503() {
        return cm0503;
    }

    public void setCm0503(String cm0503) {
        this.cm0503 = cm0503;
    }

    public String getCm0504() {
        return cm0504;
    }

    public void setCm0504(String cm0504) {
        this.cm0504 = cm0504;
    }

    public String getCm0505() {
        return cm0505;
    }

    public void setCm0505(String cm0505) {
        this.cm0505 = cm0505;
    }

    public String getCm0506() {
        return cm0506;
    }

    public void setCm0506(String cm0506) {
        this.cm0506 = cm0506;
    }

    public String getCm0507() {
        return cm0507;
    }

    public void setCm0507(String cm0507) {
        this.cm0507 = cm0507;
    }

    public String getCm0508() {
        return cm0508;
    }

    public void setCm0508(String cm0508) {
        this.cm0508 = cm0508;
    }

    public String getCm0509() {
        return cm0509;
    }

    public void setCm0509(String cm0509) {
        this.cm0509 = cm0509;
    }

    public String getCm050901x() {
        return cm050901x;
    }

    public void setCm050901x(String cm050901x) {
        this.cm050901x = cm050901x;
    }

    public String getCm05011() {
        return cm05011;
    }

    public void setCm05011(String cm05011) {
        this.cm05011 = cm05011;
    }

    public String getCm05012() {
        return cm05012;
    }

    public void setCm05012(String cm05012) {
        this.cm05012 = cm05012;
    }

    public String getCm05013() {
        return cm05013;
    }

    public void setCm05013(String cm05013) {
        this.cm05013 = cm05013;
    }

    public String getCm0501301x() {
        return cm0501301x;
    }

    public void setCm0501301x(String cm0501301x) {
        this.cm0501301x = cm0501301x;
    }

    public String getCm05015() {
        return cm05015;
    }

    public void setCm05015(String cm05015) {
        this.cm05015 = cm05015;
    }

    public String getCm05016() {
        return cm05016;
    }

    public void setCm05016(String cm05016) {
        this.cm05016 = cm05016;
    }

    public String getCm0501601x() {
        return cm0501601x;
    }

    public void setCm0501601x(String cm0501601x) {
        this.cm0501601x = cm0501601x;
    }

    public String getCm05018() {
        return cm05018;
    }

    public void setCm05018(String cm05018) {
        this.cm05018 = cm05018;
    }

    public String getCm0501801x() {
        return cm0501801x;
    }

    public void setCm0501801x(String cm0501801x) {
        this.cm0501801x = cm0501801x;
    }

    public String getCm05020() {
        return cm05020;
    }

    public void setCm05020(String cm05020) {
        this.cm05020 = cm05020;
    }

    public String getCm0601() {
        return cm0601;
    }

    public void setCm0601(String cm0601) {
        this.cm0601 = cm0601;
    }

    public String getCm0602() {
        return cm0602;
    }

    public void setCm0602(String cm0602) {
        this.cm0602 = cm0602;
    }

    public String getCm0603() {
        return cm0603;
    }

    public void setCm0603(String cm0603) {
        this.cm0603 = cm0603;
    }

    public String getCm0604() {
        return cm0604;
    }

    public void setCm0604(String cm0604) {
        this.cm0604 = cm0604;
    }


    public String getCm0606() {
        return cm0606;
    }

    public void setCm0606(String cm0606) {
        this.cm0606 = cm0606;
    }


    public String getCm0607() {
        return cm0607;
    }

    public void setCm0607(String cm0607) {
        this.cm0607 = cm0607;
    }


    public String getCm0608() {
        return cm0608;
    }

    public void setCm0608(String cm0608) {
        this.cm0608 = cm0608;
    }


    public String getCm0609() {
        return cm0609;
    }

    public void setCm0609(String cm0609) {
        this.cm0609 = cm0609;
    }


    public String getCm0605() {
        return cm0605;
    }

    public void setCm0605(String cm0605) {
        this.cm0605 = cm0605;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getS02cm() {
        return s02cm;
    }

    public void setS02cm(String s02cm) {
        this.s02cm = s02cm;
    }

    public String getS03cm() {
        return s03cm;
    }

    public void setS03cm(String s03cm) {
        this.s03cm = s03cm;
    }

    public String getS04cm() {
        return s04cm;
    }

    public void setS04cm(String s04cm) {
        this.s04cm = s04cm;
    }

    public String getS05cm() {
        return s05cm;
    }

    public void setS05cm(String s05cm) {
        this.s05cm = s05cm;
    }

    public String getS06cm() {
        return s06cm;
    }

    public void setS06cm(String s06cm) {
        this.s06cm = s06cm;
    }


    public Form21cm Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_ID);
        this.uid = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_UID);
        this.userName = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE);
        this.deviceId = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_DEVICETAGID);

        this.studyid = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_STUDYID);
        this.dssid = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_DSSID);
        this.week = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_WEEK);


        this.appver = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_APPVERSION);
        this.gps = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_GPS);
        this.endTime = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x);
        this.iStatus96x = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED_DATE);

        this.s02 = jsonObject.getString(Forms21cmContract.Forms21cmTable.COLUMN_S02);

        return this;

    }


    public Form21cm Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE));

        this.studyid = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_STUDYID));
        this.dssid = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_DSSID));
        this.week = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_WEEK));


        this.deviceId = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_APPVERSION));
        this.gps = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_GPS));
        this.endTime = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED_DATE));

        //For childCount
        this.s02 = cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_S02));

        s02Hydrate(cursor.getString(cursor.getColumnIndex(Forms21cmContract.Forms21cmTable.COLUMN_S02)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form21cm.class);
    }

    public String s02toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("cmsid", cmsid)
                    .put("cm0101", cm0101)
                    .put("cm0102", cm0102)
                    .put("cm0102a", cm0102a)
                    .put("cm0103", cm0103)
                    .put("cm0104", cm0104)
                    .put("cm0105", cm0105)
                    .put("cm0106", cm0106)
                    .put("cm0107", cm0107)
                    .put("cm0108", cm0108)
                    .put("cm0109", cm0109)
                    .put("cm0109mx", cm0109mx)
                    .put("cm0110", cm0110)
                    .put("cm0111", cm0111)
                    .put("cm0112", cm0112)
                    .put("cm0201", cm0201)
                    .put("cm0202", cm0202)
                    .put("cm020277x", cm020277x)
                    .put("cm0301", cm0301)
                    .put("cm0302", cm0302)
                    .put("cm0303", cm0303)
                    .put("cm0304", cm0304)
                    .put("cm0305", cm0305)
                    .put("cm0306", cm0306)
                    .put("cm0307", cm0307)
                    .put("cm0308", cm0308)
                    .put("cm0309", cm0309)
                    .put("cm03010", cm03010)
                    .put("cm03011", cm03011)
                    .put("cm03012", cm03012)
                    .put("cm03013", cm03013)
                    .put("cm03014", cm03014)
                    .put("cm03015", cm03015)
                    .put("cm03016", cm03016)
                    .put("cm03017", cm03017)
                    .put("cm03018", cm03018)
                    .put("cm03019", cm03019)
                    .put("cm03020", cm03020)
                    .put("cm03021", cm03021)
                    .put("cm03022", cm03022)
                    .put("cm03023", cm03023)
                    .put("cm03024", cm03024)
                    .put("cm03025", cm03025)
                    .put("cm03026", cm03026)
                    .put("cm03027", cm03027)
                    .put("cm03028", cm03028)
                    .put("cm03029", cm03029)
                    .put("cm03030", cm03030)
                    .put("cm03031", cm03031)
                    .put("cm03032", cm03032)
                    .put("cm03033", cm03033)
                    .put("cm03034", cm03034)
                    .put("cm03035", cm03035)
                    .put("cm03036", cm03036)
                    .put("cm03037", cm03037)
                    .put("cm03038", cm03038)
                    .put("cm03039", cm03039)
                    .put("cm03040", cm03040)
                    .put("cm03041", cm03041)
                    .put("cm03042", cm03042)
                    .put("cm03043", cm03043)
                    .put("cm03044", cm03044)
                    .put("cm03045", cm03045)
                    .put("cm03046", cm03046)
                    .put("cm03047", cm03047)
                    .put("cm03048", cm03048)
                    .put("cm03049", cm03049)
                    .put("cm03050", cm03050)
                    .put("cm03051", cm03051)
                    .put("cm0401", cm0401)
                    .put("cm0402", cm0402)
                    .put("cm0403", cm0403)
                    .put("cm0404", cm0404)
                    .put("cm0405", cm0405)
                    .put("cm0406", cm0406)
                    .put("cm0407", cm0407)
                    .put("cm0408", cm0408)
                    .put("cm0408015x", cm0408015x)
                    .put("cm04010", cm04010)
                    .put("cm04011", cm04011)
                    .put("cm04012", cm04012)
                    .put("cm04013", cm04013)
                    .put("cm0501", cm0501)
                    .put("cm0502", cm0502)
                    .put("cm0503", cm0503)
                    .put("cm0504", cm0504)
                    .put("cm0505", cm0505)
                    .put("cm0506", cm0506)
                    .put("cm0507", cm0507)
                    .put("cm0508", cm0508)
                    .put("cm0509", cm0509)
                    .put("cm050901x", cm050901x)
                    .put("cm05011", cm05011)
                    .put("cm05012", cm05012)
                    .put("cm05013", cm05013)
                    .put("cm0501301x", cm0501301x)
                    .put("cm05015", cm05015)
                    .put("cm05016", cm05016)
                    .put("cm0501601x", cm0501601x)
                    .put("cm05018", cm05018)
                    .put("cm0501801x", cm0501801x)
                    .put("cm05020", cm05020)
                    .put("cm0601", cm0601)
                    .put("cm0602", cm0602)
                    .put("cm0603", cm0603)
                    .put("cm0604", cm0604)
                    .put("cm0606", cm0606)
                    .put("cm0607", cm0607)
                    .put("cm0608", cm0608)
                    .put("cm0609", cm0609)
                    .put("cm0605", cm0605)
                    .put("cm0701", cm0701)
                    .put("cm0702", cm0702)
                    .put("cm070277x", cm070277x)
                    .put("cm0703a", cm0703a)
                    .put("cm0703b", cm0703b)
                    .put("chkvaccdta", chkvaccdta)
                    .put("chkvaccdtb", chkvaccdtb);


        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);

            json.put(Forms21cmContract.Forms21cmTable.COLUMN_STUDYID, this.studyid == null ? JSONObject.NULL : this.studyid);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_DSSID, this.dssid == null ? JSONObject.NULL : this.dssid);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_WEEK, this.week == null ? JSONObject.NULL : this.week);


            json.put(Forms21cmContract.Forms21cmTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_GPS, this.gps == null ? JSONObject.NULL : this.gps);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(Forms21cmContract.Forms21cmTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);

            json.put(Forms21cmContract.Forms21cmTable.COLUMN_S02, new JSONObject(s02toString()));


            if (this.s02 != null && !this.s02.equals("")) {
                json.put(Forms21cmContract.Forms21cmTable.COLUMN_S02, new JSONObject(this.s02));
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
                this.cm0103 = json.getString("cm0103");
                this.cm0104 = json.getString("cm0104");
                this.cm0105 = json.getString("cm0105");
                this.cm0106 = json.getString("cm0106");
                this.cm0107 = json.getString("cm0107");
                this.cm0108 = json.getString("cm0108");
                this.cm0109 = json.getString("cm0109");
                this.cm0109mx = json.getString("cm0109mx");
                this.cm0110 = json.getString("cm0110");
                this.cm0111 = json.getString("cm0111");
                this.cm0112 = json.getString("cm0112");
                this.cm0201 = json.getString("cm0201");
                this.cm0202 = json.getString("cm0202");
                this.cm020277x = json.getString("cm020277x");
                this.cm0301 = json.getString("cm0301");
                this.cm0302 = json.getString("cm0302");
                this.cm0303 = json.getString("cm0303");
                this.cm0304 = json.getString("cm0304");
                this.cm0305 = json.getString("cm0305");
                this.cm0306 = json.getString("cm0306");
                this.cm0307 = json.getString("cm0307");
                this.cm0308 = json.getString("cm0308");
                this.cm0309 = json.getString("cm0309");
                this.cm03010 = json.getString("cm03010");
                this.cm03011 = json.getString("cm03011");
                this.cm03012 = json.getString("cm03012");
                this.cm03013 = json.getString("cm03013");
                this.cm03014 = json.getString("cm03014");
                this.cm03015 = json.getString("cm03015");
                this.cm03016 = json.getString("cm03016");
                this.cm03017 = json.getString("cm03017");
                this.cm03018 = json.getString("cm03018");
                this.cm03019 = json.getString("cm03019");
                this.cm03020 = json.getString("cm03020");
                this.cm03021 = json.getString("cm03021");
                this.cm03022 = json.getString("cm03022");
                this.cm03023 = json.getString("cm03023");
                this.cm03024 = json.getString("cm03024");
                this.cm03025 = json.getString("cm03025");
                this.cm03026 = json.getString("cm03026");
                this.cm03027 = json.getString("cm03027");
                this.cm03028 = json.getString("cm03028");
                this.cm03029 = json.getString("cm03029");
                this.cm03030 = json.getString("cm03030");
                this.cm03031 = json.getString("cm03031");
                this.cm03032 = json.getString("cm03032");
                this.cm03033 = json.getString("cm03033");
                this.cm03034 = json.getString("cm03034");
                this.cm03035 = json.getString("cm03035");
                this.cm03036 = json.getString("cm03036");
                this.cm03037 = json.getString("cm03037");
                this.cm03038 = json.getString("cm03038");
                this.cm03039 = json.getString("cm03039");
                this.cm03040 = json.getString("cm03040");
                this.cm03041 = json.getString("cm03041");
                this.cm03042 = json.getString("cm03042");
                this.cm03043 = json.getString("cm03043");
                this.cm03044 = json.getString("cm03044");
                this.cm03045 = json.getString("cm03045");
                this.cm03046 = json.getString("cm03046");
                this.cm03047 = json.getString("cm03047");
                this.cm03048 = json.getString("cm03048");
                this.cm03049 = json.getString("cm03049");
                this.cm03050 = json.getString("cm03050");
                this.cm03051 = json.getString("cm03051");
                this.cm0401 = json.getString("cm0401");
                this.cm0402 = json.getString("cm0402");
                this.cm0403 = json.getString("cm0403");
                this.cm0404 = json.getString("cm0404");
                this.cm0405 = json.getString("cm0405");
                this.cm0406 = json.getString("cm0406");
                this.cm0407 = json.getString("cm0407");
                this.cm0408 = json.getString("cm0408");
                this.cm0408015x = json.getString("cm0408015x");
                this.cm04010 = json.getString("cm04010");
                this.cm04011 = json.getString("cm04011");
                this.cm04012 = json.getString("cm04012");
                this.cm04013 = json.getString("cm04013");
                this.cm0501 = json.getString("cm0501");
                this.cm0502 = json.getString("cm0502");
                this.cm0503 = json.getString("cm0503");
                this.cm0504 = json.getString("cm0504");
                this.cm0505 = json.getString("cm0505");
                this.cm0506 = json.getString("cm0506");
                this.cm0507 = json.getString("cm0507");
                this.cm0508 = json.getString("cm0508");
                this.cm0509 = json.getString("cm0509");
                this.cm050901x = json.getString("cm050901x");
                this.cm05011 = json.getString("cm05011");
                this.cm05012 = json.getString("cm05012");
                this.cm05013 = json.getString("cm05013");
                this.cm0501301x = json.getString("cm0501301x");
                this.cm05015 = json.getString("cm05015");
                this.cm05016 = json.getString("cm05016");
                this.cm0501601x = json.getString("cm0501601x");
                this.cm05018 = json.getString("cm05018");
                this.cm0501801x = json.getString("cm0501801x");
                this.cm05020 = json.getString("cm05020");
                this.cm0601 = json.getString("cm0601");
                this.cm0602 = json.getString("cm0602");
                this.cm0603 = json.getString("cm0603");
                this.cm0604 = json.getString("cm0604");
                if (json.has("cm0606")) {
                    this.cm0606 = json.getString("cm0606");
                } else {
                    this.cm0606 = "";
                }
                if (json.has("cm0605")) {
                    this.cm0605 = json.getString("cm0605");
                } else {
                    this.cm0605 = "";
                }
                if (json.has("cm0608")) {
                    this.cm0608 = json.getString("cm0608");
                } else {
                    this.cm0608 = "";
                }
                if (json.has("cm0609")) {
                    this.cm0609 = json.getString("cm0609");
                } else {
                    this.cm0609 = "";
                }


                if (json.has("cm0701")) {
                    this.cm0701 = json.getString("cm0701");
                } else {
                    this.cm0701 = "";
                }


                if (json.has("cm0702")) {
                    this.cm0702 = json.getString("cm0702");
                } else {
                    this.cm0702 = "";
                }


                if (json.has("cm070277x")) {
                    this.cm070277x = json.getString("cm070277x");
                } else {
                    this.cm070277x = "";
                }


                if (json.has("cm0703a")) {
                    this.cm0703a = json.getString("cm0703a");
                } else {
                    this.cm0703a = "";
                }


                if (json.has("cm0703b")) {
                    this.cm0703b = json.getString("cm0703b");
                } else {
                    this.cm0703b = "";
                }


                if (json.has("chkvaccdta")) {
                    this.chkvaccdta = json.getString("chkvaccdta");
                } else {
                    this.chkvaccdta = "";
                }


                if (json.has("chkvaccdtb")) {
                    this.chkvaccdtb = json.getString("chkvaccdtb");
                } else {
                    this.chkvaccdtb = "";
                }


              /*
                this.cm0606 = json.getString("cm0606");

                this.cm0608 = json.getString("cm0608");
                this.cm0609 = json.getString("cm0609");
                this.cm0605 = json.getString("cm0605");*/
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}