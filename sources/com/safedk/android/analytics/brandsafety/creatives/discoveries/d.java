package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.facebook.AuthenticationTokenClaims;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.PrefetchVastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.a;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.f;
import com.safedk.android.utils.k;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes3.dex */
public abstract class d implements AdNetworkDiscovery {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29565b = "Liftoff.init";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29566c = "LiftoffOuterEnv.init";
    private static final Map<String, ArrayList<String>> d = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static final String f29567o = "com.applovin.mediation.nativeAds.MaxNativeAdView";

    /* renamed from: p, reason: collision with root package name */
    public static final String f29568p = "onDataLoadedToWebView";

    /* renamed from: q, reason: collision with root package name */
    public static final String f29569q = "onResourceLoaded";

    /* renamed from: u, reason: collision with root package name */
    protected static final String f29570u = "extra_url";
    private String e;

    /* renamed from: f, reason: collision with root package name */
    private String f29571f;

    /* renamed from: r, reason: collision with root package name */
    protected a f29572r;

    /* renamed from: s, reason: collision with root package name */
    protected ConcurrentHashMap<VastAdTagUri, CreativeInfo> f29573s;

    /* renamed from: t, reason: collision with root package name */
    protected Set<String> f29574t;

    /* renamed from: v, reason: collision with root package name */
    protected String f29575v;
    protected Set<String> w;
    protected Set<String> x;

    protected abstract String a(String str, CreativeInfo creativeInfo);

    protected abstract List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException;

    protected abstract boolean b(String str, Bundle bundle);

    protected abstract boolean l(String str);

