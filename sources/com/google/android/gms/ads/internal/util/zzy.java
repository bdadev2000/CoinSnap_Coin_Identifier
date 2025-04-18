package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbcn;

@TargetApi(30)
/* loaded from: classes3.dex */
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzm(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzik)).booleanValue()) {
            return 0;
        }
        return super.zzm(context);
    }
}
