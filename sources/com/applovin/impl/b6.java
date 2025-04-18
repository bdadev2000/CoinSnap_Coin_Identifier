package com.applovin.impl;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.ma;
import com.mbridge.msdk.foundation.download.Command;
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
public class b6 extends z1 implements ma {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3838e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3839f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3840g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3841h;

    /* renamed from: i, reason: collision with root package name */
    private final ma.f f3842i;

    /* renamed from: j, reason: collision with root package name */
    private final ma.f f3843j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f3844k;

    /* renamed from: l, reason: collision with root package name */
    private Predicate f3845l;

    /* renamed from: m, reason: collision with root package name */
    private j5 f3846m;

    /* renamed from: n, reason: collision with root package name */
    private HttpURLConnection f3847n;

    /* renamed from: o, reason: collision with root package name */
    private InputStream f3848o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3849p;

    /* renamed from: q, reason: collision with root package name */
    private int f3850q;

    /* renamed from: r, reason: collision with root package name */
    private long f3851r;

    /* renamed from: s, reason: collision with root package name */
    private long f3852s;

    private b6(String str, int i10, int i11, boolean z10, ma.f fVar, Predicate predicate, boolean z11) {
        super(true);
        this.f3841h = str;
        this.f3839f = i10;
        this.f3840g = i11;
        this.f3838e = z10;
        this.f3842i = fVar;
        this.f3845l = predicate;
        this.f3843j = new ma.f();
        this.f3844k = z11;
    }

