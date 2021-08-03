package edu.aku.hassannaqvi.amanhicovid_19study.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.threeten.bp.LocalDate;

import edu.aku.hassannaqvi.amanhicovid_19study.contracts.Forms4mmContract;
import edu.aku.hassannaqvi.amanhicovid_19study.contracts.FormsPregSurvContract;
import edu.aku.hassannaqvi.amanhicovid_19study.core.MainApp;

public class FollowUpPregSurv extends BaseObservable {

    //Main Variables
    private String TAG = "FollowUpPregSurv";
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


    public String mmsid = "";
    public String mm0101 = "";
    public String mm0103 = "";
    public String mm0104 = "";
    public String mm0106 = "";
    public String mm0107 = "";
    public String mm0108 = "";
    public String mm0108a = "";
    public String mm0108b = "";


    public String site = "";
    public String mm0101a = "";
    public String mm0101b = "";
    public String mm0101c = "";
    public String mm0101d = "";
    public String mm0102 = "";
    public String mm0103d = "";
    public String mm0103m = "";
    public String mm0103y = "";
    public String mm0103ad = "";
    public String mm0103am = "";
    public String mm0103ay = "";
    public String mm0103bd = "";
    public String mm0103bm = "";
    public String mm0103by = "";
    public String mm0103cd = "";
    public String mm0103cm = "";
    public String mm0103cy = "";
    public String mm0103dd = "";
    public String mm0103dm = "";
    public String mm0103dy = "";
    public String whowid = "";
    public String pregid1 = "";
    public String pregid2 = "";
    public String pregid3 = "";
    public String mm0106t = "";
    public String mm0106wx = "";
    public String mm0107t = "";
    public String mm0107x = "";
    public String mm0201 = "";
    public String whyvisitfail = "";
    public String visitfail_oth = "";
    public String crpreg = "";
    public String cr5002a = "";
    public String cr5002aax = "";
    public String cr5002b = "";
    public String cr5002bax = "";
    public String cr5003a = "";
    public String cr5003aax = "";
    public String cr5003b = "";
    public String cr5003bax = "";
    public String cr3004a = "";
    public String cr3004b = "";
    public String cr3004bi = "";
    public String cr3004bii = "";
    public String cr3004biii = "";
    public String cr3004c = "";
    public String cr3004d = "";
    public String cr3004e = "";
    public String cr3004f = "";
    public String cr3004g = "";
    public String cr3004h = "";
    public String cr3004i = "";
    public String cr3004j = "";
    public String cr3004k = "";
    public String cr3004l = "";
    public String cr3004m = "";
    public String cr3004n = "";
    public String cr3004o = "";
    public String cr3004p = "";
    public String cr3004q = "";
    public String cr3004si = "";
    public String cr3004sia = "";
    public String cr3004qsii = "";
    public String cr3004qsiii = "";
    public String cr3004r = "";
    public String cr3004rsi = "";
    public String cr3004qrsii = "";
    public String cr3004qrsiii = "";
    public String cr3004s = "";
    public String cr3004ss = "";
    public String cr3005 = "";
    public String cr3005a = "";
    public String cr3005as = "";
    public String cr5005asid = "";
    public String cr5005asim = "";
    public String cr5005asiy = "";
    public String cr3005b = "";
    public String cr3005bs = "";
    public String cr5005bsid = "";
    public String cr5005bsim = "";
    public String cr5005bsiy = "";
    public String cr3005c = "";
    public String cr3005cs = "";
    public String cr5005csid = "";
    public String cr5005csim = "";
    public String cr5005csiy = "";
    public String cr3005d = "";
    public String cr3005ds = "";
    public String cr5005dsid = "";
    public String cr5005dsim = "";
    public String cr5005dsiy = "";
    public String cr3005e = "";
    public String cr3005es = "";
    public String cr5005esid = "";
    public String cr5005esim = "";
    public String cr5005esiy = "";
    public String cr3005f = "";
    public String cr3005fs = "";
    public String cr5005fsid = "";
    public String cr5005fsim = "";
    public String cr5005fsiy = "";
    public String cr3005g = "";
    public String cr3005gs = "";
    public String cr5005gsid = "";
    public String cr5005gsim = "";
    public String cr5005gsiy = "";
    public String cr3005h = "";
    public String cr3005hs = "";
    public String cr5005hsid = "";
    public String cr5005hsim = "";
    public String cr5005hsiy = "";
    public String cr3005i = "";
    public String cr3005is = "";
    public String cr5005isid = "";
    public String cr5005isim = "";
    public String cr5005isiy = "";
    public String cr3005j = "";
    public String cr3005js = "";
    public String cr5005jsid = "";
    public String cr5005jsim = "";
    public String cr5005jsiy = "";
    public String cr3005k = "";
    public String cr3005ks = "";
    public String cr5005ksid = "";
    public String cr5005ksim = "";
    public String cr5005ksiy = "";
    public String cr3005l = "";
    public String cr5005lsid = "";
    public String cr5005lsim = "";
    public String cr5005lsiy = "";
    public String cr3005m = "";
    public String cr5005msid = "";
    public String cr5005msim = "";
    public String cr5005msiy = "";
    public String cr3005n = "";
    public String cr5005nsid = "";
    public String cr5005nsim = "";
    public String cr5005nsiy = "";
    public String cr3005o = "";
    public String cr5005osid = "";
    public String cr5005osim = "";
    public String cr5005osiy = "";
    public String cr3005p = "";
    public String cr5005psid = "";
    public String cr5005psim = "";
    public String cr5005psiy = "";
    public String cr3005q = "";
    public String cr5005qsid = "";
    public String cr5005qsim = "";
    public String cr5005qsiy = "";
    public String cr3005r = "";
    public String cr5005rsid = "";
    public String cr5005rsim = "";
    public String cr5005rsiy = "";
    public String cr3005s = "";
    public String cr5005ssid = "";
    public String cr5005ssim = "";
    public String cr5005ssiy = "";
    public String cr3005t = "";
    public String cr5005tsid = "";
    public String cr5005tsim = "";
    public String cr5005tsiy = "";
    public String cr3005u = "";
    public String cr5005usid = "";
    public String cr5005usim = "";
    public String cr5005usiy = "";
    public String cr3005v = "";
    public String cr5005vsid = "";
    public String cr5005vsim = "";
    public String cr5005vsiy = "";
    public String cr3005w = "";
    public String cr5005wsid = "";
    public String cr5005wsim = "";
    public String cr5005wsiy = "";
    public String cr3005x = "";
    public String cr5005xsid = "";
    public String cr5005xsim = "";
    public String cr5005xsiy = "";
    public String cr3005y = "";
    public String cr5005ysid = "";
    public String cr5005ysim = "";
    public String cr5005ysiy = "";
    public String cr3005z = "";
    public String cr5005zsid = "";
    public String cr5005zsim = "";
    public String cr5005zsiy = "";
    public String cr3005aa = "";
    public String cr5005aasid = "";
    public String cr5005aasim = "";
    public String cr5005aasiy = "";
    public String cr3005ab = "";
    public String cr3005abs = "";
    public String cr5005absid = "";
    public String cr5005absim = "";
    public String cr5005absiy = "";
    public String cr5006t = "";
    public String cr5006x = "";
    public String cr5007t = "";
    public String cr5007x = "";
    public String cr5008 = "";
    public String cr5008ut = "";
    public String cr5008ux = "";
    public String cr5009t = "";
    public String cr5009x = "";
    public String cr5010t = "";
    public String cr5010x = "";
    public String cr5011 = "";
    public String cr5012 = "";
    public String cr5013at = "";
    public String cr5013ax = "";
    public String cr5013bt = "";
    public String cr5013bx = "";
    public String cr5014t = "";
    public String cr5014x = "";
    public String cr5015t = "";
    public String cr5015x = "";
    public String crlablw = "";
    public String crlabab = "";
    public String cr5016u = "";
    public String cr5016t = "";
    public String cr5016x = "";
    public String cr5017u = "";
    public String cr5017t = "";
    public String cr5017x = "";
    public String cr5018u = "";
    public String cr5018t = "";
    public String cr5018x = "";
    public String cr5019t = "";
    public String cr5019x = "";
    public String cr5020t = "";
    public String cr5020x = "";
    public String cr5021t = "";
    public String cr5021x = "";
    public String cr5022u = "";
    public String cr5022t = "";
    public String cr5022x = "";
    public String cr5023u = "";
    public String cr5023t = "";
    public String cr5023x = "";
    public String cr5024t = "";
    public String cr5024x = "";
    public String cr5025t = "";
    public String cr5025x = "";
    public String cr5026t = "";
    public String cr5026x = "";
    public String cr5027t = "";
    public String cr5027x = "";
    public String cr5028t = "";
    public String cr5028x = "";
    public String cr5029u = "";
    public String cr5029t = "";
    public String cr5029x = "";
    public String cr5030t = "";
    public String cr5030x = "";
    public String cr5031u = "";
    public String cr5031t = "";
    public String cr5031x = "";
    public String cr5032t = "";
    public String cr5032x = "";
    public String cr5033t = "";
    public String cr5033x = "";
    public String cr5034u = "";
    public String cr5034t = "";
    public String cr5034x = "";
    public String cr5035u = "";
    public String cr5035t = "";
    public String cr5035x = "";
    public String cr5036u = "";
    public String cr5036t = "";
    public String cr5036x = "";
    public String cr5037u = "";
    public String cr5037t = "";
    public String cr5037x = "";
    public String cr5038u = "";
    public String cr5038t = "";
    public String cr5038x = "";
    public String cr5039t = "";
    public String cr5039x = "";
    public String symp = "";
    public String cr5040b = "";
    public String cr5040c = "";
    public String cr5040d = "";
    public String cr5040e = "";
    public String cr5040f = "";
    public String cr5040g = "";
    public String cr5040h = "";
    public String cr5040i = "";
    public String cr5040j = "";
    public String cr5040k = "";
    public String cr5040l = "";
    public String cr5040m = "";
    public String cr5040n = "";
    public String cr5040o = "";
    public String cr5040p = "";
    public String cr5040q = "";
    public String cr5040r = "";
    public String cr5040s = "";
    public String cr5040t = "";
    public String cr5040u = "";
    public String cr5040v = "";
    public String cr5040w = "";
    public String cr5040x = "";
    public String cr5040y = "";
    public String cr5040a = "";
    public String cr5040aa = "";
    public String cr5040ab = "";
    public String cr5040ac = "";
    public String cr5040ad = "";
    public String cr5040ae = "";
    public String cr5040es = "";
    public String cr5040aesi = "";
    public String cr5040aesii = "";
    public String cr5040af = "";
    public String cr5040afs = "";
    public String cr5040ag = "";
    public String cr5040ags = "";
    public String cr5041a = "";
    public String cr5041b = "";
    public String test = "";
    public String teat_avail = "";
    public String cr5042a = "";
    public String cr5042b = "";
    public String cr5042cd = "";
    public String cr5042cm = "";
    public String cr5042cy = "";
    public String cr5024d = "";
    public String cr5042g = "";


    //Not saving in DB
    private LocalDate localDate = null;

    public FollowUpPregSurv() {
    }


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
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

    public String getMm0103() {
        return mm0103;
    }

