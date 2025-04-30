package com.bytedance.sdk.openadsdk.core.QR;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT {
    private final String KS;
    private final String jU;
    private final URL lMd;
    private final String zp;

    private dT(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.zp = str2;
        this.lMd = new URL(str);
        this.KS = str3;
        this.jU = str4;
    }

    public URL KS() {
        return this.lMd;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dT)) {
            return false;
        }
        dT dTVar = (dT) obj;
        if (!zp(this.zp, dTVar.zp) || !zp(this.lMd, dTVar.lMd) || !zp(this.KS, dTVar.KS)) {
            return false;
        }
        return zp(this.jU, dTVar.jU);
    }

    public int hashCode() {
        int i9;
        int i10;
        String str = this.zp;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode = (this.lMd.hashCode() + (i9 * 31)) * 31;
        String str2 = this.KS;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str3 = this.jU;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public JSONObject jU() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.lMd.toString());
            if (!TextUtils.isEmpty(this.zp)) {
                jSONObject.put("vendorKey", this.zp);
            }
            if (!TextUtils.isEmpty(this.KS)) {
                jSONObject.put("verificationParameters", this.KS);
            }
            if (!TextUtils.isEmpty(this.jU)) {
                jSONObject.put("verificationNotExecuted", this.jU);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String lMd() {
        return this.KS;
    }

    public String zp() {
        return this.zp;
    }

    private boolean zp(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static dT zp(String str, String str2, String str3, String str4, String str5) {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new dT(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static dT zp(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new dT(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<dT> zp(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                hashSet.add(zp(jSONArray.getJSONObject(i9)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
