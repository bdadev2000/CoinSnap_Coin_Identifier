package com.bytedance.adsdk.YFl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY implements wN {
    @Override // com.bytedance.adsdk.YFl.wN
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public Boolean YFl(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                Double.parseDouble(String.valueOf(objArr[0]));
                return Boolean.TRUE;
            } catch (NumberFormatException unused) {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
