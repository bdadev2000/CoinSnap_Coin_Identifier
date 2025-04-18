package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes3.dex */
public final class ImageResponseCache {

    @NotNull
    public static final ImageResponseCache INSTANCE = new ImageResponseCache();
    private static final String TAG = "ImageResponseCache";
    private static FileLruCache imageCache;

    /* loaded from: classes3.dex */
    public static final class BufferedHttpInputStream extends BufferedInputStream {

        @NotNull
        private HttpURLConnection connection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BufferedHttpInputStream(@Nullable InputStream inputStream, @NotNull HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            p0.a.s(httpURLConnection, "connection");
            this.connection = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            Utility utility = Utility.INSTANCE;
            Utility.disconnectQuietly(this.connection);
        }

        @NotNull
        public final HttpURLConnection getConnection() {
            return this.connection;
        }

        public final void setConnection(@NotNull HttpURLConnection httpURLConnection) {
            p0.a.s(httpURLConnection, "<set-?>");
            this.connection = httpURLConnection;
        }
    }

    private ImageResponseCache() {
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = TAG;
            p0.a.r(str, "TAG");
            companion.log(loggingBehavior, 5, str, p0.a.z0(e.getMessage(), "clearCache failed "));
        }
    }

    @NotNull
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        synchronized (ImageResponseCache.class) {
            try {
                if (imageCache == null) {
                    String str = TAG;
                    p0.a.r(str, "TAG");
                    imageCache = new FileLruCache(str, new FileLruCache.Limits());
                }
                fileLruCache = imageCache;
                if (fileLruCache == null) {
                    p0.a.B0("imageCache");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLruCache;
    }

    @Nullable
    public static final InputStream getCachedImageStream(@Nullable Uri uri) {
        if (uri == null || !INSTANCE.isCDNURL(uri)) {
            return null;
        }
        try {
            FileLruCache cache = getCache();
            String uri2 = uri.toString();
            p0.a.r(uri2, "uri.toString()");
            return FileLruCache.get$default(cache, uri2, null, 2, null);
        } catch (IOException e) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            String str = TAG;
            p0.a.r(str, "TAG");
            companion.log(loggingBehavior, 5, str, e.toString());
            return null;
        }
    }

    @Nullable
    public static final InputStream interceptAndCacheImageStream(@NotNull HttpURLConnection httpURLConnection) throws IOException {
        p0.a.s(httpURLConnection, "connection");
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (!INSTANCE.isCDNURL(parse)) {
                return inputStream;
            }
            FileLruCache cache = getCache();
            String uri = parse.toString();
            p0.a.r(uri, "uri.toString()");
            return cache.interceptAndPut(uri, new BufferedHttpInputStream(inputStream, httpURLConnection));
        } catch (IOException unused) {
            return inputStream;
        }
    }

    private final boolean isCDNURL(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!p0.a.g(host, "fbcdn.net") && !m.P0(host, ".fbcdn.net", false) && (!m.q1(host, "fbcdn", false) || !m.P0(host, ".akamaihd.net", false)))) ? false : true;
    }

    public final String getTAG() {
        return TAG;
    }
}
