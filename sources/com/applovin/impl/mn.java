package com.applovin.impl;

import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.NativeProtocol;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class mn extends in {

    /* loaded from: classes.dex */
    public class a implements d4.e {
        public a() {
        }

        @Override // com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            if (mn.this.h()) {
                com.applovin.impl.sdk.n nVar = mn.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    mn mnVar = mn.this;
                    mnVar.f28218c.b(mnVar.f28217b, "Reward validation failed with error code " + i2 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n nVar2 = mn.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                mn mnVar2 = mn.this;
                mnVar2.f28218c.b(mnVar2.f28217b, "Reward validation failed with code " + i2 + " and error: " + str2);
            }
            mn.this.a(i2);
        }

        @Override // com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (mn.this.h()) {
                com.applovin.impl.sdk.n nVar = mn.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    mn mnVar = mn.this;
                    mnVar.f28218c.b(mnVar.f28217b, "Reward validation succeeded with code " + i2 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.n nVar2 = mn.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    mn mnVar2 = mn.this;
                    mnVar2.f28218c.b(mnVar2.f28217b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n nVar3 = mn.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                mn mnVar3 = mn.this;
                mnVar3.f28218c.a(mnVar3.f28217b, "Reward validation succeeded with code " + i2 + " and response: " + jSONObject);
            }
            mn.this.c(jSONObject);
        }
    }

    public mn(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    private fh b(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        e4.c(jSONObject2, this.f28216a);
        e4.b(jSONObject, this.f28216a);
        e4.a(jSONObject, this.f28216a);
        try {
            emptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get(NativeProtocol.WEB_DIALOG_PARAMS));
        } catch (Throwable unused) {
            emptyMap = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return fh.a(str, emptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        fh b2 = b(jSONObject);
        a(b2);
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Pending reward handled: " + b2);
        }
    }

    public abstract void a(fh fhVar);

    @Override // com.applovin.impl.in
    public int g() {
        return ((Integer) this.f28216a.a(sj.t1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }
}
