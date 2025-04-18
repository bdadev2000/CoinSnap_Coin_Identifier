package com.facebook;

import com.applovin.sdk.AppLovinMediationProvider;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f11166e = k0.class.getCanonicalName();
    public final HttpURLConnection a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f11167b;

    /* renamed from: c, reason: collision with root package name */
    public final u f11168c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f11169d;

    public k0(g0 request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, u uVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = httpURLConnection;
        this.f11167b = jSONObject;
        this.f11168c = uVar;
        this.f11169d = jSONObject;
    }

    public final String toString() {
        String str;
        int responseCode;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.a;
            if (httpURLConnection == null) {
                responseCode = 200;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            objArr[0] = Integer.valueOf(responseCode);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = AppLovinMediationProvider.UNKNOWN;
        }
        StringBuilder o10 = a4.j.o("{Response:  responseCode: ", str, ", graphObject: ");
        o10.append(this.f11167b);
        o10.append(", error: ");
        o10.append(this.f11168c);
        o10.append("}");
        String sb2 = o10.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(g0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(g0 request, HttpURLConnection httpURLConnection, u error) {
        this(request, httpURLConnection, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
