package com.mbridge.msdk.mbbid.common.b;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16392a = "b";

    public b(String str, String str2) {
        this.unitId = str2;
        this.placementId = str;
    }

    public abstract void a(int i9, String str);

    public abstract void a(BidResponsedEx bidResponsedEx);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.b(f16392a, "errorCode = " + aVar.f15773a);
        a(aVar.f15773a, com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<JSONObject> dVar) {
        com.mbridge.msdk.foundation.same.net.d.a aVar;
        super.onSuccess(dVar);
        if (dVar != null && (aVar = dVar.b) != null) {
            List<h> list = aVar.b;
            JSONObject jSONObject = dVar.f15778c;
            int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
            if (200 == optInt) {
                BidResponsedEx parseBidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.unitId);
                if (parseBidResponsedEx != null) {
                    a(parseBidResponsedEx);
                    return;
                } else {
                    a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                    return;
                }
            }
            a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }
}
