package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ge extends pe implements MaxAd {

    /* renamed from: l */
    private final int f24087l;

    /* renamed from: m */
    private final AtomicBoolean f24088m;

    /* renamed from: n */
    private final AtomicBoolean f24089n;

    /* renamed from: o */
    protected com.applovin.impl.mediation.g f24090o;

    /* renamed from: p */
    private final String f24091p;

    /* renamed from: q */
    private MaxAdWaterfallInfo f24092q;

    /* renamed from: r */
    private long f24093r;

    /* renamed from: s */
    private String f24094s;

    /* renamed from: t */
    private String f24095t;

    /* renamed from: u */
    private cd f24096u;

    public ge(int i2, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(map, jSONObject, jSONObject2, jVar);
        this.f24088m = new AtomicBoolean();
        this.f24089n = new AtomicBoolean();
        this.f24087l = i2;
        this.f24090o = gVar;
        this.f24091p = gVar != null ? gVar.b() : null;
    }

    private long L() {
        return a("load_started_time_ms", 0L);
    }

    public static /* synthetic */ JSONObject b(tl tlVar) {
        return JsonUtils.deepCopy(tlVar.a("ad_values", new JSONObject()));
    }

    public /* synthetic */ Bundle c(tl tlVar) {
        JSONObject a2;
        if (tlVar.a("credentials")) {
            a2 = tlVar.a("credentials", new JSONObject());
        } else {
            a2 = tlVar.a("server_parameters", new JSONObject());
            JsonUtils.putString(a2, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, U());
        }
        return JsonUtils.toBundle(a2);
    }

    public static /* synthetic */ cd d(tl tlVar) {
        return new cd(tlVar.a("hybrid_ad_config", (JSONObject) null));
    }

    public static /* synthetic */ JSONObject e(tl tlVar) {
        return JsonUtils.deepCopy(tlVar.a("publisher_extra_info", new JSONObject()));
    }

    public static /* synthetic */ Double f(tl tlVar) {
        return Double.valueOf(JsonUtils.getDouble(tlVar.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    public static /* synthetic */ JSONObject g(tl tlVar) {
        return JsonUtils.deepCopy(tlVar.a("revenue_parameters", new JSONObject()));
    }

    public static /* synthetic */ JSONObject t(tl tlVar) {
        return g(tlVar);
    }

    public static /* synthetic */ JSONObject u(tl tlVar) {
        return b(tlVar);
    }

    public static /* synthetic */ JSONObject v(tl tlVar) {
        return e(tlVar);
    }

    public static /* synthetic */ String w(tl tlVar) {
        return h(tlVar);
    }

    public static /* synthetic */ Double x(tl tlVar) {
        return f(tlVar);
    }

    public static /* synthetic */ cd y(tl tlVar) {
        return d(tlVar);
    }

    public static /* synthetic */ Bundle z(ge geVar, tl tlVar) {
        return geVar.c(tlVar);
    }

    public com.applovin.impl.mediation.g A() {
        return this.f24090o;
    }

    public String B() {
        return a("bcode", "");
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public long E() {
        return a("bwt_ms", ((Long) this.f26025a.a(ve.Q7)).longValue());
    }

    public Bundle F() {
        JSONObject a2;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return (Bundle) tlVar.a(new is(this, 8));
        }
        if (c("credentials")) {
            a2 = a("credentials", new JSONObject());
        } else {
            a2 = a("server_parameters", new JSONObject());
            JsonUtils.putString(a2, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, U());
        }
        return JsonUtils.toBundle(a2);
    }

    public long G() {
        if (L() > 0) {
            return K() - L();
        }
        return -1L;
    }

    public cd H() {
        cd cdVar = this.f24096u;
        if (cdVar != null) {
            return cdVar;
        }
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            this.f24096u = (cd) tlVar.a(new rs(16));
        } else {
            this.f24096u = new cd(a("hybrid_ad_config", (JSONObject) null));
        }
        return this.f24096u;
    }

    public MaxAdFormat I() {
        String a2 = a("haf", (String) null);
        if (StringUtils.isValidString(a2)) {
            return MaxAdFormat.formatFromString(a2);
        }
        return null;
    }

    public int J() {
        return this.f24087l;
    }

    public long K() {
        return a("load_completed_time_ms", 0L);
    }

    public String M() {
        return this.f24094s;
    }

    public int N() {
        return a("mwalra", ((Integer) this.f26025a.a(ve.I7)).intValue());
    }

    public double O() {
        return a(FirebaseAnalytics.Param.PRICE, -1.0f);
    }

    public JSONObject P() {
        tl tlVar = this.f26031i;
        return tlVar != null ? (JSONObject) tlVar.a(new rs(18)) : a("publisher_extra_info", new JSONObject());
    }

    public String Q() {
        return JsonUtils.getString(R(), "revenue_event", "");
    }

    public JSONObject R() {
        tl tlVar = this.f26031i;
        return tlVar != null ? (JSONObject) tlVar.a(new rs(15)) : a("revenue_parameters", new JSONObject());
    }

    public String S() {
        return b("event_id", "");
    }

    public long T() {
        return a("twt_ms", ((Long) this.f26025a.a(ve.R7)).longValue());
    }

    public String U() {
        return a(BrandSafetyEvent.f29784k, (String) null);
    }

    public long V() {
        return a("walrad_ms", ((Long) this.f26025a.a(ve.J7)).longValue());
    }

    public List W() {
        return b("mwf_info_urls");
    }

    public String X() {
        return b("waterfall_name", "");
    }

    public String Y() {
        return b("waterfall_test_name", "");
    }

    public boolean Z() {
        return StringUtils.isValidString(D());
    }

    public abstract ge a(com.applovin.impl.mediation.g gVar);

    public void a(long j2) {
        this.f24093r = j2;
    }

    public boolean a0() {
        return I() != null;
    }

    public boolean b0() {
        return a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        com.applovin.impl.mediation.g gVar = this.f24090o;
        return gVar != null && gVar.k() && this.f24090o.j();
    }

    public boolean d0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean e0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void f0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void g0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f24095t;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.f24090o;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a(BrandSafetyEvent.ad, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f24093r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f26025a.a(ve.N7)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            tl tlVar = this.f26031i;
            return tlVar != null ? ((Double) tlVar.a(new rs(14))).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f26025a.J();
        if (!com.applovin.impl.sdk.n.a()) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        this.f26025a.J().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        tl tlVar = this.f26031i;
        return tlVar != null ? (String) tlVar.a(new rs(17)) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int a2 = a("ad_width", -3);
        int a3 = a("ad_height", -3);
        return (a2 == -3 || a3 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(a2, a3);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f24092q;
    }

    public void h(String str) {
        this.f24095t = str;
    }

    public void i(String str) {
        this.f24094s = str;
    }

    @Override // com.applovin.impl.pe
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public static /* synthetic */ String h(tl tlVar) {
        return JsonUtils.getString(tlVar.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f24092q = maxAdWaterfallInfo;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject x = x();
        if (x.has(str)) {
            return JsonUtils.getString(x, str, str2);
        }
        Bundle l2 = l();
        if (l2.containsKey(str)) {
            return l2.getString(str);
        }
        JSONObject P = P();
        if (P.has(str)) {
            return JsonUtils.getString(P, str, str2);
        }
        return a(str, str2);
    }

    public void t() {
        this.f24090o = null;
        this.f24092q = null;
    }

    public AtomicBoolean u() {
        return this.f24088m;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f24089n;
    }

    public JSONObject x() {
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return (JSONObject) tlVar.a(new rs(19));
        }
        return a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.g gVar;
        if (!c0() || (gVar = this.f24090o) == null) {
            return null;
        }
        return gVar.d();
    }

    public String z() {
        return this.f24091p;
    }

    public static ge a(int i2, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new he(i2, map, jSONObject, jSONObject2, jVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new je(i2, map, jSONObject, jSONObject2, jVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new ie(i2, map, jSONObject, jSONObject2, jVar);
        }
        throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Unsupported ad format: ", string));
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject P = P();
        JsonUtils.putAll(P, jSONObject);
        a("publisher_extra_info", (Object) P);
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject x = x();
        JsonUtils.putAll(x, jSONObject);
        a("ad_values", (Object) x);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i2 = BundleUtils.getInt("ad_width", bundle);
            int i3 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i2);
            c("ad_height", i3);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
