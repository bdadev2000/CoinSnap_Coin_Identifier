package com.bytedance.sdk.openadsdk.core.YoT;

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
public class nc {
    private final String AlY;
    private final URL Sg;
    private final String YFl;
    private final String tN;

    private nc(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.YFl = str2;
        this.Sg = new URL(str);
        this.tN = str3;
        this.AlY = str4;
    }

    public JSONObject AlY() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.Sg.toString());
            if (!TextUtils.isEmpty(this.YFl)) {
                jSONObject.put("vendorKey", this.YFl);
            }
            if (!TextUtils.isEmpty(this.tN)) {
                jSONObject.put("verificationParameters", this.tN);
            }
            if (!TextUtils.isEmpty(this.AlY)) {
                jSONObject.put("verificationNotExecuted", this.AlY);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String Sg() {
        return this.tN;
    }

    public String YFl() {
        return this.YFl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        if (!YFl(this.YFl, ncVar.YFl) || !YFl(this.Sg, ncVar.Sg) || !YFl(this.tN, ncVar.tN)) {
            return false;
        }
        return YFl(this.AlY, ncVar.AlY);
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.YFl;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (this.Sg.hashCode() + (i10 * 31)) * 31;
        String str2 = this.tN;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (hashCode + i11) * 31;
        String str3 = this.AlY;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public URL tN() {
        return this.Sg;
    }

    private boolean YFl(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static nc YFl(String str, String str2, String str3, String str4, String str5) {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new nc(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static nc YFl(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new nc(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<nc> YFl(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                hashSet.add(YFl(jSONArray.getJSONObject(i10)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
