package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.C0753e;
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
    private final String f8725h;

    /* renamed from: i, reason: collision with root package name */
    private final MaxAdFormat f8726i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f8727j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f8728k;
    private final Map l;
    private final JSONArray m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f8729n;

    /* renamed from: o, reason: collision with root package name */
    private final a.InterfaceC0023a f8730o;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            km.this.a(i9, str2);
            this.f12278a.B().a("fetchMediatedAd", str, i9, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            if (i9 != 200) {
                km.this.a(i9, (String) null);
                this.f12278a.B().a("fetchMediatedAd", str, i9);
            } else {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.m.b());
                km.this.b(jSONObject);
            }
        }
    }

    public km(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0023a interfaceC0023a) {
        super("TaskFetchMediatedAd", kVar, str);
        this.f8725h = str;
        this.f8726i = maxAdFormat;
        this.f8727j = map;
        this.f8728k = map2;
        this.l = map3;
        this.m = jSONArray;
        this.f8729n = context;
        this.f8730o = interfaceC0023a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            c4.c(jSONObject, this.f12278a);
            c4.b(jSONObject, this.f12278a);
            c4.a(jSONObject, this.f12278a);
            le.f(jSONObject, this.f12278a);
            le.d(jSONObject, this.f12278a);
            le.e(jSONObject, this.f12278a);
            le.a(jSONObject);
            C0753e.b(this.f12278a);
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            String str = "UNKNOWN";
            if (((Boolean) this.f12278a.a(oj.l6)).booleanValue()) {
                if (zp.a(this.f8726i, formatFromString)) {
                    a(jSONObject);
                    return;
                }
                if (formatFromString != null) {
                    str = formatFromString.getLabel();
                }
                String str2 = "Requested ad format " + this.f8726i.getLabel() + " is not compatible with received ad format " + str;
                com.applovin.impl.sdk.t.h(this.b, str2);
                this.f8730o.onAdLoadFailed(this.f8725h, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str2));
                HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", this.f8725h);
                CollectionUtils.putStringIfValid("name", this.f8726i.getLabel(), hashMap);
                CollectionUtils.putStringIfValid("details", str, hashMap);
                this.f12278a.B().a(o.b.INTEGRATION_ERROR, "incompatible_ad_format", (Map) hashMap);
                return;
            }
            if (this.f8726i != formatFromString) {
                if (formatFromString != null) {
                    str = formatFromString.getLabel();
                }
                com.applovin.impl.sdk.t.h(this.b, "Ad format requested (" + this.f8726i.getLabel() + ") does not match ad format for ad unit id " + this.f8725h + " (" + str + ")");
            }
            a(jSONObject);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Unable to process mediated ad response for ad unit " + this.f8725h, th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f12278a.S().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && zp.f(com.applovin.impl.sdk.k.k())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f12278a.a(oj.f9634M4)).booleanValue()) {
            te T2 = this.f12278a.T();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            re reVar = re.f10488c;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) T2.a(reVar, se.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) T2.a(reVar, se.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) T2.a(re.f10489d, se.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return le.a(this.f12278a);
    }

    private String f() {
        return le.b(this.f12278a);
    }

    private JSONObject g() {
        Map a6;
        if (this.f12278a.y() != null) {
            a6 = this.f12278a.y().a(null, false, true);
        } else {
            a6 = this.f12278a.x().a(null, false, true);
        }
        a6.putAll(this.l);
        JSONObject jSONObject = new JSONObject(a6);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.m;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Fetching next ad for " + this.f8726i.getLabel() + " ad unit " + this.f8725h);
        }
        com.applovin.impl.sdk.r.a();
        if (((Boolean) this.f12278a.a(oj.f9731b4)).booleanValue() && zp.j() && com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "User is connected to a VPN");
        }
        if (((Boolean) this.f12278a.a(oj.f9634M4)).booleanValue()) {
            te T2 = this.f12278a.T();
            re reVar = re.f10488c;
            T2.a(reVar, se.a(this.f8725h));
            T2.a(reVar, se.a(this.f8726i));
        }
        ba F4 = this.f12278a.F();
        F4.c(aa.f6609s);
        aa aaVar = aa.f6599g;
        if (F4.b(aaVar) == 0) {
            F4.b(aaVar, System.currentTimeMillis());
        }
        try {
            JSONObject g9 = g();
            HashMap hashMap = new HashMap();
            if (!((Boolean) this.f12278a.a(oj.f9892y5)).booleanValue() && !((Boolean) this.f12278a.a(oj.f9877w5)).booleanValue()) {
                hashMap.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f12278a.a(oj.f9790j5)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f12278a.d0());
            }
            if (this.f12278a.n0().c()) {
                hashMap.put("test_mode", "1");
            }
            List b = this.f12278a.n0().b();
            String str = this.f12278a.g0().getExtraParameters().get("fan");
            if (b != null && !b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = b.iterator();
                if (it.hasNext()) {
                    CharSequence charSequence = (CharSequence) it.next();
                    while (true) {
                        sb.append(charSequence);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                        charSequence = (CharSequence) it.next();
                    }
                }
                String sb2 = sb.toString();
                hashMap.put("filter_ad_network", sb2);
                if (!this.f12278a.n0().c()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f12278a.n0().d()) {
                    hashMap.put("force_ad_network", sb2);
                }
            } else if (StringUtils.isValidString(str)) {
                hashMap.put("filter_ad_network", str);
            }
            a(F4);
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f12278a).c("POST").a(h()).b(f()).a(e()).b(hashMap).a(g9).b(((Boolean) this.f12278a.a(qe.f10308N7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f12278a.a(qe.f10303L6)).intValue()).a(((Integer) this.f12278a.a(oj.f9758f3)).intValue()).b(((Long) this.f12278a.a(qe.f10301K6)).intValue()).a(qi.a.a(((Integer) this.f12278a.a(oj.f9827p5)).intValue())).f(true).a(), this.f12278a);
            aVar.c(qe.f10298I6);
            aVar.b(qe.f10299J6);
            this.f12278a.l0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Unable to fetch ad for ad unit " + this.f8725h, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f8725h);
        jSONObject2.put("ad_format", this.f8726i.getLabel());
        Map map = CollectionUtils.map(this.f8728k);
        u.a a6 = this.f12278a.V().a(this.f8725h);
        if (a6 != null) {
            if (Boolean.parseBoolean((String) Q7.n0.d(this.f12278a, "esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", a6.a());
                map.put("previous_winning_network_name", a6.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", a6.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", a6.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f12278a.O().a()));
            jSONObject2.put("installed", ve.a(this.f12278a));
            jSONObject2.put("initialized", this.f12278a.N().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f12278a.N().a().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f12278a.O().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f12278a.O().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e4) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Failed to populate adapter classNames", e4);
            }
            throw new RuntimeException("Failed to populate classNames: " + e4);
        }
    }

    private void a(JSONObject jSONObject) {
        xl wmVar;
        if (this.f12278a.a(qe.f10292E7, this.f8726i)) {
            wmVar = new vm(this.f8725h, this.f8726i, this.f8727j, jSONObject, this.f8729n, this.f12278a, this.f8730o);
        } else {
            wmVar = new wm(this.f8725h, this.f8726i, this.f8727j, jSONObject, this.f8729n, this.f12278a, this.f8730o);
        }
        xl xlVar = wmVar;
        long j7 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j7 > 0) {
            this.f12278a.l0().a(xlVar, sm.b.MEDIATION, j7, true);
        } else {
            this.f12278a.l0().a(xlVar);
        }
    }

    private Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f8725h);
        hashMap.put("AppLovin-Ad-Format", this.f8726i.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.f8728k.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.f8728k.get("retry_delay_sec"), hashMap);
        return hashMap;
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

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f12278a.g0().getExtraParameters()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i9, String str) {
        MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Unable to fetch ad for ad unit " + this.f8725h + ": server returned " + i9);
        }
        if (i9 == -800) {
            this.f12278a.F().c(aa.f6610t);
        }
        if (i9 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i9 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else if (StringUtils.isValidString(str)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        bc.a(this.f8730o, this.f8725h, maxErrorImpl);
    }
}