    private void j() {
        this.f29572r = new a();
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, true);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false);
        this.f29572r.a(AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.15f);
        this.f29572r.a(AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.15f);
        this.f29572r.a(AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.15f);
        this.f29572r.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.15f);
        this.f29572r.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false);
        this.f29572r.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
        this.f29572r.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false);
        this.f29572r.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_SET_CI_AS_VIDEO_AD_ON_VIDEO_RESOURCE_LOAD, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
        this.f29572r.b(AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false);
        this.f29572r.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, false);
        this.f29572r.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false);
        this.f29572r.b(AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false);
        this.f29572r.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, false);
        this.f29572r.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, false);
        this.f29572r.b(AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        this.f29572r.b(AdNetworkConfiguration.SDK_CUSTOM_VIEW_TYPE_NAME, (String) null);
        this.f29572r.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().F());
        Logger.d(this.f29571f, "SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE setting set for " + this.f29571f + ", value = " + SafeDK.getInstance().F());
        this.f29572r.b(AdNetworkConfiguration.SHOULD_OVERWRITE_REPEATED_CI_IN_CREATIVE_INFO_MANAGER_LISTS, true);
        this.f29572r.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
        this.f29572r.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        this.f29572r.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, com.safedk.android.internal.d.L);
        this.f29572r.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true);
        this.f29572r.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false);
        this.f29572r.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, false);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.f29572r.a(AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
        this.f29572r.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false);
        this.f29572r.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false);
        this.f29572r.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false);
        this.f29572r.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, com.safedk.android.internal.d.L);
        this.f29572r.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true);
        this.f29572r.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        this.f29572r.b(AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
        this.f29572r.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false);
        this.f29572r.b(AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false);
        this.f29572r.b(AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        this.f29572r.b(AdNetworkConfiguration.AVOID_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false);
        this.f29572r.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, false);
        this.f29572r.b(AdNetworkConfiguration.VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false);
        this.f29572r.b(AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(CreativeInfo creativeInfo) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str) {
        return a(str, (Bundle) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Bundle bundle) {
        String G = k.G(str);
        n(str);
        boolean z2 = b(new VastAdTagUri(G)) || b(new VastAdTagUri(str));
        boolean z3 = z2 || str.contains(".rayjump.com/openapi/ad") || b(str, bundle);
        if (z3) {
            Logger.d(this.f29571f, "should follow input stream ? " + z3 + ", vast? " + z2 + ", url=" + str);
        }
        return z3;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str, String str2) {
        n(str);
        boolean contains = this.f29574t.contains(str);
        boolean z2 = contains || l(str);
        Logger.d(this.f29571f, "should follow get url? " + z2 + ", vast media? " + contains + " url=" + str + " webviewAddress=" + str2);
        return z2;
    }

    protected void n(String str) {
        Set<String> b2 = b(str, c());
        if (b2 != null && b2.size() > 0) {
            str = a(str, b2);
            Logger.d(this.f29571f, "trigger video completed event - event url without query params=" + str);
        }
        if (this.w.remove(str)) {
            Logger.d(this.f29571f, "Video completed event sdk=" + this.e + ", source " + str);
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK != null && safeDK.y() != null) {
                safeDK.y().a(this.e, (Object) null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: Throwable -> 0x00db, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00db, blocks: (B:7:0x0003, B:9:0x000b, B:11:0x0047, B:13:0x0069, B:15:0x0077, B:17:0x0096, B:19:0x00fb, B:21:0x0101), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb A[Catch: Throwable -> 0x00db, TRY_ENTER, TryCatch #0 {Throwable -> 0x00db, blocks: (B:7:0x0003, B:9:0x000b, B:11:0x0047, B:13:0x0069, B:15:0x0077, B:17:0x0096, B:19:0x00fb, B:21:0x0101), top: B:6:0x0003 }] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> a(java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a r9) {
        /*
            r5 = this;
            r1 = 0
            if (r7 == 0) goto L9
            int r0 = r7.length()     // Catch: java.lang.Throwable -> Ldb
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
        La:
            return r0
        Lb:
            java.lang.String r0 = r5.f29571f     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r2.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = "base generate info - url: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = ", vast URLs to follow: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            java.util.concurrent.ConcurrentHashMap<com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r3 = r5.f29573s     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = ", isOnUiThread: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            boolean r3 = com.safedk.android.utils.k.c()     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.utils.k.b(r0, r2)     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r0 = r5.m(r6)     // Catch: java.lang.Throwable -> Ldb
            if (r0 != 0) goto L106
            java.lang.String r2 = s(r6)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = r5.f29571f     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r3.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "decoded URL: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.utils.k.b(r0, r3)     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r0 = r5.m(r2)     // Catch: java.lang.Throwable -> Ldb
            if (r0 != 0) goto L106
            java.lang.String r3 = "(%20|+)"
            java.lang.String r4 = " "
            java.lang.String r3 = r2.replace(r3, r4)     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> Ldb
            if (r2 != 0) goto L106
            java.lang.String r0 = r5.f29571f     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r2.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "decoded URL with spaces: "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.utils.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r0 = r5.m(r3)     // Catch: java.lang.Throwable -> Ldb
            r2 = r0
        L94:
            if (r2 == 0) goto Lfb
            java.lang.String r0 = r5.f29571f     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r3.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "found vast url: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = ", ci: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = ", content: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ldb
            com.safedk.android.utils.k.b(r0, r3)     // Catch: java.lang.Throwable -> Ldb
            r0 = 1
            r5.a(r2, r6, r7, r0)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = r5.f29571f     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = "vast processing was done in base."
            com.safedk.android.utils.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> Ldb
            r0 = 0
            r2.h(r0)     // Catch: java.lang.Throwable -> Ldb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb
            r0.<init>()     // Catch: java.lang.Throwable -> Ldb
            r0.add(r2)     // Catch: java.lang.Throwable -> Ldb
            goto La
        Ldb:
            r0 = move-exception
            java.lang.String r2 = r5.f29571f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "generate info error parsing. msg: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.safedk.android.utils.Logger.d(r2, r3, r0)
            r0 = r1
            goto La
        Lfb:
            java.util.List r0 = r5.b(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ldb
            if (r0 == 0) goto La
            r5.i()     // Catch: java.lang.Throwable -> Ldb
            goto La
        L106:
            r2 = r0
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.d.a(java.lang.String, java.lang.String, java.util.Map, com.safedk.android.analytics.brandsafety.creatives.discoveries.c$a):java.util.List");
    }

    private CreativeInfo m(String str) {
        VastAdTagUri vastAdTagUri = new VastAdTagUri(str);
        if (!this.f29573s.containsKey(vastAdTagUri)) {
            return null;
        }
        Logger.d(this.f29571f, "vasts redirect url found: " + str);
        CreativeInfo remove = this.f29573s.remove(vastAdTagUri);
        a(vastAdTagUri);
        return remove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, boolean z2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        return c(str, str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Pair<String, List<String>> a(Set<String> set) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (!BannerFinder.c(view)) {
            return false;
        }
        Logger.d(this.f29571f, "is ad view: " + view.getClass().getName() + " is an instance of a Max native ad view, isOnUiThread = " + k.c());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String o(String str) {
        String str2;
        String str3 = null;
        try {
            if (str.contains(f29565b) && (str3 = a(f.aF(), str)) == null) {
                str3 = a(f.aG(), str);
            }
            if (str.contains(f29566c) && (str3 = a(f.aH(), str)) != null) {
                Logger.d(this.f29571f, "LiftoffOuterEnv.init url found : " + str3);
            }
            str2 = k.F(str3);
        } catch (Throwable th) {
            Logger.d(this.f29571f, "Exception while getting click_url from dsp ad : " + th.getMessage(), th);
            str2 = str3;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = a(f.aK(), str);
        }
        return k.F(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String p(String str) {
        if (!str.contains(f29565b)) {
            return null;
        }
        return a(f.aI(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                Logger.d(this.f29571f, "extractSubstringViaPattern found pattern=" + pattern + " , value = " + matcher.group(1));
                return matcher.group(1);
            }
        } catch (Throwable th) {
            Logger.d(this.f29571f, "Exception while extracting with regex : " + th.getMessage() + ", pattern : " + pattern, th);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(CreativeInfo creativeInfo, f.a aVar, String str) {
        if (aVar == null) {
            return false;
        }
        k.b(this.f29571f, "updating vast CI: " + creativeInfo.toString() + ", vast ad info: " + aVar);
        creativeInfo.a(ImpressionLog.B, new ImpressionLog.a[0]);
        boolean z2 = creativeInfo.z() ? false : true;
        creativeInfo.c(true);
        if (z2) {
            String c2 = aVar.c();
            if (c2 != null) {
                creativeInfo.j(c2);
            }
            String d2 = aVar.d();
            if (d2 != null) {
                creativeInfo.m(d2);
            }
            List<String> i2 = aVar.i();
            if (i2 != null) {
                for (String str2 : i2) {
                    if (e.a(creativeInfo.Q(), str2)) {
                        Logger.d(this.f29571f, "adding impression url to dsp domains : " + str2);
                        creativeInfo.x(str2);
                    }
                }
            } else {
                Logger.d(this.f29571f, "impression list is empty");
            }
            List<String> o2 = aVar.o();
            if (o2 != null) {
                for (String str3 : o2) {
                    if (e.a(creativeInfo.Q(), str3)) {
                        Logger.d(this.f29571f, "adding video tracking event url to dsp domains : " + str3);
                        creativeInfo.x(str3);
                    }
                }
            } else {
                Logger.d(this.f29571f, "No video tracking events");
            }
            List<String> p2 = aVar.p();
            if (p2 != null) {
                for (String str4 : p2) {
                    if (e.a(creativeInfo.Q(), str4)) {
                        Logger.d(this.f29571f, "adding click tracking url to dsp domains : " + str4);
                        creativeInfo.x(str4);
                    }
                }
            } else {
                Logger.d(this.f29571f, "no click tracking urls");
            }
            List<String> q2 = aVar.q();
            if (q2 != null) {
                for (String str5 : q2) {
                    if (e.a(creativeInfo.Q(), str5)) {
                        Logger.d(this.f29571f, "adding companion click tracking url to dsp domains : " + str5);
                        creativeInfo.x(str5);
                    }
                }
            } else {
                Logger.d(this.f29571f, "no companion click tracking urls");
            }
        } else {
            Logger.d(this.f29571f, "inner Vast - don't update dsp creative ID, ad system, impression URLs and tracking URLs in CI");
        }
        String e = aVar.e();
        if (e != null) {
            String G = k.G(e);
            k.b(this.f29571f, "following vast uri: " + G);
            PrefetchVastAdTagUri prefetchVastAdTagUri = new PrefetchVastAdTagUri(G);
            this.f29573s.put(prefetchVastAdTagUri, creativeInfo);
            com.safedk.android.analytics.brandsafety.creatives.f.f29595c.remove(prefetchVastAdTagUri);
            a(str, (VastAdTagUri) prefetchVastAdTagUri);
            Logger.d(this.f29571f, "adding vast ad url to list. url: " + prefetchVastAdTagUri + ", ci: " + creativeInfo);
            creativeInfo.C(e);
            return true;
        }
        String a2 = aVar.a();
        String b2 = aVar.b();
        if (a2 != null) {
            creativeInfo.t(a2);
            Logger.d(this.f29571f, "will update click url: " + a2);
        } else {
            Logger.d(this.f29571f, "click url is empty");
        }
        if (b2 != null && !aVar.r()) {
            creativeInfo.o(b2);
            Logger.d(this.f29571f, "will update video url : " + b2);
            if (k.p(b2)) {
                String q3 = k.q(b2);
                Logger.d(this.f29571f, "google video added : " + q3);
                this.f29574t.add(q3);
            } else {
                Logger.d(this.f29571f, "video added : " + b2);
                this.f29574t.add(b2);
            }
        } else {
            Logger.d(this.f29571f, "video url is empty");
        }
        List<String> j2 = aVar.j();
        if (j2 != null) {
            Iterator<String> it = j2.iterator();
            while (it.hasNext()) {
                String a3 = a(it.next(), creativeInfo);
                if (a3 != null) {
                    Logger.d(this.f29571f, "will add follow url : " + a3);
                    this.f29574t.add(a3);
                }
            }
            creativeInfo.b(j2);
        } else {
            Logger.d(this.f29571f, "no prefetch resource urls");
        }
        List<String> k2 = aVar.k();
        creativeInfo.c(k2);
        Logger.d(this.f29571f, "added static resource : " + k2);
        List<String> l2 = aVar.l();
        creativeInfo.c(l2);
        Logger.d(this.f29571f, "added script resource : " + l2);
        List<String> m2 = aVar.m();
        creativeInfo.c(m2);
        Logger.d(this.f29571f, "added html resource : " + m2);
        if (aVar.r()) {
            creativeInfo.Z();
            Logger.d(this.f29571f, "set params " + aVar.f());
            creativeInfo.F(aVar.f());
        }
        List<String> h2 = aVar.h();
        if (h2 != null) {
            Logger.d(this.f29571f, "vast media list contains " + h2.toString());
            Iterator<String> it2 = h2.iterator();
            while (it2.hasNext()) {
                String a4 = a(it2.next(), creativeInfo);
                if (a4 != null) {
                    Logger.d(this.f29571f, "will add followUrl : " + a4);
                    this.f29574t.add(a4);
                }
            }
            creativeInfo.c(h2);
        } else {
            Logger.d(this.f29571f, "no prefetch resource urls");
        }
        k.b(this.f29571f, "updated vast CI = " + creativeInfo);
        return true;
    }

    protected void a(String str, VastAdTagUri vastAdTagUri) {
    }

    protected void a(VastAdTagUri vastAdTagUri) {
    }

    protected String a(String str, Set<String> set) {
        if (set != null && set.size() > 0) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                str = k.e(str, it.next());
            }
        }
        return str;
    }

    private static String g(String str, String str2) {
        return str.replaceAll("([?&;]+)(" + str2 + "=.*?)(&|$|;)", "$1");
    }

    protected Set<String> b(String str, Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        Map<String, String> b2 = k.b(str, false);
        if (b2 != null) {
            for (Map.Entry<String, String> entry : b2.entrySet()) {
                if (set.contains(entry.getValue())) {
                    Logger.d(this.f29571f, "identified macro : " + entry.getValue());
                    hashSet.add(entry.getKey());
                }
            }
        }
        if (hashSet.size() > 0) {
            Logger.d(this.f29571f, "query params to ignore are " + hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(CreativeInfo creativeInfo, String str, String str2, boolean z2) {
        Logger.v(this.f29571f, "updating vast CI: " + creativeInfo.toString() + ", vast xml: " + str2 + ", scan for resources: " + z2);
        boolean b2 = CreativeInfoManager.f29437u ? true : CreativeInfoManager.i(creativeInfo.Q()).b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST);
        Logger.d(this.f29571f, "sdk " + creativeInfo.Q() + " config item SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST is " + b2);
        return a(creativeInfo, com.safedk.android.analytics.brandsafety.creatives.f.b(str2, b2, creativeInfo.Q()), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(String str, String str2) {
        SdksMapping.updateSdkVersionIfNeeded(str, str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return com.safedk.android.utils.a.f30018b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public a d() {
        return this.f29572r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(String str, String str2, boolean z2) {
        this.f29573s = null;
        this.f29574t = new HashSet();
        this.w = new HashSet();
        this.x = new HashSet();
        this.e = str;
        this.f29571f = str2;
        try {
            if (z2) {
                this.f29573s = new PersistentConcurrentHashMap(this.f29571f + "_vastAdTagUriUrlsToFollow");
                Logger.d(this.f29571f, "vast ad tag uri to follow loaded, key set=" + this.f29573s.keySet());
            } else {
                this.f29573s = new ConcurrentHashMap<>();
                Logger.d(this.f29571f, "vast ad tag uri to follow loaded (no persistence)");
            }
        } catch (InvalidParameterException e) {
            Logger.e(this.f29571f, "error initializing caching will not be available", e);
        }
        j();
    }

    private d() {
        this.f29573s = null;
        this.f29574t = new HashSet();
        this.w = new HashSet();
        this.x = new HashSet();
    }

    protected boolean q(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".mp4") || lowerCase.endsWith(".webm") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".webp");
    }

    public static String r(String str) {
        return k.k(k.F(str));
    }

    public static String s(String str) {
        return k.k(k.G(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(String str) {
        if (b(new VastAdTagUri(str))) {
            return true;
        }
        return b(new VastAdTagUri(s(str)));
    }

    public boolean b(VastAdTagUri vastAdTagUri) {
        boolean z2 = this.f29573s.containsKey(vastAdTagUri) || com.safedk.android.analytics.brandsafety.creatives.f.f29595c.contains(vastAdTagUri);
        if (z2) {
            Logger.d(this.f29571f, "is VIV Url result is true");
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e() {
        Logger.d(this.f29571f, "getting SDK version: " + this.f29575v + ", adapter class name: " + f());
        if (this.f29575v == null && f() != null) {
            if (SdksMapping.getSdkAdaptersUUID().containsKey(f())) {
                String str = SdksMapping.getSdkAdaptersUUID().get(f());
                this.f29575v = SdksMapping.getAllSdkVersionsMap().get(str);
                Logger.d(this.f29571f, "getting SDK version for uuid: " + str + ", version: " + this.f29575v);
                return;
            }
            return;
        }
        Logger.d(this.f29571f, "cannot get version using sdks mapping");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f29570u);
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(View view) {
        String str;
        if (!f(view)) {
            str = null;
        } else {
            String name = view.getClass().getName();
            Logger.d(this.f29571f, "get ad ID from view started, ad view: " + view);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<String> arrayList = d.get(name);
            if (arrayList == null) {
                str = null;
            } else {
                Logger.d(this.f29571f, "get ad ID from view, found previous traversal path of " + name + ": " + arrayList);
                str = a(arrayList, (Object) view);
            }
            if (str == null) {
                HashSet hashSet = new HashSet();
                ArrayList<String> arrayList2 = new ArrayList<>();
                str = a(view, arrayList2, hashSet);
                if (str != null) {
                    d.put(name, arrayList2);
                    k.b(this.f29571f, "get ad ID from view, saving traversal path of " + name + " for later use: " + arrayList2);
                }
            }
            Logger.d(this.f29571f, "get ad ID from view - travel time " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        }
        Logger.d(this.f29571f, "get ad ID from view - ad ID: " + str);
        return str;
    }

    protected String k() {
        return null;
    }

    private String a(Object obj, List<String> list, Set<Object> set) {
        String k2 = k();
        if (k2 == null || obj == null || set.contains(obj)) {
            return null;
        }
        set.add(obj);
        Class<?> cls = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        boolean a2 = CreativeInfoManager.a(k2, AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        while (true) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
            if (cls == null || (!cls.getName().startsWith(k2) && !a2)) {
                break;
            }
        }
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 == null) {
                    continue;
                } else if (obj2.getClass().getName().startsWith(k2)) {
                    list.add(field.getName());
                    String a3 = a(obj2, list, set);
                    if (a3 == null) {
                        list.remove(list.size() - 1);
                    } else {
                        return a3;
                    }
                } else {
                    String c2 = c(obj2);
                    if (c2 != null) {
                        list.add(field.getName());
                        return c2;
                    }
                    continue;
                }
            } catch (Throwable th) {
                Logger.d(this.f29571f, "Exception in extract ad info : " + th.getMessage(), th);
            }
        }
        return null;
    }

    private String a(ArrayList<String> arrayList, Object obj) {
        String k2;
        try {
            k2 = k();
        } catch (Throwable th) {
            Logger.e(this.f29571f, "extract ad info exception: " + th.getMessage(), th);
        }
        if (k2 == null || arrayList == null || obj == null) {
            return null;
        }
        Logger.d(this.f29571f, "extract ad info using saved traversal path: " + arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            Field field = null;
            do {
                try {
                    field = cls.getDeclaredField(next);
                } catch (NoSuchFieldException e) {
                    cls = cls.getSuperclass();
                }
                if (field != null || cls == null) {
                    break;
                }
            } while (cls.getName().startsWith(k2));
            if (field == null) {
                Logger.d(this.f29571f, "extract ad info using saved traversal path, field not found");
                return null;
            }
            field.setAccessible(true);
            obj = field.get(obj);
        }
        if (obj != null) {
            return c(obj);
        }
        return null;
    }

    protected String c(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String h() {
        return this.f29571f;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<WebView> a(List<WeakReference<WebView>> list, String str) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public void i() {
        Logger.d(this.f29571f, "base clear old CIs started");
        com.safedk.android.utils.e.a(this.f29573s, this.f29571f + ":vastAdTagUriUrlsToFollow", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType g(View view) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return SafeDK.getInstance().C();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(String str, String str2) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void h(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean i(String str) {
        return false;
    }

    public boolean a(String str, String str2, ConcurrentHashMap<String, WeakReference<WebView>> concurrentHashMap, ConcurrentHashMap<String, CreativeInfo> concurrentHashMap2, String str3) {
        try {
            k.b(this.f29571f, "try reverse matching: source: " + str);
            k.b(this.f29571f, "try reverse matching: dataToWebviewRef keys: " + concurrentHashMap.keySet());
        } catch (Throwable th) {
            k.b(this.f29571f, "try reverse matching encountered exception: " + th);
        }
        if (str == null || !concurrentHashMap.containsKey(str)) {
            Logger.d(this.f29571f, "try reverse matching: source is null or not in sourceToWebviewRef");
            return false;
        }
        k.b(this.f29571f, "try reverse matching: keyToCIsMap keys: " + concurrentHashMap2.keySet());
        WeakReference<WebView> weakReference = concurrentHashMap.get(str);
        if (!k.a((Reference<?>) weakReference)) {
            Logger.d(this.f29571f, "try reverse matching: webViewRef is null or points to null - webviewRef: " + weakReference);
            return false;
        }
        k.b(this.f29571f, "try reverse matching: keyToCIsMap keys: " + concurrentHashMap2.keySet());
        WebView webView = weakReference.get();
        if (concurrentHashMap2.containsKey(str)) {
            CreativeInfo creativeInfo = concurrentHashMap2.get(str);
            if (creativeInfo != null) {
                String L = creativeInfo.L();
                if ((str3.equals(f29568p) && CreativeInfoManager.b(webView, str2, L)) || (str3.equals(f29569q) && CreativeInfoManager.a(webView, str2, L).size() > 0)) {
                    Logger.d(this.f29571f, "try reverse matching: found a match using reverse! adId=" + L);
                    j(L);
                    return true;
                }
            }
        } else {
            Logger.d(this.f29571f, "try reverse matching: keyToCIsMap does not contain source");
            k.b(this.f29571f, "try reverse matching: keyToCIsMap keys are: " + concurrentHashMap2.keySet());
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void j(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public View h(View view) {
        return null;
    }

    public boolean i(View view) {
        if (view == null || !view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        Logger.d(this.f29571f, "native video player identified, view: " + view);
        return true;
    }

    public boolean j(View view) {
        boolean z2;
        if (view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            z2 = true;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                z2 = z2 && j(viewGroup.getChildAt(i2));
            }
        } else {
            z2 = true;
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<View> a(com.safedk.android.analytics.brandsafety.d dVar) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(View view, int i2, int i3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean k(String str) {
        return false;
    }
}
