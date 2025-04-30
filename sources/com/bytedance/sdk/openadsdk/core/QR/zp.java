package com.bytedance.sdk.openadsdk.core.QR;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private String Bj;
    private String COT;
    private String HWF;
    KS KS;
    private String QR;
    private int YW;
    private String dQp;
    private int dT;
    private String jU;
    private double ku;
    lMd lMd;
    jU zp = new jU(this);
    private final Set<dT> vDp = new HashSet();
    private String tG = "VAST_ACTION_BUTTON";
    private boolean rV = false;

    private JSONArray KVG() {
        JSONArray jSONArray = new JSONArray();
        for (dT dTVar : this.vDp) {
            if (dTVar != null) {
                jSONArray.put(dTVar.jU());
            }
        }
        return jSONArray;
    }

    public String Bj() {
        return this.Bj;
    }

    public String COT() {
        return this.COT;
    }

    public String HWF() {
        return this.HWF;
    }

    public KS KS() {
        return this.KS;
    }

    public String QR() {
        return this.QR;
    }

    public String YW() {
        KS ks;
        String str = this.HWF;
        if (!TextUtils.isEmpty(this.dQp)) {
            String str2 = this.dQp;
            this.dQp = null;
            return str2;
        }
        String str3 = this.tG;
        str3.getClass();
        if (!str3.equals("VAST_ICON")) {
            if (str3.equals("VAST_END_CARD") && (ks = this.KS) != null && !TextUtils.isEmpty(ks.ku)) {
                str = this.KS.ku;
            }
        } else {
            lMd lmd = this.lMd;
            if (lmd != null && !TextUtils.isEmpty(lmd.ku)) {
                str = this.lMd.ku;
            }
        }
        this.tG = "VAST_ACTION_BUTTON";
        return str;
    }

    public void dQp() {
        this.rV = true;
    }

    public JSONObject dT() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.zp.zp());
        lMd lmd = this.lMd;
        if (lmd != null) {
            jSONObject.put("vastIcon", lmd.zp());
        }
        KS ks = this.KS;
        if (ks != null) {
            jSONObject.put("endCard", ks.zp());
        }
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, this.jU);
        jSONObject.put("description", this.COT);
        jSONObject.put("clickThroughUrl", this.HWF);
        jSONObject.put("videoUrl", this.QR);
        jSONObject.put("videDuration", this.ku);
        jSONObject.put("tag", this.Bj);
        jSONObject.put("videoWidth", this.YW);
        jSONObject.put("videoHeight", this.dT);
        jSONObject.put("viewabilityVendor", KVG());
        return jSONObject;
    }

    public String jU() {
        return this.jU;
    }

    public double ku() {
        return this.ku;
    }

    public lMd lMd() {
        return this.lMd;
    }

    public Set<dT> rV() {
        return this.vDp;
    }

    public int tG() {
        return this.dT;
    }

    public int vDp() {
        return this.YW;
    }

    public jU zp() {
        return this.zp;
    }

    public void COT(String str) {
        this.tG = str;
    }

    public void HWF(String str) {
        this.Bj = str;
        this.zp.zp(str);
    }

    public void KS(String str) {
        this.HWF = str;
    }

    public void QR(String str) {
        this.dQp = str;
    }

    public void jU(String str) {
        this.QR = str;
    }

    public void lMd(String str) {
        this.COT = str;
    }

    public void zp(lMd lmd) {
        if (lmd != null) {
            lmd.zp(this.QR);
        }
        this.lMd = lmd;
    }

    public void lMd(int i9) {
        this.dT = i9;
    }

    public void zp(KS ks) {
        if (ks != null) {
            ks.zp(this.QR);
        }
        this.KS = ks;
    }

    public void zp(String str) {
        this.jU = str;
    }

    public void zp(double d2) {
        this.ku = d2;
    }

    public static zp zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zp zpVar = new zp();
        zpVar.zp.zp(jSONObject.optJSONObject("videoTrackers"));
        zpVar.lMd = lMd.zp(jSONObject.optJSONObject("vastIcon"));
        zpVar.KS = KS.lMd(jSONObject.optJSONObject("endCard"));
        zpVar.jU = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        zpVar.COT = jSONObject.optString("description");
        zpVar.HWF = jSONObject.optString("clickThroughUrl");
        zpVar.QR = jSONObject.optString("videoUrl");
        zpVar.ku = jSONObject.optDouble("videDuration");
        zpVar.Bj = jSONObject.optString("tag");
        zpVar.YW = jSONObject.optInt("videoWidth");
        zpVar.YW = jSONObject.optInt("videoHeight");
        zpVar.vDp.addAll(dT.zp(jSONObject.optJSONArray("viewabilityVendor")));
        return zpVar;
    }

    public void zp(woN won) {
        this.zp.zp(won);
        lMd lmd = this.lMd;
        if (lmd != null) {
            lmd.zp(won);
        }
        KS ks = this.KS;
        if (ks != null) {
            ks.zp(won);
        }
    }

    public void zp(int i9) {
        this.YW = i9;
    }

    public void zp(Set<dT> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.vDp.addAll(set);
    }
}
