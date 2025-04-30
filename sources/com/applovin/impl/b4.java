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
    private static final List f6805e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6806a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c, reason: collision with root package name */
    private final zf f6807c;

    /* renamed from: d, reason: collision with root package name */
    private d f6808d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f6809a;
        private long b;

        public long a() {
            return this.f6809a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j7) {
            this.f6809a = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j7) {
            this.b = j7;
        }
    }

    /* loaded from: classes.dex */
    public class c implements S.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6810a;
        private final com.applovin.impl.sdk.network.a b;

        /* renamed from: c, reason: collision with root package name */
        private final String f6811c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f6812d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f6813e;

        /* renamed from: f, reason: collision with root package name */
        private final b f6814f;

        /* renamed from: g, reason: collision with root package name */
        private final e f6815g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z8, b bVar, e eVar) {
            this.f6810a = str;
            this.b = aVar;
            this.f6811c = str2;
            this.f6812d = obj;
            this.f6813e = z8;
            this.f6814f = bVar;
            this.f6815g = eVar;
        }

        @Override // S.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(zf.d dVar) {
            int i9;
            int c9;
            String str;
            long e4 = dVar.e();
            Object obj = null;
            int i10 = 0;
            try {
                c9 = dVar.c();
            } catch (MalformedURLException e9) {
                e = e9;
                i9 = 0;
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c9 <= 0) {
                    b4.this.a(this.f6811c, this.f6810a, c9, e4, (Throwable) null);
                    this.f6815g.a(this.f6810a, c9, null, null);
                    return;
                }
                if (c9 >= 200 && c9 < 400) {
                    b bVar = this.f6814f;
                    if (bVar != null) {
                        bVar.a(e4);
                    }
                    b4.this.a(this.f6811c, this.f6810a, c9, e4);
                    byte[] d2 = dVar.d();
                    if (zp.f(com.applovin.impl.sdk.k.k()) && (!this.f6813e || qi.b(d2) != qi.a.V2)) {
                        String str2 = "";
                        if (d2 == null) {
                            str = "";
                        } else {
                            str = new String(dVar.d(), Charset.forName("UTF-8"));
                        }
                        if (this.b.b() != null) {
                            str2 = this.b.b().toString();
                        }
                        b4.this.f6806a.o().a(str, this.f6810a, str2);
                    }
                    if (d2 != null) {
                        String str3 = new String(dVar.d(), Charset.forName("UTF-8"));
                        b bVar2 = this.f6814f;
                        if (bVar2 != null) {
                            bVar2.b(d2.length);
                            if (this.b.r()) {
                                b4.this.f6808d = new d(this.b.f(), d2.length, e4);
                            }
                        }
                        if (this.f6813e) {
                            String b = qi.b(d2, b4.this.f6806a.d0(), b4.this.f6806a);
                            if (b == null) {
                                HashMap hashMap = new HashMap(2);
                                hashMap.put(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f6810a));
                                hashMap.put("response", str3);
                                b4.this.f6806a.C().trackEvent("rdf", hashMap);
                            }
                            str3 = b;
                        }
                        try {
                            this.f6815g.a(this.f6810a, b4.this.a(str3, this.f6812d), c9);
                            return;
                        } catch (Throwable th2) {
                            String str4 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f6810a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                            com.applovin.impl.sdk.t unused = b4.this.b;
                            if (com.applovin.impl.sdk.t.a()) {
                                b4.this.b.a("ConnectionManager", str4, th2);
                            }
                            b4.this.f6806a.F().c(aa.f6604n);
                            b4.this.f6806a.B().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f6810a)));
                            this.f6815g.a(this.f6810a, AppLovinErrorCodes.INVALID_RESPONSE, str4, null);
                            return;
                        }
                    }
                    this.f6815g.a(this.f6810a, this.f6812d, c9);
                    return;
                }
                this.f6815g.a(this.f6810a, c9, null, null);
            } catch (MalformedURLException e10) {
                e = e10;
                i9 = c9;
                if (this.f6812d == null) {
                    b4.this.a(this.f6811c, this.f6810a, i9, e4);
                    this.f6815g.a(this.f6810a, this.f6812d, -901);
                } else {
                    b4.this.a(this.f6811c, this.f6810a, i9, e4, e);
                    this.f6815g.a(this.f6810a, -901, e.getMessage(), null);
                }
            } catch (Throwable th3) {
                th = th3;
                i10 = c9;
                if (((Boolean) b4.this.f6806a.a(oj.f9858u)).booleanValue()) {
                    i10 = dVar.b();
                }
                if (i10 == 0) {
                    i10 = b4.this.a(th);
                }
                int i11 = i10;
                try {
                    byte[] f9 = dVar.f();
                    String str5 = new String(f9);
                    if (f9 != null) {
                        if (this.f6813e) {
                            str5 = qi.b(f9, b4.this.f6806a.d0(), b4.this.f6806a);
                        }
                        obj = b4.this.a(str5, this.f6812d);
                    }
                } catch (Throwable unused2) {
                }
                b4.this.a(this.f6811c, this.f6810a, i11, e4, th);
                this.f6815g.a(this.f6810a, i11, th.getMessage(), obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f6817a = System.currentTimeMillis();
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final long f6818c;

        /* renamed from: d, reason: collision with root package name */
        private final long f6819d;

        public d(String str, long j7, long j9) {
            this.b = str;
            this.f6818c = j7;
            this.f6819d = j9;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f6818c;
        }

        public long c() {
            return this.f6817a;
        }

        public String d() {
            return this.b;
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
            String d2 = d();
            String d9 = dVar.d();
            if (d2 != null ? d2.equals(d9) : d9 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            long c9 = c();
            long b = b();
            int i9 = ((((int) (c9 ^ (c9 >>> 32))) + 59) * 59) + ((int) (b ^ (b >>> 32)));
            long a6 = a();
            String d2 = d();
            int i10 = ((i9 * 59) + ((int) ((a6 >>> 32) ^ a6))) * 59;
            if (d2 == null) {
                hashCode = 43;
            } else {
                hashCode = d2.hashCode();
            }
            return i10 + hashCode;
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f6819d;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str, int i9, String str2, Object obj);

        void a(String str, Object obj, int i9);
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f6806a = kVar;
        this.b = kVar.L();
        zf zfVar = new zf(kVar);
        this.f6807c = zfVar;
        zfVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    public d a() {
        return this.f6808d;
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
                return gs.a(str, this.f6806a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0244 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:42:0x012a, B:44:0x013a, B:47:0x0161, B:48:0x015d, B:49:0x0174, B:52:0x0199, B:54:0x01b5, B:58:0x01d7, B:61:0x022a, B:64:0x0239, B:66:0x0244, B:67:0x01db, B:70:0x01e3, B:77:0x01fb, B:79:0x0201, B:80:0x0216, B:81:0x01c4, B:82:0x0247, B:84:0x024d, B:85:0x0261, B:73:0x01f4), top: B:41:0x012a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.b4.b r25, com.applovin.impl.b4.e r26) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.a(com.applovin.impl.sdk.network.a, com.applovin.impl.b4$b, com.applovin.impl.b4$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i9, long j7) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i9 + " in " + (((float) j7) / 1000.0f) + " s over " + c4.g(this.f6806a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i9, long j7, Throwable th) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i9 + " in " + (((float) j7) / 1000.0f) + " s over " + c4.g(this.f6806a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