    public void setMm0103(String mm0103) {
        this.mm0103 = mm0103;
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

    public String getMm0101() {
        return mm0101;
    }

    public void setMm0101(String mm0101) {
        this.mm0101 = mm0101;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMm0101a() {
        return mm0101a;
    }

    public void setMm0101a(String mm0101a) {
        this.mm0101a = mm0101a;
    }

    public String getMm0101b() {
        return mm0101b;
    }

    public void setMm0101b(String mm0101b) {
        this.mm0101b = mm0101b;
    }

    public String getMm0101c() {
        return mm0101c;
    }

    public void setMm0101c(String mm0101c) {
        this.mm0101c = mm0101c;
    }

    public String getMm0101d() {
        return mm0101d;
    }

    public void setMm0101d(String mm0101d) {
        this.mm0101d = mm0101d;
    }

    public String getMm0102() {
        return mm0102;
    }

    public void setMm0102(String mm0102) {
        this.mm0102 = mm0102;
    }

    public String getMm0103d() {
        return mm0103d;
    }

    public void setMm0103d(String mm0103d) {
        this.mm0103d = mm0103d;
    }

    public String getMm0103m() {
        return mm0103m;
    }

    public void setMm0103m(String mm0103m) {
        this.mm0103m = mm0103m;
    }

    public String getMm0103y() {
        return mm0103y;
    }

    public void setMm0103y(String mm0103y) {
        this.mm0103y = mm0103y;
    }

    public String getMm0103ad() {
        return mm0103ad;
    }

    public void setMm0103ad(String mm0103ad) {
        this.mm0103ad = mm0103ad;
    }

    public String getMm0103am() {
        return mm0103am;
    }

    public void setMm0103am(String mm0103am) {
        this.mm0103am = mm0103am;
    }

    public String getMm0103ay() {
        return mm0103ay;
    }

    public void setMm0103ay(String mm0103ay) {
        this.mm0103ay = mm0103ay;
    }

    public String getMm0103bd() {
        return mm0103bd;
    }

    public void setMm0103bd(String mm0103bd) {
        this.mm0103bd = mm0103bd;
    }

    public String getMm0103bm() {
        return mm0103bm;
    }

    public void setMm0103bm(String mm0103bm) {
        this.mm0103bm = mm0103bm;
    }

    public String getMm0103by() {
        return mm0103by;
    }

    public void setMm0103by(String mm0103by) {
        this.mm0103by = mm0103by;
    }

    public String getMm0103cd() {
        return mm0103cd;
    }

    public void setMm0103cd(String mm0103cd) {
        this.mm0103cd = mm0103cd;
    }

    public String getMm0103cm() {
        return mm0103cm;
    }

    public void setMm0103cm(String mm0103cm) {
        this.mm0103cm = mm0103cm;
    }

    public String getMm0103cy() {
        return mm0103cy;
    }

    public void setMm0103cy(String mm0103cy) {
        this.mm0103cy = mm0103cy;
    }

    public String getMm0103dd() {
        return mm0103dd;
    }

    public void setMm0103dd(String mm0103dd) {
        this.mm0103dd = mm0103dd;
    }

    public String getMm0103dm() {
        return mm0103dm;
    }

    public void setMm0103dm(String mm0103dm) {
        this.mm0103dm = mm0103dm;
    }

    public String getMm0103dy() {
        return mm0103dy;
    }

    public void setMm0103dy(String mm0103dy) {
        this.mm0103dy = mm0103dy;
    }

    public String getMm0104() {
        return mm0104;
    }

    public void setMm0104(String mm0104) {
        this.mm0104 = mm0104;
    }

    public String getWhowid() {
        return whowid;
    }

    public void setWhowid(String whowid) {
        this.whowid = whowid;
    }

    public String getPregid1() {
        return pregid1;
    }

    public void setPregid1(String pregid1) {
        this.pregid1 = pregid1;
    }

    public String getPregid2() {
        return pregid2;
    }

    public void setPregid2(String pregid2) {
        this.pregid2 = pregid2;
    }

    public String getPregid3() {
        return pregid3;
    }

    public void setPregid3(String pregid3) {
        this.pregid3 = pregid3;
    }

    public String getMm0106t() {
        return mm0106t;
    }

    public void setMm0106t(String mm0106t) {
        this.mm0106t = mm0106t;
    }

    public String getMm0106wx() {
        return mm0106wx;
    }

    public void setMm0106wx(String mm0106wx) {
        this.mm0106wx = mm0106wx;
    }

    public String getMm0107t() {
        return mm0107t;
    }

    public void setMm0107t(String mm0107t) {
        this.mm0107t = mm0107t;
    }

    public String getMm0107x() {
        return mm0107x;
    }

    public void setMm0107x(String mm0107x) {
        this.mm0107x = mm0107x;
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

    public String getWhyvisitfail() {
        return whyvisitfail;
    }

    public void setWhyvisitfail(String whyvisitfail) {
        this.whyvisitfail = whyvisitfail;
    }

    public String getVisitfail_oth() {
        return visitfail_oth;
    }

    public void setVisitfail_oth(String visitfail_oth) {
        this.visitfail_oth = visitfail_oth;
    }

    public String getCrpreg() {
        return crpreg;
    }

    public void setCrpreg(String crpreg) {
        this.crpreg = crpreg;
    }

    public String getCr5002a() {
        return cr5002a;
    }

    public void setCr5002a(String cr5002a) {
        this.cr5002a = cr5002a;
    }

    public String getCr5002aax() {
        return cr5002aax;
    }

    public void setCr5002aax(String cr5002aax) {
        this.cr5002aax = cr5002aax;
    }

    public String getCr5002b() {
        return cr5002b;
    }

    public void setCr5002b(String cr5002b) {
        this.cr5002b = cr5002b;
    }

    public String getCr5002bax() {
        return cr5002bax;
    }

    public void setCr5002bax(String cr5002bax) {
        this.cr5002bax = cr5002bax;
    }

    public String getCr5003a() {
        return cr5003a;
    }

    public void setCr5003a(String cr5003a) {
        this.cr5003a = cr5003a;
    }

    public String getCr5003aax() {
        return cr5003aax;
    }

    public void setCr5003aax(String cr5003aax) {
        this.cr5003aax = cr5003aax;
    }

    public String getCr5003b() {
        return cr5003b;
    }

    public void setCr5003b(String cr5003b) {
        this.cr5003b = cr5003b;
    }

    public String getCr5003bax() {
        return cr5003bax;
    }

    public void setCr5003bax(String cr5003bax) {
        this.cr5003bax = cr5003bax;
    }

    public String getCr3004a() {
        return cr3004a;
    }

    public void setCr3004a(String cr3004a) {
        this.cr3004a = cr3004a;
    }

    public String getCr3004b() {
        return cr3004b;
    }

    public void setCr3004b(String cr3004b) {
        this.cr3004b = cr3004b;
    }

    public String getCr3004bi() {
        return cr3004bi;
    }

    public void setCr3004bi(String cr3004bi) {
        this.cr3004bi = cr3004bi;
    }

    public String getCr3004bii() {
        return cr3004bii;
    }

    public void setCr3004bii(String cr3004bii) {
        this.cr3004bii = cr3004bii;
    }

    public String getCr3004biii() {
        return cr3004biii;
    }

    public void setCr3004biii(String cr3004biii) {
        this.cr3004biii = cr3004biii;
    }

    public String getCr3004c() {
        return cr3004c;
    }

    public void setCr3004c(String cr3004c) {
        this.cr3004c = cr3004c;
    }

    public String getCr3004d() {
        return cr3004d;
    }

    public void setCr3004d(String cr3004d) {
        this.cr3004d = cr3004d;
    }

    public String getCr3004e() {
        return cr3004e;
    }

    public void setCr3004e(String cr3004e) {
        this.cr3004e = cr3004e;
    }

    public String getCr3004f() {
        return cr3004f;
    }

    public void setCr3004f(String cr3004f) {
        this.cr3004f = cr3004f;
    }

    public String getCr3004g() {
        return cr3004g;
    }

    public void setCr3004g(String cr3004g) {
        this.cr3004g = cr3004g;
    }

    public String getCr3004h() {
        return cr3004h;
    }

    public void setCr3004h(String cr3004h) {
        this.cr3004h = cr3004h;
    }

    public String getCr3004i() {
        return cr3004i;
    }

    public void setCr3004i(String cr3004i) {
        this.cr3004i = cr3004i;
    }

    public String getCr3004j() {
        return cr3004j;
    }

    public void setCr3004j(String cr3004j) {
        this.cr3004j = cr3004j;
    }

    public String getCr3004k() {
        return cr3004k;
    }

    public void setCr3004k(String cr3004k) {
        this.cr3004k = cr3004k;
    }

    public String getCr3004l() {
        return cr3004l;
    }

    public void setCr3004l(String cr3004l) {
        this.cr3004l = cr3004l;
    }

    public String getCr3004m() {
        return cr3004m;
    }

    public void setCr3004m(String cr3004m) {
        this.cr3004m = cr3004m;
    }

    public String getCr3004n() {
        return cr3004n;
    }

    public void setCr3004n(String cr3004n) {
        this.cr3004n = cr3004n;
    }

    public String getCr3004o() {
        return cr3004o;
    }

    public void setCr3004o(String cr3004o) {
        this.cr3004o = cr3004o;
    }

    public String getCr3004p() {
        return cr3004p;
    }

    public void setCr3004p(String cr3004p) {
        this.cr3004p = cr3004p;
    }

    public String getCr3004q() {
        return cr3004q;
    }

    public void setCr3004q(String cr3004q) {
        this.cr3004q = cr3004q;
    }

    public String getCr3004si() {
        return cr3004si;
    }

    public void setCr3004si(String cr3004si) {
        this.cr3004si = cr3004si;
    }

    public String getCr3004sia() {
        return cr3004sia;
    }

    public void setCr3004sia(String cr3004sia) {
        this.cr3004sia = cr3004sia;
    }

    public String getCr3004qsii() {
        return cr3004qsii;
    }

    public void setCr3004qsii(String cr3004qsii) {
        this.cr3004qsii = cr3004qsii;
    }

    public String getCr3004qsiii() {
        return cr3004qsiii;
    }

    public void setCr3004qsiii(String cr3004qsiii) {
        this.cr3004qsiii = cr3004qsiii;
    }

    public String getCr3004r() {
        return cr3004r;
    }

    public void setCr3004r(String cr3004r) {
        this.cr3004r = cr3004r;
    }

    public String getCr3004rsi() {
        return cr3004rsi;
    }

    public void setCr3004rsi(String cr3004rsi) {
        this.cr3004rsi = cr3004rsi;
    }

    public String getCr3004qrsii() {
        return cr3004qrsii;
    }

    public void setCr3004qrsii(String cr3004qrsii) {
        this.cr3004qrsii = cr3004qrsii;
    }

    public String getCr3004qrsiii() {
        return cr3004qrsiii;
    }

    public void setCr3004qrsiii(String cr3004qrsiii) {
        this.cr3004qrsiii = cr3004qrsiii;
    }

    public String getCr3004s() {
        return cr3004s;
    }

    public void setCr3004s(String cr3004s) {
        this.cr3004s = cr3004s;
    }

    public String getCr3004ss() {
        return cr3004ss;
    }

    public void setCr3004ss(String cr3004ss) {
        this.cr3004ss = cr3004ss;
    }

    public String getCr3005() {
        return cr3005;
    }

    public void setCr3005(String cr3005) {
        this.cr3005 = cr3005;
    }

    public String getCr3005a() {
        return cr3005a;
    }

    public void setCr3005a(String cr3005a) {
        this.cr3005a = cr3005a;
    }

    public String getCr3005as() {
        return cr3005as;
    }

    public void setCr3005as(String cr3005as) {
        this.cr3005as = cr3005as;
    }

    public String getCr5005asid() {
        return cr5005asid;
    }

    public void setCr5005asid(String cr5005asid) {
        this.cr5005asid = cr5005asid;
    }

    public String getCr5005asim() {
        return cr5005asim;
    }

    public void setCr5005asim(String cr5005asim) {
        this.cr5005asim = cr5005asim;
    }

    public String getCr5005asiy() {
        return cr5005asiy;
    }

    public void setCr5005asiy(String cr5005asiy) {
        this.cr5005asiy = cr5005asiy;
    }

    public String getCr3005b() {
        return cr3005b;
    }

    public void setCr3005b(String cr3005b) {
        this.cr3005b = cr3005b;
    }

    public String getCr3005bs() {
        return cr3005bs;
    }

    public void setCr3005bs(String cr3005bs) {
        this.cr3005bs = cr3005bs;
    }

    public String getCr5005bsid() {
        return cr5005bsid;
    }

    public void setCr5005bsid(String cr5005bsid) {
        this.cr5005bsid = cr5005bsid;
    }

    public String getCr5005bsim() {
        return cr5005bsim;
    }

    public void setCr5005bsim(String cr5005bsim) {
        this.cr5005bsim = cr5005bsim;
    }

    public String getCr5005bsiy() {
        return cr5005bsiy;
    }

    public void setCr5005bsiy(String cr5005bsiy) {
        this.cr5005bsiy = cr5005bsiy;
    }

    public String getCr3005c() {
        return cr3005c;
    }

    public void setCr3005c(String cr3005c) {
        this.cr3005c = cr3005c;
    }

    public String getCr3005cs() {
        return cr3005cs;
    }

    public void setCr3005cs(String cr3005cs) {
        this.cr3005cs = cr3005cs;
    }

    public String getCr5005csid() {
        return cr5005csid;
    }

    public void setCr5005csid(String cr5005csid) {
        this.cr5005csid = cr5005csid;
    }

    public String getCr5005csim() {
        return cr5005csim;
    }

    public void setCr5005csim(String cr5005csim) {
        this.cr5005csim = cr5005csim;
    }

    public String getCr5005csiy() {
        return cr5005csiy;
    }

    public void setCr5005csiy(String cr5005csiy) {
        this.cr5005csiy = cr5005csiy;
    }

    public String getCr3005d() {
        return cr3005d;
    }

    public void setCr3005d(String cr3005d) {
        this.cr3005d = cr3005d;
    }

    public String getCr3005ds() {
        return cr3005ds;
    }

    public void setCr3005ds(String cr3005ds) {
        this.cr3005ds = cr3005ds;
    }

    public String getCr5005dsid() {
        return cr5005dsid;
    }

    public void setCr5005dsid(String cr5005dsid) {
        this.cr5005dsid = cr5005dsid;
    }

    public String getCr5005dsim() {
        return cr5005dsim;
    }

    public void setCr5005dsim(String cr5005dsim) {
        this.cr5005dsim = cr5005dsim;
    }

    public String getCr5005dsiy() {
        return cr5005dsiy;
    }

    public void setCr5005dsiy(String cr5005dsiy) {
        this.cr5005dsiy = cr5005dsiy;
    }

    public String getCr3005e() {
        return cr3005e;
    }

    public void setCr3005e(String cr3005e) {
        this.cr3005e = cr3005e;
    }

    public String getCr3005es() {
        return cr3005es;
    }

    public void setCr3005es(String cr3005es) {
        this.cr3005es = cr3005es;
    }

    public String getCr5005esid() {
        return cr5005esid;
    }

    public void setCr5005esid(String cr5005esid) {
        this.cr5005esid = cr5005esid;
    }

    public String getCr5005esim() {
        return cr5005esim;
    }

    public void setCr5005esim(String cr5005esim) {
        this.cr5005esim = cr5005esim;
    }

    public String getCr5005esiy() {
        return cr5005esiy;
    }

    public void setCr5005esiy(String cr5005esiy) {
        this.cr5005esiy = cr5005esiy;
    }

    public String getCr3005f() {
        return cr3005f;
    }

    public void setCr3005f(String cr3005f) {
        this.cr3005f = cr3005f;
    }

    public String getCr3005fs() {
        return cr3005fs;
    }

    public void setCr3005fs(String cr3005fs) {
        this.cr3005fs = cr3005fs;
    }

    public String getCr5005fsid() {
        return cr5005fsid;
    }

    public void setCr5005fsid(String cr5005fsid) {
        this.cr5005fsid = cr5005fsid;
    }

    public String getCr5005fsim() {
        return cr5005fsim;
    }

    public void setCr5005fsim(String cr5005fsim) {
        this.cr5005fsim = cr5005fsim;
    }

    public String getCr5005fsiy() {
        return cr5005fsiy;
    }

    public void setCr5005fsiy(String cr5005fsiy) {
        this.cr5005fsiy = cr5005fsiy;
    }

    public String getCr3005g() {
        return cr3005g;
    }

    public void setCr3005g(String cr3005g) {
        this.cr3005g = cr3005g;
    }

    public String getCr3005gs() {
        return cr3005gs;
    }

    public void setCr3005gs(String cr3005gs) {
        this.cr3005gs = cr3005gs;
    }

    public String getCr5005gsid() {
        return cr5005gsid;
    }

    public void setCr5005gsid(String cr5005gsid) {
        this.cr5005gsid = cr5005gsid;
    }

    public String getCr5005gsim() {
        return cr5005gsim;
    }

    public void setCr5005gsim(String cr5005gsim) {
        this.cr5005gsim = cr5005gsim;
    }

    public String getCr5005gsiy() {
        return cr5005gsiy;
    }

    public void setCr5005gsiy(String cr5005gsiy) {
        this.cr5005gsiy = cr5005gsiy;
    }

    public String getCr3005h() {
        return cr3005h;
    }

    public void setCr3005h(String cr3005h) {
        this.cr3005h = cr3005h;
    }

    public String getCr3005hs() {
        return cr3005hs;
    }

    public void setCr3005hs(String cr3005hs) {
        this.cr3005hs = cr3005hs;
    }

    public String getCr5005hsid() {
        return cr5005hsid;
    }

    public void setCr5005hsid(String cr5005hsid) {
        this.cr5005hsid = cr5005hsid;
    }

    public String getCr5005hsim() {
        return cr5005hsim;
    }

    public void setCr5005hsim(String cr5005hsim) {
        this.cr5005hsim = cr5005hsim;
    }

    public String getCr5005hsiy() {
        return cr5005hsiy;
    }

    public void setCr5005hsiy(String cr5005hsiy) {
        this.cr5005hsiy = cr5005hsiy;
    }

    public String getCr3005i() {
        return cr3005i;
    }

    public void setCr3005i(String cr3005i) {
        this.cr3005i = cr3005i;
    }

    public String getCr3005is() {
        return cr3005is;
    }

    public void setCr3005is(String cr3005is) {
        this.cr3005is = cr3005is;
    }

    public String getCr5005isid() {
        return cr5005isid;
    }

    public void setCr5005isid(String cr5005isid) {
        this.cr5005isid = cr5005isid;
    }

    public String getCr5005isim() {
        return cr5005isim;
    }

    public void setCr5005isim(String cr5005isim) {
        this.cr5005isim = cr5005isim;
    }

    public String getCr5005isiy() {
        return cr5005isiy;
    }

    public void setCr5005isiy(String cr5005isiy) {
        this.cr5005isiy = cr5005isiy;
    }

    public String getCr3005j() {
        return cr3005j;
    }

    public void setCr3005j(String cr3005j) {
        this.cr3005j = cr3005j;
    }

    public String getCr3005js() {
        return cr3005js;
    }

    public void setCr3005js(String cr3005js) {
        this.cr3005js = cr3005js;
    }

    public String getCr5005jsid() {
        return cr5005jsid;
    }

    public void setCr5005jsid(String cr5005jsid) {
        this.cr5005jsid = cr5005jsid;
    }

    public String getCr5005jsim() {
        return cr5005jsim;
    }

    public void setCr5005jsim(String cr5005jsim) {
        this.cr5005jsim = cr5005jsim;
    }

    public String getCr5005jsiy() {
        return cr5005jsiy;
    }

    public void setCr5005jsiy(String cr5005jsiy) {
        this.cr5005jsiy = cr5005jsiy;
    }

    public String getCr3005k() {
        return cr3005k;
    }

    public void setCr3005k(String cr3005k) {
        this.cr3005k = cr3005k;
    }

    public String getCr3005ks() {
        return cr3005ks;
    }

    public void setCr3005ks(String cr3005ks) {
        this.cr3005ks = cr3005ks;
    }

    public String getCr5005ksid() {
        return cr5005ksid;
    }

    public void setCr5005ksid(String cr5005ksid) {
        this.cr5005ksid = cr5005ksid;
    }

    public String getCr5005ksim() {
        return cr5005ksim;
    }

    public void setCr5005ksim(String cr5005ksim) {
        this.cr5005ksim = cr5005ksim;
    }

    public String getCr5005ksiy() {
        return cr5005ksiy;
    }

    public void setCr5005ksiy(String cr5005ksiy) {
        this.cr5005ksiy = cr5005ksiy;
    }

    public String getCr3005l() {
        return cr3005l;
    }

    public void setCr3005l(String cr3005l) {
        this.cr3005l = cr3005l;
    }

    public String getCr5005lsid() {
        return cr5005lsid;
    }

    public void setCr5005lsid(String cr5005lsid) {
        this.cr5005lsid = cr5005lsid;
    }

    public String getCr5005lsim() {
        return cr5005lsim;
    }

    public void setCr5005lsim(String cr5005lsim) {
        this.cr5005lsim = cr5005lsim;
    }

    public String getCr5005lsiy() {
        return cr5005lsiy;
    }

    public void setCr5005lsiy(String cr5005lsiy) {
        this.cr5005lsiy = cr5005lsiy;
    }

    public String getCr3005m() {
        return cr3005m;
    }

    public void setCr3005m(String cr3005m) {
        this.cr3005m = cr3005m;
    }

    public String getCr5005msid() {
        return cr5005msid;
    }

    public void setCr5005msid(String cr5005msid) {
        this.cr5005msid = cr5005msid;
    }

    public String getCr5005msim() {
        return cr5005msim;
    }

    public void setCr5005msim(String cr5005msim) {
        this.cr5005msim = cr5005msim;
    }

    public String getCr5005msiy() {
        return cr5005msiy;
    }

    public void setCr5005msiy(String cr5005msiy) {
        this.cr5005msiy = cr5005msiy;
    }

    public String getCr3005n() {
        return cr3005n;
    }

    public void setCr3005n(String cr3005n) {
        this.cr3005n = cr3005n;
    }

    public String getCr5005nsid() {
        return cr5005nsid;
    }

    public void setCr5005nsid(String cr5005nsid) {
        this.cr5005nsid = cr5005nsid;
    }

    public String getCr5005nsim() {
        return cr5005nsim;
    }

    public void setCr5005nsim(String cr5005nsim) {
        this.cr5005nsim = cr5005nsim;
    }

    public String getCr5005nsiy() {
        return cr5005nsiy;
    }

    public void setCr5005nsiy(String cr5005nsiy) {
        this.cr5005nsiy = cr5005nsiy;
    }

    public String getCr3005o() {
        return cr3005o;
    }

    public void setCr3005o(String cr3005o) {
        this.cr3005o = cr3005o;
    }

    public String getCr5005osid() {
        return cr5005osid;
    }

    public void setCr5005osid(String cr5005osid) {
        this.cr5005osid = cr5005osid;
    }

    public String getCr5005osim() {
        return cr5005osim;
    }

    public void setCr5005osim(String cr5005osim) {
        this.cr5005osim = cr5005osim;
    }

    public String getCr5005osiy() {
        return cr5005osiy;
    }

    public void setCr5005osiy(String cr5005osiy) {
        this.cr5005osiy = cr5005osiy;
    }

    public String getCr3005p() {
        return cr3005p;
    }

    public void setCr3005p(String cr3005p) {
        this.cr3005p = cr3005p;
    }

    public String getCr5005psid() {
        return cr5005psid;
    }

    public void setCr5005psid(String cr5005psid) {
        this.cr5005psid = cr5005psid;
    }

    public String getCr5005psim() {
        return cr5005psim;
    }

    public void setCr5005psim(String cr5005psim) {
        this.cr5005psim = cr5005psim;
    }

    public String getCr5005psiy() {
        return cr5005psiy;
    }

    public void setCr5005psiy(String cr5005psiy) {
        this.cr5005psiy = cr5005psiy;
    }

    public String getCr3005q() {
        return cr3005q;
    }

    public void setCr3005q(String cr3005q) {
        this.cr3005q = cr3005q;
    }

    public String getCr5005qsid() {
        return cr5005qsid;
    }

    public void setCr5005qsid(String cr5005qsid) {
        this.cr5005qsid = cr5005qsid;
    }

    public String getCr5005qsim() {
        return cr5005qsim;
    }

    public void setCr5005qsim(String cr5005qsim) {
        this.cr5005qsim = cr5005qsim;
    }

    public String getCr5005qsiy() {
        return cr5005qsiy;
    }

    public void setCr5005qsiy(String cr5005qsiy) {
        this.cr5005qsiy = cr5005qsiy;
    }

    public String getCr3005r() {
        return cr3005r;
    }

    public void setCr3005r(String cr3005r) {
        this.cr3005r = cr3005r;
    }

    public String getCr5005rsid() {
        return cr5005rsid;
    }

    public void setCr5005rsid(String cr5005rsid) {
        this.cr5005rsid = cr5005rsid;
    }

    public String getCr5005rsim() {
        return cr5005rsim;
    }

    public void setCr5005rsim(String cr5005rsim) {
        this.cr5005rsim = cr5005rsim;
    }

    public String getCr5005rsiy() {
        return cr5005rsiy;
    }

    public void setCr5005rsiy(String cr5005rsiy) {
        this.cr5005rsiy = cr5005rsiy;
    }

    public String getCr3005s() {
        return cr3005s;
    }

    public void setCr3005s(String cr3005s) {
        this.cr3005s = cr3005s;
    }

    public String getCr5005ssid() {
        return cr5005ssid;
    }

    public void setCr5005ssid(String cr5005ssid) {
        this.cr5005ssid = cr5005ssid;
    }

    public String getCr5005ssim() {
        return cr5005ssim;
    }

    public void setCr5005ssim(String cr5005ssim) {
        this.cr5005ssim = cr5005ssim;
    }

    public String getCr5005ssiy() {
        return cr5005ssiy;
    }

    public void setCr5005ssiy(String cr5005ssiy) {
        this.cr5005ssiy = cr5005ssiy;
    }

    public String getCr3005t() {
        return cr3005t;
    }

    public void setCr3005t(String cr3005t) {
        this.cr3005t = cr3005t;
    }

    public String getCr5005tsid() {
        return cr5005tsid;
    }

    public void setCr5005tsid(String cr5005tsid) {
        this.cr5005tsid = cr5005tsid;
    }

    public String getCr5005tsim() {
        return cr5005tsim;
    }

    public void setCr5005tsim(String cr5005tsim) {
        this.cr5005tsim = cr5005tsim;
    }

    public String getCr5005tsiy() {
        return cr5005tsiy;
    }

    public void setCr5005tsiy(String cr5005tsiy) {
        this.cr5005tsiy = cr5005tsiy;
    }

    public String getCr3005u() {
        return cr3005u;
    }

    public void setCr3005u(String cr3005u) {
        this.cr3005u = cr3005u;
    }

    public String getCr5005usid() {
        return cr5005usid;
    }

    public void setCr5005usid(String cr5005usid) {
        this.cr5005usid = cr5005usid;
    }

    public String getCr5005usim() {
        return cr5005usim;
    }

    public void setCr5005usim(String cr5005usim) {
        this.cr5005usim = cr5005usim;
    }

    public String getCr5005usiy() {
        return cr5005usiy;
    }

    public void setCr5005usiy(String cr5005usiy) {
        this.cr5005usiy = cr5005usiy;
    }

    public String getCr3005v() {
        return cr3005v;
    }

    public void setCr3005v(String cr3005v) {
        this.cr3005v = cr3005v;
    }

    public String getCr5005vsid() {
        return cr5005vsid;
    }

    public void setCr5005vsid(String cr5005vsid) {
        this.cr5005vsid = cr5005vsid;
    }

    public String getCr5005vsim() {
        return cr5005vsim;
    }

    public void setCr5005vsim(String cr5005vsim) {
        this.cr5005vsim = cr5005vsim;
    }

    public String getCr5005vsiy() {
        return cr5005vsiy;
    }

    public void setCr5005vsiy(String cr5005vsiy) {
        this.cr5005vsiy = cr5005vsiy;
    }

    public String getCr3005w() {
        return cr3005w;
    }

    public void setCr3005w(String cr3005w) {
        this.cr3005w = cr3005w;
    }

    public String getCr5005wsid() {
        return cr5005wsid;
    }

    public void setCr5005wsid(String cr5005wsid) {
        this.cr5005wsid = cr5005wsid;
    }

    public String getCr5005wsim() {
        return cr5005wsim;
    }

    public void setCr5005wsim(String cr5005wsim) {
        this.cr5005wsim = cr5005wsim;
    }

    public String getCr5005wsiy() {
        return cr5005wsiy;
    }

    public void setCr5005wsiy(String cr5005wsiy) {
        this.cr5005wsiy = cr5005wsiy;
    }

    public String getCr3005x() {
        return cr3005x;
    }

    public void setCr3005x(String cr3005x) {
        this.cr3005x = cr3005x;
    }

    public String getCr5005xsid() {
        return cr5005xsid;
    }

    public void setCr5005xsid(String cr5005xsid) {
        this.cr5005xsid = cr5005xsid;
    }

    public String getCr5005xsim() {
        return cr5005xsim;
    }

    public void setCr5005xsim(String cr5005xsim) {
        this.cr5005xsim = cr5005xsim;
    }

    public String getCr5005xsiy() {
        return cr5005xsiy;
    }

    public void setCr5005xsiy(String cr5005xsiy) {
        this.cr5005xsiy = cr5005xsiy;
    }

    public String getCr3005y() {
        return cr3005y;
    }

    public void setCr3005y(String cr3005y) {
        this.cr3005y = cr3005y;
    }

    public String getCr5005ysid() {
        return cr5005ysid;
    }

    public void setCr5005ysid(String cr5005ysid) {
        this.cr5005ysid = cr5005ysid;
    }

    public String getCr5005ysim() {
        return cr5005ysim;
    }

    public void setCr5005ysim(String cr5005ysim) {
        this.cr5005ysim = cr5005ysim;
    }

    public String getCr5005ysiy() {
        return cr5005ysiy;
    }

    public void setCr5005ysiy(String cr5005ysiy) {
        this.cr5005ysiy = cr5005ysiy;
    }

    public String getCr3005z() {
        return cr3005z;
    }

    public void setCr3005z(String cr3005z) {
        this.cr3005z = cr3005z;
    }

    public String getCr5005zsid() {
        return cr5005zsid;
    }

    public void setCr5005zsid(String cr5005zsid) {
        this.cr5005zsid = cr5005zsid;
    }

    public String getCr5005zsim() {
        return cr5005zsim;
    }

    public void setCr5005zsim(String cr5005zsim) {
        this.cr5005zsim = cr5005zsim;
    }

    public String getCr5005zsiy() {
        return cr5005zsiy;
    }

    public void setCr5005zsiy(String cr5005zsiy) {
        this.cr5005zsiy = cr5005zsiy;
    }

    public String getCr3005aa() {
        return cr3005aa;
    }

    public void setCr3005aa(String cr3005aa) {
        this.cr3005aa = cr3005aa;
    }

    public String getCr5005aasid() {
        return cr5005aasid;
    }

    public void setCr5005aasid(String cr5005aasid) {
        this.cr5005aasid = cr5005aasid;
    }

    public String getCr5005aasim() {
        return cr5005aasim;
    }

    public void setCr5005aasim(String cr5005aasim) {
        this.cr5005aasim = cr5005aasim;
    }

    public String getCr5005aasiy() {
        return cr5005aasiy;
    }

    public void setCr5005aasiy(String cr5005aasiy) {
        this.cr5005aasiy = cr5005aasiy;
    }

    public String getCr3005ab() {
        return cr3005ab;
    }

    public void setCr3005ab(String cr3005ab) {
        this.cr3005ab = cr3005ab;
    }

    public String getCr3005abs() {
        return cr3005abs;
    }

    public void setCr3005abs(String cr3005abs) {
        this.cr3005abs = cr3005abs;
    }

    public String getCr5005absid() {
        return cr5005absid;
    }

    public void setCr5005absid(String cr5005absid) {
        this.cr5005absid = cr5005absid;
    }

    public String getCr5005absim() {
        return cr5005absim;
    }

    public void setCr5005absim(String cr5005absim) {
        this.cr5005absim = cr5005absim;
    }

    public String getCr5005absiy() {
        return cr5005absiy;
    }

    public void setCr5005absiy(String cr5005absiy) {
        this.cr5005absiy = cr5005absiy;
    }

    public String getCr5006t() {
        return cr5006t;
    }

    public void setCr5006t(String cr5006t) {
        this.cr5006t = cr5006t;
    }

    public String getCr5006x() {
        return cr5006x;
    }

    public void setCr5006x(String cr5006x) {
        this.cr5006x = cr5006x;
    }

    public String getCr5007t() {
        return cr5007t;
    }

    public void setCr5007t(String cr5007t) {
        this.cr5007t = cr5007t;
    }

    public String getCr5007x() {
        return cr5007x;
    }

    public void setCr5007x(String cr5007x) {
        this.cr5007x = cr5007x;
    }

    public String getCr5008() {
        return cr5008;
    }

    public void setCr5008(String cr5008) {
        this.cr5008 = cr5008;
    }

    public String getCr5008ut() {
        return cr5008ut;
    }

    public void setCr5008ut(String cr5008ut) {
        this.cr5008ut = cr5008ut;
    }

    public String getCr5008ux() {
        return cr5008ux;
    }

    public void setCr5008ux(String cr5008ux) {
        this.cr5008ux = cr5008ux;
    }

    public String getCr5009t() {
        return cr5009t;
    }

    public void setCr5009t(String cr5009t) {
        this.cr5009t = cr5009t;
    }

    public String getCr5009x() {
        return cr5009x;
    }

    public void setCr5009x(String cr5009x) {
        this.cr5009x = cr5009x;
    }

    public String getCr5010t() {
        return cr5010t;
    }

    public void setCr5010t(String cr5010t) {
        this.cr5010t = cr5010t;
    }

    public String getCr5010x() {
        return cr5010x;
    }

    public void setCr5010x(String cr5010x) {
        this.cr5010x = cr5010x;
    }

    public String getCr5011() {
        return cr5011;
    }

    public void setCr5011(String cr5011) {
        this.cr5011 = cr5011;
    }

    public String getCr5012() {
        return cr5012;
    }

    public void setCr5012(String cr5012) {
        this.cr5012 = cr5012;
    }

    public String getCr5013at() {
        return cr5013at;
    }

    public void setCr5013at(String cr5013at) {
        this.cr5013at = cr5013at;
    }

    public String getCr5013ax() {
        return cr5013ax;
    }

    public void setCr5013ax(String cr5013ax) {
        this.cr5013ax = cr5013ax;
    }

    public String getCr5013bt() {
        return cr5013bt;
    }

    public void setCr5013bt(String cr5013bt) {
        this.cr5013bt = cr5013bt;
    }

    public String getCr5013bx() {
        return cr5013bx;
    }

    public void setCr5013bx(String cr5013bx) {
        this.cr5013bx = cr5013bx;
    }

    public String getCr5014t() {
        return cr5014t;
    }

    public void setCr5014t(String cr5014t) {
        this.cr5014t = cr5014t;
    }

    public String getCr5014x() {
        return cr5014x;
    }

    public void setCr5014x(String cr5014x) {
        this.cr5014x = cr5014x;
    }

    public String getCr5015t() {
        return cr5015t;
    }

    public void setCr5015t(String cr5015t) {
        this.cr5015t = cr5015t;
    }

    public String getCr5015x() {
        return cr5015x;
    }

    public void setCr5015x(String cr5015x) {
        this.cr5015x = cr5015x;
    }

    public String getCrlablw() {
        return crlablw;
    }

    public void setCrlablw(String crlablw) {
        this.crlablw = crlablw;
    }

    public String getCrlabab() {
        return crlabab;
    }

    public void setCrlabab(String crlabab) {
        this.crlabab = crlabab;
    }

    public String getCr5016u() {
        return cr5016u;
    }

    public void setCr5016u(String cr5016u) {
        this.cr5016u = cr5016u;
    }

    public String getCr5016t() {
        return cr5016t;
    }

    public void setCr5016t(String cr5016t) {
        this.cr5016t = cr5016t;
    }

    public String getCr5016x() {
        return cr5016x;
    }

    public void setCr5016x(String cr5016x) {
        this.cr5016x = cr5016x;
    }

    public String getCr5017u() {
        return cr5017u;
    }

    public void setCr5017u(String cr5017u) {
        this.cr5017u = cr5017u;
    }

    public String getCr5017t() {
        return cr5017t;
    }

    public void setCr5017t(String cr5017t) {
        this.cr5017t = cr5017t;
    }

    public String getCr5017x() {
        return cr5017x;
    }

    public void setCr5017x(String cr5017x) {
        this.cr5017x = cr5017x;
    }

    public String getCr5018u() {
        return cr5018u;
    }

    public void setCr5018u(String cr5018u) {
        this.cr5018u = cr5018u;
    }

    public String getCr5018t() {
        return cr5018t;
    }

    public void setCr5018t(String cr5018t) {
        this.cr5018t = cr5018t;
    }

    public String getCr5018x() {
        return cr5018x;
    }

    public void setCr5018x(String cr5018x) {
        this.cr5018x = cr5018x;
    }

    public String getCr5019t() {
        return cr5019t;
    }

    public void setCr5019t(String cr5019t) {
        this.cr5019t = cr5019t;
    }

    public String getCr5019x() {
        return cr5019x;
    }

    public void setCr5019x(String cr5019x) {
        this.cr5019x = cr5019x;
    }

    public String getCr5020t() {
        return cr5020t;
    }

    public void setCr5020t(String cr5020t) {
        this.cr5020t = cr5020t;
    }

    public String getCr5020x() {
        return cr5020x;
    }

    public void setCr5020x(String cr5020x) {
        this.cr5020x = cr5020x;
    }

    public String getCr5021t() {
        return cr5021t;
    }

    public void setCr5021t(String cr5021t) {
        this.cr5021t = cr5021t;
    }

    public String getCr5021x() {
        return cr5021x;
    }

    public void setCr5021x(String cr5021x) {
        this.cr5021x = cr5021x;
    }

    public String getCr5022u() {
        return cr5022u;
    }

    public void setCr5022u(String cr5022u) {
        this.cr5022u = cr5022u;
    }

    public String getCr5022t() {
        return cr5022t;
    }

    public void setCr5022t(String cr5022t) {
        this.cr5022t = cr5022t;
    }

    public String getCr5022x() {
        return cr5022x;
    }

    public void setCr5022x(String cr5022x) {
        this.cr5022x = cr5022x;
    }

    public String getCr5023u() {
        return cr5023u;
    }

    public void setCr5023u(String cr5023u) {
        this.cr5023u = cr5023u;
    }

    public String getCr5023t() {
        return cr5023t;
    }

    public void setCr5023t(String cr5023t) {
        this.cr5023t = cr5023t;
    }

    public String getCr5023x() {
        return cr5023x;
    }

    public void setCr5023x(String cr5023x) {
        this.cr5023x = cr5023x;
    }

    public String getCr5024t() {
        return cr5024t;
    }

    public void setCr5024t(String cr5024t) {
        this.cr5024t = cr5024t;
    }

    public String getCr5024x() {
        return cr5024x;
    }

    public void setCr5024x(String cr5024x) {
        this.cr5024x = cr5024x;
    }

    public String getCr5025t() {
        return cr5025t;
    }

    public void setCr5025t(String cr5025t) {
        this.cr5025t = cr5025t;
    }

    public String getCr5025x() {
        return cr5025x;
    }

    public void setCr5025x(String cr5025x) {
        this.cr5025x = cr5025x;
    }

    public String getCr5026t() {
        return cr5026t;
    }

    public void setCr5026t(String cr5026t) {
        this.cr5026t = cr5026t;
    }

    public String getCr5026x() {
        return cr5026x;
    }

    public void setCr5026x(String cr5026x) {
        this.cr5026x = cr5026x;
    }

    public String getCr5027t() {
        return cr5027t;
    }

    public void setCr5027t(String cr5027t) {
        this.cr5027t = cr5027t;
    }

    public String getCr5027x() {
        return cr5027x;
    }

    public void setCr5027x(String cr5027x) {
        this.cr5027x = cr5027x;
    }

    public String getCr5028t() {
        return cr5028t;
    }

    public void setCr5028t(String cr5028t) {
        this.cr5028t = cr5028t;
    }

    public String getCr5028x() {
        return cr5028x;
    }

    public void setCr5028x(String cr5028x) {
        this.cr5028x = cr5028x;
    }

    public String getCr5029u() {
        return cr5029u;
    }

    public void setCr5029u(String cr5029u) {
        this.cr5029u = cr5029u;
    }

    public String getCr5029t() {
        return cr5029t;
    }

    public void setCr5029t(String cr5029t) {
        this.cr5029t = cr5029t;
    }

    public String getCr5029x() {
        return cr5029x;
    }

    public void setCr5029x(String cr5029x) {
        this.cr5029x = cr5029x;
    }

    public String getCr5030t() {
        return cr5030t;
    }

    public void setCr5030t(String cr5030t) {
        this.cr5030t = cr5030t;
    }

    public String getCr5030x() {
        return cr5030x;
    }

    public void setCr5030x(String cr5030x) {
        this.cr5030x = cr5030x;
    }

    public String getCr5031u() {
        return cr5031u;
    }

    public void setCr5031u(String cr5031u) {
        this.cr5031u = cr5031u;
    }

    public String getCr5031t() {
        return cr5031t;
    }

    public void setCr5031t(String cr5031t) {
        this.cr5031t = cr5031t;
    }

    public String getCr5031x() {
        return cr5031x;
    }

    public void setCr5031x(String cr5031x) {
        this.cr5031x = cr5031x;
    }

    public String getCr5032t() {
        return cr5032t;
    }

    public void setCr5032t(String cr5032t) {
        this.cr5032t = cr5032t;
    }

    public String getCr5032x() {
        return cr5032x;
    }

    public void setCr5032x(String cr5032x) {
        this.cr5032x = cr5032x;
    }

    public String getCr5033t() {
        return cr5033t;
    }

    public void setCr5033t(String cr5033t) {
        this.cr5033t = cr5033t;
    }

    public String getCr5033x() {
        return cr5033x;
    }

    public void setCr5033x(String cr5033x) {
        this.cr5033x = cr5033x;
    }

    public String getCr5034u() {
        return cr5034u;
    }

    public void setCr5034u(String cr5034u) {
        this.cr5034u = cr5034u;
    }

    public String getCr5034t() {
        return cr5034t;
    }

    public void setCr5034t(String cr5034t) {
        this.cr5034t = cr5034t;
    }

    public String getCr5034x() {
        return cr5034x;
    }

    public void setCr5034x(String cr5034x) {
        this.cr5034x = cr5034x;
    }

    public String getCr5035u() {
        return cr5035u;
    }

    public void setCr5035u(String cr5035u) {
        this.cr5035u = cr5035u;
    }

    public String getCr5035t() {
        return cr5035t;
    }

    public void setCr5035t(String cr5035t) {
        this.cr5035t = cr5035t;
    }

    public String getCr5035x() {
        return cr5035x;
    }

    public void setCr5035x(String cr5035x) {
        this.cr5035x = cr5035x;
    }

    public String getCr5036u() {
        return cr5036u;
    }

    public void setCr5036u(String cr5036u) {
        this.cr5036u = cr5036u;
    }

    public String getCr5036t() {
        return cr5036t;
    }

    public void setCr5036t(String cr5036t) {
        this.cr5036t = cr5036t;
    }

    public String getCr5036x() {
        return cr5036x;
    }

    public void setCr5036x(String cr5036x) {
        this.cr5036x = cr5036x;
    }

    public String getCr5037u() {
        return cr5037u;
    }

    public void setCr5037u(String cr5037u) {
        this.cr5037u = cr5037u;
    }

    public String getCr5037t() {
        return cr5037t;
    }

    public void setCr5037t(String cr5037t) {
        this.cr5037t = cr5037t;
    }

    public String getCr5037x() {
        return cr5037x;
    }

    public void setCr5037x(String cr5037x) {
        this.cr5037x = cr5037x;
    }

    public String getCr5038u() {
        return cr5038u;
    }

    public void setCr5038u(String cr5038u) {
        this.cr5038u = cr5038u;
    }

    public String getCr5038t() {
        return cr5038t;
    }

    public void setCr5038t(String cr5038t) {
        this.cr5038t = cr5038t;
    }

    public String getCr5038x() {
        return cr5038x;
    }

    public void setCr5038x(String cr5038x) {
        this.cr5038x = cr5038x;
    }

    public String getCr5039t() {
        return cr5039t;
    }

    public void setCr5039t(String cr5039t) {
        this.cr5039t = cr5039t;
    }

    public String getCr5039x() {
        return cr5039x;
    }

    public void setCr5039x(String cr5039x) {
        this.cr5039x = cr5039x;
    }

    public String getSymp() {
        return symp;
    }

    public void setSymp(String symp) {
        this.symp = symp;
    }

    public String getCr5040b() {
        return cr5040b;
    }

    public void setCr5040b(String cr5040b) {
        this.cr5040b = cr5040b;
    }

    public String getCr5040c() {
        return cr5040c;
    }

    public void setCr5040c(String cr5040c) {
        this.cr5040c = cr5040c;
    }

    public String getCr5040d() {
        return cr5040d;
    }

    public void setCr5040d(String cr5040d) {
        this.cr5040d = cr5040d;
    }

    public String getCr5040e() {
        return cr5040e;
    }

    public void setCr5040e(String cr5040e) {
        this.cr5040e = cr5040e;
    }

    public String getCr5040f() {
        return cr5040f;
    }

    public void setCr5040f(String cr5040f) {
        this.cr5040f = cr5040f;
    }

    public String getCr5040g() {
        return cr5040g;
    }

    public void setCr5040g(String cr5040g) {
        this.cr5040g = cr5040g;
    }

    public String getCr5040h() {
        return cr5040h;
    }

    public void setCr5040h(String cr5040h) {
        this.cr5040h = cr5040h;
    }

    public String getCr5040i() {
        return cr5040i;
    }

    public void setCr5040i(String cr5040i) {
        this.cr5040i = cr5040i;
    }

    public String getCr5040j() {
        return cr5040j;
    }

    public void setCr5040j(String cr5040j) {
        this.cr5040j = cr5040j;
    }

    public String getCr5040k() {
        return cr5040k;
    }

    public void setCr5040k(String cr5040k) {
        this.cr5040k = cr5040k;
    }

    public String getCr5040l() {
        return cr5040l;
    }

    public void setCr5040l(String cr5040l) {
        this.cr5040l = cr5040l;
    }

    public String getCr5040m() {
        return cr5040m;
    }

    public void setCr5040m(String cr5040m) {
        this.cr5040m = cr5040m;
    }

    public String getCr5040n() {
        return cr5040n;
    }

    public void setCr5040n(String cr5040n) {
        this.cr5040n = cr5040n;
    }

    public String getCr5040o() {
        return cr5040o;
    }

    public void setCr5040o(String cr5040o) {
        this.cr5040o = cr5040o;
    }

    public String getCr5040p() {
        return cr5040p;
    }

    public void setCr5040p(String cr5040p) {
        this.cr5040p = cr5040p;
    }

    public String getCr5040q() {
        return cr5040q;
    }

    public void setCr5040q(String cr5040q) {
        this.cr5040q = cr5040q;
    }

    public String getCr5040r() {
        return cr5040r;
    }

    public void setCr5040r(String cr5040r) {
        this.cr5040r = cr5040r;
    }

    public String getCr5040s() {
        return cr5040s;
    }

    public void setCr5040s(String cr5040s) {
        this.cr5040s = cr5040s;
    }

    public String getCr5040t() {
        return cr5040t;
    }

    public void setCr5040t(String cr5040t) {
        this.cr5040t = cr5040t;
    }

    public String getCr5040u() {
        return cr5040u;
    }

    public void setCr5040u(String cr5040u) {
        this.cr5040u = cr5040u;
    }

    public String getCr5040v() {
        return cr5040v;
    }

    public void setCr5040v(String cr5040v) {
        this.cr5040v = cr5040v;
    }

    public String getCr5040w() {
        return cr5040w;
    }

    public void setCr5040w(String cr5040w) {
        this.cr5040w = cr5040w;
    }

    public String getCr5040x() {
        return cr5040x;
    }

    public void setCr5040x(String cr5040x) {
        this.cr5040x = cr5040x;
    }

    public String getCr5040y() {
        return cr5040y;
    }

    public void setCr5040y(String cr5040y) {
        this.cr5040y = cr5040y;
    }

    public String getCr5040a() {
        return cr5040a;
    }

    public void setCr5040a(String cr5040a) {
        this.cr5040a = cr5040a;
    }

    public String getCr5040aa() {
        return cr5040aa;
    }

    public void setCr5040aa(String cr5040aa) {
        this.cr5040aa = cr5040aa;
    }

    public String getCr5040ab() {
        return cr5040ab;
    }

    public void setCr5040ab(String cr5040ab) {
        this.cr5040ab = cr5040ab;
    }

    public String getCr5040ac() {
        return cr5040ac;
    }

    public void setCr5040ac(String cr5040ac) {
        this.cr5040ac = cr5040ac;
    }

    public String getCr5040ad() {
        return cr5040ad;
    }

    public void setCr5040ad(String cr5040ad) {
        this.cr5040ad = cr5040ad;
    }

    public String getCr5040ae() {
        return cr5040ae;
    }

    public void setCr5040ae(String cr5040ae) {
        this.cr5040ae = cr5040ae;
    }

    public String getCr5040es() {
        return cr5040es;
    }

    public void setCr5040es(String cr5040es) {
        this.cr5040es = cr5040es;
    }

    public String getCr5040aesi() {
        return cr5040aesi;
    }

    public void setCr5040aesi(String cr5040aesi) {
        this.cr5040aesi = cr5040aesi;
    }

    public String getCr5040aesii() {
        return cr5040aesii;
    }

    public void setCr5040aesii(String cr5040aesii) {
        this.cr5040aesii = cr5040aesii;
    }

    public String getCr5040af() {
        return cr5040af;
    }

    public void setCr5040af(String cr5040af) {
        this.cr5040af = cr5040af;
    }

    public String getCr5040afs() {
        return cr5040afs;
    }

    public void setCr5040afs(String cr5040afs) {
        this.cr5040afs = cr5040afs;
    }

    public String getCr5040ag() {
        return cr5040ag;
    }

    public void setCr5040ag(String cr5040ag) {
        this.cr5040ag = cr5040ag;
    }

    public String getCr5040ags() {
        return cr5040ags;
    }

    public void setCr5040ags(String cr5040ags) {
        this.cr5040ags = cr5040ags;
    }

    public String getCr5041a() {
        return cr5041a;
    }

    public void setCr5041a(String cr5041a) {
        this.cr5041a = cr5041a;
    }

    public String getCr5041b() {
        return cr5041b;
    }

    public void setCr5041b(String cr5041b) {
        this.cr5041b = cr5041b;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTeat_avail() {
        return teat_avail;
    }

    public void setTeat_avail(String teat_avail) {
        this.teat_avail = teat_avail;
    }

    public String getCr5042a() {
        return cr5042a;
    }

    public void setCr5042a(String cr5042a) {
        this.cr5042a = cr5042a;
    }

    public String getCr5042b() {
        return cr5042b;
    }

    public void setCr5042b(String cr5042b) {
        this.cr5042b = cr5042b;
    }

    public String getCr5042cd() {
        return cr5042cd;
    }

    public void setCr5042cd(String cr5042cd) {
        this.cr5042cd = cr5042cd;
    }

    public String getCr5042cm() {
        return cr5042cm;
    }

    public void setCr5042cm(String cr5042cm) {
        this.cr5042cm = cr5042cm;
    }

    public String getCr5042cy() {
        return cr5042cy;
    }

    public void setCr5042cy(String cr5042cy) {
        this.cr5042cy = cr5042cy;
    }

    public String getCr5024d() {
        return cr5024d;
    }

    public void setCr5024d(String cr5024d) {
        this.cr5024d = cr5024d;
    }

    public String getCr5042g() {
        return cr5042g;
    }

    public void setCr5042g(String cr5042g) {
        this.cr5042g = cr5042g;
    }


    public FollowUpPregSurv Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ID);
        this.uid = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_UID);

        this.userName = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYSDATE);
        this.deviceId = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DEVICETAGID);

