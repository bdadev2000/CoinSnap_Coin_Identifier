package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class k implements e {
    public final T1.k b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12861c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f12862d;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f12863f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f12864g;

    public k(T1.k kVar, int i9) {
        this.b = kVar;
        this.f12861c = i9;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e4) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e4);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f12863f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f12862d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f12862d = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f12864g = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, d dVar) {
        StringBuilder sb;
        T1.k kVar = this.b;
        int i9 = j2.i.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.h(f(kVar.d(), 0, null, kVar.b.a()));
            } catch (IOException e4) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e4);
                }
                dVar.c(e4);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(j2.i.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + j2.i.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i9, URL url2, Map map) {
        if (i9 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new N1.c("In re-direct loop", -1, null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i10 = this.f12861c;
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f12862d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f12863f = this.f12862d.getInputStream();
                    if (this.f12864g) {
                        return null;
                    }
                    int c9 = c(this.f12862d);
                    int i11 = c9 / 100;
                    if (i11 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f12862d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f12863f = new j2.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f12863f = httpURLConnection2.getInputStream();
                            }
                            return this.f12863f;
                        } catch (IOException e4) {
                            throw new N1.c("Failed to obtain InputStream", c(httpURLConnection2), e4);
                        }
                    }
                    if (i11 == 3) {
                        String headerField = this.f12862d.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return f(url3, i9 + 1, url, map);
                            } catch (MalformedURLException e9) {
                                throw new N1.c(AbstractC2914a.d("Bad redirect url: ", headerField), c9, e9);
                            }
                        }
                        throw new N1.c("Received empty or null redirect url", c9, null);
                    }
                    if (c9 == -1) {
                        throw new N1.c("Http request failed", c9, null);
                    }
                    try {
                        throw new N1.c(this.f12862d.getResponseMessage(), c9, null);
                    } catch (IOException e10) {
                        throw new N1.c("Failed to get a response message", c9, e10);
                    }
                } catch (IOException e11) {
                    throw new N1.c("Failed to connect or obtain data", c(this.f12862d), e11);
                }
            } catch (IOException e12) {
                throw new N1.c("URL.openConnection threw", 0, e12);
            }
        }
        throw new N1.c("Too many (> 5) redirects!", -1, null);
    }
}
