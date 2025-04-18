package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzdwp implements zzczj, zzdex {
    private final Context zza;
    private final zzdsm zzb;

    public zzdwp(Context context, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdsmVar;
    }

    private final void zzd(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeF)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwo
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwp.this.zzc(context);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzv.zzf().zzb(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbd zzbdVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(@Nullable String str) {
    }
}
