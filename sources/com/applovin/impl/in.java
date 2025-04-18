package com.applovin.impl;

import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.vi;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class in extends yl {

    /* loaded from: classes.dex */
    public class a extends dn {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ d4.e f24522n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, d4.e eVar) {
            super(aVar, jVar);
            this.f24522n = eVar;
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            this.f24522n.a(str, i2, str2, jSONObject);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            this.f24522n.a(str, jSONObject, i2);
        }
    }

    public in(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    public void a(int i2) {
        e4.a(i2, this.f28216a);
    }

    public abstract void a(JSONObject jSONObject);

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String c2 = this.f28216a.q0().c();
        if (((Boolean) this.f28216a.a(sj.S3)).booleanValue() && StringUtils.isValidString(c2)) {
            JsonUtils.putString(jSONObject, "cuid", c2);
        }
        if (((Boolean) this.f28216a.a(sj.U3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f28216a.q());
        }
        if (((Boolean) this.f28216a.a(sj.W3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f28216a.a0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    public void a(JSONObject jSONObject, d4.e eVar) {
        Map c2 = e4.c(this.f28216a);
        if (((Boolean) this.f28216a.a(sj.I5)).booleanValue() || ((Boolean) this.f28216a.a(sj.B5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c2);
            c2 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f28216a).b(e4.b(f(), this.f28216a)).a(e4.a(f(), this.f28216a)).b(c2).a(jSONObject).c(com.safedk.android.a.g.f29074c).b(((Boolean) this.f28216a.a(sj.R5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(vi.a.a(((Integer) this.f28216a.a(sj.A5)).intValue())).a(), this.f28216a, eVar);
        aVar.c(sj.N0);
        aVar.b(sj.O0);
        this.f28216a.j0().a(aVar);
    }
}
