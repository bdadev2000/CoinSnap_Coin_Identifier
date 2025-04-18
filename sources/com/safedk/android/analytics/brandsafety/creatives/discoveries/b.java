package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.i;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends d {
    private static final String A = "pubid";
    private static final String B = "http";
    private static final String C = "intent";
    private static final String D = "market";
    private static final String E = "AdGroup+Creative+ID+0";
    private static final String H = "afma-sdk-a-v";
    private static final String I = "java.util.LinkedHashMap";
    private static final String J = "ignore_this_destination";
    private static final String K = "question";
    private static final String L = "longform_questions";
    private static final String M = "com.google.android.gms.ads.admanager.AdManagerAdView";
    private static final String N = "com.google.android.gms.ads.internal.overlay.g";
    private static final String O = "com.google.android.gms.ads.nativead.NativeAdView";
    private static final String P = "\\{background-image:url\\(([^)]+?)\\)";
    private static final String Q = "ad_json";
    private static final String R = "ads";
    private static final String S = "app_id";
    private static final String T = "headline";
    private static final String U = "image";
    private static final String V = "images";
    private static final String W = "thumbnails";
    private static final String X = "secondary_image";
    private static final String Y = "app_icon";
    private static final String Z = "tracking_urls_and_actions";
    private static final String aa = "click_actions";
    private static final String ab = "impression_tracking_urls";
    private static final String ac = "url";
    private static final String ad = "u2_final_url";
    private static final String ae = "body";
    private static final String af = "call_to_action";
    private static final String ag = "rating";
    private static final String ah = "type";
    private static final String ai = "advertiser";
    private static final String aj = "video";
    private static final String ak = "vast_xml";
    private static final String al = "title:";
    private static final String am = "mainImg:";
    private static final String an = "icon:";
    private static final String ao = "body:";
    private static final String ap = "cta:";
    private static final String aq = "star:";
    private static final String ar = "advertiser:";
    private static final String as = "tpc.googlesyndication.com/gpa_images/simgad/";
    private static final int at = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final String f29515b = "appIcon:";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29516c = "shortAppName:";
    public static final String d = "headline:";
    public static final String e = "description:";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29517f = "image:";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29518g = "ytId:";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29519h = "/store";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29520i = "/store/type2";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29521j = "/brand";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29522k = "destinationUrl";

    /* renamed from: l, reason: collision with root package name */
    private static final String f29523l = "AdMobDiscovery";

    /* renamed from: m, reason: collision with root package name */
    private static final String f29524m = "com.google.android.gms";

    /* renamed from: n, reason: collision with root package name */
    private static final String f29525n = "org.json.JSONObject";

    /* renamed from: y, reason: collision with root package name */
    private static final String f29526y = "ad_html";

    /* renamed from: z, reason: collision with root package name */
    private static final String f29527z = "clickUrl";
    private static final String F = "Backend+Query+ID";
    private static final String G = F.replace("+", "%2B");
    private static final String[] au = {"var url = 'https://googleads.g.doubleclick.net/dbm/ad?dbm_c=", "<div class=\"GoogleActiveViewInnerContainer\"", "src=\"https://googleads.g.doubleclick.net/xbbe/pixel?d", "googleInitIc(document.body"};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f29531a;

        /* renamed from: b, reason: collision with root package name */
        public String f29532b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f29533c;
        public boolean d = true;

        a(String str, String str2, boolean z2) {
            this.f29531a = str;
            this.f29532b = str2;
            this.f29533c = z2;
        }

        public String toString() {
            return "resource: " + this.f29532b + ", element prefix: " + this.f29531a + ", should report as element= " + this.d;
        }
    }

    public b() {
        super(g.f30053h, f29523l, false);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f29572r.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, true);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f29572r.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, false);
        this.f29572r.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, true);
        this.f29572r.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    private long a(View view, List<Object> list, List<String> list2) {
        long currentTimeMillis = System.currentTimeMillis();
        a(view, new ArrayList(), list, new HashSet(), list2);
        long currentTimeMillis2 = System.currentTimeMillis();
        k.b(f29523l, "generate info, travel time " + (currentTimeMillis2 - currentTimeMillis));
        return currentTimeMillis2;
    }

    private int a(List<Object> list) {
        Iterator<Object> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Iterator<String> keys = ((JSONObject) it.next()).keys();
            while (keys.hasNext()) {
                if (keys.next().equals(f29527z)) {
                    i2++;
                }
            }
        }
        Logger.d(f29523l, "generate info - clickUrlsCounter=" + i2);
        return i2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public View h(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                Logger.d(f29523l, "handle native ad reflection - found admob native view: " + childAt);
                return childAt;
            }
        }
        return null;
    }

    private void a(List<List<a>> list, List<List<String>> list2, List<String> list3, List<String> list4, List<f.a> list5, List<List<String>> list6, String str) {
        ArrayList arrayList;
        f.a a2;
        try {
            Logger.d(f29523l, "handle ad json object - started");
            JSONArray jSONArray = new JSONObject(str).getJSONArray(R);
            list3.clear();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                ArrayList arrayList2 = new ArrayList();
                list.add(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                list2.add(arrayList3);
                String optString = jSONObject.optString("app_id");
                if (!TextUtils.isEmpty(optString)) {
                    list4.add(optString);
                }
                String optString2 = jSONObject.optString(T);
                if (!TextUtils.isEmpty(optString2)) {
                    arrayList2.add(new a("title:", optString2, true));
                }
                Logger.d(f29523l, "handle ad json object - title: " + optString2);
                JSONObject optJSONObject = jSONObject.optJSONObject("image");
                if (optJSONObject != null) {
                    String optString3 = optJSONObject.optString("url");
                    if (!TextUtils.isEmpty(optString3)) {
                        arrayList2.add(new a("mainImg:", optString3, false));
                    }
                    Logger.d(f29523l, "handle ad json object - mainImg: " + optString3);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(V);
                if (optJSONArray != null) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        String optString4 = optJSONArray.getJSONObject(i3).optString("url");
                        if (!TextUtils.isEmpty(optString4)) {
                            a aVar = new a("mainImg:", optString4, false);
                            aVar.d = false;
                            arrayList2.add(aVar);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray(W);
                if (optJSONArray2 != null) {
                    for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                        String optString5 = optJSONArray2.getJSONObject(i4).optString("url");
                        if (!TextUtils.isEmpty(optString5)) {
                            a aVar2 = new a("mainImg:", optString5, false);
                            aVar2.d = false;
                            arrayList2.add(aVar2);
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(X);
                if (optJSONObject2 == null) {
                    optJSONObject2 = jSONObject.optJSONObject(Y);
                }
                if (optJSONObject2 != null) {
                    String optString6 = optJSONObject2.optString("url");
                    if (!TextUtils.isEmpty(optString6)) {
                        arrayList2.add(new a("icon:", optString6, false));
                    }
                    Logger.d(f29523l, "handle ad json object - icon: " + optString6);
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject(Z);
                if (optJSONObject3 != null) {
                    JSONArray optJSONArray3 = optJSONObject3.optJSONArray(aa);
                    if (optJSONArray3 != null) {
                        for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                            JSONObject jSONObject2 = optJSONArray3.getJSONObject(i5);
                            if (jSONObject2 != null) {
                                String optString7 = jSONObject2.optString(ad);
                                if (TextUtils.isEmpty(optString7)) {
                                    optString7 = jSONObject2.optString("url");
                                }
                                if (jSONObject2.optInt("type") == 1) {
                                    list3.add(0, optString7);
                                } else {
                                    list3.add(optString7);
                                }
                            }
                        }
                        Logger.d(f29523l, "handle ad json object - clickUrlList: " + list3);
                    }
                    JSONArray optJSONArray4 = optJSONObject3.optJSONArray(ab);
                    if (optJSONArray4 != null) {
                        for (int i6 = 0; i6 < optJSONArray4.length(); i6++) {
                            arrayList3.add(optJSONArray4.getString(i6));
                        }
                    }
                }
                String optString8 = jSONObject.optString("body");
                if (!TextUtils.isEmpty(optString8)) {
                    arrayList2.add(new a("body:", optString8, true));
                }
                Logger.d(f29523l, "handle ad json object - body: " + optString8);
                String optString9 = jSONObject.optString(af);
                if (!TextUtils.isEmpty(optString9)) {
                    arrayList2.add(new a("cta:", optString9, true));
                }
                Logger.d(f29523l, "handle ad json object - cta: " + optString9);
                String optString10 = jSONObject.optString(ag);
                if (!TextUtils.isEmpty(optString10)) {
                    arrayList2.add(new a("star:", optString10, true));
                }
                Logger.d(f29523l, "handle ad json object - star: " + optString10);
                String optString11 = jSONObject.optString(ai);
                if (!TextUtils.isEmpty(optString11)) {
                    arrayList2.add(new a("advertiser:", optString11, true));
                }
                Logger.d(f29523l, "handle ad json object - advertiser: " + optString11);
                JSONObject optJSONObject4 = jSONObject.optJSONObject("video");
                if (optJSONObject4 != null) {
                    String optString12 = optJSONObject4.optString(ak);
                    if (!TextUtils.isEmpty(optString12) && (a2 = a(optString12, (List<String>) (arrayList = new ArrayList()))) != null) {
                        list5.add(a2);
                        list6.add(arrayList);
                    }
                }
            }
            Logger.d(f29523l, "handle ad json object - appPackageNameList: " + list4);
            Logger.d(f29523l, "handle ad json object - clickUrlList: " + list3);
            Logger.d(f29523l, "handle ad json object - nativeAdElementsLists: " + list);
            Logger.d(f29523l, "handle ad json object - nativeBannerDspResourcesLists: " + list2);
            Logger.d(f29523l, "handle ad json object - vastAdInfoList: " + list5);
            Logger.d(f29523l, "handle ad json object - vastAdUrisList: " + list6);
        } catch (Exception e2) {
            Logger.d(f29523l, "handle ad json object - encountered exception: " + e2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, boolean z2) {
        BrandSafetyUtils.AdType a2;
        ArrayList arrayList;
        List<String> arrayList2;
        List<String> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str2;
        ArrayList arrayList10;
        String str3;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str4;
        ArrayList arrayList16;
        ArrayList arrayList17;
        StringBuilder sb;
        boolean z3;
        String str5;
        boolean z4;
        ArrayList<String> arrayList18;
        List<String> list;
        boolean z5;
        int i2;
        long currentTimeMillis;
        List<String> list2;
        String str6;
        List<String> list3;
        String v2;
        String b2;
        List<String> list4;
        boolean z6;
        String str7;
        String str8;
        int i3;
        String str9;
        List<String> list5;
        List<String> list6;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        ArrayList arrayList19 = new ArrayList();
        try {
            Logger.d(f29523l, "generate info started, view: " + weakReference.get());
            long measuredHeight = weakReference.get().getMeasuredHeight();
            long measuredWidth = weakReference.get().getMeasuredWidth();
            Logger.d(f29523l, "generate info View check. adInstance is a View, visibility = " + weakReference.get().getVisibility() + ", dimensions (height= " + measuredHeight + ", width=" + measuredWidth + ")");
            a2 = BrandSafetyUtils.a(measuredWidth, measuredHeight);
            long currentTimeMillis2 = System.currentTimeMillis();
            arrayList = new ArrayList();
            ArrayList<JSONObject> arrayList20 = new ArrayList();
            long a3 = a(weakReference.get(), arrayList20, arrayList);
            ArrayList arrayList21 = new ArrayList();
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            arrayList4 = new ArrayList();
            arrayList5 = new ArrayList();
            arrayList6 = new ArrayList();
            arrayList7 = new ArrayList();
            arrayList8 = new ArrayList();
            arrayList9 = new ArrayList();
            str2 = null;
            arrayList10 = new ArrayList();
            str3 = null;
            arrayList11 = new ArrayList();
            arrayList12 = new ArrayList();
            arrayList13 = new ArrayList();
            arrayList14 = new ArrayList();
            arrayList15 = new ArrayList();
            str4 = null;
            arrayList16 = new ArrayList();
            arrayList17 = new ArrayList();
            sb = new StringBuilder("b|");
            sb.append(currentTimeMillis2).append(ImpressionLog.Q);
            sb.append(a3).append(ImpressionLog.Q);
            sb.append(arrayList.size()).append(ImpressionLog.Q);
            sb.append(arrayList20.size()).append(ImpressionLog.Q);
            HashSet hashSet = new HashSet();
            sb.append(ImpressionLog.Q).append("CLC=").append(a((List<Object>) arrayList20)).append(ImpressionLog.Q);
            z3 = false;
            String str10 = null;
            int i4 = 0;
            str5 = null;
            z4 = false;
            arrayList18 = null;
            list = arrayList21;
            z5 = true;
            i2 = -1;
            for (JSONObject jSONObject : arrayList20) {
                Iterator<String> keys = jSONObject.keys();
                boolean z7 = z3;
                String str11 = str10;
                int i5 = i4;
                String str12 = str5;
                boolean z8 = z4;
                String str13 = str4;
                String str14 = str3;
                List<String> list7 = arrayList3;
                List<String> list8 = arrayList2;
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    int max = Math.max(i2, z(string));
                    boolean z9 = z8 | (max > 1);
                    k.b(f29523l, "generate info, found ad part - key: " + next + ", is multi ad? " + z9 + ", ad count: " + max + ", value: " + string);
                    sb.append(ImpressionLog.Q);
                    sb.append(next);
                    sb.append("->");
                    list = m(string);
                    boolean z10 = !hashSet.contains(next);
                    hashSet.add(next);
                    if (next.equals(Q)) {
                        a(arrayList16, arrayList17, list7, arrayList10, arrayList14, arrayList13, string);
                        if (arrayList14.isEmpty()) {
                            str6 = str14;
                        } else {
                            str6 = str14 == null ? CreativeInfo.f29630r : str14 + CreativeInfo.f29630r;
                        }
                        z7 = true;
                        list3 = list7;
                    } else if (next.equals(f29526y)) {
                        Logger.d(f29523l, "generate info, processing ad html");
                        z5 = false;
                        ArrayList<String> arrayList22 = new ArrayList();
                        a(string, arrayList22, arrayList15);
                        Logger.d(f29523l, "generate info, vastAdBlocks contains " + arrayList22.size() + " items");
                        if (!arrayList22.isEmpty()) {
                            i3 = Math.max(max, arrayList22.size());
                            Logger.d(f29523l, "generate info, processing vast blocks ad count: " + i3);
                            sb.append(CreativeInfo.f29630r);
                            sb.append("&");
                            String str15 = string;
                            for (String str16 : arrayList22) {
                                str15 = str15.replace(str16, "");
                                ArrayList arrayList23 = new ArrayList();
                                f.a a4 = a(str16, (List<String>) arrayList23);
                                if (a4 != null) {
                                    Logger.d(f29523l, "generate info, vast info found, ad id: " + a4.c());
                                    arrayList14.add(a4);
                                    arrayList13.add(arrayList23);
                                    if (!z10) {
                                        sb.append("sk&");
                                        if (a4 != null) {
                                            sb.append(CreativeInfo.f29630r);
                                            sb.append("&");
                                            sb.append("c=" + a4.a());
                                            sb.append("&i=" + a4.c());
                                        }
                                    }
                                }
                            }
                            str7 = str15;
                            v2 = str12;
                            b2 = str13;
                            str8 = CreativeInfo.f29630r;
                            list4 = list7;
                        } else {
                            String k2 = k.k(string);
                            v2 = v(k2);
                            String g2 = g(g(k2, "app-open-publisher-tab-holder"), "advertisement-top");
                            b2 = b(string, arrayList11, a(g2, arrayList11, str13, sb), sb);
                            String o2 = o(g2);
                            if (o2 != null) {
                                ArrayList arrayList24 = new ArrayList();
                                arrayList24.add(o2);
                                sb.append("dd_c&");
                                list4 = arrayList24;
                            } else {
                                String B2 = B(g2);
                                if (B2 != null) {
                                    Logger.d(f29523l, "generate info - found click url inside html, url: " + B2);
                                    Iterator<String> it = list7.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z6 = true;
                                            break;
                                        }
                                        String next2 = it.next();
                                        if (next2 != null && !next2.contains(J)) {
                                            z6 = false;
                                            break;
                                        }
                                    }
                                    if (z6) {
                                        list7 = new ArrayList<>();
                                        list7.add(B2);
                                        sb.append("dd_c&");
                                    }
                                    list4 = list7;
                                } else {
                                    Logger.d(f29523l, "generate info - did not find click url");
                                    list4 = list7;
                                }
                            }
                            arrayList10.add(p(g2));
                            String t2 = t(string);
                            if (!TextUtils.isEmpty(t2)) {
                                arrayList.add("element:ytId:" + t2);
                            }
                            str7 = string;
                            str8 = str14;
                            i3 = max;
                        }
                        if (com.safedk.android.utils.f.ab().matcher(string).find()) {
                            sb.append("playable");
                            sb.append("&");
                            b2 = "playable";
                        }
                        Logger.d(f29523l, "generate info - is multi? " + z9);
                        if (z9) {
                            String a5 = a(i3, string, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9);
                            if (str8 == null) {
                                str8 = "";
                            }
                            str8 = str8 + a5 + CreativeInfo.aH + i3;
                            sb.append(str8);
                            sb.append("&");
                        }
                        String str17 = str8;
                        arrayList18 = k.f(str7);
                        if (v2 != null && arrayList18.contains(v2)) {
                            arrayList18.remove(v2);
                            k.b(f29523l, "generate info, removed app icon url: " + v2);
                        }
                        if (u(string)) {
                            Logger.d(f29523l, "generate info, all mraid string found, marking this ad as mraid");
                            sb.append("mraidStringFound&");
                        }
                        for (int i6 = 0; i6 < arrayList18.size(); i6++) {
                            String k3 = k.k(arrayList18.get(i6));
                            arrayList18.set(i6, k3);
                            Logger.d(f29523l, "htmlUrls url = " + k3);
                        }
                        k.b(f29523l, "generate info, html: " + string);
                        if (k.s(string)) {
                            Logger.d(f29523l, "generate info, content is Html content");
                            str9 = v(string);
                            String g3 = g(g(string, "app-open-publisher-tab-holder"), "advertisement-top");
                            ArrayList<String> f2 = k.f(g3);
                            k.b(f29523l, "generate info, urls extracted from source: " + f2);
                            if (str9 != null && f2.contains(str9)) {
                                f2.remove(str9);
                                k.b(f29523l, "generate info, removed app icon url: " + str9);
                            }
                            if (f2 != null && f2.size() > 0) {
                                ArrayList arrayList25 = new ArrayList();
                                Iterator<String> it2 = f2.iterator();
                                while (it2.hasNext()) {
                                    String replaceAll = k.k(it2.next()).replaceAll("&quot;", "&");
                                    if (replaceAll != null && k.a((Object) replaceAll)) {
                                        arrayList25.add(replaceAll);
                                    } else {
                                        Logger.d(f29523l, "generate info, sanitizedUrl is not a url: " + replaceAll);
                                    }
                                }
                                k.b(f29523l, "generate info, Html content sanitized urls: " + arrayList25);
                                arrayList18.addAll(arrayList25);
                            }
                            b(g3, (List<String>) arrayList12);
                            if (k.a((Collection<?>) list4) && g3.contains(f29522k)) {
                                List<String> y2 = y(g3);
                                sb.append("dc2&");
                                sb.append(y2).append("&");
                                Logger.d(f29523l, "generate info, click urls (Destination Url): " + y2);
                                list3 = y2;
                            } else {
                                list3 = list4;
                            }
                        } else {
                            str9 = v2;
                            list3 = list4;
                        }
                        str12 = str9;
                        str13 = b2;
                        str6 = str17;
                        max = i3;
                    } else if (next.equals("pubid")) {
                        if (!z10) {
                            sb.append("sk&");
                            sb.append(string.substring(0, string.lastIndexOf(47)));
                            z8 = z9;
                            i2 = max;
                        } else {
                            str2 = string.substring(0, string.lastIndexOf(47));
                            Logger.d(f29523l, "generate info, placement ID: " + str2);
                            z5 = false;
                            sb.append(str2);
                            sb.append("&");
                            str6 = str14;
                            list3 = list7;
                        }
                    } else if (next.equals(f29527z)) {
                        i5++;
                        if (i5 == 1) {
                            Logger.d(f29523l, "generate info, first click url: " + string);
                            str11 = string;
                        } else if (str11 != null) {
                            Logger.d(f29523l, "generate info, new click url: " + string);
                            if (str11.equals(string)) {
                                Logger.d(f29523l, "generate info, the click url with index: " + i5 + " has the same value as the first, so skipping!");
                                z8 = z9;
                                i2 = max;
                            } else {
                                sb.append("||different_clickUrl_found||");
                                Logger.d(f29523l, "generate info, click url index: " + i5 + " is NOT equal to the first one which is: " + str11);
                            }
                        }
                        Map<String, String> a6 = k.a(string, false);
                        if (a6.containsKey(F) || a6.containsKey(G)) {
                            String str18 = a6.containsKey(F) ? a6.get(F) : a6.get(G);
                            if (str != null && !str.equals(str18)) {
                                Logger.d(f29523l, "generate info, for click index: " + i5 + " max creative id is: " + str + " vs backend query id: " + str18);
                            }
                        }
                        sb.append(string).append("&");
                        if (!z10) {
                            Logger.d("generate info, should process key is false, skipping click url for now");
                            sb.append("sk&");
                            sb.append("c=").append(x(string));
                            sb.append("&i=").append(a(string, false));
                            z8 = z9;
                            i2 = max;
                        } else {
                            Logger.d(f29523l, "generate info, click url value: " + string + ", clickUrlList = " + list7);
                            if (k.a((Collection<?>) list7)) {
                                List<String> x = x(string);
                                sb.append("dc2&");
                                sb.append(x).append("&");
                                Logger.d(f29523l, "generate info, click urls: " + x);
                                list5 = x;
                            } else {
                                list5 = list7;
                            }
                            if (list8 == null || list8.isEmpty()) {
                                List<String> a7 = a(string, false);
                                Logger.d(f29523l, "generate info, creative ID: " + a7);
                                list6 = a7;
                            } else {
                                list6 = list8;
                            }
                            z5 = false;
                            str6 = str14;
                            list3 = list5;
                            list8 = list6;
                        }
                    } else {
                        str6 = str14;
                        list3 = list7;
                    }
                    if (z9 && str6 != null && !str6.contains(CreativeInfo.aJ)) {
                        str6 = str6 + CreativeInfo.aJ;
                        sb.append("&multiple_ads");
                    }
                    z8 = z9;
                    str14 = str6;
                    list7 = list3;
                    i2 = max;
                }
                z3 = z7;
                str10 = str11;
                i4 = i5;
                str5 = str12;
                z4 = z8;
                str4 = str13;
                str3 = str14;
                arrayList3 = list7;
                arrayList2 = list8;
            }
            currentTimeMillis = System.currentTimeMillis();
            Logger.d(f29523l, "generate info, json build time: " + (currentTimeMillis - a3));
        } catch (Throwable th) {
            Logger.e(f29523l, "Exception in generate info: " + th.getMessage(), th);
        }
        if (z5) {
            Logger.d(f29523l, "generate info, prefetch is NULL");
            return null;
        }
        if (!arrayList14.isEmpty()) {
            a(arrayList14, arrayList2, arrayList3, arrayList4, sb);
        }
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            if (arrayList3.get(i7) != null && arrayList3.get(i7).contains(J)) {
                arrayList3.set(i7, null);
            }
        }
        if (str3 == null) {
            str3 = str4;
        } else if (str4 != null) {
            str3 = str3 + ImpressionLog.Q + str4;
        }
        Logger.d(f29523l, "generate info, downstream struct: " + str3 + ", adCount = " + i2);
        Logger.d(f29523l, "generate info, click url list size is: " + arrayList3.size());
        if (i2 > 0 && arrayList3.size() != i2) {
            Logger.d(f29523l, "generate info, mismatched between click url list size and ad count");
        }
        Logger.d(f29523l, "generate info, app package name is: " + arrayList10 + " placement id is: " + str2 + " first creative id is: " + (arrayList2.size() > 0 ? arrayList2.get(0) : "null"));
        int i8 = 0;
        while (i8 < i2) {
            CreativeInfo adMobCreativeInfo = new AdMobCreativeInfo(null, a2, arrayList2.size() > i8 ? arrayList2.get(i8) : null, arrayList3.size() > i8 ? arrayList3.get(i8) : null, str2, arrayList4.size() > i8 ? arrayList4.get(i8) : null, this.f29575v, str3, arrayList10.size() > i8 ? arrayList10.get(i8) : null);
            Logger.d(f29523l, "generate info - set click url of CI to - " + adMobCreativeInfo.M());
            if (str5 != null) {
                adMobCreativeInfo.G(str5);
                Logger.d(f29523l, "generate info, application icon url added to ci WebView urls exclusion list : " + str5);
            }
            k.b(f29523l, "created ci : " + adMobCreativeInfo);
            sb.append(ImpressionLog.Q);
            sb.append(currentTimeMillis).append(ImpressionLog.Q);
            sb.append(arrayList.size()).append(ImpressionLog.Q);
            sb.append(arrayList18 == null ? "e" : Integer.valueOf(arrayList18.size())).append(ImpressionLog.Q);
            if (i8 < arrayList14.size()) {
                f.a aVar = arrayList14.get(i8);
                if (aVar != null) {
                    sb.append(aVar.j() == null ? "v" : Integer.valueOf(aVar.j().size()));
                }
                adMobCreativeInfo.b((List<String>) arrayList);
                if (!z4) {
                    adMobCreativeInfo.b((List<String>) arrayList18);
                }
                a(adMobCreativeInfo, aVar, (String) null);
            } else {
                k.b(f29523l, "generate info, adCount is 1");
                if (i2 == 1) {
                    adMobCreativeInfo.b((List<String>) arrayList);
                    adMobCreativeInfo.b((List<String>) arrayList18);
                } else {
                    Logger.d(f29523l, "ad count is > 1 , not adding prefetch urls");
                }
            }
            k.b(f29523l, "generate info, creative info urls = " + adMobCreativeInfo.s());
            if (i8 < arrayList13.size() && (list2 = arrayList13.get(i8)) != null) {
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    adMobCreativeInfo.C(it3.next());
                }
            }
            Logger.d(f29523l, "generate info, downstreamSubtype: " + str4 + ", inter text collection: " + arrayList11);
            if (str4 != null && !str4.equals(CreativeInfo.f29630r) && arrayList11.size() > 3) {
                for (String str19 : arrayList11) {
                    Logger.d(f29523l, "generate info, inter ad text: " + str19);
                    adMobCreativeInfo.A(str19);
                }
            }
            if ((a2.equals(BrandSafetyUtils.AdType.BANNER) || a2.equals(BrandSafetyUtils.AdType.MREC)) && arrayList12.size() > 0) {
                for (String str20 : arrayList12) {
                    Logger.d(f29523l, "generate info, banner/mrec ad text: " + str20);
                    adMobCreativeInfo.A(str20);
                }
            }
            if (z4) {
                adMobCreativeInfo.ai();
                if (i8 < arrayList5.size() && arrayList5.get(i8) != null) {
                    adMobCreativeInfo.B(f29515b + ((String) arrayList5.get(i8)));
                }
                if (i8 < arrayList6.size() && arrayList6.get(i8) != null) {
                    adMobCreativeInfo.B(f29516c + ((String) arrayList6.get(i8)));
                }
                if (i8 < arrayList7.size() && arrayList7.get(i8) != null) {
                    adMobCreativeInfo.B(d + ((String) arrayList7.get(i8)));
                }
                if (i8 < arrayList8.size() && arrayList8.get(i8) != null) {
                    adMobCreativeInfo.B(e + ((String) arrayList8.get(i8)));
                }
                if (i8 < arrayList9.size() && arrayList9.get(i8) != null) {
                    adMobCreativeInfo.B(f29517f + ((String) arrayList9.get(i8)));
                }
            }
            if (i8 < arrayList15.size() && arrayList15.get(i8) != null) {
                adMobCreativeInfo.B(f29518g + ((String) arrayList15.get(i8)));
            }
            if (i8 < arrayList16.size()) {
                for (a aVar2 : arrayList16.get(i8)) {
                    Logger.d(f29523l, "generate info - add prefetch element= " + aVar2);
                    if (z2) {
                        if (!aVar2.d) {
                            adMobCreativeInfo.z(aVar2.f29532b);
                        } else {
                            adMobCreativeInfo.B(aVar2.f29531a + aVar2.f29532b);
                        }
                    } else if (aVar2.f29533c) {
                        adMobCreativeInfo.A(aVar2.f29532b);
                    } else {
                        adMobCreativeInfo.z(aVar2.f29532b);
                    }
                }
            }
            if (i8 < arrayList17.size()) {
                Iterator<String> it4 = arrayList17.get(i8).iterator();
                while (it4.hasNext()) {
                    adMobCreativeInfo.w(it4.next());
                }
            }
            if (z3 && i8 < arrayList10.size()) {
                adMobCreativeInfo.q(arrayList10.get(i8));
            }
            adMobCreativeInfo.u(sb.toString());
            if (i8 < list.size()) {
                adMobCreativeInfo = b(list.get(i8), adMobCreativeInfo);
            } else {
                Logger.d(f29523l, "generate info, click string is empty, cannot check if scar CI exists");
            }
            c(adMobCreativeInfo);
            Logger.d(f29523l, "generate info, generated info is: " + adMobCreativeInfo);
            arrayList19.add(adMobCreativeInfo);
            i8++;
        }
        return arrayList19;
    }

    private static void c(CreativeInfo creativeInfo) {
        int i2 = 0;
        Iterator<String> it = creativeInfo.s().iterator();
        while (true) {
            int i3 = i2;
            if (it.hasNext()) {
                String next = it.next();
                if (k.d(com.safedk.android.utils.f.aO(), next) || next.contains(as)) {
                    i2 = i3 + 1;
                    if (i2 >= 3) {
                        Logger.d(f29523l, "generate info, shopping collage creative detected");
                        creativeInfo.C();
                        return;
                    }
                } else {
                    i2 = i3;
                }
            } else {
                return;
            }
        }
    }

    public static void a(String str, List<String> list, List<String> list2) {
        Matcher matcher = com.safedk.android.utils.f.X().matcher(str);
        boolean z2 = false;
        while (matcher.find()) {
            a(matcher.group(1), list, list2, Integer.parseInt(matcher.group(2)));
            z2 = true;
        }
        if (!z2) {
            a(str, list, list2, 0);
        }
    }

    private static void a(String str, List<String> list, List<String> list2, int i2) {
        String e2 = k.e(com.safedk.android.utils.f.c(), str);
        if (e2 != null) {
            k.b(f29523l, "extractVastBlock adding vastBlock : " + e2);
            list.add(i2, e2);
        }
        String e3 = k.e(com.safedk.android.utils.f.W(), str);
        if (e3 == null) {
            e3 = k.e(com.safedk.android.utils.f.V(), str);
        }
        if (e3 != null) {
            k.b(f29523l, "extractVastBlock adding youtubeVideoId : " + e3);
            list2.add(i2, e3);
        }
    }

    public static String a(int i2, String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        String str2;
        String str3;
        int i3 = 0;
        List<Integer> b2 = k.b(com.safedk.android.utils.f.U(), str);
        if (!b2.isEmpty()) {
            str3 = f29519h;
            str2 = k.a(str.substring(b2.get(0).intValue()), 0);
        } else {
            str2 = str;
            str3 = f29520i;
        }
        Logger.d(f29523l, "end card div is null? " + (str2 == null));
        if (str2 != null) {
            List<Integer> b3 = k.b(com.safedk.android.utils.f.T(), str2);
            Logger.d(f29523l, "poddingCardDivOffsetList: " + b3);
            if (b3.size() >= i2) {
                while (i3 < i2) {
                    String a2 = k.a(str2, b3.get(i3).intValue());
                    list2.add(k.a(com.safedk.android.utils.f.R(), a2, 1));
                    list3.add(k.a(com.safedk.android.utils.f.Q(), a2, 1));
                    list4.add(k.a(com.safedk.android.utils.f.P(), a2, 1));
                    list.add(k.a(Pattern.compile(k.a(com.safedk.android.utils.f.S(), a2, 1) + P), str, 1));
                    list5.add(k.a(Pattern.compile(k.a(com.safedk.android.utils.f.O(), a2, 1) + P), str, 1));
                    i3++;
                }
                return str3;
            }
        }
        List<String> b4 = k.b(com.safedk.android.utils.f.O(), str, 1);
        Logger.d(f29523l, "imageUrlClassList: " + b4);
        if (b4.size() < i2) {
            return "";
        }
        while (i3 < i2) {
            list5.add(k.a(Pattern.compile(b4.get(i3) + P), str, 1));
            i3++;
        }
        Logger.d(f29523l, "extract Multi Ad Additional Elements - found brand downstream struct");
        return f29521j;
    }

    private void a(List<f.a> list, List<String> list2, List<String> list3, List<String> list4, StringBuilder sb) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < list.size()) {
                f.a aVar = list.get(i3);
                list4.add(i3, aVar.b());
                if (aVar.b() != null) {
                    sb.append("dv&");
                }
                if (aVar.a() != null) {
                    if (i3 >= list3.size()) {
                        list3.add(i3, aVar.a());
                    } else {
                        list3.set(i3, aVar.a());
                    }
                    sb.append("dc&");
                }
                sb.append("&c=" + aVar.a() + "&");
                if (aVar.c() != null) {
                    if (i3 >= list2.size()) {
                        list2.add(i3, aVar.c());
                    } else {
                        list2.set(i3, aVar.c());
                    }
                    Logger.d(f29523l, "generate info, Using ad id from vast: " + aVar.c());
                    sb.append("debugi&");
                }
                sb.append("&i=" + aVar.c() + "&");
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    private String t(String str) {
        String group;
        Matcher matcher = com.safedk.android.utils.f.Y().matcher(str);
        if (!matcher.find() || (group = matcher.group(2)) == null || group.length() > 20) {
            return null;
        }
        return group;
    }

    private String a(String str, List<String> list, String str2, StringBuilder sb) {
        String replaceAll;
        String replaceAll2 = str.replaceAll("<script\\b[^>]*>[\\s\\S]*?<\\/script\\b[^>]*>", "");
        k.b(f29523l, "generate info, sanitized html is: " + replaceAll2);
        Matcher matcher = com.safedk.android.utils.f.ad().matcher(replaceAll2);
        while (matcher.find()) {
            if (matcher.groupCount() > 1 && (replaceAll = matcher.group(2).replace("<br>", " ").replaceAll("<[^>]*>", "")) != null && replaceAll.length() > 0) {
                Logger.d(f29523l, "generate info, found ad text: " + replaceAll + ", decoded: " + k.k(replaceAll));
                list.add(k.k(replaceAll));
            }
            str2 = "text";
            sb.append("text");
            sb.append("&");
            if (k.d(com.safedk.android.utils.f.aa(), str)) {
                str2 = "image";
                sb.append("image");
                sb.append("&");
            }
        }
        return str2;
    }

    private String b(String str, List<String> list, String str2, StringBuilder sb) {
        Matcher matcher = com.safedk.android.utils.f.ac().matcher(str);
        if (matcher.find()) {
            try {
                JSONArray jSONArray = new JSONObject(k.k(matcher.group(1))).getJSONArray(L);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getJSONObject(i2).getString(K);
                    Logger.d(f29523l, "generate info, found ad survey text: " + string);
                    list.add(string);
                }
                return CreativeInfo.f29631s;
            } catch (Throwable th) {
                Logger.d(f29523l, "generate info, error parsing ad survey text: " + th.getMessage());
                return CreativeInfo.f29631s;
            } finally {
                sb.append(CreativeInfo.f29631s);
                sb.append("&");
            }
        }
        return str2;
    }

    private void b(String str, List<String> list) {
        String replaceAll;
        String replaceAll2 = str.replaceAll("<script\\b[^>]*>[\\s\\S]*?<\\/script\\b[^>]*>", "");
        k.b(f29523l, "generate info, sanitized  html is: " + replaceAll2);
        Matcher matcher = com.safedk.android.utils.f.ad().matcher(replaceAll2);
        while (matcher.find()) {
            if (matcher.groupCount() > 1 && (replaceAll = matcher.group(2).replace("<br>", " ").replaceAll("<[^>]*>", "")) != null && replaceAll.length() > 0) {
                Logger.d(f29523l, "generate info, found ad text: " + replaceAll + ", decoded: " + k.k(replaceAll));
                list.add(k.k(replaceAll));
            }
        }
    }

    private boolean u(String str) {
        Logger.d(f29523l, "isMraidAd started ");
        for (String str2 : au) {
            if (!str.contains(str2)) {
                return false;
            }
            Logger.d(f29523l, "isMraidAd ad html contains the string " + str2);
        }
        Logger.d(f29523l, "isMraidAd ad is an mraid ad");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e() {
        Logger.d(f29523l, "get SDK version - checking version for Admob " + this.f29575v);
        if (this.f29575v == null) {
            this.f29575v = SdksMapping.getSdkVersionByPackage(g.f30053h);
            Logger.d(f29523l, "get SDK version - version is " + this.f29575v);
        }
    }

    private CreativeInfo b(String str, CreativeInfo creativeInfo) {
        if (BrandSafetyUtils.AdType.INTERSTITIAL == creativeInfo.K()) {
            Logger.d(f29523l, "handle scar-admob-video ad started, click string: " + str + ", CI: " + creativeInfo);
            if (SafeDK.getInstance().y().i(g.f30056k)) {
                AdNetworkDiscovery h2 = CreativeInfoManager.h(g.f30056k);
                if (h2 != null) {
                    CreativeInfo a2 = h2.a((Object) str);
                    if (a2 != null) {
                        k.b(f29523l, "handle scar-admob-video ad, found origin SDK: " + a2.Q() + ", actual SDK: " + creativeInfo.Q());
                        a2.a(creativeInfo);
                        return a2;
                    }
                    Logger.d(f29523l, "handle scar-admob-video ad - no CI matched, actual SDK: " + creativeInfo.Q());
                    return creativeInfo;
                }
                Logger.d(f29523l, "handle scar-admob-video ad - no UnityAdsDiscovery found");
                return creativeInfo;
            }
            if (!SafeDK.getInstance().y().i(g.f30053h)) {
                Logger.d(f29523l, "handle scar-admob-video ad - no interstitial info found for package name: com.google.ads");
                return creativeInfo;
            }
            return creativeInfo;
        }
        return creativeInfo;
    }

    private String v(String str) {
        List<String> b2 = k.b(com.safedk.android.utils.f.N(), str, 3);
        if (b2 != null) {
            Iterator<String> it = b2.iterator();
            if (it.hasNext()) {
                String next = it.next();
                Logger.d(f29523l, "findPublisherAppIconUrl match  : " + next);
                return next;
            }
        }
        return null;
    }

    public String g(String str, String str2) {
        MatchResult matchResult;
        if (str.contains(str2)) {
            Iterator<MatchResult> it = k.c(Pattern.compile("<div|class=(?:\\\"|')" + str2 + "(?:\\\"|')|</div>"), str).iterator();
            int i2 = 0;
            boolean z2 = false;
            MatchResult matchResult2 = null;
            while (true) {
                if (!it.hasNext()) {
                    matchResult = null;
                    break;
                }
                matchResult = it.next();
                if (z2) {
                    if (matchResult.group().equals("<div")) {
                        i2++;
                    } else if (matchResult.group().equals("</div>")) {
                        i2--;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
                if (matchResult.group().contains(str2)) {
                    z2 = true;
                    i2++;
                } else {
                    matchResult = matchResult2;
                }
                matchResult2 = matchResult;
            }
            if (matchResult2 != null && matchResult != null) {
                String substring = str.substring((matchResult2.start() - "<div".length()) - 1, matchResult.end());
                Logger.d(f29523l, "find app icon url  remove element by className removing this matched string : " + substring);
                return str.replace(substring, "");
            }
            return str;
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean l(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    public f.a a(String str, List<String> list) {
        Logger.d(f29523l, "getVastInfoRecursive started");
        f.a b2 = f.b(str, true, g.f30053h);
        if (b2 == null) {
            return null;
        }
        String c2 = b2.c();
        String d2 = b2.d();
        List<String> i2 = b2.i();
        List<String> o2 = b2.o();
        List<String> n2 = b2.n();
        List<String> p2 = b2.p();
        List<String> q2 = b2.q();
        Logger.d(f29523l, "get vast info - saved ad ID: " + c2 + ", ad system: " + d2 + " and impression urls: " + i2);
        k.b(f29523l, "get vast info - " + b2);
        while (true) {
            if (b2 != null && b2.e() != null) {
                Logger.d(f29523l, "get vast info - fetching vast ad uri: " + b2.e());
                list.add(b2.e());
                String w = w(b2.e());
                k.b(f29523l, "get vast info -  ad tag uri content=" + w);
                if (!TextUtils.isEmpty(w)) {
                    b2 = f.b(w, true, g.f30053h);
                    k.b(f29523l, "get vast info recursive: " + b2);
                } else {
                    Logger.d(f29523l, "get vast info -  ad tag uri content is empty");
                    break;
                }
            } else {
                break;
            }
        }
        if (b2 != null) {
            if (b2.c().equals(c2)) {
                b2.a(c2);
                Logger.d(f29523l, "get vast info - saved adId from outer vast: " + c2);
            }
            if (b2.d().equals(d2)) {
                b2.b(d2);
                Logger.d(f29523l, "get vast info - saved adSystem from outer vast: " + d2);
            }
            if (i2 != null) {
                b2.a(i2);
                Logger.d(f29523l, "get vast info - saved impressionUrls from outer vast: " + i2);
            }
            if (o2 != null) {
                b2.c(o2);
                Logger.d(f29523l, "get vast info - saved videoTrackingEventUrls from outer vast: " + o2);
            }
            if (n2 != null) {
                b2.b(n2);
                Logger.d(f29523l, "get vast info - saved videoCompletedUrls from outer vast: " + n2);
            }
            if (p2 != null) {
                b2.d(p2);
                Logger.d(f29523l, "get vast info - saved clickTrackingUrls from outer vast: " + p2);
            }
            if (q2 != null) {
                b2.e(q2);
                Logger.d(f29523l, "get vast info - saved companionClickTrackingUrls from outer vast: " + q2);
                return b2;
            }
            return b2;
        }
        return b2;
    }

    private String w(String str) {
        InputStream inputStream = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Logger.d(f29523l, "downloadUrl fetching " + str);
            inputStream = new URL(str).openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                Logger.d(f29523l, "Exception in downloadUrl : " + th.getMessage(), th);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th2) {
                Logger.d(f29523l, "Exception in downloadUrl inner : " + th.getMessage(), th);
            }
        }
        return stringBuffer.toString();
    }

    private String a(String str, int i2) {
        int indexOf = str.indexOf(61);
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(38, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        String substring = str.substring(indexOf + 1, indexOf2);
        Logger.d(f29523l, "extract click url index: " + i2 + ", landing page package id: " + substring);
        if (!substring.equals(substring.toLowerCase())) {
            Logger.d(f29523l, "extract click url - found package name which contains upper cases: " + substring);
            return substring;
        }
        return substring;
    }

    private List<String> x(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<String> a2 = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.ag(), str, 1, 2, false);
            Logger.d(f29523l, "extractClickUrls values : " + a2 + ", rawValue = " + str);
            for (int i2 = 0; i2 < a2.size(); i2 += 2) {
                int parseInt = Integer.parseInt(a2.get(i2));
                String decode = URLDecoder.decode(a2.get(i2 + 1), "UTF-8");
                Logger.d(f29523l, "extract click url index: " + parseInt + ", landing page: " + decode);
                String lowerCase = decode.toLowerCase();
                if (lowerCase.startsWith("http") || lowerCase.startsWith(D)) {
                    arrayList.add(parseInt, decode);
                } else if (lowerCase.startsWith("intent")) {
                    arrayList.add(parseInt, decode);
                    Logger.d(f29523l, "extractClickUrls: adding intent link with landing page: " + decode);
                    String a3 = a(decode, parseInt);
                    if (a3 != null) {
                        arrayList.add(parseInt, i.c(a3));
                    }
                }
            }
        } catch (UnsupportedEncodingException e2) {
            Logger.e(f29523l, e2.getMessage());
        }
        return arrayList;
    }

    private List<String> y(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            k.b(f29523l, "extract destination click url started rawValue = " + str);
            List<String> a2 = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.ah(), str, 1, false);
            Logger.d(f29523l, "extract destination click url values : " + a2 + ", rawValue = " + str);
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                String m2 = k.m(it.next());
                Logger.d(f29523l, "extract destination click url destination url : " + m2);
                if (m2.startsWith("http") || m2.startsWith(D) || m2.startsWith("intent")) {
                    arrayList.add(m2);
                    Logger.d(f29523l, "extract destination click url : adding destination url : " + m2);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29523l, "Exception in extract destination click url : " + th.getMessage(), th);
        }
        return arrayList;
    }

    public static List<String> a(String str, boolean z2) {
        List<String> a2;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            a2 = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.af(), str, 1, 2, false);
        } else {
            a2 = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.ae(), str, 1, 2, false);
        }
        Logger.d(f29523l, "extract creative ids - the values are: " + Arrays.toString(a2.toArray()));
        for (int i2 = 0; i2 < a2.size(); i2 += 2) {
            int parseInt = Integer.parseInt(a2.get(i2));
            String str2 = a2.get(i2 + 1);
            if (!arrayList.contains(str2)) {
                arrayList.add(parseInt, str2);
            }
        }
        Logger.d(f29523l, "extract creative ids - creativeIds are: " + Arrays.toString(arrayList.toArray()));
        return arrayList;
    }

    public static List<String> m(String str) {
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        List<String> a2 = com.safedk.android.analytics.brandsafety.creatives.d.a(com.safedk.android.utils.f.Z(), str, 1, 2, false);
        while (true) {
            int i3 = i2;
            if (i3 < a2.size()) {
                int parseInt = Integer.parseInt(a2.get(i3));
                String str2 = a2.get(i3 + 1);
                if (!arrayList.contains(str2)) {
                    arrayList.add(parseInt, str2);
                }
                i2 = i3 + 2;
            } else {
                return arrayList;
            }
        }
    }

    private int z(String str) {
        int i2 = -1;
        Matcher matcher = com.safedk.android.utils.f.ai().matcher(str);
        while (matcher.find()) {
            i2 = Math.max(Integer.parseInt(matcher.group(1)), i2);
        }
        return i2 + 1;
    }

    private void a(Object obj, List<String> list, List<Object> list2, Set<Object> set, final List<String> list3) {
        if (obj != null && !set.contains(obj)) {
            set.add(obj);
            Class<?> cls = obj.getClass();
            ArrayList<Field> arrayList = new ArrayList();
            do {
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            } while (cls.getName().startsWith("com.google.android.gms"));
            for (Field field : arrayList) {
                field.setAccessible(true);
                try {
                    try {
                        final Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            if (field.getType().getName().equals("interface") || obj2.getClass().getName().startsWith("com.google.android.gms")) {
                                list.add(field.getName());
                                a(obj2, list, list2, set, list3);
                                list.remove(list.size() - 1);
                            } else if (field.getType().getName().equals(f29525n)) {
                                list.add(field.getName());
                                Logger.d(f29523l, "found prefetch info in path: " + list + ", object: " + obj2);
                                list2.add(obj2);
                                list.remove(list.size() - 1);
                            } else if (obj2.getClass().getName().startsWith(k.e)) {
                                String str = (String) obj2;
                                if (!TextUtils.isEmpty(str)) {
                                    k.b(f29523l, "iterating over field " + field.getName() + " (non empty value) , string info = " + str);
                                }
                                if (str != null && str.startsWith(E)) {
                                    list.add(field.getName());
                                    Logger.d(f29523l, "found prefetch click url in path: " + list + ", object: " + obj2);
                                    try {
                                        list2.add(new JSONObject("{ \"clickUrl\" : \"" + str + "\" }"));
                                    } catch (JSONException e2) {
                                    }
                                    list.remove(list.size() - 1);
                                } else if (str != null && str.startsWith(H)) {
                                    list.add(field.getName());
                                    Logger.d(f29523l, "found sdk version in path: " + list + ", object: " + obj2);
                                    String[] split = str.split("\\.");
                                    if (split.length > 1) {
                                        this.f29575v = split[1];
                                        if (this.f29575v != null) {
                                            h(g.f30053h, this.f29575v);
                                        }
                                    }
                                    list.remove(list.size() - 1);
                                }
                            } else if (field.getType().getName().equals(I)) {
                                list.add(field.getName());
                                Logger.d(f29523l, "found resource url in path: " + list);
                                try {
                                    a(obj2, list3);
                                } catch (ConcurrentModificationException e3) {
                                    Logger.d(f29523l, "Couldn't access LinkedHashMap field : " + e3.getMessage());
                                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.b.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            try {
                                                b.this.a(obj2, (List<String>) list3);
                                            } catch (Throwable th) {
                                                Logger.d(b.f29523l, "Couldn't access LinkedHashMap field (again!) : " + th.getMessage());
                                            }
                                        }
                                    }, 5L);
                                }
                                list.remove(list.size() - 1);
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        Logger.e(f29523l, e4.getMessage());
                    }
                } catch (ConcurrentModificationException e5) {
                    Logger.e(f29523l, "Error in extract ad info : " + e5.getMessage(), e5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, List<String> list) {
        String A2;
        Logger.d(f29523l, "extractHashMapFieldResourceURLs started");
        for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
            if (entry != null && entry.getValue() != null && (A2 = A(entry.getValue().toString())) != null) {
                Logger.d(f29523l, "extractHashMapFieldResourceURLs resource url: " + A2);
                list.add(A2);
            }
        }
    }

    private String A(String str) {
        int indexOf;
        int indexOf2 = str.indexOf(34);
        if (indexOf2 <= -1 || (indexOf = str.indexOf(34, indexOf2 + 1)) <= -1) {
            return null;
        }
        return str.substring(indexOf2 + 1, indexOf);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (!view.getClass().getName().equals(N) && !view.getClass().getName().equals(O)) {
            return false;
        }
        Logger.d(f29523l, "is ad view: " + view.getClass().getName() + " is an instance of " + view.getClass().getName());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return SafeDK.getInstance().C() * 2;
    }

    private String B(String str) {
        Matcher matcher = com.safedk.android.utils.f.aN().matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
