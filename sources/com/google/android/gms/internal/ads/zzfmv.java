package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfmv {
    private boolean zza;

    public final void zza(Context context) {
        zzfor.zzc(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfnz.zzb().zzd(context);
            zzfnq.zza().zzd(context);
            zzfom.zzb(context);
            zzfon.zzd(context);
            zzfoq.zza(context);
            zzfnw.zzb().zzc(context);
            zzfnp.zza().zzd(context);
            zzfob.zza().zze(context);
        }
    }

    public final boolean zzb() {
        return this.zza;
    }
}
