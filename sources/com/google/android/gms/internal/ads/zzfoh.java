package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class zzfoh {
    private boolean zza;

    public final void zza(Context context) {
        zzfqb.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfpl.zzb().zzd(context);
        zzfpc.zza().zzd(context);
        zzfpw.zzb(context);
        zzfpx.zzd(context);
        zzfqa.zza(context);
        zzfpi.zzb().zzc(context);
        zzfpb.zza().zzd(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
