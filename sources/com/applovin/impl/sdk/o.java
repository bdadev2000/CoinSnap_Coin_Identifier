package com.applovin.impl.sdk;

import Q7.n0;
import android.os.Build;
import com.applovin.impl.C0765v;
import com.applovin.impl.be;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tr;
import com.applovin.impl.ve;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {

    /* renamed from: f, reason: collision with root package name */
    private static final int f11113f = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f11114a;
    private final Map b = n0.q();

    /* renamed from: c, reason: collision with root package name */
    private final Set f11115c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    protected final k f11116d;

    /* renamed from: e, reason: collision with root package name */
    protected final t f11117e;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f11118a;

        /* renamed from: com.applovin.impl.sdk.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0037a implements Thread.UncaughtExceptionHandler {
            public C0037a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                a.this.f11118a.L();
                if (t.a()) {
                    a.this.f11118a.L().a("ErrorReporter", "Caught unhandled exception", th);
                }
            }
        }

        public a(k kVar) {
            this.f11118a = kVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:error_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) this.f11118a.a(oj.f9675T)).intValue());
            thread.setUncaughtExceptionHandler(new C0037a());
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ANR("anr"),
        BLACK_VIEW("black_view"),
        CACHE_ERROR("cache_error"),
        CAUGHT_EXCEPTION("caught_exception"),
        CONSENT_FLOW_ERROR("consent_flow_error"),
        CRASH(AppMeasurement.CRASH_ORIGIN),
        DISPLAY_ERROR("display_error"),
        FILE_ERROR("file_error"),
        GENERIC("generic"),
        INTEGRATION_ERROR("integration_error"),
        MEDIA_ERROR("media_error"),
        NATIVE_ERROR("native_error"),
        NETWORK_ERROR("network_error"),
        TASK_EXCEPTION("task_exception"),
        TASK_LATENCY_ALERT("task_latency_alert"),
        TEMPLATE_ERROR("template_error"),
        WEB_VIEW_ERROR("web_view_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f11135a;

        b(String str) {
            this.f11135a = str;
        }

        public String b() {
            return this.f11135a;
        }
    }

    public o(k kVar) {
        this.f11116d = kVar;
        this.f11117e = kVar.L();
        this.f11114a = Executors.newFixedThreadPool(1, new a(kVar));
    }

    private JSONObject b(b bVar, Object obj, Map map) {
        Map A8;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "event_type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.f11116d.a(oj.f9884x4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(tr.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", tr.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", tr.b());
            }
            if (this.f11116d.y() != null) {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.f11116d.z().s());
            } else {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.f11116d.x().D());
            }
        }
        if (this.f11116d.y() != null) {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.f11116d.z().u());
            A8 = this.f11116d.y().b();
        } else {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.f11116d.x().v());
            A8 = this.f11116d.x().A();
        }
        JsonUtils.putObject(jSONObject, "first_install", A8.get("first_install_v2"));
        JsonUtils.putStringIfValid(jSONObject, "rid", UUID.randomUUID().toString());
        JsonUtils.putStringIfValid(jSONObject, "applovin_random_token", this.f11116d.c0());
        JsonUtils.putStringIfValid(jSONObject, "compass_random_token", this.f11116d.p());
        JsonUtils.putStringIfValid(jSONObject, "ts_ms", String.valueOf(System.currentTimeMillis()));
        JsonUtils.putStringIfValid(jSONObject, "cfug", String.valueOf(this.f11116d.q().getConsentFlowUserGeography()));
        a(obj, map);
        JsonUtils.putObject(jSONObject, "extra_parameters", map);
        JsonUtils.putStringIfValid(jSONObject, "sdk_version", String.valueOf(AppLovinSdk.VERSION));
        JsonUtils.putStringIfValid(jSONObject, "os", Build.VERSION.RELEASE);
        JsonUtils.putStringIfValid(jSONObject, "api_level", String.valueOf(Build.VERSION.SDK_INT));
        JsonUtils.putStringIfValid(jSONObject, "brand", Build.MANUFACTURER);
        JsonUtils.putStringIfValid(jSONObject, "brand_name", Build.BRAND);
        JsonUtils.putStringIfValid(jSONObject, "hardware", Build.HARDWARE);
        JsonUtils.putStringIfValid(jSONObject, "revision", Build.DEVICE);
        JsonUtils.putStringIfValid(jSONObject, "model", Build.MODEL);
        JsonUtils.putStringIfValid(jSONObject, "country", this.f11116d.q().getCountryCode());
        JsonUtils.putStringIfValid(jSONObject, "aei", String.valueOf(this.f11116d.a(oj.f9893z)));
        JsonUtils.putStringIfValid(jSONObject, "mei", String.valueOf(this.f11116d.a(oj.f9546A)));
        JsonUtils.putStringIfValid(jSONObject, "md", (String) this.f11116d.a(oj.f9554B));
        JsonUtils.putObject(jSONObject, CampaignEx.JSON_KEY_PACKAGE_NAME, A8.get(CampaignEx.JSON_KEY_PACKAGE_NAME));
        JsonUtils.putObject(jSONObject, "app_version", A8.get("app_version"));
        JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f11116d.Q());
        JsonUtils.putInt(jSONObject, "installed_mediation_adapters_count", ve.a(this.f11116d).length());
        JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", C0765v.b());
        return jSONObject;
    }

    private Map c(b bVar, Object obj, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.f11116d.a(oj.f9884x4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(tr.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", tr.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", tr.b(), hashMap);
            }
            if (this.f11116d.y() != null) {
                CollectionUtils.putStringIfValid("oglv", this.f11116d.z().s(), hashMap);
            } else {
                CollectionUtils.putStringIfValid("oglv", this.f11116d.x().D(), hashMap);
            }
        }
        if (this.f11116d.y() != null) {
            hashMap.put("platform", this.f11116d.z().u());
        } else {
            hashMap.put("platform", this.f11116d.x().v());
        }
        hashMap.put("applovin_random_token", this.f11116d.c0());
        hashMap.put("compass_random_token", this.f11116d.p());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C0765v.b(), hashMap);
        hashMap.put("aei", String.valueOf(this.f11116d.a(oj.f9893z)));
        hashMap.put("mei", String.valueOf(this.f11116d.a(oj.f9546A)));
        hashMap.put("md", (String) this.f11116d.a(oj.f9554B));
        a(hashMap);
        a(obj, hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(b bVar, Object obj, Map map) {
        if (t.a()) {
            this.f11117e.a("ErrorReporter", "Reporting " + bVar.b() + " with extra parameters " + map);
        }
        if (zp.a((Integer) this.f11116d.a(oj.m))) {
            f(bVar, obj, map);
        }
        if (((Boolean) this.f11116d.a(oj.f9808n)).booleanValue()) {
            g(bVar, obj, map);
        }
    }

    private void f(b bVar, Object obj, Map map) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(a(bVar, obj, map).openConnection()));
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            int i9 = f11113f;
            httpURLConnection.setConnectTimeout(i9);
            httpURLConnection.setReadTimeout(i9);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setRequestMethod("POST");
            int responseCode = httpURLConnection.getResponseCode();
            if (t.a()) {
                this.f11117e.a("ErrorReporter", bVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
            }
            this.b.put(bVar, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th3) {
            th = th3;
            try {
                if (t.a()) {
                    this.f11117e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
                }
            } finally {
                zp.a(httpURLConnection, this.f11116d);
            }
        }
    }

    private void g(b bVar, Object obj, Map map) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        String str = (String) this.f11116d.a(oj.f9822p);
        if (!StringUtils.isValidString(str) || !zp.a((Integer) this.f11116d.a(oj.f9815o))) {
            return;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = b(bVar, obj, map).toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i9 = f11113f;
            httpURLConnection.setConnectTimeout(i9);
            httpURLConnection.setReadTimeout(i9);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (t.a()) {
                this.f11117e.a("ErrorReporter", bVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
            }
            this.b.put(bVar, Long.valueOf(System.currentTimeMillis()));
            zp.a(httpURLConnection, this.f11116d);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                if (t.a()) {
                    this.f11117e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
                }
            } finally {
                zp.a(httpURLConnection2, this.f11116d);
            }
        }
    }

    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(com.mbridge.msdk.foundation.entity.o.k(str, ":", str2), th, map);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        a(b.CAUGHT_EXCEPTION, map);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        if (bVar != null) {
            CollectionUtils.putStringIfValid("ad_size", bVar.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVar.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), hashMap);
            CollectionUtils.putStringIfValid("dsp_id", bVar.getDspId(), hashMap);
            CollectionUtils.putStringIfValid("ad_domain", bVar.getAdDomain(), hashMap);
            CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_VIDEO_URL, bVar.P(), hashMap);
        }
        hashMap.put("source", str);
        hashMap.put("top_main_method", str2);
        a(b.MEDIA_ERROR, (Map) hashMap);
    }

    public void a(String str, String str2, int i9) {
        a(str, str2, i9, new HashMap());
    }

    public void a(String str, String str2, int i9, HashMap hashMap) {
        if (i9 < 400) {
            return;
        }
        hashMap.put("source", str);
        hashMap.put("url", StringUtils.emptyIfNull(str2));
        hashMap.put("code", String.valueOf(i9));
        a(b.NETWORK_ERROR, (Map) hashMap);
    }

    public void a(b bVar, String str) {
        a(bVar, str, (Map) new HashMap());
    }

    public void a(b bVar, String str, Map map) {
        map.put("source", str);
        a(bVar, map);
    }

    public void a(b bVar, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f11115c.add(str2)) {
            map.put("source", str);
            a(bVar, str, map);
        }
    }

    public void a(b bVar, Map map) {
        a(bVar, (Object) null, map, 0L);
    }

    public void a(b bVar, Map map, long j7) {
        a(bVar, (Object) null, map, j7);
    }

    public void a(b bVar, Object obj, Map map, long j7) {
        if (a(bVar, j7)) {
            return;
        }
        try {
            if (zp.h()) {
                this.f11114a.execute(new I2.f(this, bVar, obj, map, 4));
            } else {
                d(bVar, obj, map);
            }
        } catch (Throwable th) {
            if (t.a()) {
                this.f11117e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
            }
        }
    }

    private URL a(b bVar, Object obj, Map map) {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = c(bVar, obj, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb.append(encode);
            sb.append("=");
            sb.append(encode2);
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return new URL(sb.toString());
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
            android.content.Context r2 = com.applovin.impl.sdk.k.k()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.k.k()     // Catch: java.lang.Throwable -> L18
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.a(java.util.Map):void");
    }

    private void a(Object obj, Map map) {
        if (obj == null) {
            obj = this.f11116d.E().a();
        }
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) obj).getAdIdNumber()));
        } else if (obj instanceof be) {
            be beVar = (be) obj;
            map.put("fs_ad_network", beVar.getNetworkName());
            map.put("fs_ad_creative_id", beVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private boolean a(b bVar, long j7) {
        Long l = (Long) this.b.get(bVar);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j7;
    }
}
