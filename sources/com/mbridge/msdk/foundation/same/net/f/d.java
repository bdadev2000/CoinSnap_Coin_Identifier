package com.mbridge.msdk.foundation.same.net.f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15850a = "d";

    private void a(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
        JSONObject jSONObject = dVar.f15778c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -9999);
        if (optInt == -9999) {
            a(dVar.f15778c);
            return;
        }
        if (optInt != 1 && optInt != 200) {
            String optString = dVar.f15778c.optString(NotificationCompat.CATEGORY_MESSAGE);
            if (TextUtils.isEmpty(optString)) {
                optString = "error message is null";
            }
            a(optString);
            return;
        }
        a(dVar.f15778c.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.b(f15850a, "errorCode = " + aVar.f15773a);
        a(com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
        if (dVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(dVar);
        com.mbridge.msdk.foundation.same.net.d.a aVar = dVar.b;
        if (aVar == null) {
            a(dVar);
        } else if (aVar.f15781d == 204) {
            a(new JSONObject());
        } else {
            a(dVar);
        }
    }
}
