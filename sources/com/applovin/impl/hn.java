package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class hn extends jn {

    /* loaded from: classes.dex */
    public class a implements b4.e {
        public a() {
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            hn.this.a(i10);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            hn.this.b(jSONObject);
        }
    }

    public hn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(ch chVar) {
        JSONObject e2 = e();
        JsonUtils.putString(e2, "result", chVar.b());
        Map a10 = chVar.a();
        if (a10 != null) {
            JsonUtils.putJSONObject(e2, "params", new JSONObject(a10));
        }
        return e2;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.jn
    public int g() {
        return ((Integer) this.a.a(oj.f6752s1)).intValue();
    }

    public abstract ch h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        ch h10 = h();
        if (h10 != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Reporting pending reward: " + h10 + "...");
            }
            a(a(h10), new a());
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Pending reward not found");
        }
        i();
    }
}
