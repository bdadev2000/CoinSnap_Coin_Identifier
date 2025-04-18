package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcsd implements zzhii {
    private final zzhja zza;

    public zzcsd(zzhja zzhjaVar) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z2 = true;
        if (((zzcxr) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfr)).booleanValue()) {
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }
}
