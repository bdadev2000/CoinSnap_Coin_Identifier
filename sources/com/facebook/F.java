package com.facebook;

import com.applovin.sdk.AppLovinMediationProvider;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13405e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f13406a;
    public final JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    public final p f13407c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f13408d;

    public F(C c9, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, p pVar) {
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        this.f13406a = httpURLConnection;
        this.b = jSONObject;
        this.f13407c = pVar;
        this.f13408d = jSONObject;
    }

    public final String toString() {
        String str;
        int responseCode;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f13406a;
            if (httpURLConnection == null) {
                responseCode = 200;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(responseCode)}, 1));
        } catch (IOException unused) {
            str = AppLovinMediationProvider.UNKNOWN;
        }
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("{Response:  responseCode: ", str, ", graphObject: ");
        n2.append(this.b);
        n2.append(", error: ");
        n2.append(this.f13407c);
        n2.append("}");
        String sb = n2.toString();
        G7.j.d(sb, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return sb;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(C c9, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(c9, httpURLConnection, jSONObject, null, null);
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        G7.j.e(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(C c9, HttpURLConnection httpURLConnection, p pVar) {
        this(c9, httpURLConnection, null, null, pVar);
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
    }
}
