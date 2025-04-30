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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class be extends ke implements MaxAd {
    private final int l;
    private final AtomicBoolean m;

    /* renamed from: n */
    private final AtomicBoolean f6844n;

    /* renamed from: o */
    protected com.applovin.impl.mediation.g f6845o;

    /* renamed from: p */
    private final String f6846p;

    /* renamed from: q */
    private MaxAdWaterfallInfo f6847q;

    /* renamed from: r */
    private long f6848r;

    /* renamed from: s */
    private String f6849s;

    /* renamed from: t */
    private String f6850t;

    /* renamed from: u */
    private xc f6851u;

    public be(int i9, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, kVar);
        String str;
        this.m = new AtomicBoolean();
        this.f6844n = new AtomicBoolean();
        this.l = i9;
        this.f6845o = gVar;
        if (gVar != null) {
            str = gVar.b();
        } else {
            str = null;
        }
        this.f6846p = str;
    }

    private long K() {
        return a("load_started_time_ms", 0L);
    }

    public static be a(int i9, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new ce(i9, map, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new ee(i9, map, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new de(i9, map, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException(AbstractC2914a.d("Unsupported ad format: ", string));
    }

    public static /* synthetic */ JSONObject b(ql qlVar) {
        return JsonUtils.deepCopy(qlVar.a("ad_values", new JSONObject()));
    }

    public /* synthetic */ Bundle c(ql qlVar) {
        JSONObject a6;
        if (qlVar.a("credentials")) {
            a6 = qlVar.a("credentials", new JSONObject());
        } else {
            a6 = qlVar.a("server_parameters", new JSONObject());
            JsonUtils.putString(a6, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, S());
        }
        return JsonUtils.toBundle(a6);
    }

    public static /* synthetic */ xc d(ql qlVar) {
        return new xc(qlVar.a("hybrid_ad_config", (JSONObject) null));
    }

    public static /* synthetic */ JSONObject e(ql qlVar) {
        return JsonUtils.deepCopy(qlVar.a("publisher_extra_info", new JSONObject()));
    }

    public static /* synthetic */ Double f(ql qlVar) {
        return Double.valueOf(JsonUtils.getDouble(qlVar.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    public static /* synthetic */ JSONObject g(ql qlVar) {
        return JsonUtils.deepCopy(qlVar.a("revenue_parameters", new JSONObject()));
    }

    public static /* synthetic */ String h(ql qlVar) {
        return JsonUtils.getString(qlVar.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public static /* synthetic */ Double s(ql qlVar) {
        return f(qlVar);
    }

    public static /* synthetic */ xc t(ql qlVar) {
        return d(qlVar);
    }

    public static /* synthetic */ JSONObject u(ql qlVar) {
        return e(qlVar);
    }

    public static /* synthetic */ JSONObject v(ql qlVar) {
        return g(qlVar);
    }

    public static /* synthetic */ JSONObject w(ql qlVar) {
        return b(qlVar);
    }

    public static /* synthetic */ String x(ql qlVar) {
        return h(qlVar);
    }

    public static /* synthetic */ Bundle y(be beVar, ql qlVar) {
        return beVar.c(qlVar);
    }

    public String A() {
        return a("bcode", "");
    }

    public long B() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String C() {
        return a("bid_response", (String) null);
    }

    public long D() {
        return a("bwt_ms", ((Long) this.f8655a.a(qe.f10293F7)).longValue());
    }

    public Bundle E() {
        JSONObject a6;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return (Bundle) qlVar.a(new C(this, 5));
        }
        if (c("credentials")) {
            a6 = a("credentials", new JSONObject());
        } else {
            a6 = a("server_parameters", new JSONObject());
            JsonUtils.putString(a6, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, S());
        }
        return JsonUtils.toBundle(a6);
    }

    public long F() {
        if (K() > 0) {
            return J() - K();
        }
        return -1L;
    }

    public xc G() {
        xc xcVar = this.f6851u;
        if (xcVar != null) {
            return xcVar;
        }
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            this.f6851u = (xc) qlVar.a(new I(8));
        } else {
            this.f6851u = new xc(a("hybrid_ad_config", (JSONObject) null));
        }
        return this.f6851u;
    }

    public MaxAdFormat H() {
        String a6 = a("haf", (String) null);
        if (!StringUtils.isValidString(a6)) {
            return null;
        }
        return MaxAdFormat.formatFromString(a6);
    }

    public int I() {
        return this.l;
    }

    public long J() {
        return a("load_completed_time_ms", 0L);
    }

    public String L() {
        return this.f6849s;
    }

    public double M() {
        return a(BidResponsed.KEY_PRICE, -1.0f);
    }

    public JSONObject N() {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a(new I(6));
        }
        return a("publisher_extra_info", new JSONObject());
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", "");
    }

    public JSONObject P() {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a(new I(9));
        }
        return a("revenue_parameters", new JSONObject());
    }

    public String Q() {
        return b("event_id", "");
    }

    public long R() {
        return a("twt_ms", ((Long) this.f8655a.a(qe.f10295G7)).longValue());
    }

    public String S() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String U() {
        return b("waterfall_name", "");
    }

    public String V() {
        return b("waterfall_test_name", "");
    }

    public boolean W() {
        return StringUtils.isValidString(C());
    }

    public boolean X() {
        if (H() != null) {
            return true;
        }
        return false;
    }

    public boolean Y() {
        return a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public boolean Z() {
        com.applovin.impl.mediation.g gVar = this.f6845o;
        if (gVar == null || !gVar.k() || !this.f6845o.j()) {
            return false;
        }
        return true;
    }

    public abstract be a(com.applovin.impl.mediation.g gVar);

    public void a0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void b0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f6850t;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
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
        com.applovin.impl.mediation.g gVar = this.f6845o;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(S());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f6848r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.f8655a.a(qe.f10290C7)).booleanValue() && getFormat().isFullscreenAd() && !t().get()) {
            this.f8655a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f8655a.L().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
                return 0.0d;
            }
            return 0.0d;
        }
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return ((Double) qlVar.a(new I(10))).doubleValue();
        }
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return (String) qlVar.a(new I(11));
        }
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int a6 = a("ad_width", -3);
        int a9 = a("ad_height", -3);
        if (a6 != -3 && a9 != -3) {
            return new AppLovinSdkUtils.Size(a6, a9);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f6847q;
    }

    public void i(String str) {
        this.f6849s = str;
    }

    @Override // com.applovin.impl.ke
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + S() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public com.applovin.impl.mediation.g z() {
        return this.f6845o;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject w2 = w();
        if (w2.has(str)) {
            return JsonUtils.getString(w2, str, str2);
        }
        Bundle l = l();
        if (l.containsKey(str)) {
            return l.getString(str);
        }
        JSONObject N8 = N();
        if (N8.has(str)) {
            return JsonUtils.getString(N8, str, str2);
        }
        return a(str, str2);
    }

    public void s() {
        this.f6845o = null;
        this.f6847q = null;
    }

    public AtomicBoolean t() {
        return this.m;
    }

    public String u() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean v() {
        return this.f6844n;
    }

    public JSONObject w() {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return (JSONObject) qlVar.a(new I(7));
        }
        return a("ad_values", new JSONObject());
    }

    public View x() {
        com.applovin.impl.mediation.g gVar;
        if (!Z() || (gVar = this.f6845o) == null) {
            return null;
        }
        return gVar.d();
    }

    public String y() {
        return this.f6846p;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject N8 = N();
        JsonUtils.putAll(N8, jSONObject);
        a("publisher_extra_info", (Object) N8);
    }

    public void h(String str) {
        this.f6850t = str;
    }

    public void a(long j7) {
        this.f6848r = j7;
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f6847q = maxAdWaterfallInfo;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject w2 = w();
        JsonUtils.putAll(w2, jSONObject);
        a("ad_values", (Object) w2);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !c(CampaignEx.JSON_KEY_CREATIVE_ID)) {
            c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i9 = BundleUtils.getInt("ad_width", bundle);
            int i10 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i9);
            c("ad_height", i10);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
