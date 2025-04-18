package com.bytedance.sdk.openadsdk.pDU.YFl;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY<T extends AlY> implements tN {
    private String DSW;
    private String NjR;
    private String Sg;
    private String YFl;
    private String YoT;
    private String eT;

    /* renamed from: nc, reason: collision with root package name */
    private String f10778nc;
    private String tN;
    private final String AlY = BuildConfig.VERSION_NAME;
    private long wN = System.currentTimeMillis() / 1000;

    /* renamed from: vc, reason: collision with root package name */
    private int f10779vc = 0;
    private int qsH = 0;

    @JProtect
    private JSONObject EH() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, Sco.wN());
            jSONObject.put("ua", Sco.tN());
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static AlY<AlY> Sg() {
        return new AlY<>();
    }

    private T rkt() {
        return this;
    }

    public String AlY() {
        return this.eT;
    }

    public String DSW() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String GA() {
        return this.f10778nc;
    }

    public int NjR() {
        return this.f10779vc;
    }

    @Override // com.bytedance.sdk.openadsdk.pDU.YFl.tN
    @JProtect
    public JSONObject YFl() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", DSW());
            jSONObject2.put("app_version", Sco.DSW());
            jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, qsH());
            jSONObject2.put("conn_type", EH.Sg(lG.YFl()));
            jSONObject2.put("appid", TextUtils.isEmpty(NjR.Sg().AlY()) ? "" : NjR.Sg().AlY());
            jSONObject2.put("device_info", EH());
            if (!TextUtils.isEmpty(tN())) {
                jSONObject2.put("type", tN());
            }
            jSONObject2.put("error_code", eT());
            if (!TextUtils.isEmpty(YoT())) {
                jSONObject2.put("error_msg", YoT());
            }
            if (!TextUtils.isEmpty(wN())) {
                jSONObject2.put("rit", wN());
            }
            if (!TextUtils.isEmpty(vc())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, vc());
            }
            if (NjR() > 0) {
                jSONObject2.put("adtype", NjR());
            }
            if (!TextUtils.isEmpty(nc())) {
                jSONObject2.put("req_id", nc());
            }
            if (!TextUtils.isEmpty(GA())) {
                jSONObject2.put("extra", GA());
            }
            String AlY = AlY();
            if (TextUtils.isEmpty(AlY)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(AlY);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(AlY)) {
                jSONObject2.put("event_extra", AlY);
            }
            if (!TextUtils.isEmpty(pDU())) {
                jSONObject2.put("duration", pDU());
            }
        } catch (Throwable th2) {
            YoT.YFl("LogStatsBase", th2.getMessage());
        }
        return jSONObject2;
    }

    public String YoT() {
        return this.NjR;
    }

    public int eT() {
        return this.qsH;
    }

    public String nc() {
        return this.DSW;
    }

    public String pDU() {
        return this.YoT;
    }

    public long qsH() {
        return this.wN;
    }

    public String tN() {
        return this.YFl;
    }

    public String vc() {
        return this.tN;
    }

    public String wN() {
        return this.Sg;
    }

    public T AlY(String str) {
        this.tN = str;
        return rkt();
    }

    public T DSW(String str) {
        this.f10778nc = str;
        return rkt();
    }

    public T Sg(String str) {
        this.eT = str;
        return rkt();
    }

    public T qsH(String str) {
        this.YoT = str;
        return rkt();
    }

    public T tN(String str) {
        this.Sg = str;
        return rkt();
    }

    public T vc(String str) {
        this.NjR = str;
        return rkt();
    }

    public T wN(String str) {
        this.DSW = str;
        return rkt();
    }

    public T Sg(int i10) {
        this.qsH = i10;
        return rkt();
    }

    public T YFl(String str) {
        this.YFl = str;
        return rkt();
    }

    public T YFl(int i10) {
        this.f10779vc = i10;
        return rkt();
    }
}
