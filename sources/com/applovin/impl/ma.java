package com.applovin.impl;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.la;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.security.CertificateUtil;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.CrashEvent;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ma {

    /* renamed from: g, reason: collision with root package name */
    private static final int f25228g = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f25229a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f25230b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f25231c = Collections.synchronizedMap(new HashMap());
    private final Set d = Collections.synchronizedSet(new HashSet());
    protected final com.applovin.impl.sdk.j e;

    /* renamed from: f, reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f25232f;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f25233a;

        /* renamed from: com.applovin.impl.ma$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0083a implements Thread.UncaughtExceptionHandler {
            public C0083a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                a.this.f25233a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    a.this.f25233a.J().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        public a(com.applovin.impl.sdk.j jVar) {
            this.f25233a = jVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) this.f25233a.a(sj.W)).intValue());
            thread.setUncaughtExceptionHandler(new C0083a());
            return thread;
        }
    }

    public ma(com.applovin.impl.sdk.j jVar) {
        this.e = jVar;
        this.f25232f = jVar.J();
        this.f25230b = Executors.newFixedThreadPool(1, new a(jVar));
    }

    private void c(la laVar, Object obj, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (laVar.a() == la.b.AD || laVar.a() == la.b.USER_SESSION || !yp.a(((Integer) this.e.a(sj.H)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(laVar, obj, map).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                int i2 = f25228g;
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod(com.safedk.android.a.g.f29074c);
                int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25232f.a("HealthEventsReporter", laVar.b() + " reported with code " + httpUrlConnectionGetResponseCode + " and extra parameters " + map);
                }
                this.f25231c.put(laVar, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f25232f.d("HealthEventsReporter", "Failed to report " + laVar.b() + " with extra parameters " + map, th);
                    }
                    yp.a(httpURLConnection, this.e);
                } finally {
                    yp.a(httpURLConnection, this.e);
                }
            }
        }
    }

    private void d(la laVar, Object obj, List list) {
        String str = (String) this.e.a(sj.I);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double a2 = laVar.a(this.e);
        if (yp.a(a2)) {
            if (((Boolean) this.e.a(sj.O)).booleanValue()) {
                a(str, laVar, obj, a(laVar, a2, obj, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f25230b.execute(new iu(this, str, laVar, obj, a(laVar, a2, obj, Collections.singletonList((Map) it.next())), 0));
            }
        }
    }

    private Map b(la laVar, Object obj, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", laVar.b());
        if (laVar == la.F || laVar == la.U || laVar == la.S) {
            if (((Boolean) this.e.a(sj.D4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(sr.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", sr.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", sr.b(), hashMap);
            }
            CollectionUtils.putStringIfValid("oglv", this.e.y().D(), hashMap);
        }
        Map G = this.e.y().G();
        hashMap.put(AppLovinBridge.e, String.valueOf(G.get(AppLovinBridge.e)));
        hashMap.put("country_code", String.valueOf(G.get("country_code")));
        hashMap.put("cc", this.e.r().getCountryCode());
        hashMap.put("applovin_random_token", this.e.a0());
        hashMap.put("compass_random_token", this.e.q());
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", v.b(), hashMap);
        hashMap.put("md", (String) this.e.a(sj.f26956v));
        a(hashMap);
        a(obj, hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(androidx.compose.foundation.text.input.a.k(str, CertificateUtil.DELIMITER, str2), th, map);
    }

    private URL a(la laVar, Object obj, Map map) {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(laVar, obj, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb.append(encode);
            sb.append(ImpressionLog.R);
            sb.append(encode2);
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return new URL(sb.toString());
    }

    public static Map a(com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap(8);
        if (bVar != null) {
            CollectionUtils.putStringIfValid(CreativeInfo.aU, bVar.getAdDomain(), hashMap);
            CollectionUtils.putStringIfValid(CreativeInfo.f29617c, String.valueOf(bVar.getAdIdNumber()), hashMap);
            MaxAdFormat d = bVar.getAdZone().d();
            CollectionUtils.putStringIfValid("ad_format", d != null ? d.getLabel() : null, hashMap);
            CollectionUtils.putStringIfValid("ad_zone_id", bVar.getAdZone().e(), hashMap);
            CollectionUtils.putStringIfValid("clcode", bVar.getClCode(), hashMap);
            CollectionUtils.putStringIfValid("dsp_id", bVar.getDspId(), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), hashMap);
            CollectionUtils.putStringIfValid("ad_size", bVar.getSize().getLabel(), hashMap);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, la laVar, Object obj, JSONObject jSONObject) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = jSONObject.toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i2 = f25228g;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod(com.safedk.android.a.g.f29074c);
            OutputStream urlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            urlConnectionGetOutputStream.write(bytes);
            urlConnectionGetOutputStream.close();
            int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (com.applovin.impl.sdk.n.a()) {
                this.f25232f.a("HealthEventsReporter", laVar.b() + " reported with code " + httpUrlConnectionGetResponseCode);
            }
            this.f25231c.put(laVar, Long.valueOf(System.currentTimeMillis()));
            yp.a(httpURLConnection, this.e);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25232f.d("HealthEventsReporter", "Failed to report " + laVar.b(), th);
                }
            } finally {
                yp.a(httpURLConnection2, this.e);
            }
        }
    }

    private AppLovinAdSize a(h0 h0Var, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize f2 = h0Var != null ? h0Var.f() : null;
        if (f2 != null) {
            return f2;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }

    private JSONObject a(la laVar, double d, Object obj, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (laVar == la.F || laVar == la.U || laVar == la.S) {
            if (((Boolean) this.e.a(sj.D4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(sr.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", sr.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", sr.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.e.y().D());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map G = this.e.y().G();
        JsonUtils.putObject(jSONObject2, AppLovinBridge.e, G.get(AppLovinBridge.e));
        JsonUtils.putObject(jSONObject2, "os", G.get("os"));
        JsonUtils.putObject(jSONObject2, "brand", G.get("brand"));
        JsonUtils.putObject(jSONObject2, DeviceRequestsHelper.DEVICE_INFO_MODEL, G.get(DeviceRequestsHelper.DEVICE_INFO_MODEL));
        JsonUtils.putObject(jSONObject2, "revision", G.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", G.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.e.r().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.e.a0());
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(v.b()));
        Map A = this.e.y().A();
        JsonUtils.putObject(jSONObject2, "sdk_version", A.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "app_version", A.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", A.get("package_name"));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) A.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.e.a(sj.f26956v));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.e.O());
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", laVar.b());
            JsonUtils.putDouble(jSONObject3, "weight", d);
            JsonUtils.putString(jSONObject3, "level", "DEBUG");
            a(obj, map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, CrashEvent.f29806f, jSONArray);
        return jSONObject;
    }

    public static Map a(ge geVar) {
        Map a2 = a((pe) geVar);
        CollectionUtils.putStringIfValid("bcode", geVar.B(), a2);
        CollectionUtils.putStringIfValid("creative_id", geVar.getCreativeId(), a2);
        CollectionUtils.putStringIfValid("ad_unit_id", geVar.getAdUnitId(), a2);
        CollectionUtils.putStringIfValid("ad_format", geVar.getFormat().getLabel(), a2);
        return a2;
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f25229a, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f25229a, "default", null) : integerList;
    }

    private boolean a(la laVar, long j2) {
        Long l2 = (Long) this.f25231c.get(laVar);
        return System.currentTimeMillis() - (l2 != null ? l2.longValue() : -1L) < j2;
    }

    public void a() {
        this.f25229a = JsonUtils.deserialize((String) this.e.a(sj.Q));
    }

    public void a(String str, String str2, int i2) {
        a(str, str2, i2, new HashMap());
    }

    public void a(String str, String str2, int i2, HashMap hashMap) {
        List a2 = a(str2);
        boolean z2 = a2 != null;
        if (z2 && a2.contains(Integer.valueOf(i2))) {
            return;
        }
        if (z2 || i2 >= 400) {
            hashMap.put("source", str);
            hashMap.put("url", StringUtils.emptyIfNull(str2));
            hashMap.put("code", String.valueOf(i2));
            a(la.O, (Map) hashMap);
        }
    }

    private void a(Object obj, Map map) {
        if (map == null) {
            return;
        }
        if (obj == null) {
            obj = this.e.C().a();
        }
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) obj).getAdIdNumber()));
        } else if (obj instanceof ge) {
            ge geVar = (ge) obj;
            map.put("fs_ad_network", geVar.getNetworkName());
            map.put("fs_ad_creative_id", geVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.j.l()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.j.l()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ma.a(java.util.Map):void");
    }

    public void a(la laVar, Object obj, List list, long j2) {
        if (a(laVar, j2)) {
            return;
        }
        try {
            if (yp.h()) {
                this.f25230b.execute(new ft(this, laVar, obj, list, 2));
            } else {
                b(laVar, obj, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25232f.d("HealthEventsReporter", "Failed to report " + laVar.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    public void a(la laVar, h0 h0Var, AppLovinError appLovinError) {
        a(laVar, h0Var, (com.applovin.impl.sdk.ad.b) null, appLovinError);
    }

    private void a(la laVar, h0 h0Var, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError) {
        if (((Boolean) this.e.a(sj.P)).booleanValue() && this.e.A0()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            hashMap.putAll(a(bVar));
        }
        if (h0Var != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", h0Var.e(), hashMap);
            MaxAdFormat d = h0Var.d();
            if (d != null) {
                CollectionUtils.putStringIfValid("ad_format", d.getLabel(), hashMap);
            }
        }
        AppLovinAdSize a2 = a(h0Var, bVar);
        if (a2 != null) {
            CollectionUtils.putStringIfValid("ad_size", a2.getLabel(), hashMap);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), hashMap);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), hashMap);
        }
        a(laVar, (Map) hashMap);
    }

    public void a(la laVar, ge geVar) {
        a(laVar, geVar.getFormat(), geVar.getAdUnitId(), geVar, null);
    }

    public void a(la laVar, ge geVar, MaxError maxError) {
        a(laVar, geVar.getFormat(), geVar.getAdUnitId(), geVar, maxError);
    }

    public void a(la laVar, com.applovin.impl.sdk.ad.b bVar) {
        a(laVar, bVar != null ? bVar.getAdZone() : null, bVar, (AppLovinError) null);
    }

    private void a(la laVar, MaxAdFormat maxAdFormat, String str, ge geVar, MaxError maxError) {
        HashMap hashMap = new HashMap();
        if (geVar != null) {
            hashMap.putAll(a(geVar));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap);
        }
        if (maxError != null) {
            CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), hashMap);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), hashMap);
            CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), hashMap);
            CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), hashMap);
        }
        a(laVar, (Map) hashMap);
    }

    public void a(la laVar, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(laVar, maxAdFormat, str, null, maxError);
    }

    public void a(la laVar, Object obj, Map map, long j2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(laVar, obj, arrayList, j2);
    }

    public void a(la laVar, String str) {
        a(laVar, str, (Map) new HashMap());
    }

    public void a(la laVar, String str, Map map) {
        map.put("source", str);
        a(laVar, map);
    }

    public void a(la laVar, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.d.add(str2)) {
            map.put("source", str);
            a(laVar, str, map);
        }
    }

    public void a(la laVar, Map map) {
        a(laVar, (Object) null, map, 0L);
    }

    public void a(la laVar, Map map, long j2) {
        a(laVar, (Object) null, map, j2);
    }

    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("source", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), hashMap);
            arrayList.add(hashMap);
        }
        a(la.H, (Object) null, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("error_message", str2);
        if (bVar != null) {
            hashMap.putAll(a(bVar));
            boolean I0 = bVar.I0();
            hashMap.put("is_video_stream", String.valueOf(I0));
            if (I0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid(CreativeInfo.e, ((com.applovin.impl.sdk.ad.a) bVar).m1(), hashMap);
            } else {
                CollectionUtils.putStringIfValid(CreativeInfo.e, bVar.P(), hashMap);
            }
        }
        a(la.M, (Map) hashMap);
    }

    public static Map a(pe peVar) {
        HashMap hashMap = new HashMap(3);
        CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, peVar.c(), hashMap);
        String b2 = peVar.b();
        CollectionUtils.putStringIfValid("adapter_class", peVar.b(), hashMap);
        CollectionUtils.putStringIfValid("adapter_version", af.a(b2).getAdapterVersion(), hashMap);
        return hashMap;
    }

    public static Map a(MaxError maxError) {
        HashMap hashMap = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), hashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(la laVar, Object obj, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25232f.a("HealthEventsReporter", "Reporting " + laVar.b() + " with extra parameters collection " + list);
        }
        c(laVar, obj, list);
        d(laVar, obj, list);
    }
}
