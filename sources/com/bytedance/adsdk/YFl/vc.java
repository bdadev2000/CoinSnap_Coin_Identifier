package com.bytedance.adsdk.YFl;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc implements wN {
    @Override // com.bytedance.adsdk.YFl.wN
    public Object YFl(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length == 0) {
            String valueOf = String.valueOf(objArr[2]);
            String valueOf2 = String.valueOf(objArr[1]);
            String valueOf3 = String.valueOf(objArr[0]);
            if (TextUtils.isEmpty(valueOf3)) {
                return valueOf;
            }
            if (jSONObject == null) {
                return valueOf;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("i18n");
            if (optJSONObject == null) {
                return valueOf;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(valueOf2);
            if (optJSONObject2 == null) {
                return valueOf;
            }
            String optString = optJSONObject2.optString(valueOf3);
            if (TextUtils.isEmpty(optString)) {
                return valueOf;
            }
            return optString;
        }
        return null;
    }
}
