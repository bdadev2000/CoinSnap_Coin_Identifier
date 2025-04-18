package okhttp3.internal.http;

import com.android.volley.toolbox.HttpClientStack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safedk.android.a.g;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class HttpMethod {

    @NotNull
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(@NotNull String str) {
        a.s(str, FirebaseAnalytics.Param.METHOD);
        return (a.g(str, "GET") || a.g(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(@NotNull String str) {
        a.s(str, FirebaseAnalytics.Param.METHOD);
        return a.g(str, g.f29074c) || a.g(str, g.d) || a.g(str, HttpClientStack.HttpPatch.METHOD_NAME) || a.g(str, "PROPPATCH") || a.g(str, "REPORT");
    }

    public final boolean invalidatesCache(@NotNull String str) {
        a.s(str, FirebaseAnalytics.Param.METHOD);
        return a.g(str, g.f29074c) || a.g(str, HttpClientStack.HttpPatch.METHOD_NAME) || a.g(str, g.d) || a.g(str, "DELETE") || a.g(str, "MOVE");
    }

    public final boolean redirectsToGet(@NotNull String str) {
        a.s(str, FirebaseAnalytics.Param.METHOD);
        return !a.g(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String str) {
        a.s(str, FirebaseAnalytics.Param.METHOD);
        return a.g(str, "PROPFIND");
    }
}
