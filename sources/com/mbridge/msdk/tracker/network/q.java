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

/* loaded from: classes4.dex */
public final class q {
    private volatile long A;
    private volatile long B;
    private volatile long C;
    private volatile long D;
    private volatile long E;
    private volatile long F;
    private volatile long G;
    private volatile List<InetAddress> H;
    private volatile InetSocketAddress I;
    private volatile Proxy J;
    private volatile Handshake K;
    private volatile Protocol L;
    private volatile IOException M;
    private volatile Exception O;
    private long Q;
    private long R;
    private long S;
    private long T;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f15449d;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f15451f;

    /* renamed from: j, reason: collision with root package name */
    private volatile String f15455j;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f15456k;

    /* renamed from: s, reason: collision with root package name */
    private volatile long f15464s;

    /* renamed from: t, reason: collision with root package name */
    private volatile long f15465t;
    private volatile IOException u;

    /* renamed from: v, reason: collision with root package name */
    private volatile long f15466v;

    /* renamed from: w, reason: collision with root package name */
    private volatile long f15467w;

    /* renamed from: x, reason: collision with root package name */
    private volatile long f15468x;

    /* renamed from: y, reason: collision with root package name */
    private volatile long f15469y;

    /* renamed from: z, reason: collision with root package name */
    private volatile long f15470z;
    protected volatile String a = "";

    /* renamed from: b, reason: collision with root package name */
    private volatile String f15447b = "";

    /* renamed from: c, reason: collision with root package name */
    private volatile String f15448c = "";

    /* renamed from: e, reason: collision with root package name */
    private volatile String f15450e = "";

    /* renamed from: g, reason: collision with root package name */
    private volatile int f15452g = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f15453h = "";

    /* renamed from: i, reason: collision with root package name */
    private volatile int f15454i = -1;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f15457l = "okhttp";

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f15458m = false;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f15459n = new AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    private volatile String f15460o = "";

    /* renamed from: p, reason: collision with root package name */
    private volatile long f15461p = 0;

    /* renamed from: q, reason: collision with root package name */
    private volatile long f15462q = 0;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f15463r = 0;
    private volatile boolean N = false;
    private volatile boolean P = false;

    public q(String str, String str2) {
        this.f15449d = "";
        this.f15455j = "un_known";
        this.f15456k = "";
        this.f15455j = str;
        this.f15456k = str2;
        this.f15449d = UUID.randomUUID().toString();
    }

    private String g() {
        return TextUtils.isEmpty(this.f15448c) ? "" : this.f15448c;
    }

    private String h() {
        return TextUtils.isEmpty(this.f15447b) ? "" : this.f15447b;
    }

    private String i() {
        return TextUtils.isEmpty(this.f15449d) ? "" : this.f15449d;
    }

    private String j() {
        return TextUtils.isEmpty(this.f15450e) ? "" : this.f15450e;
    }

    private String k() {
        try {
            if (TextUtils.isEmpty(this.a)) {
                return "";
            }
            return URLEncoder.encode(this.a, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private String l() {
        return TextUtils.isEmpty(this.f15455j) ? "un_known" : this.f15455j;
    }

    private String m() {
        return TextUtils.isEmpty(this.f15456k) ? "" : this.f15456k;
    }

    private int n() {
        return this.f15459n.getAndAdd(0);
    }

    private String o() {
        if (this.H != null && !this.H.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < this.H.size(); i10++) {
                try {
                    InetAddress inetAddress = this.H.get(i10);
                    if (inetAddress != null) {
                        sb2.append(inetAddress.getHostAddress());
                        if (i10 != this.H.size() - 1) {
                            sb2.append(",");
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getDnsResult ", e2);
                    }
                }
            }
            return sb2.toString();
        }
        return "";
    }

    private String p() {
        if (this.I != null) {
            try {
                InetAddress address = this.I.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                if (TextUtils.isEmpty(hostAddress)) {
                    return "";
                }
                return hostAddress;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getAddress ", e2);
                }
            }
        }
        return "";
    }

    private String q() {
        if (this.K != null) {
            try {
                TlsVersion tlsVersion = this.K.tlsVersion();
                if (tlsVersion == null) {
                    return "";
                }
                return tlsVersion.javaName();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getTlsVersion ", e2);
                }
            }
        }
        return "";
    }

    private String r() {
        try {
            if (this.M != null) {
                String name = this.M.getClass().getName();
                String message = this.M.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return a("connection: %s ", name, message);
                }
            }
            if (this.u != null) {
                String name2 = this.u.getClass().getName();
                String message2 = this.u.getMessage();
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
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "getError ", e2);
                return "un_known";
            }
            return "un_known";
        }
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void b(long j3) {
        this.R = j3;
    }

