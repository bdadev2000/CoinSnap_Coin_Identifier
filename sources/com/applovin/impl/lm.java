package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.impl.vi;
import com.applovin.impl.xe;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.facebook.appevents.AppEventsConstants;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lm extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final String f25100h;

    /* renamed from: i, reason: collision with root package name */
    private final MaxAdFormat f25101i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f25102j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f25103k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f25104l;

    /* renamed from: m, reason: collision with root package name */
    private final JSONArray f25105m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f25106n;

    /* renamed from: o, reason: collision with root package name */
    private final a.InterfaceC0085a f25107o;

    /* loaded from: classes.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            lm.this.a(str, i2, str2);
            this.f28216a.E().a("fetchMediatedAd", str, i2, CollectionUtils.hashMap("error_message", str2));
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (i2 != 200) {
                lm.this.a(str, i2, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f23515m.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f23515m.b());
            HashMap hashMap = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
            CollectionUtils.putStringIfValid("code", String.valueOf(i2), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", lm.this.f25100h, hashMap);
            CollectionUtils.putStringIfValid("ad_format", lm.this.f25101i.getLabel(), hashMap);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f23515m.a()), hashMap);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f23515m.b()), hashMap);
            this.f28216a.E().a(la.f25021s, (Map) hashMap);
            lm.this.b(jSONObject);
        }
    }

    public lm(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, com.applovin.impl.sdk.j jVar, a.InterfaceC0085a interfaceC0085a) {
        super("TaskFetchMediatedAd", jVar, str);
        this.f25100h = str;
        this.f25101i = maxAdFormat;
        this.f25102j = map;
        this.f25103k = map2;
        this.f25104l = map3;
        this.f25105m = jSONArray;
        this.f25106n = context;
        this.f25107o = interfaceC0085a;
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f28216a.Q().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !yp.f(com.applovin.impl.sdk.j.l())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f28216a.a(sj.Q4)).booleanValue()) {
            ye R = this.f28216a.R();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            we weVar = we.f27719c;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) R.a(weVar, xe.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) R.a(weVar, xe.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) R.a(we.d, xe.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return qe.a(this.f28216a);
    }

    private String f() {
        return qe.b(this.f28216a);
    }

    private JSONObject g() {
        Map a2 = this.f28216a.y().a(null, false, true);
        a2.putAll(this.f25104l);
        JSONObject jSONObject = new JSONObject(a2);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.f25105m;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Fetching next ad for " + this.f25101i.getLabel() + " ad unit " + this.f25100h);
        }
        pb.a();
        if (((Boolean) this.f28216a.a(sj.h4)).booleanValue() && yp.j() && com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "User is connected to a VPN");
        }
        this.f28216a.E().a(la.f25020r, this.f25101i, this.f25100h, (MaxError) null);
        if (((Boolean) this.f28216a.a(sj.Q4)).booleanValue()) {
            ye R = this.f28216a.R();
            we weVar = we.f27719c;
            R.a(weVar, xe.a(this.f25100h));
            R.a(weVar, xe.a(this.f25101i));
        }
        yp.a(this.f28216a, this.f28217b);
        da D = this.f28216a.D();
        D.c(ca.f23255s);
        ca caVar = ca.f23243g;
        if (D.b(caVar) == 0) {
            D.b(caVar, System.currentTimeMillis());
        }
        try {
            JSONObject g2 = g();
            HashMap hashMap = new HashMap();
            if (!((Boolean) this.f28216a.a(sj.D5)).booleanValue() && !((Boolean) this.f28216a.a(sj.B5)).booleanValue()) {
                hashMap.put(ImpressionLog.x, UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f28216a.a(sj.o5)).booleanValue()) {
                hashMap.put("sdk_key", this.f28216a.b0());
            }
            if (this.f28216a.l0().c()) {
                hashMap.put("test_mode", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            List b2 = this.f28216a.l0().b();
            String str = this.f28216a.g0().getExtraParameters().get("fan");
            if (b2 != null && !b2.isEmpty()) {
                String join = String.join(",", b2);
                hashMap.put("filter_ad_network", join);
                if (!this.f28216a.l0().c()) {
                    hashMap.put("fhkZsVqYC7", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                }
                if (this.f28216a.l0().d()) {
                    hashMap.put("force_ad_network", join);
                }
            } else if (StringUtils.isValidString(str)) {
                hashMap.put("filter_ad_network", str);
            }
            a(D);
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f28216a).c(com.safedk.android.a.g.f29074c).a(h()).b(f()).a(e()).b(hashMap).a(g2).b(((Boolean) this.f28216a.a(ve.c8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f28216a.a(ve.U6)).intValue()).a(((Integer) this.f28216a.a(sj.o3)).intValue()).b(((Long) this.f28216a.a(ve.T6)).intValue()).a(vi.a.a(((Integer) this.f28216a.a(sj.u5)).intValue())).f(true).a(), this.f28216a);
            aVar.c(ve.R6);
            aVar.b(ve.S6);
            this.f28216a.j0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Unable to fetch ad for Ad Unit ID: " + this.f25100h, th);
            }
            a("", 0, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            e4.c(jSONObject, this.f28216a);
            e4.b(jSONObject, this.f28216a);
            e4.a(jSONObject, this.f28216a);
            qe.f(jSONObject, this.f28216a);
            qe.d(jSONObject, this.f28216a);
            qe.e(jSONObject, this.f28216a);
            qe.g(jSONObject, this.f28216a);
            u0.b(this.f28216a);
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (this.f25101i == formatFromString) {
                a(jSONObject);
                return;
            }
            String label = formatFromString != null ? formatFromString.getLabel() : "UNKNOWN";
            String str = "Incorrect format (" + label + ") loaded for (" + this.f25101i.getLabel() + ") ad. Please verify if the ad unit ID (" + this.f25100h + ") is assigned to the correct ad format.";
            if (yp.a(this.f25101i, formatFromString)) {
                com.applovin.impl.sdk.n.j(this.f28217b, str);
                a(jSONObject);
                return;
            }
            q6.a(str, new Object[0]);
            com.applovin.impl.sdk.n.h(this.f28217b, str);
            this.f25107o.onAdLoadFailed(this.f25100h, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", this.f25100h);
            CollectionUtils.putStringIfValid("name", this.f25101i.getLabel(), hashMap);
            CollectionUtils.putStringIfValid("details", label, hashMap);
            this.f28216a.E().a(la.L, "incompatible_ad_format", (Map) hashMap);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Unable to process mediated ad response for ad unit " + this.f25100h, th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f25100h);
        jSONObject2.put("ad_format", this.f25101i.getLabel());
        Map map = CollectionUtils.map(this.f25103k);
        com.applovin.impl.sdk.o T = this.f28216a.T();
        CollectionUtils.putStringIfValid("previous_request_id", T.b(this.f25100h), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", T.a(this.f25100h), map);
        o.a c2 = T.c(this.f25100h);
        if (c2 != null) {
            if (Boolean.parseBoolean(this.f28216a.g0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", c2.a());
                map.put("previous_winning_network_name", c2.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", c2.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", c2.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f28216a.M().a()));
            jSONObject2.put("installed", af.a(this.f28216a));
            jSONObject2.put("initialized", this.f28216a.L().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f28216a.L().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f28216a.M().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f28216a.M().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f25100h);
        hashMap.put("AppLovin-Ad-Format", this.f25101i.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.f25103k.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.f25103k.get("retry_delay_sec"), hashMap);
        return hashMap;
    }

    private void a(JSONObject jSONObject) {
        yl xmVar;
        if (this.f28216a.a(ve.P7, this.f25101i)) {
            xmVar = new wm(this.f25100h, this.f25101i, this.f25102j, jSONObject, this.f25106n, this.f28216a, this.f25107o);
        } else {
            xmVar = new xm(this.f25100h, this.f25101i, this.f25102j, jSONObject, this.f25106n, this.f28216a, this.f25107o);
        }
        yl ylVar = xmVar;
        long j2 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j2 > 0) {
            this.f28216a.j0().a(ylVar, tm.b.MEDIATION, j2, true);
        } else {
            this.f28216a.j0().a(ylVar);
        }
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

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f28216a.g0().getExtraParameters()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2, String str2) {
        MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Unable to fetch ad for ad unit " + this.f25100h + ": server returned " + i2);
        }
        if (i2 == -800) {
            this.f28216a.D().c(ca.f23256t);
        }
        if (i2 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i2 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
        CollectionUtils.putStringIfValid("code", String.valueOf(i2), hashMap);
        CollectionUtils.putStringIfValid("error_message", str2, hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", this.f25100h, hashMap);
        CollectionUtils.putStringIfValid("ad_format", this.f25101i.getLabel(), hashMap);
        this.f28216a.E().a(la.f25022t, (Map) hashMap);
        gc.a(this.f25107o, this.f25100h, maxErrorImpl);
    }
}
