package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzecj implements zzcya, zzcwp {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzect zzd;

    public zzecj(zzect zzectVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzectVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue() && !this.zzc.zzN()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgd)).intValue();
            }
            if (i10 < intValue) {
                this.zzd.zzd(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzb(true);
    }
}
