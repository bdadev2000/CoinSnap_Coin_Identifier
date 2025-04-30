package com.bytedance.sdk.component.zp;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dQp {
    private final Map<String, Object> zp = new ConcurrentHashMap();

    private dQp() {
    }

    public static dQp zp() {
        return new dQp();
    }

    public String lMd() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.zp.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public dQp zp(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.zp.put(str, obj);
        }
        return this;
    }
}
