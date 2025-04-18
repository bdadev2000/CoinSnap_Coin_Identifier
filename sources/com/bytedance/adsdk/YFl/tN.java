package com.bytedance.adsdk.YFl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN implements wN {
    @Override // com.bytedance.adsdk.YFl.wN
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public String YFl(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 3) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(valueOf);
            String valueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            return jSONObject2.optString(valueOf2, String.valueOf(objArr[2]));
        } catch (JSONException unused) {
            return null;
        }
    }
}
