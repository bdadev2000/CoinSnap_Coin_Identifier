package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes3.dex */
final class zzdy extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzeb zza;

    public zzdy(zzeb zzebVar) {
        this.zza = zzebVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z10;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzeb zzebVar = this.zza;
        if (true == z10) {
            i10 = 10;
        }
        zzeb.zzc(zzebVar, i10);
    }
}
