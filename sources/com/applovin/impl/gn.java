package com.applovin.impl;

import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.NativeProtocol;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class gn extends in {

    /* loaded from: classes2.dex */
    public class a implements d4.e {
        public a() {
        }

        @Override // com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            gn.this.a(i2);
        }

        @Override // com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            gn.this.b(jSONObject);
        }
    }

    public gn(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    private JSONObject a(fh fhVar) {
        JSONObject e = e();
        JsonUtils.putString(e, "result", fhVar.b());
        Map a2 = fhVar.a();
        if (a2 != null) {
            JsonUtils.putJSONObject(e, NativeProtocol.WEB_DIALOG_PARAMS, new JSONObject(a2));
        }
        return e;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.in
    public int g() {
        return ((Integer) this.f28216a.a(sj.u1)).intValue();
    }

    public abstract fh h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        fh h2 = h();
        if (h2 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Reporting pending reward: " + h2 + "...");
        }
        a(a(h2), new a());
    }
}
