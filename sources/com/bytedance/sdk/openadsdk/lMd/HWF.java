package com.bytedance.sdk.openadsdk.lMd;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF extends zp {
    public static final SimpleDateFormat KS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public HWF(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.zp
    public JSONObject KS() {
        return this.lMd;
    }
}
