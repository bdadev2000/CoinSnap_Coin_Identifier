package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzeet implements zzdaz, zzczo {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzefd zzd;

    public zzeet(zzefd zzefdVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzefdVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z8) {
        int i9;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue() && !this.zzc.zzS()) {
            Object obj = zza;
            synchronized (obj) {
                i9 = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgt)).intValue();
            }
            if (i9 < intValue) {
                this.zzd.zzd(z8);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzb(true);
    }
}
