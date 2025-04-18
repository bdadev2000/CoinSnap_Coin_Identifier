package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfil implements zzhfx {
    public static zzfil zza() {
        zzfil zzfilVar;
        zzfilVar = zzfik.zza;
        return zzfilVar;
    }

    public static zzges zzc() {
        zzges zzgesVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfG)).booleanValue()) {
            zzgesVar = zzcaj.zzc;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfF)).booleanValue()) {
                zzgesVar = zzcaj.zza;
            } else {
                zzgesVar = zzcaj.zze;
            }
        }
        zzhgf.zzb(zzgesVar);
        return zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
