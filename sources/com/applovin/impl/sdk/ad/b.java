package com.applovin.impl.sdk.ad;

import Q7.n0;
import U4.C0314j;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.c5;
import com.applovin.impl.ch;
import com.applovin.impl.ig;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.rq;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tr;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public abstract class b extends AppLovinAdImpl {

    /* renamed from: f */
    private final List f10742f;

    /* renamed from: g */
    private final AtomicBoolean f10743g;

    /* renamed from: h */
    private final AtomicBoolean f10744h;

    /* renamed from: i */
    private final AtomicReference f10745i;

    /* renamed from: j */
    private final Bundle f10746j;

    /* renamed from: k */
    private d f10747k;

    /* renamed from: com.applovin.impl.sdk.ad.b$b */
    /* loaded from: classes.dex */
    public enum EnumC0034b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: classes.dex */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        public final int f10754a;
        public final int b;

        /* renamed from: c */
        public final int f10755c;

        /* renamed from: d */
        public final int f10756d;

        /* renamed from: e */
        public final int f10757e;

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        private d() {
            this.f10754a = AppLovinSdkUtils.dpToPx(k.k(), b.this.m());
            this.b = AppLovinSdkUtils.dpToPx(k.k(), b.this.o());
            this.f10755c = AppLovinSdkUtils.dpToPx(k.k(), b.this.k());
            this.f10756d = AppLovinSdkUtils.dpToPx(k.k(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(oj.f9563C1)).intValue());
            this.f10757e = AppLovinSdkUtils.dpToPx(k.k(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(oj.f9556B1)).intValue());
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f10742f = CollectionUtils.synchronizedList();
        this.f10743g = new AtomicBoolean();
        this.f10744h = new AtomicBoolean();
        this.f10745i = new AtomicReference();
        this.f10746j = new Bundle();
    }

    public /* synthetic */ List a(ql qlVar) {
        return zp.a(qlVar.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List b(ql qlVar) {
        return zp.a(qlVar.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List g(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public static /* synthetic */ c5 h(ql qlVar) {
        JSONObject a6 = qlVar.a("custom_tabs_settings", (JSONObject) null);
        if (a6 != null) {
            return new c5(a6);
        }
        return null;
    }

    public /* synthetic */ List i(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List j(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public static /* synthetic */ Bundle k(ql qlVar) {
        return JsonUtils.toBundle(qlVar.a("ah_parameters", (JSONObject) null));
    }

    public /* synthetic */ List l(ql qlVar) {
        return zp.a(qlVar.a("imp_urls", new JSONObject()), getClCode(), null, null, Q(), Q0(), this.sdk);
    }

    public /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$1(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$2(InterfaceC2702a interfaceC2702a, ql qlVar) {
        return (List) interfaceC2702a.apply(qlVar.a("omid_verification_script_resources", (JSONArray) null));
    }

    public static /* synthetic */ Map m(ql qlVar) {
        try {
            return JsonUtils.toStringMap(qlVar.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static /* synthetic */ String n(ql qlVar) {
        return JsonUtils.getString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    public static /* synthetic */ String o(ql qlVar) {
        return JsonUtils.getString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    private String o0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject == null) {
            return null;
        }
        return stringFromAdObject.replace("{CLCODE}", getClCode());
    }

    public static /* synthetic */ String p(ql qlVar) {
        return JsonUtils.getString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_html_url", "");
    }

    public /* synthetic */ rq q(ql qlVar) {
        return new rq(qlVar.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    public /* synthetic */ List r(ql qlVar) {
        return zp.a(qlVar.a("video_end_urls", new JSONObject()), getClCode(), o0(), this.sdk);
    }

    public static /* synthetic */ m s(ql qlVar) {
        JSONObject a6 = qlVar.a("web_view_settings", (JSONObject) null);
        if (a6 != null) {
            return new m(a6);
        }
        return null;
    }

    public static /* synthetic */ Boolean t(ql qlVar) {
        return JsonUtils.getBoolean(qlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public static /* synthetic */ Boolean u(ql qlVar) {
        return JsonUtils.getBoolean(qlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_url_contents", Boolean.FALSE);
    }

    public static /* synthetic */ Boolean v(ql qlVar) {
        return JsonUtils.getBoolean(qlVar.a("video_button_properties", (JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE);
    }

    public boolean A0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean B0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean C0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public AtomicBoolean D0() {
        return this.f10743g;
    }

    public boolean E0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(oj.f9840r2));
    }

    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public abstract boolean G0();

    public boolean H0() {
        boolean z8;
        if (!zp.h(k.k()) && !zp.f(k.k()) && !((Boolean) this.sdk.a(oj.f9814n6)).booleanValue()) {
            z8 = false;
        } else {
            z8 = true;
        }
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(z8));
    }

    public boolean I0() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public abstract void J0();

    public boolean K0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean L0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(oj.f9844r6));
    }

    public boolean M0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return ((Boolean) qlVar.a(new A4.a(23))).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public boolean N0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return ((Boolean) qlVar.a(new A4.a(24))).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_url_contents", Boolean.FALSE).booleanValue();
    }

    public boolean O0() {
        return this.f10744h.get();
    }

    public abstract String P();

    public boolean P0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean Q0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public boolean R0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean S0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public boolean T0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public boolean U0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public int V() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean V0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public List W() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return Collections.emptyList();
    }

    public boolean W0() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public List X() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return this.sdk.c(oj.f9716Z0);
    }

    public boolean X0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return ((Boolean) qlVar.a(new g(0))).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE).booleanValue();
    }

    public String Y() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public boolean Y0() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String Z() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public boolean Z0() {
        boolean z8;
        if (AppLovinAdType.AUTO_INCENTIVIZED == getType()) {
            z8 = true;
        } else {
            z8 = false;
        }
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(z8));
    }

    public String a0() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public boolean a1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public e.a b0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        if (intFromAdObject == -1) {
            return n();
        }
        return a(intFromAdObject);
    }

    public boolean b1() {
        String str = (String) n0.d(this.sdk, "should_use_exoplayer_if_available");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    public List c0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean c1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public c d0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        if ("ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_LANDSCAPE;
        }
        return cVar;
    }

    public Uri e0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public ch f() {
        return (ch) this.f10745i.getAndSet(null);
    }

    public String f0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a(new A4.a(26));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public String g0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a(new g(2));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public abstract ig getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (Bundle) qlVar.a(new g(1));
        }
        return JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public List getOpenMeasurementVerificationScriptResources() {
        List lambda$getOpenMeasurementVerificationScriptResources$1;
        com.applovin.impl.sdk.ad.e eVar = new com.applovin.impl.sdk.ad.e(this, 9);
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new F2.d(eVar, 10));
        }
        synchronized (this.adObjectLock) {
            lambda$getOpenMeasurementVerificationScriptResources$1 = lambda$getOpenMeasurementVerificationScriptResources$1(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return lambda$getOpenMeasurementVerificationScriptResources$1;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public String h0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a(new A4.a(28));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html_url", "");
    }

    public rq i0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (rq) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 0));
        }
        return new rq(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public abstract boolean isOpenMeasurementEnabled();

    public abstract Uri j();

    public abstract Uri j0();

    public long k0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long l0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public int m0() {
        return zp.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public List n0() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 2));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), o0(), this.sdk);
        }
        return a6;
    }

    public e p0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if ("top".equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if (TtmlNode.LEFT.equals(stringFromAdObject)) {
            return e.LEFT;
        }
        if (TtmlNode.RIGHT.equals(stringFromAdObject)) {
            return e.RIGHT;
        }
        return e.RESIZE_ASPECT;
    }

    public int q0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean r0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri s0();

    public int t0() {
        int i9;
        if (zp.a(getSize())) {
            i9 = 1;
        } else if (((Boolean) this.sdk.a(oj.f9674S5)).booleanValue()) {
            i9 = 0;
        } else {
            i9 = -1;
        }
        return getIntFromAdObject("whalt", i9);
    }

    public m u0() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (m) qlVar.a(new A4.a(25));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject == null) {
            return null;
        }
        return new m(jsonObjectFromAdObject);
    }

    public List v0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List w() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 6));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public List w0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public boolean x0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(oj.f9714Y5));
    }

    public boolean y0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(oj.f9751e2));
    }

    public boolean z0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    private List J() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    public /* synthetic */ Map c(ql qlVar) {
        try {
            return JsonUtils.toStringMap(qlVar.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e4) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e4);
            }
            return new HashMap();
        }
    }

    public /* synthetic */ List d(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List e(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List f(ql qlVar) {
        return zp.a(qlVar.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List A() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public boolean B() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public int C() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int D() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int E() {
        return zp.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public List F() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 3));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, Q(), Q0(), this.sdk);
        }
        return a6;
    }

    public boolean G() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String H() {
        return getStringFromFullResponse("event_id", null);
    }

    public List I() {
        List J8 = J();
        if (J8 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(J8.size());
        Iterator it = J8.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public List K() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public Uri L() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public String M() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public String N() {
        return getStringFromAdObject("nia_message", "");
    }

    public String O() {
        return getStringFromAdObject("nia_title", "");
    }

    public Map Q() {
        Map<String, String> stringMap;
        HashMap hashMap = new HashMap();
        try {
            ql qlVar = this.synchronizedAdObject;
            if (qlVar != null) {
                stringMap = (Map) qlVar.a(new A4.a(27));
            } else {
                stringMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject()));
            }
            hashMap.putAll(stringMap);
        } catch (JSONException e4) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a("DirectAd", "Failed to retrieve http headers for postbacks", e4);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put(Command.HTTP_HEADER_USER_AGENT, tr.a());
        }
        return hashMap;
    }

    public EnumC0034b R() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0034b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0034b.DO_NOT_DISMISS;
            }
        }
        return EnumC0034b.UNSPECIFIED;
    }

    public int S() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public long T() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public long U() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public c5 x() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (c5) qlVar.a(new A4.a(29));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new c5(jsonObjectFromAdObject);
        }
        return null;
    }

    public List y() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 8));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public List z() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 10));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public /* synthetic */ List a(MotionEvent motionEvent, boolean z8, boolean z9, ql qlVar) {
        return zp.a(qlVar.a("click_tracking_urls", new JSONObject()), a(motionEvent, z8, z9), c(motionEvent, z8, z9), Q(), Q0(), this.sdk);
    }

    public List g() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 7));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public String h() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public List i() {
        return this.f10742f;
    }

    public int k() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(oj.f9757f2)).intValue());
    }

    public d l() {
        if (this.f10747k == null) {
            this.f10747k = new d();
        }
        return this.f10747k;
    }

    public int m() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(oj.f9765g2)).intValue());
    }

    public e.a n() {
        List J8 = J();
        int intFromAdObject = getIntFromAdObject("close_style", (J8 == null || J8.size() <= 0) ? -1 : ((Integer) J8.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int o() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(oj.f9772h2)).intValue());
    }

    public long p() {
        List K5 = K();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (K5 == null || K5.size() <= 0) ? 0L : ((Integer) K5.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public int q() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int r() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public Bundle s() {
        Map hashMap;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            hashMap = (Map) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 4));
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e4) {
                this.sdk.L();
                if (t.a()) {
                    this.sdk.L().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e4);
                }
                hashMap = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString(Command.HTTP_HEADER_USER_AGENT, tr.a());
        }
        return bundle;
    }

    public List t() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 12));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public List u() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 1));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public List v() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 11));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public void b(boolean z8) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a("html_resources_cached", z8);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z8);
        }
    }

    public long d() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public Bundle e() {
        return this.f10746j;
    }

    public List c() {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new com.applovin.impl.sdk.ad.e(this, 5));
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a6;
    }

    public List d(MotionEvent motionEvent, boolean z8, boolean z9) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map a6 = a(motionEvent, z8, z9);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(StringUtils.replace(it.next(), a6));
        }
        return arrayList;
    }

    public /* synthetic */ List a(MotionEvent motionEvent, boolean z8, ql qlVar) {
        return zp.a(qlVar.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z8), null, Q(), Q0(), this.sdk);
    }

    public List b(final MotionEvent motionEvent, final boolean z8, final boolean z9) {
        List a6;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a(new InterfaceC2702a() { // from class: com.applovin.impl.sdk.ad.f
                @Override // t.InterfaceC2702a
                public final Object apply(Object obj) {
                    List a9;
                    MotionEvent motionEvent2 = motionEvent;
                    boolean z10 = z8;
                    a9 = b.this.a(motionEvent2, z10, z9, (ql) obj);
                    return a9;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a6 = zp.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z8, z9), c(motionEvent, z8, z9), Q(), Q0(), this.sdk);
        }
        return a6;
    }

    public static /* synthetic */ void a(String str, ql qlVar) {
        JsonUtils.putString(qlVar.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    private String c(MotionEvent motionEvent, boolean z8, boolean z9) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map a6 = a(motionEvent, z8, z9);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a6);
        }
        return null;
    }

    public void a(ch chVar) {
        this.f10745i.set(chVar);
    }

    public void c(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public void a(Uri uri) {
        this.f10742f.add(uri);
    }

    public void a(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.a(new com.applovin.impl.sdk.ad.d(str, 1));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public void b(Uri uri) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public List a(MotionEvent motionEvent, boolean z8) {
        List a6;
        List list;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            list = (List) qlVar.a(new C0314j(this, motionEvent, z8));
        } else {
            synchronized (this.adObjectLock) {
                a6 = zp.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z8), null, Q(), Q0(), this.sdk);
            }
            list = a6;
        }
        return list.isEmpty() ? b(motionEvent, true, z8) : list;
    }

    public void b() {
        this.f10744h.set(true);
    }

    private Map a(MotionEvent motionEvent, boolean z8, boolean z9) {
        Point b = x3.b(k.k());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        hashMap.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z8));
        hashMap.put("{IS_INSTALL}", String.valueOf(z9));
        return hashMap;
    }

    private e.a a(boolean z8) {
        return z8 ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    public e.a a(int i9) {
        if (i9 == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i9 == 2) {
            return e.a.INVISIBLE;
        }
        if (i9 == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
