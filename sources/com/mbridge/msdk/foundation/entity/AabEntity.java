package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AabEntity implements NoProGuard, Serializable {
    private static final String TAG = "AabEntity";
    public int h3c;
    public int hlp;

    public static AabEntity parser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            AabEntity aabEntity = new AabEntity();
            if (jSONObject.has("hlp")) {
                aabEntity.setHlp(jSONObject.optInt("hlp"));
            }
            if (jSONObject.has("h3c")) {
                aabEntity.setH3c(jSONObject.optInt("h3c"));
            }
            return aabEntity;
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
            return null;
        }
    }

    public int getH3c() {
        return this.h3c;
    }

    public int getHlp() {
        return this.hlp;
    }

    public void setH3c(int i10) {
        this.h3c = i10;
    }

    public void setHlp(int i10) {
        this.hlp = i10;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.hlp);
            jSONObject.put("h3c", this.h3c);
        } catch (JSONException e2) {
            ad.b(TAG, e2.getMessage());
        }
        return jSONObject;
    }
}
