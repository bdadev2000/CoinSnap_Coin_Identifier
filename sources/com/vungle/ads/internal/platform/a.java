package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getCarrierName$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getNetworkOperatorName();
    }
}
