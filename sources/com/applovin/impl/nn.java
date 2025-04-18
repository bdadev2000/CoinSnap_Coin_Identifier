package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class nn extends jn {

    /* loaded from: classes.dex */
    public class a implements b4.e {
        public a() {
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (nn.this.h()) {
                com.applovin.impl.sdk.t tVar = nn.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    nn nnVar = nn.this;
                    nnVar.f9061c.b(nnVar.f9060b, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.t tVar2 = nn.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                nn nnVar2 = nn.this;
                nnVar2.f9061c.b(nnVar2.f9060b, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            nn.this.a(i10);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (nn.this.h()) {
                com.applovin.impl.sdk.t tVar = nn.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    nn nnVar = nn.this;
                    nnVar.f9061c.b(nnVar.f9060b, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.t tVar2 = nn.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    nn nnVar2 = nn.this;
                    nnVar2.f9061c.b(nnVar2.f9060b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.t tVar3 = nn.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                nn nnVar3 = nn.this;
                nnVar3.f9061c.a(nnVar3.f9060b, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            nn.this.c(jSONObject);
        }
    }

    public nn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private ch b(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        c4.c(jSONObject2, this.a);
        c4.b(jSONObject, this.a);
        c4.a(jSONObject, this.a);
        try {
            emptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            emptyMap = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return ch.a(str, emptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        ch b3 = b(jSONObject);
        a(b3);
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Pending reward handled: " + b3);
        }
    }

    public abstract void a(ch chVar);

    @Override // com.applovin.impl.jn
    public int g() {
        return ((Integer) this.a.a(oj.f6745r1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }
}
