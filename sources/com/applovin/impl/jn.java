package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class jn extends xl {

    /* loaded from: classes.dex */
    public class a extends en {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ b4.e f5529n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, b4.e eVar) {
            super(aVar, kVar);
            this.f5529n = eVar;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f5529n.a(str, i10, str2, jSONObject);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f5529n.a(str, jSONObject, i10);
        }
    }

    public jn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public void a(int i10) {
        c4.a(i10, this.a);
    }

    public abstract void a(JSONObject jSONObject);

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String c10 = this.a.t0().c();
        if (((Boolean) this.a.a(oj.L3)).booleanValue() && StringUtils.isValidString(c10)) {
            JsonUtils.putString(jSONObject, "cuid", c10);
        }
        if (((Boolean) this.a.a(oj.N3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.a.p());
        }
        if (((Boolean) this.a.a(oj.P3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.a.c0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    public void a(JSONObject jSONObject, b4.e eVar) {
        Map c10 = c4.c(this.a);
        if (((Boolean) this.a.a(oj.D5)).booleanValue() || ((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c10);
            c10 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).b(c4.b(f(), this.a)).a(c4.a(f(), this.a)).b(c10).a(jSONObject).c("POST").b(((Boolean) this.a.a(oj.M5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(qi.a.a(((Integer) this.a.a(oj.f6776v5)).intValue())).a(), this.a, eVar);
        aVar.c(oj.K0);
        aVar.b(oj.L0);
        this.a.l0().a(aVar);
    }
}
