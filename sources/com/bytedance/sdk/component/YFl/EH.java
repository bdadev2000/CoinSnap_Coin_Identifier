package com.bytedance.sdk.component.YFl;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class EH {
    private final Map<String, Object> YFl = new ConcurrentHashMap();

    private EH() {
    }

    public static EH YFl() {
        return new EH();
    }

    public String Sg() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.YFl.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public EH YFl(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.YFl.put(str, obj);
        }
        return this;
    }
}
