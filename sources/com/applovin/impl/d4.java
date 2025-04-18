package com.applovin.impl;

import androidx.core.util.Consumer;
import com.applovin.impl.eg;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.vi;
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

/* loaded from: classes2.dex */
public class d4 {
    private static final List e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f23403a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f23404b;

    /* renamed from: c, reason: collision with root package name */
    private final eg f23405c;
    private d d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f23406a;

        /* renamed from: b, reason: collision with root package name */
        private long f23407b;

        public long a() {
            return this.f23406a;
        }

        public long b() {
            return this.f23407b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j2) {
            this.f23406a = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j2) {
            this.f23407b = j2;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Consumer {

        /* renamed from: a, reason: collision with root package name */
        private final String f23408a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f23409b;

        /* renamed from: c, reason: collision with root package name */
        private final String f23410c;
        private final Object d;
        private final boolean e;

        /* renamed from: f, reason: collision with root package name */
        private final b f23411f;

        /* renamed from: g, reason: collision with root package name */
        private final e f23412g;

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z2, b bVar, e eVar) {
            this.f23408a = str;
            this.f23409b = aVar;
            this.f23410c = str2;
            this.d = obj;
            this.e = z2;
            this.f23411f = bVar;
            this.f23412g = eVar;
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(eg.d dVar) {
            int i2;
            int c2;
            long e = dVar.e();
            Object obj = null;
            int i3 = 0;
            try {
                c2 = dVar.c();
            } catch (MalformedURLException e2) {
                e = e2;
                i2 = 0;
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c2 <= 0) {
                    d4.this.a(this.f23410c, this.f23408a, c2, e, (Throwable) null);
                    this.f23412g.a(this.f23408a, c2, null, null);
                    return;
                }
                if (c2 < 200 || c2 >= 400) {
                    this.f23412g.a(this.f23408a, c2, null, null);
                    return;
                }
                b bVar = this.f23411f;
                if (bVar != null) {
                    bVar.a(e);
                }
                d4.this.a(this.f23410c, this.f23408a, c2, e);
                byte[] d = dVar.d();
                if (yp.f(com.applovin.impl.sdk.j.l()) && (!this.e || vi.b(d) != vi.a.V2)) {
                    d4.this.f23403a.p().a(d != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f23408a, this.f23409b.b() != null ? this.f23409b.b().toString() : "");
                }
                if (d == null) {
                    this.f23412g.a(this.f23408a, this.d, c2);
                    return;
                }
                String str = new String(dVar.d(), Charset.forName("UTF-8"));
                b bVar2 = this.f23411f;
                if (bVar2 != null) {
                    bVar2.b(d.length);
                    if (this.f23409b.r()) {
                        d4.this.d = new d(this.f23409b.f(), d.length, e);
                    }
                }
                if (this.e) {
                    String b2 = vi.b(d, d4.this.f23403a.b0(), d4.this.f23403a);
                    if (b2 == null) {
                        HashMap hashMap = new HashMap(2);
                        hashMap.put("request", StringUtils.getHostAndPath(this.f23408a));
                        hashMap.put("response", str);
                        d4.this.f23403a.A().trackEvent("rdf", hashMap);
                    }
                    str = b2;
                }
                try {
                    this.f23412g.a(this.f23408a, d4.this.a(str, this.d), c2);
                } catch (Throwable th2) {
                    String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f23408a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                    com.applovin.impl.sdk.n unused = d4.this.f23404b;
                    if (com.applovin.impl.sdk.n.a()) {
                        d4.this.f23404b.a("ConnectionManager", str2, th2);
                    }
                    d4.this.f23403a.D().c(ca.f23250n);
                    d4.this.f23403a.E().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f23408a)));
                    this.f23412g.a(this.f23408a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                }
            } catch (MalformedURLException e3) {
                e = e3;
                i2 = c2;
                if (this.d != null) {
                    d4.this.a(this.f23410c, this.f23408a, i2, e, e);
                    this.f23412g.a(this.f23408a, -901, e.getMessage(), null);
                } else {
                    d4.this.a(this.f23410c, this.f23408a, i2, e);
                    this.f23412g.a(this.f23408a, this.d, -901);
                }
            } catch (Throwable th3) {
                th = th3;
                i3 = c2;
                if (((Boolean) d4.this.f23403a.a(sj.f26946q)).booleanValue()) {
                    i3 = dVar.b();
                }
                if (i3 == 0) {
                    i3 = d4.this.a(th);
                }
                int i4 = i3;
                try {
                    byte[] f2 = dVar.f();
                    String str3 = new String(f2);
                    if (f2 != null) {
                        if (this.e) {
                            str3 = vi.b(f2, d4.this.f23403a.b0(), d4.this.f23403a);
                        }
                        obj = d4.this.a(str3, this.d);
                    }
                } catch (Throwable unused2) {
                }
                d4.this.a(this.f23410c, this.f23408a, i4, e, th);
                this.f23412g.a(this.f23408a, i4, th.getMessage(), obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f23414a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f23415b;

        /* renamed from: c, reason: collision with root package name */
        private final long f23416c;
        private final long d;

        public d(String str, long j2, long j3) {
            this.f23415b = str;
            this.f23416c = j2;
            this.d = j3;
        }

        public long a() {
            return this.d;
        }

        public long b() {
            return this.f23416c;
        }

        public long c() {
            return this.f23414a;
        }

        public String d() {
            return this.f23415b;
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
            String d = d();
            String d2 = dVar.d();
            return d != null ? d.equals(d2) : d2 == null;
        }

        public int hashCode() {
            long c2 = c();
            long b2 = b();
            int i2 = ((((int) (c2 ^ (c2 >>> 32))) + 59) * 59) + ((int) (b2 ^ (b2 >>> 32)));
            long a2 = a();
            String d = d();
            return (((i2 * 59) + ((int) ((a2 >>> 32) ^ a2))) * 59) + (d == null ? 43 : d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(String str, int i2, String str2, Object obj);

        void a(String str, Object obj, int i2);
    }

    public d4(com.applovin.impl.sdk.j jVar) {
        this.f23403a = jVar;
        this.f23404b = jVar.J();
        eg egVar = new eg(jVar);
        this.f23405c = egVar;
        egVar.a();
    }

    public d a() {
        return this.d;
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

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof es) {
                return fs.a(str, this.f23403a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f23404b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0244 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:42:0x012a, B:44:0x013a, B:47:0x0161, B:48:0x015d, B:49:0x0174, B:52:0x0199, B:54:0x01b5, B:58:0x01d7, B:61:0x022a, B:64:0x0239, B:66:0x0244, B:67:0x01db, B:70:0x01e3, B:77:0x01fb, B:79:0x0201, B:80:0x0216, B:81:0x01c4, B:82:0x0247, B:84:0x024d, B:85:0x0261, B:73:0x01f4), top: B:41:0x012a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.d4.b r25, com.applovin.impl.d4.e r26) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d4.a(com.applovin.impl.sdk.network.a, com.applovin.impl.d4$b, com.applovin.impl.d4$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i2, long j2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f23404b.d("ConnectionManager", "Successful " + str + " returned " + i2 + " in " + (((float) j2) / 1000.0f) + " s over " + e4.g(this.f23403a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i2, long j2, Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f23404b.a("ConnectionManager", "Failed " + str + " returned " + i2 + " in " + (((float) j2) / 1000.0f) + " s over " + e4.g(this.f23403a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
