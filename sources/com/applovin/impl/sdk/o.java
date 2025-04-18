package com.applovin.impl.sdk;

import android.os.Build;
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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
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

    /* renamed from: f */
    private static final int f7949f = (int) TimeUnit.SECONDS.toMillis(30);
    private final ExecutorService a;

    /* renamed from: b */
    private final Map f7950b = a4.j.r();

    /* renamed from: c */
    private final Set f7951c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    protected final k f7952d;

    /* renamed from: e */
    protected final t f7953e;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        final /* synthetic */ k a;

        /* renamed from: com.applovin.impl.sdk.o$a$a */
        /* loaded from: classes.dex */
        public class C0037a implements Thread.UncaughtExceptionHandler {
            public C0037a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                a.this.a.L();
                if (t.a()) {
                    a.this.a.L().a("ErrorReporter", "Caught unhandled exception", th2);
                }
            }
        }

        public a(k kVar) {
            this.a = kVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:error_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) this.a.a(oj.T)).intValue());
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

        private final String a;

        b(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public o(k kVar) {
        this.f7952d = kVar;
        this.f7953e = kVar.L();
        this.a = Executors.newFixedThreadPool(1, new a(kVar));
    }

    public static /* synthetic */ void a(o oVar, b bVar, Object obj, Map map) {
        oVar.d(bVar, obj, map);
    }

    private JSONObject b(b bVar, Object obj, Map map) {
        Map A;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "event_type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.f7952d.a(oj.f6791x4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(tr.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", tr.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", tr.b());
            }
            if (this.f7952d.y() != null) {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.f7952d.z().s());
            } else {
                JsonUtils.putStringIfValid(jSONObject, "oglv", this.f7952d.x().D());
            }
        }
        if (this.f7952d.y() != null) {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.f7952d.z().u());
            A = this.f7952d.y().b();
        } else {
            JsonUtils.putStringIfValid(jSONObject, "platform", this.f7952d.x().v());
            A = this.f7952d.x().A();
        }
        JsonUtils.putObject(jSONObject, "first_install", A.get("first_install_v2"));
        JsonUtils.putStringIfValid(jSONObject, "rid", UUID.randomUUID().toString());
        JsonUtils.putStringIfValid(jSONObject, "applovin_random_token", this.f7952d.c0());
        JsonUtils.putStringIfValid(jSONObject, "compass_random_token", this.f7952d.p());
        JsonUtils.putStringIfValid(jSONObject, "ts_ms", String.valueOf(System.currentTimeMillis()));
        JsonUtils.putStringIfValid(jSONObject, "cfug", String.valueOf(this.f7952d.q().getConsentFlowUserGeography()));
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
        JsonUtils.putStringIfValid(jSONObject, "country", this.f7952d.q().getCountryCode());
        JsonUtils.putStringIfValid(jSONObject, "aei", String.valueOf(this.f7952d.a(oj.f6801z)));
        JsonUtils.putStringIfValid(jSONObject, "mei", String.valueOf(this.f7952d.a(oj.A)));
        JsonUtils.putStringIfValid(jSONObject, "md", (String) this.f7952d.a(oj.B));
        JsonUtils.putObject(jSONObject, CampaignEx.JSON_KEY_PACKAGE_NAME, A.get(CampaignEx.JSON_KEY_PACKAGE_NAME));
        JsonUtils.putObject(jSONObject, "app_version", A.get("app_version"));
        JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f7952d.Q());
        JsonUtils.putInt(jSONObject, "installed_mediation_adapters_count", ve.a(this.f7952d).length());
        JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", com.applovin.impl.v.b());
        return jSONObject;
    }

    private Map c(b bVar, Object obj, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", bVar.b());
        if (bVar == b.BLACK_VIEW || bVar == b.WEB_VIEW_ERROR || bVar == b.TEMPLATE_ERROR) {
            if (((Boolean) this.f7952d.a(oj.f6791x4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(tr.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", tr.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", tr.b(), hashMap);
            }
            if (this.f7952d.y() != null) {
                CollectionUtils.putStringIfValid("oglv", this.f7952d.z().s(), hashMap);
            } else {
                CollectionUtils.putStringIfValid("oglv", this.f7952d.x().D(), hashMap);
            }
        }
        if (this.f7952d.y() != null) {
            hashMap.put("platform", this.f7952d.z().u());
        } else {
            hashMap.put("platform", this.f7952d.x().v());
        }
        hashMap.put("applovin_random_token", this.f7952d.c0());
        hashMap.put("compass_random_token", this.f7952d.p());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), hashMap);
        hashMap.put("aei", String.valueOf(this.f7952d.a(oj.f6801z)));
        hashMap.put("mei", String.valueOf(this.f7952d.a(oj.A)));
        hashMap.put("md", (String) this.f7952d.a(oj.B));
        a(hashMap);
        a(obj, hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: e */
    public void d(b bVar, Object obj, Map map) {
        if (t.a()) {
            this.f7953e.a("ErrorReporter", "Reporting " + bVar.b() + " with extra parameters " + map);
        }
        if (zp.a((Integer) this.f7952d.a(oj.f6703m))) {
            f(bVar, obj, map);
        }
        if (((Boolean) this.f7952d.a(oj.f6711n)).booleanValue()) {
            g(bVar, obj, map);
        }
    }

    private void f(b bVar, Object obj, Map map) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) a(bVar, obj, map).openConnection();
            try {
                int i10 = f7949f;
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod("POST");
                int responseCode = httpURLConnection.getResponseCode();
                if (t.a()) {
                    this.f7953e.a("ErrorReporter", bVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
                }
                this.f7950b.put(bVar, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    if (t.a()) {
                        this.f7953e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th2);
                    }
                } finally {
                    zp.a(httpURLConnection, this.f7952d);
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection = null;
        }
    }

    private void g(b bVar, Object obj, Map map) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        String str = (String) this.f7952d.a(oj.f6727p);
        if (!StringUtils.isValidString(str) || !zp.a((Integer) this.f7952d.a(oj.f6719o))) {
            return;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = b(bVar, obj, map).toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int i10 = f7949f;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
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
                this.f7953e.a("ErrorReporter", bVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
            }
            this.f7950b.put(bVar, Long.valueOf(System.currentTimeMillis()));
            zp.a(httpURLConnection, this.f7952d);
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                if (t.a()) {
                    this.f7953e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th);
                }
            } finally {
                zp.a(httpURLConnection2, this.f7952d);
            }
        }
    }

    public void a(String str, String str2, Throwable th2, Map map) {
        a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, ":", str2), th2, map);
    }

    public void a(String str, String str2, Throwable th2) {
        a(str, str2, th2, new HashMap());
    }

    public void a(String str, Throwable th2) {
        a(str, th2, new HashMap());
    }

    public void a(String str, Throwable th2, Map map) {
        map.put("source", str);
        map.put("top_main_method", th2.toString());
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

    public void a(String str, String str2, int i10) {
        a(str, str2, i10, new HashMap());
    }

    public void a(String str, String str2, int i10, HashMap hashMap) {
        if (i10 < 400) {
            return;
        }
        hashMap.put("source", str);
        hashMap.put("url", StringUtils.emptyIfNull(str2));
        hashMap.put("code", String.valueOf(i10));
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
        if (!StringUtils.isValidString(str2) || this.f7951c.add(str2)) {
            map.put("source", str);
            a(bVar, str, map);
        }
    }

    public void a(b bVar, Map map) {
        a(bVar, (Object) null, map, 0L);
    }

    public void a(b bVar, Map map, long j3) {
        a(bVar, (Object) null, map, j3);
    }

    public void a(b bVar, Object obj, Map map, long j3) {
        if (a(bVar, j3)) {
            return;
        }
        try {
            if (zp.h()) {
                this.a.execute(new c3.b(4, this, bVar, obj, map));
            } else {
                d(bVar, obj, map);
            }
        } catch (Throwable th2) {
            if (t.a()) {
                this.f7953e.d("ErrorReporter", "Failed to report " + bVar.b() + " with extra parameters " + map, th2);
            }
        }
    }

    private URL a(b bVar, Object obj, Map map) {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = c(bVar, obj, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb2.append(encode);
            sb2.append("=");
            sb2.append(encode2);
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return new URL(sb2.toString());
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
            obj = this.f7952d.E().a();
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

    private boolean a(b bVar, long j3) {
        Long l10 = (Long) this.f7950b.get(bVar);
        return System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1L) < j3;
    }
}
