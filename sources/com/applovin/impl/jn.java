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
        final /* synthetic */ b4.e f8487n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, b4.e eVar) {
            super(aVar, kVar);
            this.f8487n = eVar;
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            this.f8487n.a(str, i9, str2, jSONObject);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            this.f8487n.a(str, jSONObject, i9);
        }
    }

    public jn(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public void a(int i9) {
        c4.a(i9, this.f12278a);
    }

    public abstract void a(JSONObject jSONObject);

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String c9 = this.f12278a.t0().c();
        if (((Boolean) this.f12278a.a(oj.f9626L3)).booleanValue() && StringUtils.isValidString(c9)) {
            JsonUtils.putString(jSONObject, "cuid", c9);
        }
        if (((Boolean) this.f12278a.a(oj.f9640N3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f12278a.p());
        }
        if (((Boolean) this.f12278a.a(oj.f9652P3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f12278a.c0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    public void a(JSONObject jSONObject, b4.e eVar) {
        Map c9 = c4.c(this.f12278a);
        if (((Boolean) this.f12278a.a(oj.f9575D5)).booleanValue() || ((Boolean) this.f12278a.a(oj.f9877w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c9);
            c9 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f12278a).b(c4.b(f(), this.f12278a)).a(c4.a(f(), this.f12278a)).b(c9).a(jSONObject).c("POST").b(((Boolean) this.f12278a.a(oj.f9635M5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(qi.a.a(((Integer) this.f12278a.a(oj.f9872v5)).intValue())).a(), this.f12278a, eVar);
        aVar.c(oj.K0);
        aVar.b(oj.f9623L0);
        this.f12278a.l0().a(aVar);
    }
}
