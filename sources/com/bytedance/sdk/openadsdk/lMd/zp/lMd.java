package com.bytedance.sdk.openadsdk.lMd.zp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    public int jU;
    public AtomicInteger zp = new AtomicInteger(0);
    public AtomicInteger lMd = new AtomicInteger(0);
    public AtomicLong KS = new AtomicLong(0);
    public AtomicInteger COT = new AtomicInteger(0);
    public Map<Integer, Integer> HWF = new HashMap();
    public AtomicBoolean QR = new AtomicBoolean(false);

    public lMd(int i9) {
        this.jU = i9;
    }

    public JSONObject lMd() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.zp.get());
            jSONObject.put("fail", this.lMd.get());
            jSONObject.put("type", this.jU);
            jSONObject.put("time", this.COT.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject zp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.zp.get());
            jSONObject.put("fail", this.lMd.get());
            jSONObject.put("type", this.jU);
            jSONObject.put("duration", this.KS.get() / this.zp.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.HWF.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.HWF.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
