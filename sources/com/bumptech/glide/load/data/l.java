package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import k4.p;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    public final p f9704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9705c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f9706d;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f9707f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f9708g;

    static {
        new com.facebook.b(8);
    }

    public l(p pVar, int i10) {
        this.f9704b = pVar;
        this.f9705c = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
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
        InputStream inputStream = this.f9707f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9706d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9706d = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f9708g = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, d dVar) {
        StringBuilder sb2;
        p pVar = this.f9704b;
        int i10 = w4.g.f26732b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.f(f(pVar.d(), 0, null, pVar.f20253b.a()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                dVar.c(e2);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(w4.g.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + w4.g.a(elapsedRealtimeNanos));
            }
            throw th2;
        }
    }

    public final InputStream f(URL url, int i10, URL url2, Map map) {
        boolean z10;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e4.d(-1, "In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z11 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i11 = this.f9705c;
                httpURLConnection.setConnectTimeout(i11);
                httpURLConnection.setReadTimeout(i11);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f9706d = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f9707f = this.f9706d.getInputStream();
                    if (this.f9708g) {
                        return null;
                    }
                    int c10 = c(this.f9706d);
                    int i12 = c10 / 100;
                    if (i12 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        HttpURLConnection httpURLConnection2 = this.f9706d;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f9707f = new w4.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f9707f = httpURLConnection2.getInputStream();
                            }
                            return this.f9707f;
                        } catch (IOException e2) {
                            throw new e4.d(c(httpURLConnection2), "Failed to obtain InputStream", e2);
                        }
                    }
                    if (i12 == 3) {
                        z11 = true;
                    }
                    if (z11) {
                        String headerField = this.f9706d.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return f(url3, i10 + 1, url, map);
                            } catch (MalformedURLException e10) {
                                throw new e4.d(c10, vd.e.e("Bad redirect url: ", headerField), e10);
                            }
                        }
                        throw new e4.d(c10, "Received empty or null redirect url", null);
                    }
                    if (c10 == -1) {
                        throw new e4.d(c10, "Http request failed", null);
                    }
                    try {
                        throw new e4.d(c10, this.f9706d.getResponseMessage(), null);
                    } catch (IOException e11) {
                        throw new e4.d(c10, "Failed to get a response message", e11);
                    }
                } catch (IOException e12) {
                    throw new e4.d(c(this.f9706d), "Failed to connect or obtain data", e12);
                }
            } catch (IOException e13) {
                throw new e4.d(0, "URL.openConnection threw", e13);
            }
        }
        throw new e4.d(-1, "Too many (> 5) redirects!", null);
    }
}
