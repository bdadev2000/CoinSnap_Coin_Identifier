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
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            hn.this.a(i9);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            hn.this.b(jSONObject);
        }
    }

    public hn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(ch chVar) {
        JSONObject e4 = e();
        JsonUtils.putString(e4, "result", chVar.b());
        Map a6 = chVar.a();
        if (a6 != null) {
            JsonUtils.putJSONObject(e4, "params", new JSONObject(a6));
        }
        return e4;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.jn
    public int g() {
        return ((Integer) this.f12278a.a(oj.s1)).intValue();
    }

    public abstract ch h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        ch h6 = h();
        if (h6 != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Reporting pending reward: " + h6 + "...");
            }
            a(a(h6), new a());
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Pending reward not found");
        }
        i();
    }
}
