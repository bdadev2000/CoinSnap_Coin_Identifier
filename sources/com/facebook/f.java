package com.facebook;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements b0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10993b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.f10993b = obj;
    }

    @Override // com.facebook.b0
    public final void a(k0 response) {
        int i10 = this.a;
        Boolean bool = null;
        Object obj = this.f10993b;
        switch (i10) {
            case 0:
                i refreshResult = (i) obj;
                Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = response.f11169d;
                if (jSONObject != null) {
                    refreshResult.a = jSONObject.optString("access_token");
                    refreshResult.f11015c = jSONObject.optInt("expires_at");
                    refreshResult.f11016d = jSONObject.optInt("expires_in");
                    refreshResult.f11017e = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    refreshResult.f11014b = jSONObject.optString("graph_domain", null);
                    return;
                }
                return;
            case 1:
            default:
                ArrayList validReports = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(validReports, "$validReports");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f11168c == null) {
                        JSONObject jSONObject2 = response.f11169d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            Iterator it = validReports.iterator();
                            while (it.hasNext()) {
                                com.facebook.appevents.g.e(((n6.a) it.next()).a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            case 2:
                a4.j.t(obj);
                Intrinsics.checkNotNullParameter(response, "response");
                return;
            case 3:
                j6.c instrumentData = (j6.c) obj;
                Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f11168c == null) {
                        JSONObject jSONObject3 = response.f11169d;
                        if (jSONObject3 != null) {
                            bool = Boolean.valueOf(jSONObject3.getBoolean("success"));
                        }
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            com.facebook.appevents.g.e(instrumentData.a);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }
}
