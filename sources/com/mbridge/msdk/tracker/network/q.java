package com.mbridge.msdk.tracker.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.Connection;
import com.mbridge.msdk.thrid.okhttp.Handshake;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.Route;
import com.mbridge.msdk.thrid.okhttp.TlsVersion;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: A, reason: collision with root package name */
    private volatile long f18189A;

    /* renamed from: B, reason: collision with root package name */
    private volatile long f18190B;

    /* renamed from: C, reason: collision with root package name */
    private volatile long f18191C;

    /* renamed from: D, reason: collision with root package name */
    private volatile long f18192D;

    /* renamed from: E, reason: collision with root package name */
    private volatile long f18193E;

    /* renamed from: F, reason: collision with root package name */
    private volatile long f18194F;

    /* renamed from: G, reason: collision with root package name */
    private volatile long f18195G;

    /* renamed from: H, reason: collision with root package name */
    private volatile List<InetAddress> f18196H;

    /* renamed from: I, reason: collision with root package name */
    private volatile InetSocketAddress f18197I;

    /* renamed from: J, reason: collision with root package name */
    private volatile Proxy f18198J;

    /* renamed from: K, reason: collision with root package name */
    private volatile Handshake f18199K;

    /* renamed from: L, reason: collision with root package name */
    private volatile Protocol f18200L;

    /* renamed from: M, reason: collision with root package name */
    private volatile IOException f18201M;
    private volatile Exception O;

    /* renamed from: Q, reason: collision with root package name */
    private long f18204Q;

    /* renamed from: R, reason: collision with root package name */
    private long f18205R;

    /* renamed from: S, reason: collision with root package name */
    private long f18206S;

    /* renamed from: T, reason: collision with root package name */
    private long f18207T;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f18210d;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f18212f;

    /* renamed from: j, reason: collision with root package name */
    private volatile String f18216j;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f18217k;

    /* renamed from: s, reason: collision with root package name */
    private volatile long f18223s;

    /* renamed from: t, reason: collision with root package name */
    private volatile long f18224t;

    /* renamed from: u, reason: collision with root package name */
    private volatile IOException f18225u;

    /* renamed from: v, reason: collision with root package name */
    private volatile long f18226v;

    /* renamed from: w, reason: collision with root package name */
    private volatile long f18227w;

    /* renamed from: x, reason: collision with root package name */
    private volatile long f18228x;

    /* renamed from: y, reason: collision with root package name */
    private volatile long f18229y;

    /* renamed from: z, reason: collision with root package name */
    private volatile long f18230z;

    /* renamed from: a, reason: collision with root package name */
    protected volatile String f18208a = "";
    private volatile String b = "";

    /* renamed from: c, reason: collision with root package name */
    private volatile String f18209c = "";

    /* renamed from: e, reason: collision with root package name */
    private volatile String f18211e = "";

    /* renamed from: g, reason: collision with root package name */
    private volatile int f18213g = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f18214h = "";

    /* renamed from: i, reason: collision with root package name */
    private volatile int f18215i = -1;
    private volatile String l = "okhttp";
    private volatile boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f18218n = new AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    private volatile String f18219o = "";

    /* renamed from: p, reason: collision with root package name */
    private volatile long f18220p = 0;

    /* renamed from: q, reason: collision with root package name */
    private volatile long f18221q = 0;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f18222r = 0;

    /* renamed from: N, reason: collision with root package name */
    private volatile boolean f18202N = false;

    /* renamed from: P, reason: collision with root package name */
    private volatile boolean f18203P = false;

    public q(String str, String str2) {
        this.f18210d = "";
        this.f18216j = "un_known";
        this.f18217k = "";
        this.f18216j = str;
        this.f18217k = str2;
        this.f18210d = UUID.randomUUID().toString();
    }

    private String g() {
        return TextUtils.isEmpty(this.f18209c) ? "" : this.f18209c;
    }

    private String h() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    private String i() {
        return TextUtils.isEmpty(this.f18210d) ? "" : this.f18210d;
    }

    private String j() {
        return TextUtils.isEmpty(this.f18211e) ? "" : this.f18211e;
    }

    private String k() {
        try {
            if (TextUtils.isEmpty(this.f18208a)) {
                return "";
            }
            return URLEncoder.encode(this.f18208a, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private String l() {
        if (TextUtils.isEmpty(this.f18216j)) {
            return "un_known";
        }
        return this.f18216j;
    }

    private String m() {
        if (TextUtils.isEmpty(this.f18217k)) {
            return "";
        }
        return this.f18217k;
    }

    private int n() {
        return this.f18218n.getAndAdd(0);
    }

    private String o() {
        if (this.f18196H != null && !this.f18196H.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < this.f18196H.size(); i9++) {
                try {
                    InetAddress inetAddress = this.f18196H.get(i9);
                    if (inetAddress != null) {
                        sb.append(inetAddress.getHostAddress());
                        if (i9 != this.f18196H.size() - 1) {
                            sb.append(",");
                        }
                    }
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getDnsResult ", e4);
                    }
                }
            }
            return sb.toString();
        }
        return "";
    }

    private String p() {
        if (this.f18197I != null) {
            try {
                InetAddress address = this.f18197I.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                if (TextUtils.isEmpty(hostAddress)) {
                    return "";
                }
                return hostAddress;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getAddress ", e4);
                }
            }
        }
        return "";
    }

    private String q() {
        if (this.f18199K != null) {
            try {
                TlsVersion tlsVersion = this.f18199K.tlsVersion();
                if (tlsVersion == null) {
                    return "";
                }
                return tlsVersion.javaName();
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getTlsVersion ", e4);
                }
            }
        }
        return "";
    }

    private String r() {
        try {
            if (this.f18201M != null) {
                String name = this.f18201M.getClass().getName();
                String message = this.f18201M.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return a("connection: %s ", name, message);
                }
            }
            if (this.f18225u != null) {
                String name2 = this.f18225u.getClass().getName();
                String message2 = this.f18225u.getMessage();
                if (!TextUtils.isEmpty(message2)) {
                    return a("call: %s ", name2, message2);
                }
            }
            if (this.O != null) {
                String name3 = this.O.getClass().getName();
                String message3 = this.O.getMessage();
                if (!TextUtils.isEmpty(message3)) {
                    return a("error: %s ", name3, message3);
                }
                return "un_known";
            }
            return "un_known";
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getError ", e4);
                return "un_known";
            }
            return "un_known";
        }
    }

    public final void a(String str) {
        this.f18208a = str;
    }

    public final void b(long j7) {
        this.f18205R = j7;
    }

    public final void c(long j7) {
        this.f18206S = j7;
    }

    public final void d(long j7) {
        this.f18207T = j7;
    }

    public final void e(long j7) {
        this.f18191C = SystemClock.elapsedRealtime();
    }

    public final void f(long j7) {
        this.f18222r = j7;
    }

    public final void a(long j7) {
        this.f18204Q = j7;
    }

    public final void b(String str) {
        this.f18209c = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.f18214h = str;
    }

    public final void e() {
        this.f18194F = SystemClock.elapsedRealtime();
    }

    public final long f() {
        return this.f18222r;
    }

    public final void g(long j7) {
        this.f18195G = SystemClock.elapsedRealtime();
    }

    public final void h(long j7) {
        this.f18221q = j7;
    }

    public final void i(long j7) {
        this.f18220p = j7;
    }

    public final void j(long j7) {
        this.f18211e = UUID.randomUUID().toString();
        this.f18212f = j7;
        this.f18218n.addAndGet(1);
        this.f18201M = null;
        this.f18225u = null;
        this.O = null;
        this.f18223s = 0L;
        this.f18224t = 0L;
        this.f18226v = 0L;
        this.f18227w = 0L;
        this.f18228x = 0L;
        this.f18229y = 0L;
        this.f18230z = 0L;
        this.f18189A = 0L;
        this.f18190B = 0L;
        this.f18191C = 0L;
        this.f18192D = 0L;
        this.f18193E = 0L;
        this.f18194F = 0L;
        this.f18195G = 0L;
        this.f18221q = 0L;
        this.f18222r = 0L;
        this.m = false;
        this.f18213g = -1;
        this.f18215i = -1;
        this.f18214h = "";
        this.f18219o = "";
        this.f18220p = 0L;
        this.f18203P = false;
        this.f18203P = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "m_request_start");
            jSONObject.put("uuid", i());
            jSONObject.put("request_uuid", j());
            jSONObject.put("lrid", h());
            jSONObject.put("url", k());
            jSONObject.put("timeout", this.f18204Q);
            jSONObject.put("timeout_connection", this.f18205R);
            jSONObject.put("timeout_read", this.f18206S);
            jSONObject.put("timeout_write", this.f18207T);
            jSONObject.put("scene", l());
            jSONObject.put("method", m());
            jSONObject.put("adtp", g());
            jSONObject.put("http_stack", this.l);
            jSONObject.put("retry_count", n() - 1);
            jSONObject.put("request_wait_duration", this.f18212f);
            com.mbridge.msdk.tracker.e a6 = a(jSONObject, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.a("NetworkMonitor_" + l(), "request start monitor = " + jSONObject.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().c().a(a6);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "reportRequestStart ", th);
            }
        }
    }

    public final void a(int i9) {
        this.f18215i = i9;
    }

    public final void b() {
        this.f18230z = SystemClock.elapsedRealtime();
    }

    public final void c() {
        this.f18190B = SystemClock.elapsedRealtime();
    }

    public final void d() {
        this.f18192D = SystemClock.elapsedRealtime();
    }

    public final void a(Call call) {
        this.f18223s = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0107 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:7:0x0010, B:10:0x00c0, B:12:0x00d9, B:13:0x00e4, B:16:0x00ef, B:19:0x00f8, B:20:0x00fe, B:22:0x0107, B:23:0x010d, B:25:0x012d, B:26:0x013d, B:28:0x01a0, B:29:0x01c3), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:7:0x0010, B:10:0x00c0, B:12:0x00d9, B:13:0x00e4, B:16:0x00ef, B:19:0x00f8, B:20:0x00fe, B:22:0x0107, B:23:0x010d, B:25:0x012d, B:26:0x013d, B:28:0x01a0, B:29:0x01c3), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a0 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:7:0x0010, B:10:0x00c0, B:12:0x00d9, B:13:0x00e4, B:16:0x00ef, B:19:0x00f8, B:20:0x00fe, B:22:0x0107, B:23:0x010d, B:25:0x012d, B:26:0x013d, B:28:0x01a0, B:29:0x01c3), top: B:6:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r11) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.q.b(int):void");
    }

    public final void a() {
        this.f18226v = SystemClock.elapsedRealtime();
    }

    public final void a(List<InetAddress> list) {
        this.f18227w = SystemClock.elapsedRealtime();
        this.f18196H = list;
    }

    public final void a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f18228x = SystemClock.elapsedRealtime();
        this.f18197I = inetSocketAddress;
        this.f18198J = proxy;
        this.f18202N = true;
    }

    public final void a(Handshake handshake) {
        this.f18199K = handshake;
    }

    public final void a(Protocol protocol, IOException iOException) {
        this.f18229y = SystemClock.elapsedRealtime();
        this.f18200L = protocol;
        this.f18201M = iOException;
    }

    public final void a(Connection connection) {
        this.m = !this.f18202N;
        if (!this.m || connection == null) {
            return;
        }
        try {
            this.f18200L = connection.protocol();
            Route route = connection.route();
            if (route != null) {
                this.f18197I = route.socketAddress();
                this.f18198J = route.proxy();
            }
            this.f18199K = connection.handshake();
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "connectionAcquired ", e4);
            }
        }
    }

    public final void a(Request request) {
        this.f18189A = SystemClock.elapsedRealtime();
    }

    public final void a(Response response) {
        this.f18193E = SystemClock.elapsedRealtime();
        if (response != null) {
            try {
                Headers headers = response.headers();
                if (headers != null) {
                    String str = headers.get("Content-Type");
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    this.f18219o = str;
                }
            } catch (Exception e4) {
                this.f18219o = AppLovinMediationProvider.UNKNOWN;
                if (MBridgeConstans.DEBUG) {
                    com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "responseHeadersEnd ", e4);
                }
            }
        }
    }

    public final void a(IOException iOException) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f18224t = elapsedRealtime;
        this.f18225u = iOException;
        if (iOException != null) {
            if (this.f18226v == 0) {
                this.f18226v = elapsedRealtime;
            }
            if (this.f18227w == 0) {
                this.f18227w = elapsedRealtime;
            }
            if (this.f18228x == 0) {
                this.f18228x = elapsedRealtime;
            }
            if (this.f18229y == 0) {
                this.f18229y = elapsedRealtime;
            }
            if (this.f18230z == 0) {
                this.f18230z = elapsedRealtime;
            }
            if (this.f18189A == 0) {
                this.f18189A = elapsedRealtime;
            }
            if (this.f18190B == 0) {
                this.f18190B = elapsedRealtime;
            }
            if (this.f18191C == 0) {
                this.f18191C = elapsedRealtime;
            }
            if (this.f18192D == 0) {
                this.f18192D = elapsedRealtime;
            }
            if (this.f18193E == 0) {
                this.f18193E = elapsedRealtime;
            }
            if (this.f18194F == 0) {
                this.f18194F = elapsedRealtime;
            }
            if (this.f18195G == 0) {
                this.f18195G = elapsedRealtime;
            }
        }
    }

    private static String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        sb.append(String.format(str, str2));
        sb.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", " "));
        return sb.toString();
    }

    public final void a(Exception exc) {
        this.O = exc;
    }

    private static com.mbridge.msdk.tracker.e a(JSONObject jSONObject, String str) {
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        eVar.b(0);
        eVar.a(0);
        eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
        eVar.a(jSONObject);
        return eVar;
    }
}
