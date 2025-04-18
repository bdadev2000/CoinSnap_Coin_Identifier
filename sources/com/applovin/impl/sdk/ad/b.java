package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.e5;
import com.applovin.impl.fh;
import com.applovin.impl.mg;
import com.applovin.impl.qq;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sr;
import com.applovin.impl.tl;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
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

/* loaded from: classes3.dex */
public abstract class b extends AppLovinAdImpl {

    /* renamed from: f */
    private final List f26549f;

    /* renamed from: g */
    private final AtomicBoolean f26550g;

    /* renamed from: h */
    private final AtomicBoolean f26551h;

    /* renamed from: i */
    private final AtomicReference f26552i;

    /* renamed from: j */
    private final Bundle f26553j;

    /* renamed from: k */
    private d f26554k;

    /* renamed from: com.applovin.impl.sdk.ad.b$b */
    /* loaded from: classes3.dex */
    public enum EnumC0097b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: classes3.dex */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: classes3.dex */
    public class d {

        /* renamed from: a */
        public final int f26561a;

        /* renamed from: b */
        public final int f26562b;

        /* renamed from: c */
        public final int f26563c;
        public final int d;
        public final int e;

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        private d() {
            this.f26561a = AppLovinSdkUtils.dpToPx(j.l(), b.this.l());
            this.f26562b = AppLovinSdkUtils.dpToPx(j.l(), b.this.n());
            this.f26563c = AppLovinSdkUtils.dpToPx(j.l(), b.this.j());
            this.d = AppLovinSdkUtils.dpToPx(j.l(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(sj.E1)).intValue());
            this.e = AppLovinSdkUtils.dpToPx(j.l(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(sj.D1)).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f26549f = CollectionUtils.synchronizedList();
        this.f26550g = new AtomicBoolean();
        this.f26551h = new AtomicBoolean();
        this.f26552i = new AtomicReference();
        this.f26553j = new Bundle();
    }

    public /* synthetic */ List a(tl tlVar) {
        return yp.a(tlVar.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List b(tl tlVar) {
        return yp.a(tlVar.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ Map c(tl tlVar) {
        try {
            return JsonUtils.toStringMap(tlVar.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.J();
            if (n.a()) {
                this.sdk.J().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    public /* synthetic */ List f(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List g(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List i(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List j(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public static /* synthetic */ Bundle k(tl tlVar) {
        return JsonUtils.toBundle(tlVar.a("ah_parameters", (JSONObject) null));
    }

    public /* synthetic */ List l(tl tlVar) {
        return yp.a(tlVar.a("imp_urls", new JSONObject()), getClCode(), null, null, Q(), T0(), this.sdk);
    }

    public static /* synthetic */ Map m(tl tlVar) {
        try {
            return JsonUtils.toStringMap(tlVar.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ String n(tl tlVar) {
        return JsonUtils.getString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_base_url", RemoteSettings.FORWARD_SLASH_STRING);
    }

    public static /* synthetic */ String o(tl tlVar) {
        return JsonUtils.getString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    public static /* synthetic */ String p(tl tlVar) {
        return JsonUtils.getString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_html_url", "");
    }

    private String p0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public /* synthetic */ qq q(tl tlVar) {
        return new qq(tlVar.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    public /* synthetic */ List r(tl tlVar) {
        return yp.a(tlVar.a("video_end_urls", new JSONObject()), getClCode(), p0(), this.sdk);
    }

    public static /* synthetic */ m s(tl tlVar) {
        JSONObject a2 = tlVar.a("web_view_settings", (JSONObject) null);
        if (a2 != null) {
            return new m(a2);
        }
        return null;
    }

    public static /* synthetic */ Boolean t(tl tlVar) {
        return JsonUtils.getBoolean(tlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public static /* synthetic */ Boolean u(tl tlVar) {
        return JsonUtils.getBoolean(tlVar.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_url_contents", Boolean.FALSE);
    }

    public static /* synthetic */ Boolean v(tl tlVar) {
        return JsonUtils.getBoolean(tlVar.a("video_button_properties", (JSONObject) null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE);
    }

    public boolean A0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean B0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean C0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean D0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean E0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public AtomicBoolean F0() {
        return this.f26550g;
    }

    public boolean G0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(sj.t2));
    }

    public boolean H0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public abstract boolean I0();

    public boolean J0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(yp.h(j.l()) || yp.f(j.l()) || ((Boolean) this.sdk.a(sj.r6)).booleanValue()));
    }

    public boolean K0() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public abstract void L0();

    public boolean M0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean N0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(sj.v6));
    }

    public boolean O0() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? ((Boolean) tlVar.a(new androidx.compose.animation.core.a(15))).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public abstract String P();

    public boolean P0() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? ((Boolean) tlVar.a(new androidx.compose.animation.core.a(9))).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_url_contents", Boolean.FALSE).booleanValue();
    }

    public boolean Q0() {
        return this.f26551h.get();
    }

    public boolean R0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public boolean S0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(sj.f26939n1));
    }

    public boolean T0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public boolean U0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean V0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public boolean W0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public boolean X0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public List Y() {
        return getStringListFromAdObject("rea", W());
    }

    public boolean Y0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public String Z() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public boolean Z0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public String a0() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public boolean a1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public String b0() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public boolean b1() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? ((Boolean) tlVar.a(new androidx.compose.animation.core.a(11))).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_respect_whitelist_when_retrieving_video_button_html_from_url", Boolean.FALSE).booleanValue();
    }

    public e.a c0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? m() : a(intFromAdObject);
    }

    public boolean c1() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public Bundle d() {
        return this.f26553j;
    }

    public List d0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean d1() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public fh e() {
        return (fh) this.f26552i.getAndSet(null);
    }

    public c e0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean e1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public Uri f0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean f1() {
        return getBooleanFromAdObject("track_auto_redirects", Boolean.FALSE);
    }

    public String g0() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (String) tlVar.a(new androidx.compose.animation.core.a(10)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", RemoteSettings.FORWARD_SLASH_STRING);
    }

    public boolean g1() {
        String str = this.sdk.g0().getExtraParameters().get("should_use_exoplayer_if_available");
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public abstract mg getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (Bundle) tlVar.a(new androidx.compose.animation.core.a(12)) : JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        com.applovin.impl.sdk.ad.e eVar = new com.applovin.impl.sdk.ad.e(this, 2);
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new androidx.fragment.app.j(eVar, 1));
        }
        synchronized (this.adObjectLock) {
            list = (List) eVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
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

    public List h() {
        return this.f26549f;
    }

    public String h0() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (String) tlVar.a(new androidx.compose.animation.core.a(16)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean h1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public abstract Uri i();

    public String i0() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (String) tlVar.a(new androidx.compose.animation.core.a(14)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html_url", "");
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.lg
    public abstract boolean isOpenMeasurementEnabled();

    public qq j0() {
        tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (qq) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 8)) : new qq(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public abstract Uri k0();

    public long l0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long m0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public int n0() {
        return yp.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public List o0() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 1));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), p0(), this.sdk);
        }
        return a2;
    }

    public e q0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : ViewHierarchyConstants.DIMENSION_LEFT_KEY.equals(stringFromAdObject) ? e.LEFT : "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int r0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean s0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri t0();

    public int u0() {
        return getIntFromAdObject("whalt", yp.a(getSize()) ? 1 : ((Boolean) this.sdk.a(sj.X5)).booleanValue() ? 0 : -1);
    }

    public m v0() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (m) tlVar.a(new androidx.compose.animation.core.a(8));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new m(jsonObjectFromAdObject);
        }
        return null;
    }

    public e5 w() {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (e5) tlVar.a(new androidx.compose.animation.core.a(13));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new e5(jsonObjectFromAdObject);
        }
        return null;
    }

    public List w0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List x0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public boolean y0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(sj.d6));
    }

    public boolean z0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(sj.g2));
    }

    private List J() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    public /* synthetic */ List d(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public /* synthetic */ List e(tl tlVar) {
        return yp.a(tlVar.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public static /* synthetic */ e5 h(tl tlVar) {
        JSONObject a2 = tlVar.a("custom_tabs_settings", (JSONObject) null);
        if (a2 != null) {
            return new e5(a2);
        }
        return null;
    }

    public boolean A() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public int B() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int C() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int D() {
        return yp.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public List E() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 3));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, Q(), T0(), this.sdk);
        }
        return a2;
    }

    public int F() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(sj.f26942o1)).intValue());
    }

    public boolean G() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String H() {
        return getStringFromFullResponse("event_id", null);
    }

    public List I() {
        List J = J();
        if (J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(J.size());
        Iterator it = J.iterator();
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
            tl tlVar = this.synchronizedAdObject;
            if (tlVar != null) {
                stringMap = (Map) tlVar.a(new androidx.compose.animation.core.a(17));
            } else {
                stringMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject()));
            }
            hashMap.putAll(stringMap);
        } catch (JSONException e2) {
            this.sdk.J();
            if (n.a()) {
                this.sdk.J().a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put(HttpHeaders.USER_AGENT, sr.a());
        }
        return hashMap;
    }

    public EnumC0097b R() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0097b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0097b.DO_NOT_DISMISS;
            }
        }
        return EnumC0097b.UNSPECIFIED;
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

    public int V() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public List W() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public List X() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return this.sdk.c(sj.Z0);
    }

    public List x() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 6));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List y() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 11));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List z() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public /* synthetic */ List a(MotionEvent motionEvent, boolean z2, boolean z3, tl tlVar) {
        return yp.a(tlVar.a("click_tracking_urls", new JSONObject()), a(motionEvent, z2, z3), c(motionEvent, z2, z3), Q(), T0(), this.sdk);
    }

    public List f() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 0));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public String g() {
        String stringFromAdObject = getStringFromAdObject("base_url", RemoteSettings.FORWARD_SLASH_STRING);
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public int j() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(sj.h2)).intValue());
    }

    public d k() {
        if (this.f26554k == null) {
            this.f26554k = new d();
        }
        return this.f26554k;
    }

    public int l() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(sj.i2)).intValue());
    }

    public e.a m() {
        List J = J();
        int intFromAdObject = getIntFromAdObject("close_style", (J == null || J.size() <= 0) ? -1 : ((Integer) J.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public int n() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(sj.j2)).intValue());
    }

    public long o() {
        List K = K();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (K == null || K.size() <= 0) ? 0L : ((Integer) K.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public int p() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int q() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public Bundle r() {
        Map hashMap;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            hashMap = (Map) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 5));
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.J();
                if (n.a()) {
                    this.sdk.J().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                hashMap = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString(HttpHeaders.USER_AGENT, sr.a());
        }
        return bundle;
    }

    public List s() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 10));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List t() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 7));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List u() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 4));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List v() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 12));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public void b(boolean z2) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a("html_resources_cached", z2);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z2);
        }
    }

    public List c() {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new com.applovin.impl.sdk.ad.e(this, 9));
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a2;
    }

    public List d(MotionEvent motionEvent, boolean z2, boolean z3) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map a2 = a(motionEvent, z2, z3);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(StringUtils.replace(it.next(), a2));
        }
        return arrayList;
    }

    public static /* synthetic */ List a(Function function, tl tlVar) {
        return (List) function.apply(tlVar.a("omid_verification_script_resources", (JSONArray) null));
    }

    private String c(MotionEvent motionEvent, boolean z2, boolean z3) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map a2 = a(motionEvent, z2, z3);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a2);
        }
        return null;
    }

    public List b(final MotionEvent motionEvent, final boolean z2, final boolean z3) {
        List a2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (List) tlVar.a(new Function() { // from class: com.applovin.impl.sdk.ad.g
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List a3;
                    a3 = b.this.a(motionEvent, z2, z3, (tl) obj);
                    return a3;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = yp.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z2, z3), c(motionEvent, z2, z3), Q(), T0(), this.sdk);
        }
        return a2;
    }

    public /* synthetic */ List a(MotionEvent motionEvent, boolean z2, tl tlVar) {
        return yp.a(tlVar.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z2), null, Q(), T0(), this.sdk);
    }

    public void c(Uri uri) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public static /* synthetic */ void a(String str, tl tlVar) {
        JsonUtils.putString(tlVar.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    public void a(fh fhVar) {
        this.f26552i.set(fhVar);
    }

    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
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
                this.sdk.J();
                if (n.a()) {
                    this.sdk.J().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    public void b(Uri uri) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public void b() {
        this.f26551h.set(true);
    }

    public void a(Uri uri) {
        this.f26549f.add(uri);
    }

    public void a(String str) {
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.a(new com.applovin.impl.sdk.ad.d(str, 1));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public List a(MotionEvent motionEvent, boolean z2) {
        List a2;
        List list;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            list = (List) tlVar.a(new f(this, motionEvent, z2));
        } else {
            synchronized (this.adObjectLock) {
                a2 = yp.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z2), null, Q(), T0(), this.sdk);
            }
            list = a2;
        }
        return list.isEmpty() ? b(motionEvent, true, z2) : list;
    }

    private Map a(MotionEvent motionEvent, boolean z2, boolean z3) {
        Point b2 = z3.b(j.l());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        hashMap.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b2.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b2.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z2));
        hashMap.put("{IS_INSTALL}", String.valueOf(z3));
        return hashMap;
    }

    private e.a a(boolean z2) {
        return z2 ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    public e.a a(int i2) {
        if (i2 == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i2 == 2) {
            return e.a.INVISIBLE;
        }
        if (i2 == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
