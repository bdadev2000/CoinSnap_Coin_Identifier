package com.bytedance.sdk.openadsdk.dT.zp;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.KVG;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.dT.zp.KS;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS<T extends KS> implements lMd {
    private String Bj;
    private String KS;
    private String QR;
    private String YW;
    private String dT;
    private String lMd;
    private String vDp;
    private String zp;
    private final String jU = BuildConfig.VERSION_NAME;
    private long COT = System.currentTimeMillis() / 1000;
    private int HWF = 0;
    private int ku = 0;

    private T KVG() {
        return this;
    }

    @JProtect
    private JSONObject dQp() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, YhE.COT());
            jSONObject.put("ua", YhE.KS());
            jSONObject.put("gaid", com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static KS<KS> lMd() {
        return new KS<>();
    }

    public int Bj() {
        return this.ku;
    }

    public String COT() {
        return this.lMd;
    }

    public String HWF() {
        return this.KS;
    }

    public String KS() {
        return this.zp;
    }

    public String QR() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public int YW() {
        return this.HWF;
    }

    public String dT() {
        return this.QR;
    }

    public String jU() {
        return this.Bj;
    }

    public long ku() {
        return this.COT;
    }

    public String rV() {
        return this.vDp;
    }

    public String tG() {
        return this.dT;
    }

    public String vDp() {
        return this.YW;
    }

    @Override // com.bytedance.sdk.openadsdk.dT.zp.lMd
    @JProtect
    public JSONObject zp() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", QR());
            jSONObject2.put("app_version", YhE.QR());
            jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, ku());
            jSONObject2.put("conn_type", KVG.lMd(com.bytedance.sdk.openadsdk.core.KVG.zp()));
            jSONObject2.put("appid", TextUtils.isEmpty(ku.lMd().jU()) ? "" : ku.lMd().jU());
            jSONObject2.put("device_info", dQp());
            if (!TextUtils.isEmpty(KS())) {
                jSONObject2.put("type", KS());
            }
            jSONObject2.put("error_code", Bj());
            if (!TextUtils.isEmpty(vDp())) {
                jSONObject2.put("error_msg", vDp());
            }
            if (!TextUtils.isEmpty(COT())) {
                jSONObject2.put("rit", COT());
            }
            if (!TextUtils.isEmpty(HWF())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, HWF());
            }
            if (YW() > 0) {
                jSONObject2.put("adtype", YW());
            }
            if (!TextUtils.isEmpty(dT())) {
                jSONObject2.put("req_id", dT());
            }
            if (!TextUtils.isEmpty(tG())) {
                jSONObject2.put("extra", tG());
            }
            String jU = jU();
            if (TextUtils.isEmpty(jU)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(jU);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(jU)) {
                jSONObject2.put("event_extra", jU);
            }
            if (!TextUtils.isEmpty(rV())) {
                jSONObject2.put("duration", rV());
            }
        } catch (Throwable th) {
            tG.zp("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public T COT(String str) {
        this.QR = str;
        return KVG();
    }

    public T HWF(String str) {
        this.YW = str;
        return KVG();
    }

    public T KS(String str) {
        this.lMd = str;
        return KVG();
    }

    public T QR(String str) {
        this.dT = str;
        return KVG();
    }

    public T jU(String str) {
        this.KS = str;
        return KVG();
    }

    public T ku(String str) {
        this.vDp = str;
        return KVG();
    }

    public T lMd(String str) {
        this.Bj = str;
        return KVG();
    }

    public T lMd(int i9) {
        this.ku = i9;
        return KVG();
    }

    public T zp(String str) {
        this.zp = str;
        return KVG();
    }

    public T zp(int i9) {
        this.HWF = i9;
        return KVG();
    }
}