        this.studyid = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_STUDYID);
        this.dssid = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DSSID);
        this.week = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_WEEK);


        this.appver = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_APPVERSION);
        this.gps = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_GPS);
        this.endTime = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS96x);
        this.iStatus96x = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYNCED_DATE);

        this.s02 = jsonObject.getString(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02);

        return this;

    }


    public FollowUpPregSurv Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYSDATE));

        this.studyid = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_STUDYID));
        this.dssid = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DSSID));
        this.week = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_WEEK));


        this.deviceId = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_APPVERSION));
        this.gps = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_GPS));
        this.endTime = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYNCED_DATE));

        //For childCount
        this.s02 = cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02));

        s02Hydrate(cursor.getString(cursor.getColumnIndex(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, FollowUpPregSurv.class);
    }

    public String s02toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("mmsid", mmsid)
                    .put("mm0101", mm0101)
                    .put("mm0102", mm0102)
                    .put("mm0103", mm0103)
                    .put("mm0104", mm0104)
                    .put("mm0106", mm0106)
                    .put("mm0107", mm0107)
                    .put("mm0108", mm0108)
                    .put("mm0108a", mm0108a)
                    .put("mm0108b", mm0108b)
                    .put("mm0201", mm0201)
                    .put("crpreg", crpreg)
                    .put("cr5002a", cr5002a)
                    .put("cr5002aax", cr5002aax)
                    .put("cr5002b", cr5002b)
                    .put("cr5002bax", cr5002bax)
                    .put("cr5003a", cr5003a)
                    .put("cr5003aax", cr5003aax)
                    .put("cr5003b", cr5003b)
                    .put("cr5003bax", cr5003bax)
                    .put("cr3004a", cr3004a)
                    .put("cr3004b", cr3004b)
                    .put("cr3004bi", cr3004bi)
                    .put("cr3004bii", cr3004bii)
                    .put("cr3004biii", cr3004biii)
                    .put("cr3004c", cr3004c)
                    .put("cr3004d", cr3004d)
                    .put("cr3004e", cr3004e)
                    .put("cr3004f", cr3004f)
                    .put("cr3004g", cr3004g)
                    .put("cr3004h", cr3004h)
                    .put("cr3004i", cr3004i)
                    .put("cr3004j", cr3004j)
                    .put("cr3004k", cr3004k)
                    .put("cr3004l", cr3004l)
                    .put("cr3004m", cr3004m)
                    .put("cr3004n", cr3004n)
                    .put("cr3004o", cr3004o)
                    .put("cr3004p", cr3004p)
                    .put("cr3004q", cr3004q)
                    .put("cr3004si", cr3004si)
                    .put("cr3004sia", cr3004sia)
                    .put("cr3004qsii", cr3004qsii)
                    .put("cr3004qsiii", cr3004qsiii)
                    .put("cr3004r", cr3004r)
                    .put("cr3004rsi", cr3004rsi)
                    .put("cr3004qrsii", cr3004qrsii)
                    .put("cr3004qrsiii", cr3004qrsiii)
                    .put("cr3004s", cr3004s)
                    .put("cr3004ss", cr3004ss)
                    .put("cr3005", cr3005)
                    .put("cr3005a", cr3005a)
                    .put("cr3005as", cr3005as)
                    .put("cr5005asid", cr5005asid)
                    .put("cr5005asim", cr5005asim)
                    .put("cr5005asiy", cr5005asiy)
                    .put("cr3005b", cr3005b)
                    .put("cr3005bs", cr3005bs)
                    .put("cr5005bsid", cr5005bsid)
                    .put("cr5005bsim", cr5005bsim)
                    .put("cr5005bsiy", cr5005bsiy)
                    .put("cr3005c", cr3005c)
                    .put("cr3005cs", cr3005cs)
                    .put("cr5005csid", cr5005csid)
                    .put("cr5005csim", cr5005csim)
                    .put("cr5005csiy", cr5005csiy)
                    .put("cr3005d", cr3005d)
                    .put("cr3005ds", cr3005ds)
                    .put("cr5005dsid", cr5005dsid)
                    .put("cr5005dsim", cr5005dsim)
                    .put("cr5005dsiy", cr5005dsiy)
                    .put("cr3005e", cr3005e)
                    .put("cr3005es", cr3005es)
                    .put("cr5005esid", cr5005esid)
                    .put("cr5005esim", cr5005esim)
                    .put("cr5005esiy", cr5005esiy)
                    .put("cr3005f", cr3005f)
                    .put("cr3005fs", cr3005fs)
                    .put("cr5005fsid", cr5005fsid)
                    .put("cr5005fsim", cr5005fsim)
                    .put("cr5005fsiy", cr5005fsiy)
                    .put("cr3005g", cr3005g)
                    .put("cr3005gs", cr3005gs)
                    .put("cr5005gsid", cr5005gsid)
                    .put("cr5005gsim", cr5005gsim)
                    .put("cr5005gsiy", cr5005gsiy)
                    .put("cr3005h", cr3005h)
                    .put("cr3005hs", cr3005hs)
                    .put("cr5005hsid", cr5005hsid)
                    .put("cr5005hsim", cr5005hsim)
                    .put("cr5005hsiy", cr5005hsiy)
                    .put("cr3005i", cr3005i)
                    .put("cr3005is", cr3005is)
                    .put("cr5005isid", cr5005isid)
                    .put("cr5005isim", cr5005isim)
                    .put("cr5005isiy", cr5005isiy)
                    .put("cr3005j", cr3005j)
                    .put("cr3005js", cr3005js)
                    .put("cr5005jsid", cr5005jsid)
                    .put("cr5005jsim", cr5005jsim)
                    .put("cr5005jsiy", cr5005jsiy)
                    .put("cr3005k", cr3005k)
                    .put("cr3005ks", cr3005ks)
                    .put("cr5005ksid", cr5005ksid)
                    .put("cr5005ksim", cr5005ksim)
                    .put("cr5005ksiy", cr5005ksiy)
                    .put("cr3005l", cr3005l)
                    .put("cr5005lsid", cr5005lsid)
                    .put("cr5005lsim", cr5005lsim)
                    .put("cr5005lsiy", cr5005lsiy)
                    .put("cr3005m", cr3005m)
                    .put("cr5005msid", cr5005msid)
                    .put("cr5005msim", cr5005msim)
                    .put("cr5005msiy", cr5005msiy)
                    .put("cr3005n", cr3005n)
                    .put("cr5005nsid", cr5005nsid)
                    .put("cr5005nsim", cr5005nsim)
                    .put("cr5005nsiy", cr5005nsiy)
                    .put("cr3005o", cr3005o)
                    .put("cr5005osid", cr5005osid)
                    .put("cr5005osim", cr5005osim)
                    .put("cr5005osiy", cr5005osiy)
                    .put("cr3005p", cr3005p)
                    .put("cr5005psid", cr5005psid)
                    .put("cr5005psim", cr5005psim)
                    .put("cr5005psiy", cr5005psiy)
                    .put("cr3005q", cr3005q)
                    .put("cr5005qsid", cr5005qsid)
                    .put("cr5005qsim", cr5005qsim)
                    .put("cr5005qsiy", cr5005qsiy)
                    .put("cr3005r", cr3005r)
                    .put("cr5005rsid", cr5005rsid)
                    .put("cr5005rsim", cr5005rsim)
                    .put("cr5005rsiy", cr5005rsiy)
                    .put("cr3005s", cr3005s)
                    .put("cr5005ssid", cr5005ssid)
                    .put("cr5005ssim", cr5005ssim)
                    .put("cr5005ssiy", cr5005ssiy)
                    .put("cr3005t", cr3005t)
                    .put("cr5005tsid", cr5005tsid)
                    .put("cr5005tsim", cr5005tsim)
                    .put("cr5005tsiy", cr5005tsiy)
                    .put("cr3005u", cr3005u)
                    .put("cr5005usid", cr5005usid)
                    .put("cr5005usim", cr5005usim)
                    .put("cr5005usiy", cr5005usiy)
                    .put("cr3005v", cr3005v)
                    .put("cr5005vsid", cr5005vsid)
                    .put("cr5005vsim", cr5005vsim)
                    .put("cr5005vsiy", cr5005vsiy)
                    .put("cr3005w", cr3005w)
                    .put("cr5005wsid", cr5005wsid)
                    .put("cr5005wsim", cr5005wsim)
                    .put("cr5005wsiy", cr5005wsiy)
                    .put("cr3005x", cr3005x)
                    .put("cr5005xsid", cr5005xsid)
                    .put("cr5005xsim", cr5005xsim)
                    .put("cr5005xsiy", cr5005xsiy)
                    .put("cr3005y", cr3005y)
                    .put("cr5005ysid", cr5005ysid)
                    .put("cr5005ysim", cr5005ysim)
                    .put("cr5005ysiy", cr5005ysiy)
                    .put("cr3005z", cr3005z)
                    .put("cr5005zsid", cr5005zsid)
                    .put("cr5005zsim", cr5005zsim)
                    .put("cr5005zsiy", cr5005zsiy)
                    .put("cr3005aa", cr3005aa)
                    .put("cr5005aasid", cr5005aasid)
                    .put("cr5005aasim", cr5005aasim)
                    .put("cr5005aasiy", cr5005aasiy)
                    .put("cr3005ab", cr3005ab)
                    .put("cr3005abs", cr3005abs)
                    .put("cr5005absid", cr5005absid)
                    .put("cr5005absim", cr5005absim)
                    .put("cr5005absiy", cr5005absiy)
                    .put("cr5006t", cr5006t)
                    .put("cr5006x", cr5006x)
                    .put("cr5007t", cr5007t)
                    .put("cr5007x", cr5007x)
                    .put("cr5008", cr5008)
                    .put("cr5008ut", cr5008ut)
                    .put("cr5008ux", cr5008ux)
                    .put("cr5009t", cr5009t)
                    .put("cr5009x", cr5009x)
                    .put("cr5010t", cr5010t)
                    .put("cr5010x", cr5010x)
                    .put("cr5011", cr5011)
                    .put("cr5012", cr5012)
                    .put("cr5013at", cr5013at)
                    .put("cr5013ax", cr5013ax)
                    .put("cr5013bt", cr5013bt)
                    .put("cr5013bx", cr5013bx)
                    .put("cr5014t", cr5014t)
                    .put("cr5014x", cr5014x)
                    .put("cr5015t", cr5015t)
                    .put("cr5015x", cr5015x)
                    .put("crlablw", crlablw)
                    .put("crlabab", crlabab)
                    .put("cr5016u", cr5016u)
                    .put("cr5016t", cr5016t)
                    .put("cr5016x", cr5016x)
                    .put("cr5017u", cr5017u)
                    .put("cr5017t", cr5017t)
                    .put("cr5017x", cr5017x)
                    .put("cr5018u", cr5018u)
                    .put("cr5018t", cr5018t)
                    .put("cr5018x", cr5018x)
                    .put("cr5019t", cr5019t)
                    .put("cr5019x", cr5019x)
                    .put("cr5020t", cr5020t)
                    .put("cr5020x", cr5020x)
                    .put("cr5021t", cr5021t)
                    .put("cr5021x", cr5021x)
                    .put("cr5022u", cr5022u)
                    .put("cr5022t", cr5022t)
                    .put("cr5022x", cr5022x)
                    .put("cr5023u", cr5023u)
                    .put("cr5023t", cr5023t)
                    .put("cr5023x", cr5023x)
                    .put("cr5024t", cr5024t)
                    .put("cr5024x", cr5024x)
                    .put("cr5025t", cr5025t)
                    .put("cr5025x", cr5025x)
                    .put("cr5026t", cr5026t)
                    .put("cr5026x", cr5026x)
                    .put("cr5027t", cr5027t)
                    .put("cr5027x", cr5027x)
                    .put("cr5028t", cr5028t)
                    .put("cr5028x", cr5028x)
                    .put("cr5029u", cr5029u)
                    .put("cr5029t", cr5029t)
                    .put("cr5029x", cr5029x)
                    .put("cr5030t", cr5030t)
                    .put("cr5030x", cr5030x)
                    .put("cr5031u", cr5031u)
                    .put("cr5031t", cr5031t)
                    .put("cr5031x", cr5031x)
                    .put("cr5032t", cr5032t)
                    .put("cr5032x", cr5032x)
                    .put("cr5033t", cr5033t)
                    .put("cr5033x", cr5033x)
                    .put("cr5034u", cr5034u)
                    .put("cr5034t", cr5034t)
                    .put("cr5034x", cr5034x)
                    .put("cr5035u", cr5035u)
                    .put("cr5035t", cr5035t)
                    .put("cr5035x", cr5035x)
                    .put("cr5036u", cr5036u)
                    .put("cr5036t", cr5036t)
                    .put("cr5036x", cr5036x)
                    .put("cr5037u", cr5037u)
                    .put("cr5037t", cr5037t)
                    .put("cr5037x", cr5037x)
                    .put("cr5038u", cr5038u)
                    .put("cr5038t", cr5038t)
                    .put("cr5038x", cr5038x)
                    .put("cr5039t", cr5039t)
                    .put("cr5039x", cr5039x)
                    .put("symp", symp)
                    .put("cr5040b", cr5040b)
                    .put("cr5040c", cr5040c)
                    .put("cr5040d", cr5040d)
                    .put("cr5040e", cr5040e)
                    .put("cr5040f", cr5040f)
                    .put("cr5040g", cr5040g)
                    .put("cr5040h", cr5040h)
                    .put("cr5040i", cr5040i)
                    .put("cr5040j", cr5040j)
                    .put("cr5040k", cr5040k)
                    .put("cr5040l", cr5040l)
                    .put("cr5040m", cr5040m)
                    .put("cr5040n", cr5040n)
                    .put("cr5040o", cr5040o)
                    .put("cr5040p", cr5040p)
                    .put("cr5040q", cr5040q)
                    .put("cr5040r", cr5040r)
                    .put("cr5040s", cr5040s)
                    .put("cr5040t", cr5040t)
                    .put("cr5040u", cr5040u)
                    .put("cr5040v", cr5040v)
                    .put("cr5040w", cr5040w)
                    .put("cr5040x", cr5040x)
                    .put("cr5040y", cr5040y)
                    .put("cr5040a", cr5040a)
                    .put("cr5040aa", cr5040aa)
                    .put("cr5040ab", cr5040ab)
                    .put("cr5040ac", cr5040ac)
                    .put("cr5040ad", cr5040ad)
                    .put("cr5040ae", cr5040ae)
                    .put("cr5040es", cr5040es)
                    .put("cr5040aesi", cr5040aesi)
                    .put("cr5040aesii", cr5040aesii)
                    .put("cr5040af", cr5040af)
                    .put("cr5040afs", cr5040afs)
                    .put("cr5040ag", cr5040ag)
                    .put("cr5040ags", cr5040ags)
                    .put("cr5041a", cr5041a)
                    .put("cr5041b", cr5041b)
                    .put("test", test)
                    .put("teat_avail", teat_avail)
                    .put("cr5042a", cr5042a)
                    .put("cr5042b", cr5042b)
                    .put("cr5042cd", cr5042cd)
                    .put("cr5042cm", cr5042cm)
                    .put("cr5042cy", cr5042cy)
                    .put("cr5024d", cr5024d)
                    .put("cr5042g", cr5042g);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);

            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_STUDYID, this.studyid == null ? JSONObject.NULL : this.studyid);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_DSSID, this.dssid == null ? JSONObject.NULL : this.dssid);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_WEEK, this.week == null ? JSONObject.NULL : this.week);


            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_GPS, this.gps == null ? JSONObject.NULL : this.gps);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);

            json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02, new JSONObject(s02toString()));


            if (this.s02 != null && !this.s02.equals("")) {
                json.put(FormsPregSurvContract.FormsPregSurvTable.COLUMN_S02, new JSONObject(this.s02));
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
                this.mm0103 = json.getString("mm0103");
                this.mm0104 = json.getString("mm0104");
                this.mm0106 = json.getString("mm0106");
                this.mm0107 = json.getString("mm0107");
                this.mm0108 = json.getString("mm0108");
                this.mm0108a = json.getString("mm0108a");
                this.mm0108b = json.getString("mm0108b");

                this.crpreg = json.getString("crpreg");
                this.cr5002a = json.getString("cr5002a");
                this.cr5002aax = json.getString("cr5002aax");
                this.cr5002b = json.getString("cr5002b");
                this.cr5002bax = json.getString("cr5002bax");
                this.cr5003a = json.getString("cr5003a");
                this.cr5003aax = json.getString("cr5003aax");
                this.cr5003b = json.getString("cr5003b");
                this.cr5003bax = json.getString("cr5003bax");
                this.cr3004a = json.getString("cr3004a");
                this.cr3004b = json.getString("cr3004b");
                this.cr3004bi = json.getString("cr3004bi");
                this.cr3004bii = json.getString("cr3004bii");
                this.cr3004biii = json.getString("cr3004biii");
                this.cr3004c = json.getString("cr3004c");
                this.cr3004d = json.getString("cr3004d");
                this.cr3004e = json.getString("cr3004e");
                this.cr3004f = json.getString("cr3004f");
                this.cr3004g = json.getString("cr3004g");
                this.cr3004h = json.getString("cr3004h");
                this.cr3004i = json.getString("cr3004i");
                this.cr3004j = json.getString("cr3004j");
                this.cr3004k = json.getString("cr3004k");
                this.cr3004l = json.getString("cr3004l");
                this.cr3004m = json.getString("cr3004m");
                this.cr3004n = json.getString("cr3004n");
                this.cr3004o = json.getString("cr3004o");
                this.cr3004p = json.getString("cr3004p");
                this.cr3004q = json.getString("cr3004q");
                this.cr3004si = json.getString("cr3004si");
                this.cr3004sia = json.getString("cr3004sia");
                this.cr3004qsii = json.getString("cr3004qsii");
                this.cr3004qsiii = json.getString("cr3004qsiii");
                this.cr3004r = json.getString("cr3004r");
                this.cr3004rsi = json.getString("cr3004rsi");
                this.cr3004qrsii = json.getString("cr3004qrsii");
                this.cr3004qrsiii = json.getString("cr3004qrsiii");
                this.cr3004s = json.getString("cr3004s");
                this.cr3004ss = json.getString("cr3004ss");
                this.cr3005 = json.getString("cr3005");
                this.cr3005a = json.getString("cr3005a");
                this.cr3005as = json.getString("cr3005as");
                this.cr5005asid = json.getString("cr5005asid");
                this.cr5005asim = json.getString("cr5005asim");
                this.cr5005asiy = json.getString("cr5005asiy");
                this.cr3005b = json.getString("cr3005b");
                this.cr3005bs = json.getString("cr3005bs");
                this.cr5005bsid = json.getString("cr5005bsid");
                this.cr5005bsim = json.getString("cr5005bsim");
                this.cr5005bsiy = json.getString("cr5005bsiy");
                this.cr3005c = json.getString("cr3005c");
                this.cr3005cs = json.getString("cr3005cs");
                this.cr5005csid = json.getString("cr5005csid");
                this.cr5005csim = json.getString("cr5005csim");
                this.cr5005csiy = json.getString("cr5005csiy");
                this.cr3005d = json.getString("cr3005d");
                this.cr3005ds = json.getString("cr3005ds");
                this.cr5005dsid = json.getString("cr5005dsid");
                this.cr5005dsim = json.getString("cr5005dsim");
                this.cr5005dsiy = json.getString("cr5005dsiy");
                this.cr3005e = json.getString("cr3005e");
                this.cr3005es = json.getString("cr3005es");
                this.cr5005esid = json.getString("cr5005esid");
                this.cr5005esim = json.getString("cr5005esim");
                this.cr5005esiy = json.getString("cr5005esiy");
                this.cr3005f = json.getString("cr3005f");
                this.cr3005fs = json.getString("cr3005fs");
                this.cr5005fsid = json.getString("cr5005fsid");
                this.cr5005fsim = json.getString("cr5005fsim");
                this.cr5005fsiy = json.getString("cr5005fsiy");
                this.cr3005g = json.getString("cr3005g");
                this.cr3005gs = json.getString("cr3005gs");
                this.cr5005gsid = json.getString("cr5005gsid");
                this.cr5005gsim = json.getString("cr5005gsim");
                this.cr5005gsiy = json.getString("cr5005gsiy");
                this.cr3005h = json.getString("cr3005h");
                this.cr3005hs = json.getString("cr3005hs");
                this.cr5005hsid = json.getString("cr5005hsid");
                this.cr5005hsim = json.getString("cr5005hsim");
                this.cr5005hsiy = json.getString("cr5005hsiy");
                this.cr3005i = json.getString("cr3005i");
                this.cr3005is = json.getString("cr3005is");
                this.cr5005isid = json.getString("cr5005isid");
                this.cr5005isim = json.getString("cr5005isim");
                this.cr5005isiy = json.getString("cr5005isiy");
                this.cr3005j = json.getString("cr3005j");
                this.cr3005js = json.getString("cr3005js");
                this.cr5005jsid = json.getString("cr5005jsid");
                this.cr5005jsim = json.getString("cr5005jsim");
                this.cr5005jsiy = json.getString("cr5005jsiy");
                this.cr3005k = json.getString("cr3005k");
                this.cr3005ks = json.getString("cr3005ks");
                this.cr5005ksid = json.getString("cr5005ksid");
                this.cr5005ksim = json.getString("cr5005ksim");
                this.cr5005ksiy = json.getString("cr5005ksiy");
                this.cr3005l = json.getString("cr3005l");
                this.cr5005lsid = json.getString("cr5005lsid");
                this.cr5005lsim = json.getString("cr5005lsim");
                this.cr5005lsiy = json.getString("cr5005lsiy");
                this.cr3005m = json.getString("cr3005m");
                this.cr5005msid = json.getString("cr5005msid");
                this.cr5005msim = json.getString("cr5005msim");
                this.cr5005msiy = json.getString("cr5005msiy");
                this.cr3005n = json.getString("cr3005n");
                this.cr5005nsid = json.getString("cr5005nsid");
                this.cr5005nsim = json.getString("cr5005nsim");
                this.cr5005nsiy = json.getString("cr5005nsiy");
                this.cr3005o = json.getString("cr3005o");
                this.cr5005osid = json.getString("cr5005osid");
                this.cr5005osim = json.getString("cr5005osim");
                this.cr5005osiy = json.getString("cr5005osiy");
                this.cr3005p = json.getString("cr3005p");
                this.cr5005psid = json.getString("cr5005psid");
                this.cr5005psim = json.getString("cr5005psim");
                this.cr5005psiy = json.getString("cr5005psiy");
                this.cr3005q = json.getString("cr3005q");
                this.cr5005qsid = json.getString("cr5005qsid");
                this.cr5005qsim = json.getString("cr5005qsim");
                this.cr5005qsiy = json.getString("cr5005qsiy");
                this.cr3005r = json.getString("cr3005r");
                this.cr5005rsid = json.getString("cr5005rsid");
                this.cr5005rsim = json.getString("cr5005rsim");
                this.cr5005rsiy = json.getString("cr5005rsiy");
                this.cr3005s = json.getString("cr3005s");
                this.cr5005ssid = json.getString("cr5005ssid");
                this.cr5005ssim = json.getString("cr5005ssim");
                this.cr5005ssiy = json.getString("cr5005ssiy");
                this.cr3005t = json.getString("cr3005t");
                this.cr5005tsid = json.getString("cr5005tsid");
                this.cr5005tsim = json.getString("cr5005tsim");
                this.cr5005tsiy = json.getString("cr5005tsiy");
                this.cr3005u = json.getString("cr3005u");
                this.cr5005usid = json.getString("cr5005usid");
                this.cr5005usim = json.getString("cr5005usim");
                this.cr5005usiy = json.getString("cr5005usiy");
                this.cr3005v = json.getString("cr3005v");
                this.cr5005vsid = json.getString("cr5005vsid");
                this.cr5005vsim = json.getString("cr5005vsim");
                this.cr5005vsiy = json.getString("cr5005vsiy");
                this.cr3005w = json.getString("cr3005w");
                this.cr5005wsid = json.getString("cr5005wsid");
                this.cr5005wsim = json.getString("cr5005wsim");
                this.cr5005wsiy = json.getString("cr5005wsiy");
                this.cr3005x = json.getString("cr3005x");
                this.cr5005xsid = json.getString("cr5005xsid");
                this.cr5005xsim = json.getString("cr5005xsim");
                this.cr5005xsiy = json.getString("cr5005xsiy");
                this.cr3005y = json.getString("cr3005y");
                this.cr5005ysid = json.getString("cr5005ysid");
                this.cr5005ysim = json.getString("cr5005ysim");
                this.cr5005ysiy = json.getString("cr5005ysiy");
                this.cr3005z = json.getString("cr3005z");
                this.cr5005zsid = json.getString("cr5005zsid");
                this.cr5005zsim = json.getString("cr5005zsim");
                this.cr5005zsiy = json.getString("cr5005zsiy");
                this.cr3005aa = json.getString("cr3005aa");
                this.cr5005aasid = json.getString("cr5005aasid");
                this.cr5005aasim = json.getString("cr5005aasim");
                this.cr5005aasiy = json.getString("cr5005aasiy");
                this.cr3005ab = json.getString("cr3005ab");
                this.cr3005abs = json.getString("cr3005abs");
                this.cr5005absid = json.getString("cr5005absid");
                this.cr5005absim = json.getString("cr5005absim");
                this.cr5005absiy = json.getString("cr5005absiy");
                this.cr5006t = json.getString("cr5006t");
                this.cr5006x = json.getString("cr5006x");
                this.cr5007t = json.getString("cr5007t");
                this.cr5007x = json.getString("cr5007x");
                this.cr5008 = json.getString("cr5008");
                this.cr5008ut = json.getString("cr5008ut");
                this.cr5008ux = json.getString("cr5008ux");
                this.cr5009t = json.getString("cr5009t");
                this.cr5009x = json.getString("cr5009x");
                this.cr5010t = json.getString("cr5010t");
                this.cr5010x = json.getString("cr5010x");
                this.cr5011 = json.getString("cr5011");
                this.cr5012 = json.getString("cr5012");
                this.cr5013at = json.getString("cr5013at");
                this.cr5013ax = json.getString("cr5013ax");
                this.cr5013bt = json.getString("cr5013bt");
                this.cr5013bx = json.getString("cr5013bx");
                this.cr5014t = json.getString("cr5014t");
                this.cr5014x = json.getString("cr5014x");
                this.cr5015t = json.getString("cr5015t");
                this.cr5015x = json.getString("cr5015x");
                this.crlablw = json.getString("crlablw");
                this.crlabab = json.getString("crlabab");
                this.cr5016u = json.getString("cr5016u");
                this.cr5016t = json.getString("cr5016t");
                this.cr5016x = json.getString("cr5016x");
                this.cr5017u = json.getString("cr5017u");
                this.cr5017t = json.getString("cr5017t");
                this.cr5017x = json.getString("cr5017x");
                this.cr5018u = json.getString("cr5018u");
                this.cr5018t = json.getString("cr5018t");
                this.cr5018x = json.getString("cr5018x");
                this.cr5019t = json.getString("cr5019t");
                this.cr5019x = json.getString("cr5019x");
                this.cr5020t = json.getString("cr5020t");
                this.cr5020x = json.getString("cr5020x");
                this.cr5021t = json.getString("cr5021t");
                this.cr5021x = json.getString("cr5021x");
                this.cr5022u = json.getString("cr5022u");
                this.cr5022t = json.getString("cr5022t");
                this.cr5022x = json.getString("cr5022x");
                this.cr5023u = json.getString("cr5023u");
                this.cr5023t = json.getString("cr5023t");
                this.cr5023x = json.getString("cr5023x");
                this.cr5024t = json.getString("cr5024t");
                this.cr5024x = json.getString("cr5024x");
                this.cr5025t = json.getString("cr5025t");
                this.cr5025x = json.getString("cr5025x");
                this.cr5026t = json.getString("cr5026t");
                this.cr5026x = json.getString("cr5026x");
                this.cr5027t = json.getString("cr5027t");
                this.cr5027x = json.getString("cr5027x");
                this.cr5028t = json.getString("cr5028t");
                this.cr5028x = json.getString("cr5028x");
                this.cr5029u = json.getString("cr5029u");
                this.cr5029t = json.getString("cr5029t");
                this.cr5029x = json.getString("cr5029x");
                this.cr5030t = json.getString("cr5030t");
                this.cr5030x = json.getString("cr5030x");
                this.cr5031u = json.getString("cr5031u");
                this.cr5031t = json.getString("cr5031t");
                this.cr5031x = json.getString("cr5031x");
                this.cr5032t = json.getString("cr5032t");
                this.cr5032x = json.getString("cr5032x");
                this.cr5033t = json.getString("cr5033t");
                this.cr5033x = json.getString("cr5033x");
                this.cr5034u = json.getString("cr5034u");
                this.cr5034t = json.getString("cr5034t");
                this.cr5034x = json.getString("cr5034x");
                this.cr5035u = json.getString("cr5035u");
                this.cr5035t = json.getString("cr5035t");
                this.cr5035x = json.getString("cr5035x");
                this.cr5036u = json.getString("cr5036u");
                this.cr5036t = json.getString("cr5036t");
                this.cr5036x = json.getString("cr5036x");
                this.cr5037u = json.getString("cr5037u");
                this.cr5037t = json.getString("cr5037t");
                this.cr5037x = json.getString("cr5037x");
                this.cr5038u = json.getString("cr5038u");
                this.cr5038t = json.getString("cr5038t");
                this.cr5038x = json.getString("cr5038x");
                this.cr5039t = json.getString("cr5039t");
                this.cr5039x = json.getString("cr5039x");
                this.symp = json.getString("symp");
                this.cr5040b = json.getString("cr5040b");
                this.cr5040c = json.getString("cr5040c");
                this.cr5040d = json.getString("cr5040d");
                this.cr5040e = json.getString("cr5040e");
                this.cr5040f = json.getString("cr5040f");
                this.cr5040g = json.getString("cr5040g");
                this.cr5040h = json.getString("cr5040h");
                this.cr5040i = json.getString("cr5040i");
                this.cr5040j = json.getString("cr5040j");
                this.cr5040k = json.getString("cr5040k");
                this.cr5040l = json.getString("cr5040l");
                this.cr5040m = json.getString("cr5040m");
                this.cr5040n = json.getString("cr5040n");
                this.cr5040o = json.getString("cr5040o");
                this.cr5040p = json.getString("cr5040p");
                this.cr5040q = json.getString("cr5040q");
                this.cr5040r = json.getString("cr5040r");
                this.cr5040s = json.getString("cr5040s");
                this.cr5040t = json.getString("cr5040t");
                this.cr5040u = json.getString("cr5040u");
                this.cr5040v = json.getString("cr5040v");
                this.cr5040w = json.getString("cr5040w");
                this.cr5040x = json.getString("cr5040x");
                this.cr5040y = json.getString("cr5040y");
                this.cr5040a = json.getString("cr5040a");
                this.cr5040aa = json.getString("cr5040aa");
                this.cr5040ab = json.getString("cr5040ab");
                this.cr5040ac = json.getString("cr5040ac");
                this.cr5040ad = json.getString("cr5040ad");
                this.cr5040ae = json.getString("cr5040ae");
                this.cr5040es = json.getString("cr5040es");
                this.cr5040aesi = json.getString("cr5040aesi");
                this.cr5040aesii = json.getString("cr5040aesii");
                this.cr5040af = json.getString("cr5040af");
                this.cr5040afs = json.getString("cr5040afs");
                this.cr5040ag = json.getString("cr5040ag");
                this.cr5040ags = json.getString("cr5040ags");
                this.cr5041a = json.getString("cr5041a");
                this.cr5041b = json.getString("cr5041b");
                this.test = json.getString("test");
                this.teat_avail = json.getString("teat_avail");
                this.cr5042a = json.getString("cr5042a");
                this.cr5042b = json.getString("cr5042b");
                this.cr5042cd = json.getString("cr5042cd");
                this.cr5042cm = json.getString("cr5042cm");
                this.cr5042cy = json.getString("cr5042cy");
                this.cr5024d = json.getString("cr5024d");
                this.cr5042g = json.getString("cr5042g");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


}