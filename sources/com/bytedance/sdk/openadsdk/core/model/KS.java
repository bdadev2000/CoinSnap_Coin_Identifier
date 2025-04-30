package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private int QR;
    private String zp = "";
    private String lMd = "";
    private String KS = "";
    private String jU = "";
    private double COT = -1.0d;
    private int HWF = -1;

    public int COT() {
        return this.HWF;
    }

    public int HWF() {
        return this.QR;
    }

    public String KS() {
        return this.KS;
    }

    public String QR() {
        return this.jU;
    }

    public double jU() {
        return this.COT;
    }

    public JSONObject ku() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", lMd());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, HWF());
            jSONObject.put("comment_num", COT());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, zp());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, KS());
            jSONObject.put("score", jU());
            jSONObject.put("app_category", QR());
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.toString());
        }
        return jSONObject;
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void KS(String str) {
        this.KS = str;
    }

    public void jU(String str) {
        this.jU = str;
    }

    public void lMd(String str) {
        this.lMd = str;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void lMd(int i9) {
        this.QR = i9;
    }

    public void zp(double d2) {
        if (d2 >= 1.0d && d2 <= 5.0d) {
            this.COT = d2;
        } else {
            this.COT = -1.0d;
        }
    }

    public void zp(int i9) {
        if (i9 <= 0) {
            this.HWF = -1;
        } else {
            this.HWF = i9;
        }
    }
}
