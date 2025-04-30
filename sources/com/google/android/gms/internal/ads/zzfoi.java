package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfoi {
    private boolean zza;

    public final void zza(Context context) {
        zzfqd.zzc(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfpm.zzb().zzd(context);
            zzfpd.zza().zzd(context);
            zzfpx.zzb(context);
            zzfpy.zzd(context);
            zzfqb.zza(context);
            zzfpj.zzb().zzc(context);
            zzfpc.zza().zzd(context);
        }
    }

    public final boolean zzb() {
        return this.zza;
    }
}
