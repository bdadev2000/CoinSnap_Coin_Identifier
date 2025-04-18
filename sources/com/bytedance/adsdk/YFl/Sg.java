package com.bytedance.adsdk.YFl;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg implements wN {
    @Override // com.bytedance.adsdk.YFl.wN
    public Object YFl(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf) && !TextUtils.equals(valueOf, AbstractJsonLexerKt.NULL)) {
                    return valueOf;
                }
            }
        }
        return null;
    }
}
