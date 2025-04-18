package com.bytedance.sdk.openadsdk.AlY.YFl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    public int AlY;
    public AtomicInteger YFl = new AtomicInteger(0);
    public AtomicInteger Sg = new AtomicInteger(0);
    public AtomicLong tN = new AtomicLong(0);
    public AtomicInteger wN = new AtomicInteger(0);

    /* renamed from: vc, reason: collision with root package name */
    public Map<Integer, Integer> f10493vc = new HashMap();
    public AtomicBoolean DSW = new AtomicBoolean(false);

    public Sg(int i10) {
        this.AlY = i10;
    }

    public JSONObject Sg() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.YFl.get());
            jSONObject.put("fail", this.Sg.get());
            jSONObject.put("type", this.AlY);
            jSONObject.put("time", this.wN.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject YFl() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.YFl.get());
            jSONObject.put("fail", this.Sg.get());
            jSONObject.put("type", this.AlY);
            jSONObject.put("duration", this.tN.get() / this.YFl.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.f10493vc.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.f10493vc.entrySet()) {
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
