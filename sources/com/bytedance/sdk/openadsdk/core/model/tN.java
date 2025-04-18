package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private int DSW;
    private String YFl = "";
    private String Sg = "";
    private String tN = "";
    private String AlY = "";
    private double wN = -1.0d;

    /* renamed from: vc, reason: collision with root package name */
    private int f10717vc = -1;

    public double AlY() {
        return this.wN;
    }

    public String DSW() {
        return this.AlY;
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public JSONObject qsH() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", Sg());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, vc());
            jSONObject.put("comment_num", wN());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, YFl());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, tN());
            jSONObject.put("score", AlY());
            jSONObject.put("app_category", DSW());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.Sg(e2.toString());
        }
        return jSONObject;
    }

    public String tN() {
        return this.tN;
    }

    public int vc() {
        return this.DSW;
    }

    public int wN() {
        return this.f10717vc;
    }

    public void AlY(String str) {
        this.AlY = str;
    }

    public void Sg(String str) {
        this.Sg = str;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void tN(String str) {
        this.tN = str;
    }

    public void Sg(int i10) {
        this.DSW = i10;
    }

    public void YFl(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.wN = d10;
        } else {
            this.wN = -1.0d;
        }
    }

    public void YFl(int i10) {
        if (i10 <= 0) {
            this.f10717vc = -1;
        } else {
            this.f10717vc = i10;
        }
    }
}
