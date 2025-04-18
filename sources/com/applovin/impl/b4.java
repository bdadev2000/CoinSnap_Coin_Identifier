package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zf;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b4 {

    /* renamed from: e, reason: collision with root package name */
    private static final List f3821e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f3822b;

    /* renamed from: c, reason: collision with root package name */
    private final zf f3823c;

    /* renamed from: d, reason: collision with root package name */
    private d f3824d;

    /* loaded from: classes.dex */
    public static class b {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private long f3825b;

        public long a() {
            return this.a;
        }

        public long b() {
            return this.f3825b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j3) {
            this.a = j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j3) {
            this.f3825b = j3;
        }
    }

    /* loaded from: classes.dex */
    public class c implements m0.a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f3826b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3827c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f3828d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f3829e;

        /* renamed from: f, reason: collision with root package name */
        private final b f3830f;

        /* renamed from: g, reason: collision with root package name */
        private final e f3831g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.a = str;
            this.f3826b = aVar;
            this.f3827c = str2;
            this.f3828d = obj;
            this.f3829e = z10;
            this.f3830f = bVar;
            this.f3831g = eVar;
        }

        @Override // m0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(zf.d dVar) {
            int i10;
            int c10;
            String str;
            long e2 = dVar.e();
            Object obj = null;
            int i11 = 0;
            try {
                c10 = dVar.c();
            } catch (MalformedURLException e10) {
                e = e10;
                i10 = 0;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (c10 <= 0) {
                    b4.this.a(this.f3827c, this.a, c10, e2, (Throwable) null);
                    this.f3831g.a(this.a, c10, null, null);
                    return;
                }
                if (c10 >= 200 && c10 < 400) {
                    b bVar = this.f3830f;
                    if (bVar != null) {
                        bVar.a(e2);
                    }
                    b4.this.a(this.f3827c, this.a, c10, e2);
                    byte[] d10 = dVar.d();
                    if (zp.f(com.applovin.impl.sdk.k.k()) && (!this.f3829e || qi.b(d10) != qi.a.V2)) {
                        String str2 = "";
                        if (d10 == null) {
                            str = "";
                        } else {
                            str = new String(dVar.d(), Charset.forName("UTF-8"));
                        }
                        if (this.f3826b.b() != null) {
                            str2 = this.f3826b.b().toString();
                        }
                        b4.this.a.o().a(str, this.a, str2);
                    }
                    if (d10 != null) {
                        String str3 = new String(dVar.d(), Charset.forName("UTF-8"));
                        b bVar2 = this.f3830f;
                        if (bVar2 != null) {
                            bVar2.b(d10.length);
                            if (this.f3826b.r()) {
                                b4.this.f3824d = new d(this.f3826b.f(), d10.length, e2);
                            }
                        }
                        if (this.f3829e) {
                            String b3 = qi.b(d10, b4.this.a.d0(), b4.this.a);
                            if (b3 == null) {
                                HashMap hashMap = new HashMap(2);
                                hashMap.put(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.a));
                                hashMap.put("response", str3);
                                b4.this.a.C().trackEvent("rdf", hashMap);
                            }
                            str3 = b3;
                        }
                        try {
                            this.f3831g.a(this.a, b4.this.a(str3, this.f3828d), c10);
                            return;
                        } catch (Throwable th3) {
                            String str4 = "Unable to parse response from " + StringUtils.getHostAndPath(this.a) + " because of " + th3.getClass().getName() + " : " + th3.getMessage();
                            com.applovin.impl.sdk.t unused = b4.this.f3822b;
                            if (com.applovin.impl.sdk.t.a()) {
                                b4.this.f3822b.a("ConnectionManager", str4, th3);
                            }
                            b4.this.a.F().c(aa.f3624n);
                            b4.this.a.B().a("ConnectionManager", "failedToParseResponse", th3, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.a)));
                            this.f3831g.a(this.a, AppLovinErrorCodes.INVALID_RESPONSE, str4, null);
                            return;
                        }
                    }
                    this.f3831g.a(this.a, this.f3828d, c10);
                    return;
                }
                this.f3831g.a(this.a, c10, null, null);
            } catch (MalformedURLException e11) {
                e = e11;
                i10 = c10;
                if (this.f3828d == null) {
                    b4.this.a(this.f3827c, this.a, i10, e2);
                    this.f3831g.a(this.a, this.f3828d, -901);
                } else {
                    b4.this.a(this.f3827c, this.a, i10, e2, e);
                    this.f3831g.a(this.a, -901, e.getMessage(), null);
                }
            } catch (Throwable th4) {
                th = th4;
                i11 = c10;
                if (((Boolean) b4.this.a.a(oj.u)).booleanValue()) {
                    i11 = dVar.b();
                }
                if (i11 == 0) {
                    i11 = b4.this.a(th);
                }
                int i12 = i11;
                try {
                    byte[] f10 = dVar.f();
                    String str5 = new String(f10);
                    if (f10 != null) {
                        if (this.f3829e) {
                            str5 = qi.b(f10, b4.this.a.d0(), b4.this.a);
                        }
                        obj = b4.this.a(str5, this.f3828d);
                    }
                } catch (Throwable unused2) {
                }
                b4.this.a(this.f3827c, this.a, i12, e2, th);
                this.f3831g.a(this.a, i12, th.getMessage(), obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        private final long a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f3833b;

        /* renamed from: c, reason: collision with root package name */
        private final long f3834c;

        /* renamed from: d, reason: collision with root package name */
        private final long f3835d;

        public d(String str, long j3, long j10) {
            this.f3833b = str;
            this.f3834c = j3;
            this.f3835d = j10;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f3834c;
        }

        public long c() {
            return this.a;
        }

        public String d() {
            return this.f3833b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String d10 = d();
            String d11 = dVar.d();
            return d10 != null ? d10.equals(d11) : d11 == null;
        }

        public int hashCode() {
            long c10 = c();
            long b3 = b();
            int i10 = ((((int) (c10 ^ (c10 >>> 32))) + 59) * 59) + ((int) (b3 ^ (b3 >>> 32)));
            long a = a();
            String d10 = d();
            return (((i10 * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (d10 == null ? 43 : d10.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f3835d;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f3822b = kVar.L();
        zf zfVar = new zf(kVar);
        this.f3823c = zfVar;
        zfVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th2) {
        if (th2 instanceof UnknownHostException) {
            return -1009;
        }
        if (th2 instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th2 instanceof IOException) {
            return -100;
        }
        return th2 instanceof JSONException ? -104 : -1;
    }

    public d a() {
        return this.f3824d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof fs) {
                return gs.a(str, this.a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f3822b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x023e A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:41:0x0129, B:43:0x0139, B:46:0x0160, B:47:0x015c, B:48:0x016f, B:51:0x0194, B:53:0x01b0, B:56:0x01d1, B:59:0x0224, B:62:0x0233, B:64:0x023e, B:65:0x01d5, B:68:0x01dd, B:75:0x01f5, B:77:0x01fb, B:78:0x0210, B:79:0x01be, B:80:0x0241, B:82:0x0247, B:83:0x025b, B:71:0x01ee), top: B:40:0x0129, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.b4.b r25, com.applovin.impl.b4.e r26) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.a(com.applovin.impl.sdk.network.a, com.applovin.impl.b4$b, com.applovin.impl.b4$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j3) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f3822b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (((float) j3) / 1000.0f) + " s over " + c4.g(this.a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j3, Throwable th2) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f3822b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (((float) j3) / 1000.0f) + " s over " + c4.g(this.a) + " to " + a(str2), th2);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
