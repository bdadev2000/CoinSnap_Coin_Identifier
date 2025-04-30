package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class ve {

    /* renamed from: a, reason: collision with root package name */
    private static final TreeMap f11725a;
    private static final List b;

    /* renamed from: c, reason: collision with root package name */
    private static JSONArray f11726c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f11727d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final Map f11728e = Collections.synchronizedMap(new HashMap(1));

    static {
        TreeMap treeMap = new TreeMap();
        f11725a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NimbusMediationAdapter", "Nimbus");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.TaboolaMediationAdapter", "Taboola");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        b = new ArrayList(treeMap.keySet());
    }

    public static MaxAdapter a(String str, com.applovin.impl.sdk.k kVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(kVar.v0());
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    public static JSONObject b(String str, com.applovin.impl.sdk.k kVar) {
        JSONArray a6 = a(kVar);
        for (int i9 = 0; i9 < a6.length(); i9++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a6, i9, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", null))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static boolean b(Object obj) {
        return (obj instanceof com.applovin.impl.sdk.ad.b) && StringUtils.isValidString(((com.applovin.impl.sdk.ad.b) obj).H());
    }

    private static void b(com.applovin.impl.sdk.k kVar) {
        MaxAdapter a6;
        for (int i9 = 0; i9 < f11726c.length(); i9++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f11726c, i9, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (a6 = a(string, kVar)) != null) {
                String a9 = a(a6);
                if (StringUtils.isValidString(a9)) {
                    synchronized (f11727d) {
                        JsonUtils.putString(jSONObject, "sdk_version", a9);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static String a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    public static AppLovinSdkUtils.Size a(int i9, MaxAdFormat maxAdFormat, Context context) {
        if (i9 < 0) {
            try {
                i9 = AppLovinSdkUtils.pxToDp(context, x3.a(context).x);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Map map = f11728e;
        AppLovinSdkUtils.Size size = (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i9));
        if (size != null) {
            return size;
        }
        int i10 = AdSize.FULL_WIDTH;
        Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = AdSize.class.getMethod("getWidth", null);
        Method method3 = AdSize.class.getMethod("getHeight", null);
        Object invoke = method.invoke(null, context, Integer.valueOf(i9));
        AppLovinSdkUtils.Size size2 = new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, null)).intValue(), ((Integer) method3.invoke(invoke, null)).intValue());
        map.put(Integer.valueOf(i9), size2);
        return size2;
    }

    public static boolean a(Object obj) {
        return (obj instanceof be) && "APPLOVIN".equals(((be) obj).k());
    }

    public static boolean a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), 1035, "code")) {
            return false;
        }
        String d2 = AbstractC2914a.d("invalid_or_disabled_ad_unit_id", str);
        kVar.B().a(o.b.INTEGRATION_ERROR, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), d2);
        return true;
    }

    public static JSONArray a(com.applovin.impl.sdk.k kVar) {
        if (f11726c != null) {
            b(kVar);
            return f11726c;
        }
        f11726c = new JSONArray();
        for (String str : b) {
            MaxAdapter a6 = a(str, kVar);
            if (a6 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f11725a.get(str));
                    jSONObject.put("class", str);
                    jSONObject.put("sdk_version", a(a6));
                    jSONObject.put("version", a6.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f11727d) {
                    f11726c.put(jSONObject);
                }
            }
        }
        return f11726c;
    }
}
