package com.bytedance.adsdk.ugeno.zp;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements lMd {
    @Override // com.bytedance.adsdk.ugeno.zp.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public String lMd(Object[] objArr) {
        if (objArr != null && objArr.length == 3) {
            String valueOf = String.valueOf(objArr[0]);
            if (TextUtils.isEmpty(valueOf)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(valueOf);
                String valueOf2 = String.valueOf(objArr[1]);
                if (TextUtils.isEmpty(valueOf2)) {
                    return null;
                }
                return jSONObject.optString(valueOf2, String.valueOf(objArr[2]));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
