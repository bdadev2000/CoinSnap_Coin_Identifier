package com.applovin.impl;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.ma;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class b6 extends AbstractC0783z1 implements ma {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6822e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6823f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6824g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6825h;

    /* renamed from: i, reason: collision with root package name */
    private final ma.f f6826i;

    /* renamed from: j, reason: collision with root package name */
    private final ma.f f6827j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f6828k;
    private Predicate l;
    private j5 m;

    /* renamed from: n, reason: collision with root package name */
    private HttpURLConnection f6829n;

    /* renamed from: o, reason: collision with root package name */
    private InputStream f6830o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6831p;

    /* renamed from: q, reason: collision with root package name */
    private int f6832q;

    /* renamed from: r, reason: collision with root package name */
    private long f6833r;

    /* renamed from: s, reason: collision with root package name */
    private long f6834s;

    private b6(String str, int i9, int i10, boolean z8, ma.f fVar, Predicate predicate, boolean z9) {
        super(true);
        this.f6825h = str;
        this.f6823f = i9;
        this.f6824g = i10;
        this.f6822e = z8;
        this.f6826i = fVar;
        this.l = predicate;
        this.f6827j = new ma.f();
        this.f6828k = z9;
    }

    private URL a(URL url, String str, j5 j5Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new ma.c(AbstractC2914a.d("Unsupported protocol redirect: ", protocol), j5Var, 2001, 1);
                }
                if (this.f6822e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new ma.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", j5Var, 2001, 1);
            } catch (MalformedURLException e4) {
                throw new ma.c(e4, j5Var, 2001, 1);
            }
        }
        throw new ma.c("Null location redirect", j5Var, 2001, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection d(com.applovin.impl.j5 r26) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b6.d(com.applovin.impl.j5):java.net.HttpURLConnection");
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.f6829n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                kc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.f6829n = null;
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        HttpURLConnection httpURLConnection = this.f6829n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.g5
    public void close() {
        try {
            InputStream inputStream = this.f6830o;
            if (inputStream != null) {
                long j7 = this.f6833r;
                long j9 = -1;
                if (j7 != -1) {
                    j9 = j7 - this.f6834s;
                }
                a(this.f6829n, j9);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new ma.c(e4, (j5) yp.a(this.m), 2000, 3);
                }
            }
        } finally {
            this.f6830o = null;
            h();
            if (this.f6831p) {
                this.f6831p = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        HttpURLConnection httpURLConnection = this.f6829n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* loaded from: classes.dex */
    public static final class b implements ma.b {
        private yo b;

        /* renamed from: c, reason: collision with root package name */
        private Predicate f6836c;

        /* renamed from: d, reason: collision with root package name */
        private String f6837d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6840g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f6841h;

        /* renamed from: a, reason: collision with root package name */
        private final ma.f f6835a = new ma.f();

        /* renamed from: e, reason: collision with root package name */
        private int f6838e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f6839f = 8000;

        @Override // com.applovin.impl.ma.b, com.applovin.impl.g5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b6 a() {
            b6 b6Var = new b6(this.f6837d, this.f6838e, this.f6839f, this.f6840g, this.f6835a, this.f6836c, this.f6841h);
            yo yoVar = this.b;
            if (yoVar != null) {
                b6Var.a(yoVar);
            }
            return b6Var;
        }

        public b a(String str) {
            this.f6837d = str;
            return this;
        }
    }

    private int e(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.f6833r;
        if (j7 != -1) {
            long j9 = j7 - this.f6834s;
            if (j9 == 0) {
                return -1;
            }
            i10 = (int) Math.min(i10, j9);
        }
        int read = ((InputStream) yp.a((Object) this.f6830o)).read(bArr, i9, i10);
        if (read == -1) {
            return -1;
        }
        this.f6834s += read;
        d(read);
        return read;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection a(URL url, int i9, byte[] bArr, long j7, long j9, boolean z8, boolean z9, Map map) {
        HttpURLConnection a6 = a(url);
        a6.setConnectTimeout(this.f6823f);
        a6.setReadTimeout(this.f6824g);
        HashMap hashMap = new HashMap();
        ma.f fVar = this.f6826i;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f6827j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a6.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a9 = oa.a(j7, j9);
        if (a9 != null) {
            a6.setRequestProperty(Command.HTTP_HEADER_RANGE, a9);
        }
        String str = this.f6825h;
        if (str != null) {
            a6.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        a6.setRequestProperty("Accept-Encoding", z8 ? "gzip" : "identity");
        a6.setInstanceFollowRedirects(z9);
        a6.setDoOutput(bArr != null);
        a6.setRequestMethod(j5.a(i9));
        if (bArr != null) {
            a6.setFixedLengthStreamingMode(bArr.length);
            a6.connect();
            OutputStream outputStream = a6.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a6.connect();
        }
        return a6;
    }

    private static void a(HttpURLConnection httpURLConnection, long j7) {
        int i9;
        if (httpURLConnection != null && (i9 = yp.f12451a) >= 19 && i9 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j7 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j7 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) AbstractC0669a1.a(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        byte[] bArr;
        this.m = j5Var;
        long j7 = 0;
        this.f6834s = 0L;
        this.f6833r = 0L;
        b(j5Var);
        try {
            HttpURLConnection d2 = d(j5Var);
            this.f6829n = d2;
            this.f6832q = d2.getResponseCode();
            String responseMessage = d2.getResponseMessage();
            int i9 = this.f6832q;
            if (i9 >= 200 && i9 <= 299) {
                String contentType = d2.getContentType();
                Predicate predicate = this.l;
                if (predicate != null && !predicate.apply(contentType)) {
                    h();
                    throw new ma.d(contentType, j5Var);
                }
                if (this.f6832q == 200) {
                    long j9 = j5Var.f8400g;
                    if (j9 != 0) {
                        j7 = j9;
                    }
                }
                boolean a6 = a(d2);
                if (!a6) {
                    long j10 = j5Var.f8401h;
                    if (j10 != -1) {
                        this.f6833r = j10;
                    } else {
                        long a9 = oa.a(d2.getHeaderField("Content-Length"), d2.getHeaderField("Content-Range"));
                        this.f6833r = a9 != -1 ? a9 - j7 : -1L;
                    }
                } else {
                    this.f6833r = j5Var.f8401h;
                }
                try {
                    this.f6830o = d2.getInputStream();
                    if (a6) {
                        this.f6830o = new GZIPInputStream(this.f6830o);
                    }
                    this.f6831p = true;
                    c(j5Var);
                    try {
                        a(j7, j5Var);
                        return this.f6833r;
                    } catch (IOException e4) {
                        h();
                        if (e4 instanceof ma.c) {
                            throw ((ma.c) e4);
                        }
                        throw new ma.c(e4, j5Var, 2000, 1);
                    }
                } catch (IOException e9) {
                    h();
                    throw new ma.c(e9, j5Var, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = d2.getHeaderFields();
            if (this.f6832q == 416) {
                if (j5Var.f8400g == oa.a(d2.getHeaderField("Content-Range"))) {
                    this.f6831p = true;
                    c(j5Var);
                    long j11 = j5Var.f8401h;
                    if (j11 != -1) {
                        return j11;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d2.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = yp.a(errorStream);
                } else {
                    bArr = yp.f12455f;
                }
            } catch (IOException unused) {
                bArr = yp.f12455f;
            }
            byte[] bArr2 = bArr;
            h();
            throw new ma.e(this.f6832q, responseMessage, this.f6832q == 416 ? new h5(2008) : null, headerFields, j5Var, bArr2);
        } catch (IOException e10) {
            h();
            throw ma.c.a(e10, j5Var, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        try {
            return e(bArr, i9, i10);
        } catch (IOException e4) {
            throw ma.c.a(e4, (j5) yp.a(this.m), 2);
        }
    }

    private void a(long j7, j5 j5Var) {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int read = ((InputStream) yp.a((Object) this.f6830o)).read(bArr, 0, (int) Math.min(j7, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new ma.c(new InterruptedIOException(), j5Var, 2000, 1);
            }
            if (read != -1) {
                j7 -= read;
                d(read);
            } else {
                throw new ma.c(j5Var, 2008, 1);
            }
        }
    }
}
