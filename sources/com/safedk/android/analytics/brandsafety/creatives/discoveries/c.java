package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAdSize;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.AppLovinCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.e;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends d {
    private static final String A = "ad_size";
    private static final String B = "ad_format";
    private static final String C = "REWARD";
    private static final String D = "ad_type";
    private static final String E = "REGULAR";
    private static final String F = "VIDEOA";
    private static final String G = "zone_id";
    private static final String H = "event_id";
    private static final String I = "clcodes";
    private static final String J = "dsp_name";
    private static final String K = "is_js_tag_ad";
    private static final String L = "html";
    private static final String M = "html_template";
    private static final String N = "status";
    private static final String O = "ads";
    private static final String P = "click_url";
    private static final String Q = "&listing=";
    private static final String R = "video";
    private static final String S = "ad_id";
    private static final String T = "clcode";
    private static final String U = "bid_response";
    private static final String V = "creative_id";
    private static final String W = "adomain";
    private static final String X = "third_party_ad_placement_id";
    private static final String Y = "xml";
    private static final String Z = "stream_url";
    private static final String aA = "click_tracking_urls";
    private static final String aB = "manual";
    private static final String aC = "ad_info";
    private static final String aD = "ad_unit_id";
    private static final String aE = "com.applovin.mediation.adapters.AppLovinMediationAdapter";
    private static final String aF = "name";
    private static final int aG = 200;
    private static String aI = null;
    private static final int aJ = 15;
    private static final String aQ = "&current_retry_attempt=";
    private static final String aR = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(message)}else{console.log(\"SafeDKWebApInterface log object missing\")}}catch(error){}};var addObservers=function(){try{var isContainerExpanded=false;var privacyElement=document.getElementById(\"al_bigAdInfo\");if(!privacyElement){privacyElement=document.getElementById(\"al_optout_container_expanded\");isContainerExpanded=true}if(!privacyElement&&document.querySelectorAll('div[class^=\"_background_\"]').length>0){privacyElement=document.querySelectorAll('div[class^=\"_background_\"]')[0]}if(privacyElement&&privacyElement.style){var displayState=privacyElement.style.display;var visibility=getComputedStyle(privacyElement).visibility;var isVisible=visibility==\"visible\";if(isContainerExpanded&&isVisible){isVisible=privacyElement.offsetWidth!=0&&privacyElement.offsetHeight!=0}if(displayState!=\"none\"&&displayState!=\"\"||isVisible){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyElement.safedkPrivacyDialogObserver!=true){privacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":var isVisible=getComputedStyle(mutation.target).visibility==\"visible\";if(mutation.target.id==\"al_optout_container_expanded\"){isVisible=mutation.target.offsetWidth!=0&&mutation.target.offsetHeight!=0}if(isVisible||getComputedStyle(mutation.target).display!=\"none\"&&displayState!=\"\"||getComputedStyle(mutation.target).display==\"block\"){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\",\"class\"]};observer.observe(privacyElement,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}}}}}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}};addObservers();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addObservers()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}})();\n";
    private static final String aS = "{PLACEMENT}";
    private static final String aT = "(\\/)([A-Za-z0-9]{8}_)([^'\"\\?]*?['\"\\?])";
    private static final String aU = "(ad[-_A-Za-z_\\/]+[0-9]*[_\\/])(index\\.js)";
    private static final String aV = "(?:file|http[s]?):\\/{2,3}.*?([^\\/'\\\"\\?]*)(['\\\"\\?])";
    private static final String aW = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}";
    private static final String aX = "(<head>\\s*)(<script.*?</script>)";
    private static final String aa = "network_name";
    private static final String ab = "HOSTED_HTML_UNIVERSAL_VIDEO";
    private static final String ac = "HOSTED_HTML_UNIVERSAL_REWARD";
    private static final String ad = "HOSTED_HTML_UNIVERSAL";
    private static final String ae = "server_parameters";
    private static final String af = "ortb_response";
    private static final String ag = "version";
    private static final String ah = "value";
    private static final String ai = "native";
    private static final String aj = "link";
    private static final String ak = "assets";
    private static final String al = "title";
    private static final String am = "text";
    private static final String an = "img";
    private static final String ao = "id";
    private static final String ap = "type";
    private static final String aq = "url";
    private static final String ar = "w";
    private static final String as = "h";
    private static final String at = "video";
    private static final String au = "vasttag";
    private static final String av = "data";
    private static final String aw = "fallback";
    private static final String ax = "clicktrackers";
    private static final String ay = "imptrackers";
    private static final String az = "eventtrackers";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29534b = "video";
    private static MessageDigest ba = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f29535c = "playable";
    public static final String d = "template";
    public static final String e = ".applovin.com/redirect";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29536f = "n";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29537g = "applovin://com.applovin.sdk/adservice/expand_ad";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29538h = "SSP_MRAID";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29540j = "com.applovin.mediation.adapters.AppLovinMediationAdapter";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29541k = "APPLOVIN_EXCHANGE";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29542l = "APPLOVIN_NETWORK";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29543m = "APPLOVIN_DIRECTSOLD";
    private final ConcurrentHashMap<String, CreativeInfo> aM;
    private final ConcurrentHashMap<String, CreativeInfo> aN;
    private final Map<String, a> aO;
    private final LimitedConcurrentHashMap<String, String> aP;

    /* renamed from: y, reason: collision with root package name */
    private static String f29545y = "AppLovinDiscovery";

    /* renamed from: z, reason: collision with root package name */
    private static String f29546z = "json_v3!";

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f29539i = {"applovin://com.applovin.sdk/webview_event"};
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> aK = new LimitedConcurrentHashMap<>(15);
    private static final LimitedConcurrentHashMap<String, String> aL = new LimitedConcurrentHashMap<>(15);
    private static final List<String> aY = Arrays.asList("a.applovin.com/4.0/ad", "a.applvn.com/4.0/ad", "a4.applovin.com/4.0/ad", "a4.applvn.com/4.0/ad");
    private static boolean aZ = false;
    private static final String aH = "BANNER_NATIVE";

    /* renamed from: n, reason: collision with root package name */
    public static List<String> f29544n = Arrays.asList("BANNER_GRAPHIC_BLANK_UNIFIED", "BANNER_STOREKIT", aH, "BANNER_STOREASSETS");

    static {
        try {
            ba = MessageDigest.getInstance("SHA-256");
        } catch (Throwable th) {
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final int f29553a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f29554b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f29555c = 3;
        private static final int d = 4;
        private static final int e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f29556f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f29557g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f29558h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f29559i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f29560j = 3;

        /* renamed from: k, reason: collision with root package name */
        private static final int f29561k = 1;

        /* renamed from: l, reason: collision with root package name */
        private static final int f29562l = 2;

        /* renamed from: m, reason: collision with root package name */
        private static final int f29563m = 12;

        /* renamed from: n, reason: collision with root package name */
        private static final int f29564n = -1;

        private b() {
        }
    }

    public static void j() {
        aZ = true;
    }

    public c() {
        super(g.f30048a, f29545y, false);
        this.aM = new ConcurrentHashMap<>();
        this.aN = new ConcurrentHashMap<>();
        this.aO = new HashMap();
        this.aP = new LimitedConcurrentHashMap<>(15);
        aI = k.a();
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, true);
        this.f29572r.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, aR);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f29572r.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, true);
        this.f29572r.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, "APPLOVIN_EXCHANGE");
        this.f29572r.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "APPLOVIN_NETWORK_&_APPLOVIN_DIRECTSOLD");
        this.f29572r.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 4800000L);
        this.f29572r.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 4800000L);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, true);
        AsyncTask.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.1
            @Override // java.lang.Runnable
            public void run() {
                f.b("<vast><ad id=\"stam\"></ad></vast>", false, "");
            }
        });
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, a aVar) {
        int indexOf = str.indexOf(aQ);
        if (indexOf > -1) {
            str = str.substring(0, indexOf);
        }
        return super.a(str, str2, map, aVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, a aVar) throws JSONException {
        String str3;
        String str4;
        a aVar2;
        Logger.d(f29545y, "generate info, url: " + str);
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Throwable th) {
            Logger.d(f29545y, "generate info, exception parsing prefetch: " + th.getMessage(), th);
        }
        if (!k.t(str2)) {
            return new ArrayList();
        }
        JSONObject jSONObject = new JSONObject(str2);
        if (!jSONObject.has(O)) {
            return new ArrayList();
        }
        JSONArray jSONArray = jSONObject.getJSONArray(O);
        if (jSONArray.length() != 0 && jSONObject.getInt("status") == aG) {
            String optString = jSONObject.optString(T);
            Logger.d(f29545y, "adId = " + optString);
            if (TextUtils.isEmpty(optString) && !aZ) {
                JSONArray optJSONArray = jSONObject.optJSONArray(I);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    optString = optJSONArray.getString(0);
                } else {
                    String optString2 = jSONObject.optString("ad_format", null);
                    String optString3 = jSONObject.optString("event_id");
                    if (optString2 != null) {
                        try {
                            aVar2 = new a(this, optString3, BrandSafetyEvent.AdFormatType.valueOf(optString2));
                        } catch (IllegalArgumentException e2) {
                            Logger.d(f29545y, "generate info, Max prefetch parameters: unsupported ad format=" + optString2);
                            return null;
                        }
                    } else {
                        aVar2 = new a(optString3);
                    }
                    Logger.d(f29545y, "generate info, Max prefetch parameters: eventId=" + aVar2.f29548a + ", adFormat=" + aVar2.f29549b);
                    a(str, map, jSONArray, aVar2);
                    return null;
                }
            }
            BrandSafetyUtils.AdType adType = null;
            String str5 = null;
            if (jSONObject.has(A)) {
                String string = jSONObject.getString(A);
                Logger.d(f29545y, "generate info, json ad_size is " + string);
                if (BrandSafetyUtils.f29190m.equals(string) || BrandSafetyUtils.f29191n.equals(string)) {
                    str5 = BrandSafetyEvent.AdFormatType.BANNER.name();
                    adType = BrandSafetyUtils.AdType.BANNER;
                } else if (BrandSafetyUtils.f29192o.equals(string)) {
                    str5 = BrandSafetyEvent.AdFormatType.MREC.name();
                    adType = BrandSafetyUtils.AdType.MREC;
                } else if ("NATIVE".equals(string)) {
                    str5 = BrandSafetyEvent.AdFormatType.NATIVE.name();
                    adType = BrandSafetyUtils.AdType.NATIVE;
                } else {
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                }
                Logger.d(f29545y, "generate info, json ad_size : ad format = " + str5 + ", ad type = " + adType.name() + ", ad_format = " + (jSONObject.has("ad_format") ? jSONObject.get("ad_format") : "NA"));
            } else {
                if (jSONObject.has("ad_format")) {
                    String string2 = jSONObject.getString("ad_format");
                    Logger.d(f29545y, "generate info, json ad_format is " + string2);
                    if (string2.equals(BrandSafetyUtils.f29190m) || string2.equals(BrandSafetyUtils.f29191n)) {
                        str5 = BrandSafetyEvent.AdFormatType.BANNER.name();
                        adType = BrandSafetyUtils.AdType.BANNER;
                    } else if (string2.equals(BrandSafetyUtils.f29192o)) {
                        str5 = BrandSafetyEvent.AdFormatType.MREC.name();
                        adType = BrandSafetyUtils.AdType.MREC;
                    } else if (string2.equals("NATIVE")) {
                        str5 = BrandSafetyEvent.AdFormatType.NATIVE.name();
                        adType = BrandSafetyUtils.AdType.NATIVE;
                    } else if (string2.equals(BrandSafetyUtils.f29187j)) {
                        str5 = BrandSafetyEvent.AdFormatType.INTER.name();
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    } else if (string2.equals(C)) {
                        str5 = BrandSafetyEvent.AdFormatType.REWARD.name();
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    } else if (string2.equals(BrandSafetyUtils.f29189l)) {
                        str5 = BrandSafetyEvent.AdFormatType.APPOPEN.name();
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    Logger.d(f29545y, "generate info, prefetch parameters adFormat: " + str5);
                } else {
                    Logger.d(f29545y, "generate info, json ad_format has no value, setting ad type to default : INTERSTITIAL ");
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                }
                Logger.d(f29545y, "generate info, json ad_format result : ad format = " + str5 + " , ad type = " + adType.name());
            }
            if (!jSONObject.has("ad_type")) {
                str3 = null;
            } else {
                str3 = jSONObject.getString("ad_type");
            }
            String a2 = a(jSONObject);
            Logger.d(f29545y, "generate info, placementId = " + a2);
            String optString4 = jSONObject.optString("event_id", null);
            Logger.d(f29545y, "generate info, eventId = " + optString4);
            if (aVar != null) {
                Logger.d(f29545y, "generate info, got MAX prefetch parameters: " + aVar);
                str5 = aVar.f29549b.name();
                str4 = aVar.f29548a;
            } else {
                a remove = this.aO.remove(optString);
                if (remove != null) {
                    Logger.d(f29545y, "generate info, find MAX prefetch parameters: " + remove);
                    str4 = remove.f29548a;
                    if (a2 == null || a2.isEmpty()) {
                        a2 = remove.f29550c;
                    }
                    if (remove.f29549b != null) {
                        if (remove.f29549b.name().equals(BrandSafetyUtils.f29190m) || remove.f29549b.name().equals(BrandSafetyUtils.f29191n)) {
                            str5 = BrandSafetyEvent.AdFormatType.BANNER.name();
                            adType = BrandSafetyUtils.AdType.BANNER;
                        } else if (remove.f29549b.name().equals(BrandSafetyUtils.f29192o)) {
                            str5 = BrandSafetyEvent.AdFormatType.MREC.name();
                            adType = BrandSafetyUtils.AdType.MREC;
                        } else if (remove.f29549b.name().equals("NATIVE")) {
                            str5 = BrandSafetyEvent.AdFormatType.NATIVE.name();
                            adType = BrandSafetyUtils.AdType.NATIVE;
                        } else if (remove.f29549b.name().equals(BrandSafetyUtils.f29187j)) {
                            str5 = BrandSafetyEvent.AdFormatType.INTER.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (remove.f29549b.name().equals(C)) {
                            str5 = BrandSafetyEvent.AdFormatType.REWARD.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (remove.f29549b.name().equals(BrandSafetyUtils.f29189l)) {
                            str5 = BrandSafetyEvent.AdFormatType.APPOPEN.name();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        }
                    }
                    Logger.d(f29545y, "generate info, MAX prefetch parameters adFormat: " + str5);
                } else {
                    Logger.d(f29545y, "generate info, no MAX prefetch parameters found for adId: " + optString + ", eventId: " + optString4);
                    return arrayList;
                }
            }
            Logger.d(f29545y, "generate info, adTypeJson = " + str3);
            if (str5 == null && str3 != null && str3.equals(F)) {
                str5 = BrandSafetyEvent.AdFormatType.REWARD.name();
            }
            Logger.d(f29545y, "generate info, ad format = " + str5);
            String optString5 = jSONObject.optString("dsp_name");
            Logger.d(f29545y, "generate info, dsp name = " + optString5);
            Logger.d(f29545y, "generate info, network name = " + jSONObject.optString("network_name"));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                k.b(f29545y, "generate info, json object is " + jSONObject2.toString());
                CreativeInfo creativeInfo = null;
                if (jSONObject2.has("html") || jSONObject2.has(M)) {
                    creativeInfo = a(optString, adType, str5, a2, str4, optString5, jSONObject2, str);
                } else if (jSONObject2.has(af)) {
                    creativeInfo = a(optString, adType, str5, a2, optString5, str4, jSONObject2);
                }
                if (creativeInfo != null) {
                    if (aVar != null) {
                        if (aVar.e != null) {
                            creativeInfo.g(aVar.e);
                            Logger.d(f29545y, "generate info, setting adDomain : " + aVar.e);
                        }
                        if (aVar.f29551f != null && creativeInfo.K() == BrandSafetyUtils.AdType.NATIVE) {
                            String h2 = creativeInfo.h();
                            if (TextUtils.isEmpty(h2)) {
                                creativeInfo.c(aVar.f29551f);
                            } else {
                                creativeInfo.c(h2 + RemoteSettings.FORWARD_SLASH_STRING + aVar.f29551f);
                            }
                            Logger.d(f29545y, "generate info, setting native template: " + aVar.f29551f);
                        }
                    }
                    arrayList.add(creativeInfo);
                    k.b(f29545y, "generate info, added CI: " + creativeInfo);
                }
            }
            return arrayList;
        }
        return null;
    }

    private String a(JSONObject jSONObject, String str, String str2, String str3) {
        String str4 = null;
        if (str2 != null && str2.startsWith(f29538h)) {
            Logger.d(f29545y, "extract clickUrl - SSP Mraid - not extracting click url from prefetch");
        } else {
            String optString = jSONObject.optString("click_url", null);
            if (optString == null || !optString.startsWith(Q)) {
                str4 = optString;
            } else {
                Logger.d(f29545y, "extract clickUrl - clickUrl extraction from json is invalid, will be set to null. clickUrl= " + optString);
            }
            if (str4 == null && !TextUtils.isEmpty(str)) {
                str4 = o(str);
                if (str4 == null) {
                    str4 = a(com.safedk.android.utils.f.as(), str);
                }
                if (str4 == null) {
                    str4 = a(com.safedk.android.utils.f.ar(), str);
                }
                if (str4 == null) {
                    str4 = a(com.safedk.android.utils.f.ak(), str);
                }
                if (str4 == null && str3 != null && f29544n.contains(str3.trim().split(" ")[0])) {
                    str4 = a(com.safedk.android.utils.f.al(), str);
                    Logger.d(f29545y, "extract clickUrl - clickUrl ad, " + str3 + " = " + str4);
                }
            }
            if (str4 == null && !TextUtils.isEmpty(str)) {
                Logger.d(f29545y, "extract clickUrl - click_url attempting extracting Mraid click url on html " + str);
                Matcher matcher = com.safedk.android.utils.f.aJ().matcher(str);
                if (matcher.find() && matcher.group(2) != null) {
                    try {
                        str4 = matcher.group(2).replace("\\/", RemoteSettings.FORWARD_SLASH_STRING);
                        Logger.d(f29545y, "extract clickUrl - click_url extracting via Mraid click url regex : " + str4);
                    } catch (Throwable th) {
                        Logger.d(f29545y, "Exception extracting Mraid click url : " + th.getMessage(), th);
                    }
                }
            }
            Logger.d(f29545y, "extract clickUrl - downstream struct: " + str2 + " click url is: " + str4);
        }
        return str4;
    }

    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6) throws JSONException {
        String str7;
        String str8;
        String optString = jSONObject.optString("html");
        if (adType != BrandSafetyUtils.AdType.BANNER && adType != BrandSafetyUtils.AdType.MREC) {
            str7 = null;
            str8 = null;
        } else {
            String m2 = m(optString);
            String a2 = a(com.safedk.android.utils.f.aq(), optString);
            k.b(f29545y, "parse ad, prefetch bannerType = " + a2 + ", html hash = " + m2 + ", content = " + optString);
            str7 = a2;
            str8 = m2;
        }
        String optString2 = TextUtils.isEmpty(optString) ? jSONObject.optString(M) : optString;
        String optString3 = jSONObject.optString(Z);
        String optString4 = jSONObject.optString("video");
        if (optString4.isEmpty()) {
            optString4 = a(com.safedk.android.utils.f.am(), optString2);
        }
        boolean z2 = false;
        String a3 = a(com.safedk.android.utils.f.an(), optString2);
        if (a3 != null && k.J(a3)) {
            JSONObject jSONObject2 = new JSONObject(a3);
            JSONObject optJSONObject = jSONObject2.optJSONObject("video");
            if (optJSONObject != null && TextUtils.isEmpty(optString4)) {
                optString4 = optJSONObject.optString("url");
            }
            z2 = jSONObject2.has("playable");
            Logger.d(f29545y, "parse ad, new template, video: " + optString4 + ", is playable? " + z2);
        }
        String str9 = optString4;
        String a4 = a(com.safedk.android.utils.f.aq(), optString2);
        if (a4 != null) {
            a4 = a4.trim() + RemoteSettings.FORWARD_SLASH_STRING;
        } else if (z2) {
            a4 = "playable/";
        }
        boolean z3 = (TextUtils.isEmpty(str9) && TextUtils.isEmpty(optString3)) ? false : true;
        String a5 = a(jSONObject, optString2, a4, str7);
        String p2 = p(optString2);
        String optString5 = jSONObject.optString("ad_id");
        boolean z4 = false;
        if (jSONObject.has("network_name") && jSONObject.getString("network_name").equals(CreativeInfoManager.f29430n) && jSONObject.has(K)) {
            z4 = jSONObject.optBoolean(K);
            Logger.d(f29545y, "parse ad, field is_js_tag_ad value is " + z4);
        }
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, optString5, a5, str9, str2, str3, aI, a4, str5, str4, p2, z3, z2, z4);
        if (this.aP.containsKey(str6)) {
            String remove = this.aP.remove(str6);
            Logger.d(f29545y, "parse ad - found ad unit id: " + remove + ", urlToAdUnitId contains the key url: " + str6);
            appLovinCreativeInfo.e(remove);
        } else {
            k.b(f29545y, "parse ad - urlToAdUnitId contains the key url: " + str6 + " the keys are: " + this.aP.keySet());
        }
        Logger.d(f29545y, "parse ad, adding CI id: " + str + ", CI: " + appLovinCreativeInfo);
        if (adType.equals(BrandSafetyUtils.AdType.BANNER) || adType.equals(BrandSafetyUtils.AdType.MREC)) {
            this.aM.put(str3 + "_" + str4 + "_" + g.f30048a, appLovinCreativeInfo);
            if (str8 != null) {
                aL.put(str, str8);
                this.aM.put(str8, appLovinCreativeInfo);
            }
        }
        String optString6 = jSONObject.optString(Y);
        if (!TextUtils.isEmpty(optString6)) {
            a((CreativeInfo) appLovinCreativeInfo, str6, optString6, true);
        }
        appLovinCreativeInfo.b((List<String>) k.g(optString2));
        if (!TextUtils.isEmpty(optString2)) {
            appLovinCreativeInfo.a(str.hashCode());
        }
        ArrayList<String> arrayList = null;
        if (k.a(str6, aY) || (str7 != null && str7.contains(aH))) {
            arrayList = t(optString2);
        }
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Logger.d(f29545y, "parse ad, json object text " + next);
                appLovinCreativeInfo.A(next);
            }
        }
        return appLovinCreativeInfo;
    }

    private String a(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("zone_id")) {
            return "";
        }
        String string = jSONObject.getString("zone_id");
        Logger.d(f29545y, "generate info - found placement id in zone id - " + string);
        return string;
    }

    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, String str2, String str3, String str4, String str5, JSONObject jSONObject) throws JSONException {
        String str6;
        String optString = jSONObject.optString("ad_id");
        JSONObject jSONObject2 = jSONObject.getJSONObject(af);
        String optString2 = jSONObject2.optString("version");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
        Logger.d(f29545y, "parse native ad, rendering native ad for oRTB version: " + optString2);
        JSONObject optJSONObject = jSONObject3.optJSONObject("native");
        if (optJSONObject == null) {
            Logger.d(f29545y, "parse native ad, no native object, continue...");
        } else {
            jSONObject3 = optJSONObject;
        }
        JSONObject optJSONObject2 = jSONObject3.optJSONObject("link");
        JSONArray jSONArray = jSONObject3.getJSONArray(ak);
        ArrayList arrayList = new ArrayList();
        String str7 = null;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= jSONArray.length()) {
                break;
            }
            JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
            if (jSONObject4.has("title")) {
                JSONObject optJSONObject3 = jSONObject4.optJSONObject("title");
                if (optJSONObject3 != null) {
                    String optString3 = optJSONObject3.optString("text");
                    if (!optString3.isEmpty()) {
                        arrayList.add(CreativeInfo.aM + optString3);
                        Logger.d(f29545y, "parse native ad, processed title: " + optString3);
                    }
                }
            } else if (jSONObject4.has("link")) {
                optJSONObject2 = jSONObject4.optJSONObject("link");
            } else if (jSONObject4.has("img")) {
                int optInt = jSONObject4.optInt("id", -1);
                JSONObject optJSONObject4 = jSONObject4.optJSONObject("img");
                if (optJSONObject4 != null) {
                    int optInt2 = optJSONObject4.optInt("type", -1);
                    String optString4 = optJSONObject4.optString("url");
                    if (!optString4.isEmpty()) {
                        if (3 == optInt || optInt2 == 1) {
                            arrayList.add(CreativeInfo.aO + optString4);
                            Logger.d(f29545y, "parse native ad, processed icon URL: " + optString4);
                        } else if (2 == optInt || optInt2 == 3) {
                            arrayList.add(CreativeInfo.aN + optString4);
                            Logger.d(f29545y, "parse native ad, processed main image URL: " + optString4);
                        } else {
                            Logger.d(f29545y, "parse native ad, unrecognized image: " + jSONObject4);
                            int optInt3 = optJSONObject4.optInt(ar, -1);
                            int optInt4 = optJSONObject4.optInt(as, -1);
                            if (optInt3 <= 0 || optInt4 <= 0) {
                                Logger.d(f29545y, "parse native ad, skipping...");
                            } else if (optInt3 / optInt4 > 1.0d) {
                                Logger.d(f29545y, "parse native ad, inferring main image from " + optInt3 + "x" + optInt4 + ", processed main image URL: " + optString4);
                                arrayList.add(CreativeInfo.aN + optString4);
                            } else {
                                Logger.d(f29545y, "parse native ad, inferring icon image from " + optInt3 + "x" + optInt4 + ", processed icon URL: " + optString4);
                                arrayList.add(CreativeInfo.aO + optString4);
                            }
                        }
                    }
                }
            } else if (jSONObject4.has("video")) {
                JSONObject optJSONObject5 = jSONObject4.optJSONObject("video");
                if (optJSONObject5 != null) {
                    str6 = optJSONObject5.optString(au);
                    Logger.d(f29545y, "parse native ad, processed VAST video: " + str6);
                } else {
                    str6 = str7;
                }
                str7 = str6;
            } else if (jSONObject4.has("data")) {
                int optInt5 = jSONObject4.optInt("id", -1);
                JSONObject optJSONObject6 = jSONObject4.optJSONObject("data");
                if (optJSONObject6 != null) {
                    int optInt6 = optJSONObject6.optInt("type", -1);
                    String optString5 = optJSONObject6.optString("value");
                    if (!optString5.isEmpty()) {
                        if (optInt5 == 8 || optInt6 == 1) {
                            arrayList.add(CreativeInfo.aS + optString5);
                            Logger.d(f29545y, "parse native ad, processed advertiser: " + optString5);
                        } else if (optInt5 == 4 || optInt6 == 2) {
                            arrayList.add(CreativeInfo.aP + optString5);
                            Logger.d(f29545y, "parse native ad, processed body: " + optString5);
                        } else if (optInt5 == 5 || optInt6 == 12) {
                            arrayList.add(CreativeInfo.aQ + optString5);
                            Logger.d(f29545y, "parse native ad, processed cta: " + optString5);
                        } else if (optInt5 == 6 || optInt6 == -1) {
                            arrayList.add(CreativeInfo.aR + optString5);
                            Logger.d(f29545y, "parse native ad, processed star rating: " + optString5);
                        } else {
                            Logger.d(f29545y, "parse native ad, skipping unsupported data: " + jSONObject4);
                        }
                    }
                }
            } else {
                Logger.d(f29545y, "parse native ad, unsupported asset object: " + jSONObject4);
            }
            i2 = i3 + 1;
        }
        String str8 = null;
        ArrayList arrayList2 = new ArrayList();
        if (optJSONObject2 != null) {
            str8 = optJSONObject2.optString("url");
            Logger.d(f29545y, "parse native ad, processed click destination URL: " + str8);
            Logger.d(f29545y, "parse native ad, processed click destination backup URL: " + optJSONObject2.optString(aw));
            JSONArray optJSONArray = optJSONObject2.optJSONArray(ax);
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList2.add(optJSONArray.optString(i4));
                }
                Logger.d(f29545y, "parse native ad, processed click trackers: " + arrayList2);
            }
        }
        JSONArray optJSONArray2 = jSONObject3.optJSONArray(ay);
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                arrayList2.add(optJSONArray2.optString(i5));
            }
            Logger.d(f29545y, "parse native ad, processed imp trackers: " + arrayList2);
        }
        JSONArray optJSONArray3 = jSONObject3.optJSONArray(az);
        if (optJSONArray3 != null) {
            for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                if (optJSONArray3.get(i6) instanceof JSONObject) {
                    JSONObject jSONObject5 = optJSONArray3.getJSONObject(i6);
                    if (jSONObject5.has("url")) {
                        arrayList2.add(jSONObject5.getString("url"));
                    }
                } else {
                    arrayList2.add(optJSONArray3.getString(i6));
                }
            }
            Logger.d(f29545y, "parse native ad, processed event trackers: " + arrayList2);
        }
        if (jSONObject.has(aA)) {
            arrayList2.add(jSONObject.getString(aA));
            Logger.d(f29545y, "parse native ad, processed click tracking URLs: " + arrayList2);
        }
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, optString, str8, null, str2, str3, aI, null, str4, str5, null, false, false, false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            appLovinCreativeInfo.B((String) it.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            appLovinCreativeInfo.x((String) it2.next());
        }
        if (!TextUtils.isEmpty(str7)) {
            a((CreativeInfo) appLovinCreativeInfo, (String) null, str7, false);
            appLovinCreativeInfo.c(CreativeInfo.f29630r);
        }
        Logger.d(f29545y, "parse native ad, new CI detected, ad ID: " + appLovinCreativeInfo.L() + ", event ID: " + appLovinCreativeInfo.m() + ", CI: " + appLovinCreativeInfo);
        this.aN.put(str, appLovinCreativeInfo);
        return appLovinCreativeInfo;
    }

    private String m(String str) {
        return k.a(ba.digest(k.a(str, com.safedk.android.utils.f.aj(), 2, "").replace(aS, "").replaceAll(aT, "$1$3").replaceAll(aU, "$2").replaceAll(aV, "$1$2").replaceAll(aW, "").replaceAll(aX, "$1").getBytes(Charset.defaultCharset())));
    }

    private ArrayList<String> t(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String a2 = a(com.safedk.android.utils.f.ap(), str);
        String a3 = a(com.safedk.android.utils.f.ao(), str);
        Logger.d(f29545y, "found ad text: title=" + a2 + ", description=" + a3);
        arrayList.add(a2);
        arrayList.add(a3);
        return arrayList;
    }

    private void a(String str, Map<String, List<String>> map, JSONArray jSONArray, a aVar) throws JSONException {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                String optString = jSONObject.optString("name");
                String optString2 = jSONObject.optString(U, null);
                String optString3 = jSONObject.optString("creative_id", null);
                String optString4 = jSONObject.optString("third_party_ad_placement_id");
                String optString5 = jSONObject.optString(W, null);
                String str2 = aB;
                JSONObject optJSONObject = jSONObject.optJSONObject(ae);
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString("template");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = aB;
                    }
                }
                Logger.d(f29545y, "parse Max prefetch response started url=" + str + " ,max params = " + aVar.toString());
                a aVar2 = new a(aVar.f29548a, aVar.f29549b, optString4, optString3, optString5, str2);
                if (CreativeInfoManager.c().contains(optString)) {
                    String u2 = u(optString2);
                    if (u2 != null) {
                        Logger.d(f29545y, "parse Max prefetch response " + optString + " " + aVar2.f29549b + " base64 bid response is " + optString2);
                        CreativeInfoManager.a(optString, str, u2, map, aVar2);
                    } else {
                        Logger.d(f29545y, "parse Max prefetch response " + optString + " bidder " + aVar2.f29549b + ", bid response is clcode " + optString2);
                        this.aO.put(optString2, aVar2);
                    }
                } else if (optString2 != null) {
                    Logger.d(f29545y, "parse Max prefetch response " + optString + " " + aVar2.f29549b + " bid response is " + optString2);
                    CreativeInfoManager.a(optString, str, optString2, map, aVar2);
                } else {
                    Logger.d(f29545y, "parse Max prefetch response " + optString + " " + aVar2.f29549b + " bid response empty.");
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    private static String u(String str) {
        if (str != null) {
            String[] split = str.split("!");
            if (split.length == 2) {
                return new String(Base64.decode(split[1], 0));
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean l(String str) {
        Logger.d(f29545y, "should follow get url: " + str);
        return str.contains("4.0/ad");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean b(java.lang.String r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r1 = 1
            r0 = 0
            java.lang.String r2 = "&current_retry_attempt="
            int r2 = r5.indexOf(r2)
            r3 = -1
            if (r2 <= r3) goto L4d
            java.lang.String r2 = r5.substring(r0, r2)
            java.lang.String r5 = s(r2)
            java.util.concurrent.ConcurrentHashMap<com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r2 = r4.f29573s
            com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri r3 = new com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri
            r3.<init>(r5)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L4d
            r2 = r1
        L21:
            if (r2 != 0) goto L31
            java.lang.String r2 = "4.0/ad"
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L31
            boolean r2 = com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.g(r5)
            if (r2 == 0) goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L4c
            java.lang.String r1 = com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29545y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "should follow input stream: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.safedk.android.utils.Logger.d(r1, r2)
        L4c:
            return r0
        L4d:
            r2 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.b(java.lang.String, android.os.Bundle):boolean");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        k.b(f29545y, "get ad ID from resource started, url: " + str2 + ", value: " + str);
        if (str2 != null) {
            try {
                String[] split = str2.split("clcode=");
                if (split.length > 1) {
                    String[] split2 = split[1].split("\"|\\&|&");
                    if (split2.length > 0) {
                        String str3 = split2[0];
                        Logger.d(f29545y, "get ad ID from resource: CI MATCH, adId = " + str3);
                        return str3;
                    }
                } else {
                    Logger.d(f29545y, "get ad ID from resource: cant split string by clcode, url: " + str2);
                }
            } catch (Exception e2) {
                Logger.d(f29545y, "get ad ID from resource: cant extract ad id from: " + str2, e2);
            }
        }
        if (k.s(str)) {
            String m2 = m(str);
            Logger.d(f29545y, "get ad ID from resource: the banner hash is: " + m2);
            if (aK.containsKey(m2)) {
                Logger.d(f29545y, "get ad ID from resource: bannerHtmlHash already in sourceToWebviewRef map - bannerHtmlHash=" + m2);
            }
            if (k.a((Reference<?>) weakReference)) {
                aK.put(m2, weakReference);
            } else {
                Logger.d(f29545y, "get ad id from resource - webview is null, not storing bannerHtmlHash in sourceToWebviewRef");
            }
            if (this.aM.containsKey(m2)) {
                CreativeInfo creativeInfo = this.aM.get(m2);
                if (creativeInfo != null) {
                    String L2 = creativeInfo.L();
                    Logger.d(f29545y, "get ad ID from resource: CI MATCH! : id = " + L2 + ", ci : " + creativeInfo);
                    if (aL.containsKey(L2)) {
                        Logger.d(f29545y, "get ad ID from resource: ad id already in adIdToSource map - adId=" + L2);
                    }
                    aL.put(L2, m2);
                    return L2;
                }
                Logger.d(f29545y, "get ad ID from resource: failed to mach by html hash. will try to extract ad id...");
                String a2 = a(com.safedk.android.utils.f.aP(), str);
                if (a2 == null) {
                    Logger.d(f29545y, "get ad ID from resource: NO MATCH, can't extract clcode from html");
                } else {
                    return a2;
                }
            } else {
                Logger.d(f29545y, "get ad ID from resource: NO MATCH, putting the banner hash into the sourceToWebviewRef");
            }
        } else {
            Logger.d(f29545y, "get ad ID from resource: NO MATCH, putting the value into sourceToWebviewRef");
            if (k.a((Reference<?>) weakReference)) {
                aK.put(str, weakReference);
            } else {
                Logger.d(f29545y, "get ad id from resource - webview is null, not storing value in sourceToWebviewRef");
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        String c2 = c(str, str);
        if (c2 == null) {
            return 0;
        }
        Logger.d(f29545y, String.format("ad id %s, hash code: %s, from webview html: %s, ", c2, Integer.valueOf(c2.hashCode()), str));
        return c2.hashCode();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f29548a;

        /* renamed from: b, reason: collision with root package name */
        public BrandSafetyEvent.AdFormatType f29549b;

        /* renamed from: c, reason: collision with root package name */
        public String f29550c;
        public String d;
        public String e;

        /* renamed from: f, reason: collision with root package name */
        public String f29551f;

        public a(String str, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, String str5) {
            this.f29548a = str;
            this.f29549b = adFormatType;
            this.f29550c = str2;
            this.d = str3;
            this.e = str4;
            this.f29551f = str5;
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType, String str2) {
            this(str, adFormatType, str2, null, null, null);
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType) {
            this(str, adFormatType, null, null, null, null);
        }

        public a(String str) {
            this.f29548a = str;
        }

        public String toString() {
            return "{eventId=" + this.f29548a + ", adFormat=" + this.f29549b + ", placementId=" + this.f29550c + ", creativeId=" + this.d + ", adDomain=" + this.e + '}';
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        CreativeInfo creativeInfo;
        CreativeInfo creativeInfo2;
        if (obj instanceof String) {
            if (((String) obj).startsWith(f29546z)) {
                String u2 = u((String) obj);
                if (u2 != null) {
                    try {
                        String optString = new JSONObject(u2).optString(T);
                        if (!TextUtils.isEmpty(optString)) {
                            creativeInfo2 = this.aN.get(optString);
                            try {
                                Logger.d(f29545y, "match info found, native CI: " + creativeInfo2);
                                return creativeInfo2;
                            } catch (JSONException e2) {
                                Logger.d(f29545y, "match info: failed to parse bid response");
                                return creativeInfo2;
                            }
                        }
                    } catch (JSONException e3) {
                        creativeInfo2 = null;
                    }
                } else {
                    Logger.d(f29545y, "match info: failed to decode bid response");
                }
            } else {
                String str = (String) obj;
                if (this.aM.containsKey(str)) {
                    Logger.d(f29545y, "match info started, complex key = " + str + " , banner CIs key set = " + this.aM.keySet());
                    CreativeInfo creativeInfo3 = this.aM.get(str);
                    Logger.d(f29545y, "match info found, banner CI: " + creativeInfo3);
                    return creativeInfo3;
                }
                Iterator<Map.Entry<String, CreativeInfo>> it = this.aN.entrySet().iterator();
                CreativeInfo creativeInfo4 = null;
                while (it.hasNext()) {
                    Map.Entry<String, CreativeInfo> next = it.next();
                    if (str.equals(next.getValue().m())) {
                        creativeInfo = next.getValue();
                        Logger.d(f29545y, "match info found, native CI: " + creativeInfo);
                        it.remove();
                    } else {
                        creativeInfo = creativeInfo4;
                    }
                    creativeInfo4 = creativeInfo;
                }
                return creativeInfo4;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return "com.applovin.mediation.adapters.AppLovinMediationAdapter";
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        e.a(this.aM, f29545y + ":bannerCreativeInfos", false);
        e.a(this.aN, f29545y + ":nativeCreativeInfos", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return i(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return j(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        if (str != null) {
            if (str.contains(e)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(f29537g)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : f29539i) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        if (str != null && str.contains(e)) {
            return k.c(str, f29536f);
        }
        if (str.contains(f29537g)) {
            return null;
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType g(View view) {
        if (view instanceof AppLovinAdView) {
            AppLovinAdSize size = ((AppLovinAdView) view).getSize();
            if (size.equals(AppLovinAdSize.BANNER) || size.equals(AppLovinAdSize.LEADER)) {
                return BrandSafetyUtils.AdType.BANNER;
            }
            if (size.equals(AppLovinAdSize.MREC)) {
                return BrandSafetyUtils.AdType.MREC;
            }
            if (size.equals(AppLovinAdSize.INTERSTITIAL)) {
                return BrandSafetyUtils.AdType.INTERSTITIAL;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static Bundle a(MaxAd maxAd) {
        Class<? super Object> superclass;
        String str;
        String str2;
        String str3;
        Class<?> cls = maxAd.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        while (true) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            superclass = cls.getSuperclass();
            if (superclass == null || !superclass.getName().startsWith(g.f30048a)) {
                break;
            }
            cls = superclass;
        }
        String str4 = null;
        String str5 = null;
        String str6 = null;
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj = field.get(maxAd);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    k.b(f29545y, "extract data from Max ad, field class: " + superclass + ", type: " + obj.getClass() + ", name: " + field.getName() + ", value: " + obj);
                    str3 = jSONObject.has("event_id") ? jSONObject.getString("event_id") : str6;
                    try {
                        if (jSONObject.has(U)) {
                            String b2 = CreativeInfoManager.b(jSONObject.getString("name"));
                            try {
                                str = jSONObject.getString(U);
                                str2 = b2;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                str = str4;
                                str2 = b2;
                                Logger.e(f29545y, "extract data from Max ad exception: " + e.getMessage(), e);
                                str4 = str;
                                str5 = str2;
                                str6 = str3;
                            } catch (Throwable th) {
                                th = th;
                                str = str4;
                                str2 = b2;
                                Logger.e(f29545y, "extract data from Max ad exception: " + th.getMessage(), th);
                                str4 = str;
                                str5 = str2;
                                str6 = str3;
                            }
                        } else {
                            if (jSONObject.has("name")) {
                                String optString = jSONObject.optString("name");
                                if (!TextUtils.isEmpty(optString)) {
                                    str2 = CreativeInfoManager.b(optString);
                                    if (CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false)) {
                                        str = "";
                                    }
                                }
                            }
                            str = str4;
                            str2 = str5;
                        }
                    } catch (IllegalAccessException e3) {
                        e = e3;
                        str = str4;
                        str2 = str5;
                    } catch (Throwable th2) {
                        th = th2;
                        str = str4;
                        str2 = str5;
                    }
                } else {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                }
                if (str3 != null && str2 != null && str != null) {
                    try {
                        Logger.d(f29545y, "extract data from Max ad, event ID: " + str3 + ", sdk: " + str2 + ", bid response: " + str);
                        Bundle bundle = new Bundle();
                        bundle.putString("eventId", str3);
                        bundle.putString(ServerProtocol.DIALOG_PARAM_SDK_VERSION, str2);
                        bundle.putString("bidResponse", str);
                        return bundle;
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        Logger.e(f29545y, "extract data from Max ad exception: " + e.getMessage(), e);
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                    } catch (Throwable th3) {
                        th = th3;
                        Logger.e(f29545y, "extract data from Max ad exception: " + th.getMessage(), th);
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                    }
                }
            } catch (IllegalAccessException e5) {
                e = e5;
                str = str4;
                str2 = str5;
                str3 = str6;
            } catch (Throwable th4) {
                th = th4;
                str = str4;
                str2 = str5;
                str3 = str6;
            }
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        Iterator<String> it = CreativeInfoManager.f29432p.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                Logger.d(f29545y, "should follow output stream returned TRUE for url " + str);
                return true;
            }
        }
        Logger.d(f29545y, "should follow output stream returned FALSE for url " + str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        if (b(str)) {
            if (TextUtils.isEmpty(str2)) {
                Logger.d(f29545y, "handle on request sent - content is empty");
            } else {
                try {
                    if (k.J(str2)) {
                        JSONObject jSONObject = new JSONObject(str2);
                        k.b(f29545y, "handle on request sent - parsing json. url: " + str + ", content: " + str2);
                        if (jSONObject.has(aC)) {
                            Logger.d(f29545y, "handle on request sent - applovin request json has ad info");
                            JSONObject jSONObject2 = jSONObject.getJSONObject(aC);
                            if (jSONObject2.has(aD)) {
                                String string = jSONObject2.getString(aD);
                                Logger.d(f29545y, "handle on request sent - found ad unit id " + string + " inside the request");
                                this.aP.put(str, string);
                            }
                        }
                    } else {
                        Logger.d(f29545y, "handle on request sent - content is not json. content = " + str2);
                    }
                } catch (Throwable th) {
                    k.b(f29545y, "handle on request sent - exception occurred: " + th.getMessage());
                }
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean i(String str) {
        if (aL.containsKey(str)) {
            return a(aL.get(str), g.f30048a, aK, this.aM, d.f29568p);
        }
        Logger.d(f29545y, "tryReverseMatching with ad id - ad id " + str + " is not in the adIdToSource keys: " + aL.keySet());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void j(String str) {
        String remove = aL.remove(str);
        Logger.d(f29545y, "clean resources started with ad id: " + str + ", and source is: " + remove);
        if (remove != null) {
            aK.remove(remove);
        }
    }
}
