package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzfjz implements zzhii {
    public static zzfjz zza() {
        zzfjz zzfjzVar;
        zzfjzVar = zzfjy.zza;
        return zzfjzVar;
    }

    public static zzgfz zzc() {
        zzgfz zzgfzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfA)).booleanValue()) {
            zzgfzVar = zzcan.zzc;
        } else {
            zzgfzVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfz)).booleanValue() ? zzcan.zza : zzcan.zze;
        }
        zzhiq.zzb(zzgfzVar);
        return zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
