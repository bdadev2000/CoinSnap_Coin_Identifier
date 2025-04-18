package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.u;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class km extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final String f5744h;

    /* renamed from: i, reason: collision with root package name */
    private final MaxAdFormat f5745i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f5746j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f5747k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f5748l;

    /* renamed from: m, reason: collision with root package name */
    private final JSONArray f5749m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f5750n;

    /* renamed from: o, reason: collision with root package name */
    private final a.InterfaceC0023a f5751o;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            km.this.a(i10, str2);
            this.a.B().a("fetchMediatedAd", str, i10, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200) {
                km.this.a(i10, (String) null);
                this.a.B().a("fetchMediatedAd", str, i10);
            } else {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f4502m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f4502m.b());
                km.this.b(jSONObject);
            }
        }
    }

    public km(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0023a interfaceC0023a) {
        super("TaskFetchMediatedAd", kVar, str);
        this.f5744h = str;
        this.f5745i = maxAdFormat;
        this.f5746j = map;
        this.f5747k = map2;
        this.f5748l = map3;
        this.f5749m = jSONArray;
        this.f5750n = context;
        this.f5751o = interfaceC0023a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            c4.c(jSONObject, this.a);
            c4.b(jSONObject, this.a);
            c4.a(jSONObject, this.a);
            le.f(jSONObject, this.a);
            le.d(jSONObject, this.a);
            le.e(jSONObject, this.a);
            le.a(jSONObject);
            com.applovin.impl.sdk.e.b(this.a);
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            String str = "UNKNOWN";
            if (((Boolean) this.a.a(oj.f6702l6)).booleanValue()) {
                if (zp.a(this.f5745i, formatFromString)) {
                    a(jSONObject);
                    return;
                }
                if (formatFromString != null) {
                    str = formatFromString.getLabel();
                }
                String str2 = "Requested ad format " + this.f5745i.getLabel() + " is not compatible with received ad format " + str;
                com.applovin.impl.sdk.t.h(this.f9060b, str2);
                this.f5751o.onAdLoadFailed(this.f5744h, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str2));
                HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", this.f5744h);
                CollectionUtils.putStringIfValid("name", this.f5745i.getLabel(), hashMap);
                CollectionUtils.putStringIfValid("details", str, hashMap);
                this.a.B().a(o.b.INTEGRATION_ERROR, "incompatible_ad_format", (Map) hashMap);
                return;
            }
            if (this.f5745i != formatFromString) {
                if (formatFromString != null) {
                    str = formatFromString.getLabel();
                }
                com.applovin.impl.sdk.t.h(this.f9060b, "Ad format requested (" + this.f5745i.getLabel() + ") does not match ad format for ad unit id " + this.f5744h + " (" + str + ")");
            }
            a(jSONObject);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Unable to process mediated ad response for ad unit " + this.f5744h, th2);
            }
            throw new RuntimeException("Unable to process ad: " + th2);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.a.S().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && zp.f(com.applovin.impl.sdk.k.k())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.a.a(oj.M4)).booleanValue()) {
            te T = this.a.T();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            re reVar = re.f7355c;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) T.a(reVar, se.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) T.a(reVar, se.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) T.a(re.f7356d, se.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return le.a(this.a);
    }

    private String f() {
        return le.b(this.a);
    }

    private JSONObject g() {
        Map a10;
        if (this.a.y() != null) {
            a10 = this.a.y().a(null, false, true);
        } else {
            a10 = this.a.x().a(null, false, true);
        }
        a10.putAll(this.f5748l);
        JSONObject jSONObject = new JSONObject(a10);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.f5749m;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Fetching next ad for " + this.f5745i.getLabel() + " ad unit " + this.f5744h);
        }
        com.applovin.impl.sdk.r.a();
        if (((Boolean) this.a.a(oj.f6623b4)).booleanValue() && zp.j() && com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "User is connected to a VPN");
        }
        if (((Boolean) this.a.a(oj.M4)).booleanValue()) {
            te T = this.a.T();
            re reVar = re.f7355c;
            T.a(reVar, se.a(this.f5744h));
            T.a(reVar, se.a(this.f5745i));
        }
        ba F = this.a.F();
        F.c(aa.f3629s);
        aa aaVar = aa.f3617g;
        if (F.b(aaVar) == 0) {
            F.b(aaVar, System.currentTimeMillis());
        }
        try {
            JSONObject g10 = g();
            HashMap hashMap = new HashMap();
            if (!((Boolean) this.a.a(oj.f6799y5)).booleanValue() && !((Boolean) this.a.a(oj.f6784w5)).booleanValue()) {
                hashMap.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.a.a(oj.f6685j5)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0());
            }
            if (this.a.n0().c()) {
                hashMap.put("test_mode", "1");
            }
            List b3 = this.a.n0().b();
            String str = this.a.g0().getExtraParameters().get("fan");
            if (b3 != null && !b3.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = b3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                String sb3 = sb2.toString();
                hashMap.put("filter_ad_network", sb3);
                if (!this.a.n0().c()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.a.n0().d()) {
                    hashMap.put("force_ad_network", sb3);
                }
            } else if (StringUtils.isValidString(str)) {
                hashMap.put("filter_ad_network", str);
            }
            a(F);
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.a).c("POST").a(h()).b(f()).a(e()).b(hashMap).a(g10).b(((Boolean) this.a.a(qe.N7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.a.a(qe.L6)).intValue()).a(((Integer) this.a.a(oj.f6652f3)).intValue()).b(((Long) this.a.a(qe.K6)).intValue()).a(qi.a.a(((Integer) this.a.a(oj.f6733p5)).intValue())).f(true).a(), this.a);
            aVar.c(qe.I6);
            aVar.b(qe.J6);
            this.a.l0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Unable to fetch ad for ad unit " + this.f5744h, th2);
            }
            throw new RuntimeException("Unable to fetch ad: " + th2);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f5744h);
        jSONObject2.put("ad_format", this.f5745i.getLabel());
        Map map = CollectionUtils.map(this.f5747k);
        u.a a10 = this.a.V().a(this.f5744h);
        if (a10 != null) {
            if (Boolean.parseBoolean((String) a4.j.b(this.a, "esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", a10.a());
                map.put("previous_winning_network_name", a10.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", a10.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", a10.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.a.O().a()));
            jSONObject2.put("installed", ve.a(this.a));
            jSONObject2.put("initialized", this.a.N().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.a.N().a().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.a.O().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.a.O().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Failed to populate adapter classNames", e2);
            }
            throw new RuntimeException("Failed to populate classNames: " + e2);
        }
    }

    private void a(JSONObject jSONObject) {
        xl wmVar;
        if (this.a.a(qe.E7, this.f5745i)) {
            wmVar = new vm(this.f5744h, this.f5745i, this.f5746j, jSONObject, this.f5750n, this.a, this.f5751o);
        } else {
            wmVar = new wm(this.f5744h, this.f5745i, this.f5746j, jSONObject, this.f5750n, this.a, this.f5751o);
        }
        xl xlVar = wmVar;
        long j3 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j3 > 0) {
            this.a.l0().a(xlVar, sm.b.MEDIATION, j3, true);
        } else {
            this.a.l0().a(xlVar);
        }
    }

    private Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f5744h);
        hashMap.put("AppLovin-Ad-Format", this.f5745i.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.f5747k.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.f5747k.get("retry_delay_sec"), hashMap);
        return hashMap;
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

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.a.g0().getExtraParameters()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Unable to fetch ad for ad unit " + this.f5744h + ": server returned " + i10);
        }
        if (i10 == -800) {
            this.a.F().c(aa.f3630t);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else if (StringUtils.isValidString(str)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        bc.a(this.f5751o, this.f5744h, maxErrorImpl);
    }
}
