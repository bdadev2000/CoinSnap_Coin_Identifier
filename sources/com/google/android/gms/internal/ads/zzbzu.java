package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final class zzbzu {
    public final ListenableFuture zza(Context context, int i2) {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu(context)) {
            zzcan.zza.execute(new zzbzt(this, context, zzcasVar));
        }
        return zzcasVar;
    }
}
