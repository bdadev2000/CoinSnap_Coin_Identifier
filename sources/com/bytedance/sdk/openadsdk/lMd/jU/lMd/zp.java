package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp<T extends KS> {
    private boolean COT = false;
    private JSONObject KS;
    private T jU;
    private String lMd;
    private woN zp;

    public zp(woN won, String str, JSONObject jSONObject, T t9) {
        this.zp = won;
        this.lMd = str;
        this.KS = jSONObject;
        this.jU = t9;
    }

    public boolean COT() {
        return this.COT;
    }

    public JSONObject KS() {
        if (this.KS == null) {
            this.KS = new JSONObject();
        }
        return this.KS;
    }

    public T jU() {
        return this.jU;
    }

    public String lMd() {
        return this.lMd;
    }

    public woN zp() {
        return this.zp;
    }

    public void zp(boolean z8) {
        this.COT = z8;
    }
}