    public final void c(long j3) {
        this.S = j3;
    }

    public final void d(long j3) {
        this.T = j3;
    }

    public final void e(long j3) {
        this.C = SystemClock.elapsedRealtime();
    }

    public final void f(long j3) {
        this.f15463r = j3;
    }

    public final void a(long j3) {
        this.Q = j3;
    }

    public final void b(String str) {
        this.f15448c = str;
    }

    public final void c(String str) {
        this.f15447b = str;
    }

    public final void d(String str) {
        this.f15453h = str;
    }

    public final void e() {
        this.F = SystemClock.elapsedRealtime();
    }

    public final long f() {
        return this.f15463r;
    }

    public final void g(long j3) {
        this.G = SystemClock.elapsedRealtime();
    }

    public final void h(long j3) {
        this.f15462q = j3;
    }

    public final void i(long j3) {
        this.f15461p = j3;
    }

    public final void j(long j3) {
        this.f15450e = UUID.randomUUID().toString();
        this.f15451f = j3;
        this.f15459n.addAndGet(1);
        this.M = null;
        this.u = null;
        this.O = null;
        this.f15464s = 0L;
        this.f15465t = 0L;
        this.f15466v = 0L;
        this.f15467w = 0L;
        this.f15468x = 0L;
        this.f15469y = 0L;
        this.f15470z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.f15462q = 0L;
        this.f15463r = 0L;
        this.f15458m = false;
        this.f15452g = -1;
        this.f15454i = -1;
        this.f15453h = "";
        this.f15460o = "";
        this.f15461p = 0L;
        this.P = false;
        this.P = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "m_request_start");
            jSONObject.put("uuid", i());
            jSONObject.put("request_uuid", j());
            jSONObject.put("lrid", h());
            jSONObject.put("url", k());
            jSONObject.put("timeout", this.Q);
            jSONObject.put("timeout_connection", this.R);
            jSONObject.put("timeout_read", this.S);
            jSONObject.put("timeout_write", this.T);
            jSONObject.put("scene", l());
            jSONObject.put("method", m());
            jSONObject.put("adtp", g());
            jSONObject.put("http_stack", this.f15457l);
            jSONObject.put("retry_count", n() - 1);
            jSONObject.put("request_wait_duration", this.f15451f);
            com.mbridge.msdk.tracker.e a = a(jSONObject, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.a("NetworkMonitor_" + l(), "request start monitor = " + jSONObject.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().c().a(a);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "reportRequestStart ", th2);
            }
        }
    }

    public final void a(int i10) {
        this.f15454i = i10;
    }

    public final void b() {
        this.f15470z = SystemClock.elapsedRealtime();
    }

    public final void c() {
        this.B = SystemClock.elapsedRealtime();
    }

    public final void d() {
        this.D = SystemClock.elapsedRealtime();
    }

    public final void a(Call call) {
        this.f15464s = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107 A[Catch: all -> 0x01cf, TryCatch #0 {all -> 0x01cf, blocks: (B:7:0x0010, B:10:0x00c0, B:13:0x00ca, B:15:0x00dc, B:16:0x00e4, B:19:0x00ef, B:22:0x00f8, B:23:0x00fe, B:25:0x0107, B:26:0x010d, B:28:0x012d, B:29:0x013d, B:31:0x01a0, B:32:0x01c3), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d A[Catch: all -> 0x01cf, TryCatch #0 {all -> 0x01cf, blocks: (B:7:0x0010, B:10:0x00c0, B:13:0x00ca, B:15:0x00dc, B:16:0x00e4, B:19:0x00ef, B:22:0x00f8, B:23:0x00fe, B:25:0x0107, B:26:0x010d, B:28:0x012d, B:29:0x013d, B:31:0x01a0, B:32:0x01c3), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a0 A[Catch: all -> 0x01cf, TryCatch #0 {all -> 0x01cf, blocks: (B:7:0x0010, B:10:0x00c0, B:13:0x00ca, B:15:0x00dc, B:16:0x00e4, B:19:0x00ef, B:22:0x00f8, B:23:0x00fe, B:25:0x0107, B:26:0x010d, B:28:0x012d, B:29:0x013d, B:31:0x01a0, B:32:0x01c3), top: B:6:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r12) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.network.q.b(int):void");
    }

    public final void a() {
        this.f15466v = SystemClock.elapsedRealtime();
    }

    public final void a(List<InetAddress> list) {
        this.f15467w = SystemClock.elapsedRealtime();
        this.H = list;
    }

    public final void a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f15468x = SystemClock.elapsedRealtime();
        this.I = inetSocketAddress;
        this.J = proxy;
        this.N = true;
    }

    public final void a(Handshake handshake) {
        this.K = handshake;
    }

    public final void a(Protocol protocol, IOException iOException) {
        this.f15469y = SystemClock.elapsedRealtime();
        this.L = protocol;
        this.M = iOException;
    }

    public final void a(Connection connection) {
        this.f15458m = !this.N;
        if (!this.f15458m || connection == null) {
            return;
        }
        try {
            this.L = connection.protocol();
            Route route = connection.route();
            if (route != null) {
                this.I = route.socketAddress();
                this.J = route.proxy();
            }
            this.K = connection.handshake();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "connectionAcquired ", e2);
            }
        }
    }

    public final void a(Request request) {
        this.A = SystemClock.elapsedRealtime();
    }

    public final void a(Response response) {
        this.E = SystemClock.elapsedRealtime();
        if (response != null) {
            try {
                Headers headers = response.headers();
                if (headers != null) {
                    String str = headers.get("Content-Type");
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    this.f15460o = str;
                }
            } catch (Exception e2) {
                this.f15460o = AppLovinMediationProvider.UNKNOWN;
                if (MBridgeConstans.DEBUG) {
                    com.mbridge.msdk.foundation.tools.ad.b("NetworkMonitor", "responseHeadersEnd ", e2);
                }
            }
        }
    }

    public final void a(IOException iOException) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f15465t = elapsedRealtime;
        this.u = iOException;
        if (iOException != null) {
            if (this.f15466v == 0) {
                this.f15466v = elapsedRealtime;
            }
            if (this.f15467w == 0) {
                this.f15467w = elapsedRealtime;
            }
            if (this.f15468x == 0) {
                this.f15468x = elapsedRealtime;
            }
            if (this.f15469y == 0) {
                this.f15469y = elapsedRealtime;
            }
            if (this.f15470z == 0) {
                this.f15470z = elapsedRealtime;
            }
            if (this.A == 0) {
                this.A = elapsedRealtime;
            }
            if (this.B == 0) {
                this.B = elapsedRealtime;
            }
            if (this.C == 0) {
                this.C = elapsedRealtime;
            }
            if (this.D == 0) {
                this.D = elapsedRealtime;
            }
            if (this.E == 0) {
                this.E = elapsedRealtime;
            }
            if (this.F == 0) {
                this.F = elapsedRealtime;
            }
            if (this.G == 0) {
                this.G = elapsedRealtime;
            }
        }
    }

    private static String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        objArr[0] = str2;
        sb2.append(String.format(str, objArr));
        sb2.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", " "));
        return sb2.toString();
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
