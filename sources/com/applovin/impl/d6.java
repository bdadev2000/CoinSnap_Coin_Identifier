package com.applovin.impl;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.qa;
import com.facebook.ads.AdError;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.common.net.HttpHeaders;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class d6 extends a2 implements qa {
    private final boolean e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23422f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23423g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23424h;

    /* renamed from: i, reason: collision with root package name */
    private final qa.f f23425i;

    /* renamed from: j, reason: collision with root package name */
    private final qa.f f23426j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f23427k;

    /* renamed from: l, reason: collision with root package name */
    private Predicate f23428l;

    /* renamed from: m, reason: collision with root package name */
    private l5 f23429m;

    /* renamed from: n, reason: collision with root package name */
    private HttpURLConnection f23430n;

    /* renamed from: o, reason: collision with root package name */
    private InputStream f23431o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23432p;

    /* renamed from: q, reason: collision with root package name */
    private int f23433q;

    /* renamed from: r, reason: collision with root package name */
    private long f23434r;

    /* renamed from: s, reason: collision with root package name */
    private long f23435s;

    /* loaded from: classes.dex */
    public static final class b implements qa.b {

        /* renamed from: b, reason: collision with root package name */
        private xo f23437b;

        /* renamed from: c, reason: collision with root package name */
        private Predicate f23438c;
        private String d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f23440g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f23441h;

        /* renamed from: a, reason: collision with root package name */
        private final qa.f f23436a = new qa.f();
        private int e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f23439f = 8000;

        public b a(String str) {
            this.d = str;
            return this;
        }

        @Override // com.applovin.impl.qa.b, com.applovin.impl.i5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d6 a() {
            d6 d6Var = new d6(this.d, this.e, this.f23439f, this.f23440g, this.f23436a, this.f23438c, this.f23441h);
            xo xoVar = this.f23437b;
            if (xoVar != null) {
                d6Var.a(xoVar);
            }
            return d6Var;
        }
    }

    private d6(String str, int i2, int i3, boolean z2, qa.f fVar, Predicate predicate, boolean z3) {
        super(true);
        this.f23424h = str;
        this.f23422f = i2;
        this.f23423g = i3;
        this.e = z2;
        this.f23425i = fVar;
        this.f23428l = predicate;
        this.f23426j = new qa.f();
        this.f23427k = z3;
    }

    private URL a(URL url, String str, l5 l5Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!TournamentShareDialogURIBuilder.scheme.equals(protocol) && !com.safedk.android.analytics.brandsafety.creatives.e.e.equals(protocol)) {
                    throw new qa.c(androidx.compose.ui.platform.j.b("Unsupported protocol redirect: ", protocol), l5Var, AdError.INTERNAL_ERROR_CODE, 1);
                }
                if (this.e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new qa.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", l5Var, AdError.INTERNAL_ERROR_CODE, 1);
            } catch (MalformedURLException e) {
                throw new qa.c(e, l5Var, AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        throw new qa.c("Null location redirect", l5Var, AdError.INTERNAL_ERROR_CODE, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection d(com.applovin.impl.l5 r26) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d6.d(com.applovin.impl.l5):java.net.HttpURLConnection");
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.f23430n;
        if (httpURLConnection != null) {
            try {
                AppLovinNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                pc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f23430n = null;
        }
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        HttpURLConnection httpURLConnection = this.f23430n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.i5
    public void close() {
        try {
            InputStream inputStream = this.f23431o;
            if (inputStream != null) {
                long j2 = this.f23434r;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = j2 - this.f23435s;
                }
                a(this.f23430n, j3);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new qa.c(e, (l5) xp.a(this.f23429m), AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f23431o = null;
            h();
            if (this.f23432p) {
                this.f23432p = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.i5
    public Map e() {
        HttpURLConnection httpURLConnection = this.f23430n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    private int e(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f23434r;
        if (j2 != -1) {
            long j3 = j2 - this.f23435s;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, j3);
        }
        int read = ((InputStream) xp.a((Object) this.f23431o)).read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        this.f23435s += read;
        d(read);
        return read;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
    }

    private HttpURLConnection a(URL url, int i2, byte[] bArr, long j2, long j3, boolean z2, boolean z3, Map map) {
        HttpURLConnection a2 = a(url);
        a2.setConnectTimeout(this.f23422f);
        a2.setReadTimeout(this.f23423g);
        HashMap hashMap = new HashMap();
        qa.f fVar = this.f23425i;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f23426j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a3 = sa.a(j2, j3);
        if (a3 != null) {
            a2.setRequestProperty(HttpHeaders.RANGE, a3);
        }
        String str = this.f23424h;
        if (str != null) {
            a2.setRequestProperty(HttpHeaders.USER_AGENT, str);
        }
        a2.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z2 ? "gzip" : "identity");
        a2.setInstanceFollowRedirects(z3);
        a2.setDoOutput(bArr != null);
        a2.setRequestMethod(l5.a(i2));
        if (bArr != null) {
            a2.setFixedLengthStreamingMode(bArr.length);
            a2.connect();
            OutputStream urlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(a2);
            urlConnectionGetOutputStream.write(bArr);
            urlConnectionGetOutputStream.close();
        } else {
            a2.connect();
        }
        return a2;
    }

    private static void a(HttpURLConnection httpURLConnection, long j2) {
        int i2;
        if (httpURLConnection != null && (i2 = xp.f27962a) >= 19 && i2 <= 20) {
            try {
                InputStream urlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (j2 == -1) {
                    if (urlConnectionGetInputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = urlConnectionGetInputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) b1.a(urlConnectionGetInputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(urlConnectionGetInputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        byte[] bArr;
        this.f23429m = l5Var;
        long j2 = 0;
        this.f23435s = 0L;
        this.f23434r = 0L;
        b(l5Var);
        try {
            HttpURLConnection d = d(l5Var);
            this.f23430n = d;
            this.f23433q = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(d);
            String responseMessage = d.getResponseMessage();
            int i2 = this.f23433q;
            if (i2 >= 200 && i2 <= 299) {
                String contentType = d.getContentType();
                Predicate predicate = this.f23428l;
                if (predicate != null && !predicate.apply(contentType)) {
                    h();
                    throw new qa.d(contentType, l5Var);
                }
                if (this.f23433q == 200) {
                    long j3 = l5Var.f24987g;
                    if (j3 != 0) {
                        j2 = j3;
                    }
                }
                boolean a2 = a(d);
                if (!a2) {
                    long j4 = l5Var.f24988h;
                    if (j4 != -1) {
                        this.f23434r = j4;
                    } else {
                        long a3 = sa.a(d.getHeaderField(HttpHeaders.CONTENT_LENGTH), d.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        this.f23434r = a3 != -1 ? a3 - j2 : -1L;
                    }
                } else {
                    this.f23434r = l5Var.f24988h;
                }
                try {
                    this.f23431o = AppLovinNetworkBridge.urlConnectionGetInputStream(d);
                    if (a2) {
                        this.f23431o = new GZIPInputStream(this.f23431o);
                    }
                    this.f23432p = true;
                    c(l5Var);
                    try {
                        a(j2, l5Var);
                        return this.f23434r;
                    } catch (IOException e) {
                        h();
                        if (e instanceof qa.c) {
                            throw ((qa.c) e);
                        }
                        throw new qa.c(e, l5Var, AdError.SERVER_ERROR_CODE, 1);
                    }
                } catch (IOException e2) {
                    h();
                    throw new qa.c(e2, l5Var, AdError.SERVER_ERROR_CODE, 1);
                }
            }
            Map<String, List<String>> headerFields = d.getHeaderFields();
            if (this.f23433q == 416) {
                if (l5Var.f24987g == sa.a(d.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                    this.f23432p = true;
                    c(l5Var);
                    long j5 = l5Var.f24988h;
                    if (j5 != -1) {
                        return j5;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = xp.a(errorStream);
                } else {
                    bArr = xp.f27965f;
                }
            } catch (IOException unused) {
                bArr = xp.f27965f;
            }
            byte[] bArr2 = bArr;
            h();
            throw new qa.e(this.f23433q, responseMessage, this.f23433q == 416 ? new j5(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, l5Var, bArr2);
        } catch (IOException e3) {
            h();
            throw qa.c.a(e3, l5Var, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        try {
            return e(bArr, i2, i3);
        } catch (IOException e) {
            throw qa.c.a(e, (l5) xp.a(this.f23429m), 2);
        }
    }

    private void a(long j2, l5 l5Var) {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j2 > 0) {
            int read = ((InputStream) xp.a((Object) this.f23431o)).read(bArr, 0, (int) Math.min(j2, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new qa.c(new InterruptedIOException(), l5Var, AdError.SERVER_ERROR_CODE, 1);
            }
            if (read != -1) {
                j2 -= read;
                d(read);
            } else {
                throw new qa.c(l5Var, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
        }
    }
}
