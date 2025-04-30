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
    protected final C0703h0 f7927h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7928i;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            gm.this.a(i9, str2);
            this.f12278a.B().a("fetchAd", str, i9, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            if (i9 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                gm.this.b(jSONObject);
            } else {
                gm.this.a(i9, MaxAdapterError.NO_FILL.getErrorMessage());
                this.f12278a.B().a("fetchAd", str, i9);
            }
        }
    }

    public gm(C0703h0 c0703h0, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f7927h = c0703h0;
        this.f7928i = kVar.b();
    }

    private void a(ba baVar) {
        aa aaVar = aa.f6599g;
        long b = baVar.b(aaVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis(((Integer) this.f12278a.a(oj.f9558B3)).intValue())) {
            baVar.b(aaVar, currentTimeMillis);
            baVar.a(aa.f6600h);
            baVar.a(aa.f6601i);
        }
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f7927h.e());
        if (this.f7927h.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f7927h.f().getLabel());
        }
        if (this.f7927h.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f7927h.g().getLabel());
        }
        return hashMap;
    }

    public abstract xl a(JSONObject jSONObject);

    public void b(JSONObject jSONObject) {
        c4.c(jSONObject, this.f12278a);
        c4.b(jSONObject, this.f12278a);
        c4.a(jSONObject, this.f12278a);
        C0703h0.a(jSONObject);
        this.f12278a.l0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f7927h.e());
        if (this.f7927h.f() != null) {
            hashMap.put("size", this.f7927h.f().getLabel());
        }
        if (this.f7927h.g() != null) {
            hashMap.put("require", this.f7927h.g().getLabel());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map a6;
        qi.a aVar;
        Map map;
        Map a9;
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Fetching next ad of zone: " + this.f7927h);
        }
        if (((Boolean) this.f12278a.a(oj.f9731b4)).booleanValue() && zp.j() && com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "User is connected to a VPN");
        }
        ba F4 = this.f12278a.F();
        F4.c(aa.f6596d);
        aa aaVar = aa.f6599g;
        if (F4.b(aaVar) == 0) {
            F4.b(aaVar, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f12278a.i().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f12278a.a(oj.f9833q3)).booleanValue()) {
                aVar = qi.a.a(((Integer) this.f12278a.a(oj.f9843r5)).intValue());
                if (this.f12278a.y() != null) {
                    a9 = this.f12278a.y().a(h(), false, true);
                } else {
                    a9 = this.f12278a.x().a(h(), false, true);
                }
                JSONObject jSONObject = new JSONObject(a9);
                HashMap hashMap = new HashMap();
                if (!((Boolean) this.f12278a.a(oj.f9552A5)).booleanValue() && !((Boolean) this.f12278a.a(oj.f9877w5)).booleanValue()) {
                    hashMap.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f12278a.a(oj.f9790j5)).booleanValue()) {
                    hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f12278a.d0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = hashMap;
            } else {
                qi.a a10 = qi.a.a(((Integer) this.f12278a.a(oj.s5)).intValue());
                if (this.f12278a.y() != null) {
                    a6 = this.f12278a.y().a(h(), false, false);
                } else {
                    a6 = this.f12278a.x().a(h(), false, false);
                }
                Map a11 = zp.a(a6);
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                aVar = a10;
                map = a11;
            }
            if (zp.f(a())) {
                map.putAll(this.f12278a.i().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f7928i)) {
                map.put("sts", this.f7928i);
            }
            a(F4);
            a.C0036a f9 = com.applovin.impl.sdk.network.a.a(this.f12278a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f12278a.a(oj.f9758f3)).intValue()).c(((Boolean) this.f12278a.a(oj.f9766g3)).booleanValue()).d(((Boolean) this.f12278a.a(oj.f9773h3)).booleanValue()).c(((Integer) this.f12278a.a(oj.f9752e3)).intValue()).a(aVar).f(true);
            if (andResetCustomPostBody != null) {
                f9.a(andResetCustomPostBody);
                f9.b(((Boolean) this.f12278a.a(oj.K5)).booleanValue());
            }
            a aVar2 = new a(f9.a(), this.f12278a);
            aVar2.c(oj.f9605I0);
            aVar2.b(oj.f9611J0);
            this.f12278a.l0().a(aVar2);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Unable to fetch ad " + this.f7927h, th);
            }
            a(0, th.getMessage());
        }
    }

    public void a(int i9, String str) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Unable to fetch " + this.f7927h + " ad: server returned " + i9);
        }
        if (i9 == -800) {
            this.f12278a.F().c(aa.m);
        }
    }
}
