package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.vi;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class hm extends yl {

    /* renamed from: h, reason: collision with root package name */
    protected final h0 f24333h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24334i;

    /* loaded from: classes.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            hm.this.a(i2, str2);
            this.f28216a.E().a("fetchAd", str, i2, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (i2 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f23515m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f23515m.b());
                HashMap hashMap = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid("code", String.valueOf(i2), hashMap);
                CollectionUtils.putStringIfValid("ad_zone_id", hm.this.f24333h.e(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f23515m.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f23515m.b()), hashMap);
                this.f28216a.E().a(la.f25009g, (Map) hashMap);
                hm.this.b(jSONObject);
                return;
            }
            hm.this.a(i2, MaxAdapterError.NO_FILL.getErrorMessage());
        }
    }

    public hm(h0 h0Var, String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.f24333h = h0Var;
        this.f24334i = jVar.b();
    }

    private void a(da daVar) {
        ca caVar = ca.f23243g;
        long b2 = daVar.b(caVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b2 > TimeUnit.MINUTES.toMillis(((Integer) this.f28216a.a(sj.K3)).intValue())) {
            daVar.b(caVar, currentTimeMillis);
            daVar.a(ca.f23244h);
            daVar.a(ca.f23245i);
        }
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f24333h.e());
        if (this.f24333h.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f24333h.f().getLabel());
        }
        if (this.f24333h.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f24333h.g().getLabel());
        }
        return hashMap;
    }

    public abstract yl a(JSONObject jSONObject);

    public void b(JSONObject jSONObject) {
        e4.c(jSONObject, this.f28216a);
        e4.b(jSONObject, this.f28216a);
        e4.a(jSONObject, this.f28216a);
        h0.a(jSONObject);
        this.f28216a.j0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.f24333h.e());
        if (this.f24333h.f() != null) {
            hashMap.put("size", this.f24333h.f().getLabel());
        }
        if (this.f24333h.g() != null) {
            hashMap.put("require", this.f24333h.g().getLabel());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        vi.a a2;
        Map map;
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Fetching next ad of zone: " + this.f24333h);
        }
        if (((Boolean) this.f28216a.a(sj.h4)).booleanValue() && yp.j() && com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "User is connected to a VPN");
        }
        yp.a(this.f28216a, this.f28217b);
        JSONObject jSONObject = null;
        this.f28216a.E().a(la.f25008f, this.f24333h, (AppLovinError) null);
        da D = this.f28216a.D();
        D.c(ca.d);
        ca caVar = ca.f23243g;
        if (D.b(caVar) == 0) {
            D.b(caVar, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f28216a.i().getAndResetCustomPostBody();
            boolean booleanValue = ((Boolean) this.f28216a.a(sj.z3)).booleanValue();
            String str = com.safedk.android.a.g.f29074c;
            if (booleanValue) {
                vi.a a3 = vi.a.a(((Integer) this.f28216a.a(sj.w5)).intValue());
                JSONObject jSONObject2 = new JSONObject(this.f28216a.y().a(h(), false, true));
                HashMap hashMap = new HashMap();
                if (!((Boolean) this.f28216a.a(sj.F5)).booleanValue() && !((Boolean) this.f28216a.a(sj.B5)).booleanValue()) {
                    hashMap.put(ImpressionLog.x, UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f28216a.a(sj.o5)).booleanValue()) {
                    hashMap.put("sdk_key", this.f28216a.b0());
                }
                JsonUtils.putAll(jSONObject2, andResetCustomPostBody);
                a2 = a3;
                jSONObject = jSONObject2;
                map = hashMap;
            } else {
                a2 = vi.a.a(((Integer) this.f28216a.a(sj.x5)).intValue());
                Map a4 = yp.a(this.f28216a.y().a(h(), false, false));
                if (andResetCustomPostBody != null) {
                    jSONObject = andResetCustomPostBody;
                } else {
                    str = "GET";
                }
                map = a4;
            }
            if (yp.f(a())) {
                map.putAll(this.f28216a.i().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f24334i)) {
                map.put("sts", this.f24334i);
            }
            a(D);
            a.C0099a f2 = com.applovin.impl.sdk.network.a.a(this.f28216a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f28216a.a(sj.o3)).intValue()).c(((Boolean) this.f28216a.a(sj.p3)).booleanValue()).d(((Boolean) this.f28216a.a(sj.q3)).booleanValue()).c(((Integer) this.f28216a.a(sj.n3)).intValue()).a(a2).f(true);
            if (jSONObject != null) {
                f2.a(jSONObject);
                f2.b(((Boolean) this.f28216a.a(sj.P5)).booleanValue());
            }
            a aVar = new a(f2.a(), this.f28216a);
            aVar.c(sj.L0);
            aVar.b(sj.M0);
            this.f28216a.j0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Unable to fetch ad for zone id: " + this.f24333h, th);
            }
            a(0, th.getMessage());
        }
    }

    public void a(int i2, String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Unable to fetch " + this.f24333h + " ad: server returned " + i2);
        }
        if (i2 == -800) {
            this.f28216a.D().c(ca.f23249m);
        }
        this.f28216a.E().a(la.f25010h, this.f24333h, new AppLovinError(i2, str));
    }
}
