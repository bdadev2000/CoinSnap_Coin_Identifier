package m9;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.common.collect.e2;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class y extends f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21784e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21785f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21786g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21787h;

    /* renamed from: i, reason: collision with root package name */
    public final g4.d0 f21788i;

    /* renamed from: j, reason: collision with root package name */
    public final g4.d0 f21789j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21790k;

    /* renamed from: l, reason: collision with root package name */
    public final ra.j f21791l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f21792m;

    /* renamed from: n, reason: collision with root package name */
    public InputStream f21793n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21794o;

    /* renamed from: p, reason: collision with root package name */
    public int f21795p;

    /* renamed from: q, reason: collision with root package name */
    public long f21796q;

    /* renamed from: r, reason: collision with root package name */
    public long f21797r;

    public y(String str, int i10, int i11, g4.d0 d0Var) {
        super(true);
        this.f21787h = str;
        this.f21785f = i10;
        this.f21786g = i11;
        this.f21784e = false;
        this.f21788i = d0Var;
        this.f21791l = null;
        this.f21789j = new g4.d0(1);
        this.f21790k = false;
    }

    public static void l(HttpURLConnection httpURLConnection, long j3) {
        int i10;
        if (httpURLConnection != null && (i10 = n9.h0.a) >= 19 && i10 <= 20) {
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
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0139 A[Catch: IOException -> 0x0162, TRY_LEAVE, TryCatch #3 {IOException -> 0x0162, blocks: (B:26:0x0131, B:28:0x0139), top: B:25:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    @Override // m9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(m9.p r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.y.a(m9.p):long");
    }

    @Override // m9.l
    public final void close() {
        try {
            InputStream inputStream = this.f21793n;
            if (inputStream != null) {
                long j3 = this.f21796q;
                long j10 = -1;
                if (j3 != -1) {
                    j10 = j3 - this.f21797r;
                }
                l(this.f21792m, j10);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    int i10 = n9.h0.a;
                    throw new d0(e2, 2000, 3);
                }
            }
        } finally {
            this.f21793n = null;
            h();
            if (this.f21794o) {
                this.f21794o = false;
                e();
            }
        }
    }

    @Override // m9.l
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f21792m;
        if (httpURLConnection == null) {
            return e2.f11936i;
        }
        return new x(httpURLConnection.getHeaderFields());
    }

    @Override // m9.l
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f21792m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.f21792m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                n9.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f21792m = null;
        }
    }

    public final URL i(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new d0(vd.e.e("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f21784e && !protocol.equals(url.getProtocol())) {
                    throw new d0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e2) {
                throw new d0(e2, 2001, 1);
            }
        }
        throw new d0("Null location redirect", 2001);
    }

    public final HttpURLConnection j(URL url, int i10, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        Map map2;
        String sb2;
        String str;
        boolean z12;
        String str2;
        Map map3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f21785f);
        httpURLConnection.setReadTimeout(this.f21786g);
        HashMap hashMap = new HashMap();
        g4.d0 d0Var = this.f21788i;
        if (d0Var != null) {
            synchronized (d0Var) {
                if (d0Var.f18046b == null) {
                    d0Var.f18046b = Collections.unmodifiableMap(new HashMap(d0Var.a));
                }
                map3 = d0Var.f18046b;
            }
            hashMap.putAll(map3);
        }
        g4.d0 d0Var2 = this.f21789j;
        synchronized (d0Var2) {
            if (d0Var2.f18046b == null) {
                d0Var2.f18046b = Collections.unmodifiableMap(new HashMap(d0Var2.a));
            }
            map2 = d0Var2.f18046b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = g0.a;
        if (j3 == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("bytes=", j3, "-");
            if (j10 != -1) {
                o10.append((j3 + j10) - 1);
            }
            sb2 = o10.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb2);
        }
        String str3 = this.f21787h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str3);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        int i11 = p.f21705k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection k(p pVar) {
        boolean z10;
        HttpURLConnection j3;
        boolean z11;
        p pVar2 = pVar;
        URL url = new URL(pVar2.a.toString());
        int i10 = pVar2.f21707c;
        byte[] bArr = pVar2.f21708d;
        long j10 = pVar2.f21710f;
        long j11 = pVar2.f21711g;
        if ((pVar2.f21713i & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = this.f21784e;
        boolean z13 = this.f21790k;
        if (!z12 && !z13) {
            return j(url, i10, bArr, j10, j11, z10, true, pVar2.f21709e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                Map map = pVar2.f21709e;
                URL url3 = url2;
                int i14 = i11;
                boolean z14 = z13;
                long j12 = j11;
                j3 = j(url2, i11, bArr2, j10, j11, z10, false, map);
                int responseCode = j3.getResponseCode();
                String headerField = j3.getHeaderField("Location");
                if ((i14 != 1 && i14 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    j3.disconnect();
                    if (z14 && responseCode == 302) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i14;
                    }
                    url2 = i(url3, headerField);
                } else {
                    j3.disconnect();
                    url2 = i(url3, headerField);
                    i11 = i14;
                }
                pVar2 = pVar;
                i12 = i13;
                z13 = z14;
                j11 = j12;
            } else {
                throw new d0(new NoRouteToHostException(eb.j.i("Too many redirects: ", i13)), 2001, 1);
            }
        }
        return j3;
    }

    public final void m(long j3) {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j3 > 0) {
            int min = (int) Math.min(j3, 4096);
            InputStream inputStream = this.f21793n;
            int i10 = n9.h0.a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j3 -= read;
                    d(read);
                } else {
                    throw new d0();
                }
            } else {
                throw new d0(new InterruptedIOException(), 2000, 1);
            }
        }
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j3 = this.f21796q;
            if (j3 != -1) {
                long j10 = j3 - this.f21797r;
                if (j10 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j10);
            }
            InputStream inputStream = this.f21793n;
            int i12 = n9.h0.a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f21797r += read;
                d(read);
                return read;
            }
            return -1;
        } catch (IOException e2) {
            int i13 = n9.h0.a;
            throw d0.a(e2, 2);
        }
    }
}
