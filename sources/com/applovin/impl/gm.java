package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class gm extends xl {

    /* renamed from: h, reason: collision with root package name */
    protected final h0 f4951h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4952i;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            gm.this.a(i10, str2);
            this.a.B().a("fetchAd", str, i10, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f4502m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f4502m.b());
                gm.this.b(jSONObject);
            } else {
                gm.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
                this.a.B().a("fetchAd", str, i10);
            }
        }
    }

    public gm(h0 h0Var, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f4951h = h0Var;
        this.f4952i = kVar.b();
    }

    private void a(ba baVar) {
        aa aaVar = aa.f3617g;
        long b3 = baVar.b(aaVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b3 > TimeUnit.MINUTES.toMillis(((Integer) this.a.a(oj.B3)).intValue())) {
            baVar.b(aaVar, currentTimeMillis);
            baVar.a(aa.f3618h);
            baVar.a(aa.f3619i);
        }
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f4951h.e());
        if (this.f4951h.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f4951h.f().getLabel());
        }
        if (this.f4951h.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f4951h.g().getLabel());
        }
        return hashMap;
    }

    public abstract xl a(JSONObject jSONObject);

    public void b(JSONObject jSONObject) {
        c4.c(jSONObject, this.a);
        c4.b(jSONObject, this.a);
        c4.a(jSONObject, this.a);
        h0.a(jSONObject);
        this.a.l0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f4951h.e());
        if (this.f4951h.f() != null) {
            hashMap.put("size", this.f4951h.f().getLabel());
        }
        if (this.f4951h.g() != null) {
            hashMap.put("require", this.f4951h.g().getLabel());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map a10;
        qi.a aVar;
        Map map;
        Map a11;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Fetching next ad of zone: " + this.f4951h);
        }
        if (((Boolean) this.a.a(oj.f6623b4)).booleanValue() && zp.j() && com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "User is connected to a VPN");
        }
        ba F = this.a.F();
        F.c(aa.f3614d);
        aa aaVar = aa.f3617g;
        if (F.b(aaVar) == 0) {
            F.b(aaVar, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.a.i().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.a.a(oj.f6739q3)).booleanValue()) {
                aVar = qi.a.a(((Integer) this.a.a(oj.f6749r5)).intValue());
                if (this.a.y() != null) {
                    a11 = this.a.y().a(h(), false, true);
                } else {
                    a11 = this.a.x().a(h(), false, true);
                }
                JSONObject jSONObject = new JSONObject(a11);
                HashMap hashMap = new HashMap();
                if (!((Boolean) this.a.a(oj.A5)).booleanValue() && !((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
                    hashMap.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.a.a(oj.f6685j5)).booleanValue()) {
                    hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = hashMap;
            } else {
                qi.a a12 = qi.a.a(((Integer) this.a.a(oj.s5)).intValue());
                if (this.a.y() != null) {
                    a10 = this.a.y().a(h(), false, false);
                } else {
                    a10 = this.a.x().a(h(), false, false);
                }
                Map a13 = zp.a(a10);
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                aVar = a12;
                map = a13;
            }
            if (zp.f(a())) {
                map.putAll(this.a.i().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f4952i)) {
                map.put("sts", this.f4952i);
            }
            a(F);
            a.C0036a f10 = com.applovin.impl.sdk.network.a.a(this.a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.a.a(oj.f6652f3)).intValue()).c(((Boolean) this.a.a(oj.f6660g3)).booleanValue()).d(((Boolean) this.a.a(oj.f6668h3)).booleanValue()).c(((Integer) this.a.a(oj.f6644e3)).intValue()).a(aVar).f(true);
            if (andResetCustomPostBody != null) {
                f10.a(andResetCustomPostBody);
                f10.b(((Boolean) this.a.a(oj.K5)).booleanValue());
            }
            a aVar2 = new a(f10.a(), this.a);
            aVar2.c(oj.I0);
            aVar2.b(oj.J0);
            this.a.l0().a(aVar2);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Unable to fetch ad " + this.f4951h, th2);
            }
            a(0, th2.getMessage());
        }
    }

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Unable to fetch " + this.f4951h + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.a.F().c(aa.f3623m);
        }
    }
}
