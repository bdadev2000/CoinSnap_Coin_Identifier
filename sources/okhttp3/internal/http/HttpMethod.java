package okhttp3.internal.http;

import com.google.firebase.perf.FirebasePerformance;

/* loaded from: classes9.dex */
public final class HttpMethod {
    public static boolean invalidatesCache(String str) {
        return str.equals(FirebasePerformance.HttpMethod.POST) || str.equals(FirebasePerformance.HttpMethod.PATCH) || str.equals(FirebasePerformance.HttpMethod.PUT) || str.equals(FirebasePerformance.HttpMethod.DELETE) || str.equals("MOVE");
    }

    public static boolean requiresRequestBody(String str) {
        return str.equals(FirebasePerformance.HttpMethod.POST) || str.equals(FirebasePerformance.HttpMethod.PUT) || str.equals(FirebasePerformance.HttpMethod.PATCH) || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean permitsRequestBody(String str) {
        return (str.equals(FirebasePerformance.HttpMethod.GET) || str.equals(FirebasePerformance.HttpMethod.HEAD)) ? false : true;
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals("PROPFIND");
    }

    private HttpMethod() {
    }
}
