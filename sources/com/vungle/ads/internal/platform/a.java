package com.vungle.ads.internal.platform;

import G7.j;
import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(G7.f fVar) {
        this();
    }

    public final String getCarrierName$vungle_ads_release(Context context) {
        j.e(context, "context");
        Object systemService = context.getSystemService("phone");
        j.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getNetworkOperatorName();
    }

    private a() {
    }
}
