package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class Internal {
    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str) {
        a.s(builder, "builder");
        a.s(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec, @NotNull SSLSocket sSLSocket, boolean z2) {
        a.s(connectionSpec, "connectionSpec");
        a.s(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z2);
    }

    @Nullable
    public static final Response cacheGet(@NotNull Cache cache, @NotNull Request request) {
        a.s(cache, "cache");
        a.s(request, "request");
        return cache.get$okhttp(request);
    }

    @NotNull
    public static final String cookieToString(@NotNull Cookie cookie, boolean z2) {
        a.s(cookie, "cookie");
        return cookie.toString$okhttp(z2);
    }

    @Nullable
    public static final Cookie parseCookie(long j2, @NotNull HttpUrl httpUrl, @NotNull String str) {
        a.s(httpUrl, "url");
        a.s(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j2, httpUrl, str);
    }

    @NotNull
    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        a.s(builder, "builder");
        a.s(str, "name");
        a.s(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }
}
