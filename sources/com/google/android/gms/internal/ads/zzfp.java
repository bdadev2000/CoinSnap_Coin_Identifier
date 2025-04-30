package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes2.dex */
final class zzfp extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzfs zza;

    public zzfp(zzfs zzfsVar) {
        this.zza = zzfsVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z8;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i9 = 5;
        if (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfs zzfsVar = this.zza;
        if (true == z8) {
            i9 = 10;
        }
        zzfs.zzc(zzfsVar, i9);
    }
}
