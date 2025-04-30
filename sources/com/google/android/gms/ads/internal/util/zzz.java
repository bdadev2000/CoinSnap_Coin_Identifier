package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbep;
import com.vungle.ads.internal.protos.n;

@TargetApi(n.AD_PLAY_RESET_ON_DEINIT_VALUE)
/* loaded from: classes2.dex */
public final class zzz extends zzy {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzm(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziF)).booleanValue()) {
            return 0;
        }
        return super.zzm(context);
    }
}