    private URL a(URL url, String str, j5 j5Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new ma.c(vd.e.e("Unsupported protocol redirect: ", protocol), j5Var, 2001, 1);
                }
                if (this.f3838e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new ma.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", j5Var, 2001, 1);
            } catch (MalformedURLException e2) {
                throw new ma.c(e2, j5Var, 2001, 1);
            }
        }
        throw new ma.c("Null location redirect", j5Var, 2001, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection d(com.applovin.impl.j5 r26) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b6.d(com.applovin.impl.j5):java.net.HttpURLConnection");
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.f3847n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                kc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f3847n = null;
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        HttpURLConnection httpURLConnection = this.f3847n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.g5
    public void close() {
        try {
            InputStream inputStream = this.f3848o;
            if (inputStream != null) {
                long j3 = this.f3851r;
                long j10 = -1;
                if (j3 != -1) {
                    j10 = j3 - this.f3852s;
                }
                a(this.f3847n, j10);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new ma.c(e2, (j5) yp.a(this.f3846m), 2000, 3);
                }
            }
        } finally {
            this.f3848o = null;
            h();
            if (this.f3849p) {
                this.f3849p = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        HttpURLConnection httpURLConnection = this.f3847n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* loaded from: classes.dex */
    public static final class b implements ma.b {

        /* renamed from: b, reason: collision with root package name */
        private yo f3853b;

        /* renamed from: c, reason: collision with root package name */
        private Predicate f3854c;

        /* renamed from: d, reason: collision with root package name */
        private String f3855d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3858g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f3859h;
        private final ma.f a = new ma.f();

        /* renamed from: e, reason: collision with root package name */
        private int f3856e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f3857f = 8000;

        @Override // com.applovin.impl.ma.b, com.applovin.impl.g5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b6 a() {
            b6 b6Var = new b6(this.f3855d, this.f3856e, this.f3857f, this.f3858g, this.a, this.f3854c, this.f3859h);
            yo yoVar = this.f3853b;
            if (yoVar != null) {
                b6Var.a(yoVar);
            }
            return b6Var;
        }

        public b a(String str) {
            this.f3855d = str;
            return this;
        }
    }

    private int e(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f3851r;
        if (j3 != -1) {
            long j10 = j3 - this.f3852s;
            if (j10 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j10);
        }
        int read = ((InputStream) yp.a((Object) this.f3848o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f3852s += read;
        d(read);
        return read;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection a(URL url, int i10, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        HttpURLConnection a10 = a(url);
        a10.setConnectTimeout(this.f3839f);
        a10.setReadTimeout(this.f3840g);
        HashMap hashMap = new HashMap();
        ma.f fVar = this.f3842i;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f3843j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a11 = oa.a(j3, j10);
        if (a11 != null) {
            a10.setRequestProperty(Command.HTTP_HEADER_RANGE, a11);
        }
        String str = this.f3841h;
        if (str != null) {
            a10.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        a10.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        a10.setInstanceFollowRedirects(z11);
        a10.setDoOutput(bArr != null);
        a10.setRequestMethod(j5.a(i10));
        if (bArr != null) {
            a10.setFixedLengthStreamingMode(bArr.length);
            a10.connect();
            OutputStream outputStream = a10.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a10.connect();
        }
        return a10;
    }

    private static void a(HttpURLConnection httpURLConnection, long j3) {
        int i10;
        if (httpURLConnection != null && (i10 = yp.a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j3 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j3 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) a1.a(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        byte[] bArr;
        this.f3846m = j5Var;
        long j3 = 0;
        this.f3852s = 0L;
        this.f3851r = 0L;
        b(j5Var);
        try {
            HttpURLConnection d10 = d(j5Var);
            this.f3847n = d10;
            this.f3850q = d10.getResponseCode();
            String responseMessage = d10.getResponseMessage();
            int i10 = this.f3850q;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = d10.getContentType();
                Predicate predicate = this.f3845l;
                if (predicate != null && !predicate.apply(contentType)) {
                    h();
                    throw new ma.d(contentType, j5Var);
                }
                if (this.f3850q == 200) {
                    long j10 = j5Var.f5443g;
                    if (j10 != 0) {
                        j3 = j10;
                    }
                }
                boolean a10 = a(d10);
                if (!a10) {
                    long j11 = j5Var.f5444h;
                    if (j11 != -1) {
                        this.f3851r = j11;
                    } else {
                        long a11 = oa.a(d10.getHeaderField("Content-Length"), d10.getHeaderField("Content-Range"));
                        this.f3851r = a11 != -1 ? a11 - j3 : -1L;
                    }
                } else {
                    this.f3851r = j5Var.f5444h;
                }
                try {
                    this.f3848o = d10.getInputStream();
                    if (a10) {
                        this.f3848o = new GZIPInputStream(this.f3848o);
                    }
                    this.f3849p = true;
                    c(j5Var);
                    try {
                        a(j3, j5Var);
                        return this.f3851r;
                    } catch (IOException e2) {
                        h();
                        if (e2 instanceof ma.c) {
                            throw ((ma.c) e2);
                        }
                        throw new ma.c(e2, j5Var, 2000, 1);
                    }
                } catch (IOException e10) {
                    h();
                    throw new ma.c(e10, j5Var, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = d10.getHeaderFields();
            if (this.f3850q == 416) {
                if (j5Var.f5443g == oa.a(d10.getHeaderField("Content-Range"))) {
                    this.f3849p = true;
                    c(j5Var);
                    long j12 = j5Var.f5444h;
                    if (j12 != -1) {
                        return j12;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d10.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = yp.a(errorStream);
                } else {
                    bArr = yp.f9257f;
                }
            } catch (IOException unused) {
                bArr = yp.f9257f;
            }
            byte[] bArr2 = bArr;
            h();
            throw new ma.e(this.f3850q, responseMessage, this.f3850q == 416 ? new h5(2008) : null, headerFields, j5Var, bArr2);
        } catch (IOException e11) {
            h();
            throw ma.c.a(e11, j5Var, 1);
        }
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        try {
            return e(bArr, i10, i11);
        } catch (IOException e2) {
            throw ma.c.a(e2, (j5) yp.a(this.f3846m), 2);
        }
    }

    private void a(long j3, j5 j5Var) {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j3 > 0) {
            int read = ((InputStream) yp.a((Object) this.f3848o)).read(bArr, 0, (int) Math.min(j3, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new ma.c(new InterruptedIOException(), j5Var, 2000, 1);
            }
            if (read != -1) {
                j3 -= read;
                d(read);
            } else {
                throw new ma.c(j5Var, 2008, 1);
            }
        }
    }
}
