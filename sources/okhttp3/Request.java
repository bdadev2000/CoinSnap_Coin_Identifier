package okhttp3;

import b1.f0;
import com.android.volley.toolbox.HttpClientStack;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safedk.android.a.g;
import d0.k;
import e0.e0;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* loaded from: classes2.dex */
public final class Request {

    @Nullable
    private final RequestBody body;

    @NotNull
    private final Headers headers;

    @Nullable
    private CacheControl lazyCacheControl;

    @NotNull
    private final String method;

    @NotNull
    private final Map<Class<?>, Object> tags;

    @NotNull
    private final HttpUrl url;

    /* loaded from: classes2.dex */
    public static class Builder {

        @Nullable
        private RequestBody body;

        @NotNull
        private Headers.Builder headers;

        @NotNull
        private String method;

        @NotNull
        private Map<Class<?>, Object> tags;

        @Nullable
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i2 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        @NotNull
        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            a.s(str, "name");
            a.s(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            a.s(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? removeHeader(HttpHeaders.CACHE_CONTROL) : header(HttpHeaders.CACHE_CONTROL, cacheControl2);
        }

        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String str, @NotNull String str2) {
            a.s(str, "name");
            a.s(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            a.s(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String str, @Nullable RequestBody requestBody) {
            a.s(str, FirebaseAnalytics.Param.METHOD);
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                if (!(!HttpMethod.requiresRequestBody(str))) {
                    throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("method ", str, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(str)) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("method ", str, " must not have a request body.").toString());
            }
            this.method = str;
            this.body = requestBody;
            return this;
        }

        @NotNull
        public Builder patch(@NotNull RequestBody requestBody) {
            a.s(requestBody, "body");
            return method(HttpClientStack.HttpPatch.METHOD_NAME, requestBody);
        }

        @NotNull
        public Builder post(@NotNull RequestBody requestBody) {
            a.s(requestBody, "body");
            return method(g.f29074c, requestBody);
        }

        @NotNull
        public Builder put(@NotNull RequestBody requestBody) {
            a.s(requestBody, "body");
            return method(g.d, requestBody);
        }

        @NotNull
        public Builder removeHeader(@NotNull String str) {
            a.s(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            a.s(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            a.s(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            a.s(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl httpUrl) {
            a.s(httpUrl, "url");
            this.url = httpUrl;
            return this;
        }

        @NotNull
        public Builder delete(@Nullable RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> cls, @Nullable T t2) {
            a.s(cls, "type");
            if (t2 == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T cast = cls.cast(t2);
                a.p(cast);
                map.put(cls, cast);
            }
            return this;
        }

        @NotNull
        public Builder url(@NotNull String str) {
            a.s(str, "url");
            if (m.q1(str, "ws:", true)) {
                String substring = str.substring(3);
                a.r(substring, "this as java.lang.String).substring(startIndex)");
                str = "http:".concat(substring);
            } else if (m.q1(str, "wss:", true)) {
                String substring2 = str.substring(4);
                a.r(substring2, "this as java.lang.String).substring(startIndex)");
                str = "https:".concat(substring2);
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(@NotNull Request request) {
            LinkedHashMap z2;
            a.s(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                z2 = new LinkedHashMap();
            } else {
                z2 = e0.z(request.getTags$okhttp());
            }
            this.tags = z2;
            this.headers = request.headers().newBuilder();
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            a.s(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            a.r(url2, "url.toString()");
            return url(companion.get(url2));
        }
    }

    public Request(@NotNull HttpUrl httpUrl, @NotNull String str, @NotNull Headers headers, @Nullable RequestBody requestBody, @NotNull Map<Class<?>, ? extends Object> map) {
        a.s(httpUrl, "url");
        a.s(str, FirebaseAnalytics.Param.METHOD);
        a.s(headers, "headers");
        a.s(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m742deprecated_body() {
        return this.body;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m743deprecated_cacheControl() {
        return cacheControl();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m744deprecated_headers() {
        return this.headers;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m745deprecated_method() {
        return this.method;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m746deprecated_url() {
        return this.url;
    }

    @Nullable
    public final RequestBody body() {
        return this.body;
    }

    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    @NotNull
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String str) {
        a.s(str, "name");
        return this.headers.get(str);
    }

    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (k kVar : this.headers) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    f0.D();
                    throw null;
                }
                k kVar2 = kVar;
                String str = (String) kVar2.f30134a;
                String str2 = (String) kVar2.f30135b;
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i2 = i3;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }

    @NotNull
    public final List<String> headers(@NotNull String str) {
        a.s(str, "name");
        return this.headers.values(str);
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> cls) {
        a.s(cls, "type");
        return cls.cast(this.tags.get(cls));
    }
}
