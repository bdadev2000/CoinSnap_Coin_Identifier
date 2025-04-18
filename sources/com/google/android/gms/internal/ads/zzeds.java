package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeds implements zzczo, zzcyd {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzeec zzd;

    public zzeds(zzeec zzeecVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeecVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z2) {
        int i2;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfX)).booleanValue() && !this.zzc.zzS()) {
            Object obj = zza;
            synchronized (obj) {
                i2 = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfY)).intValue();
            }
            if (i2 < intValue) {
                this.zzd.zzd(z2);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
        zzb(true);
    }
}
