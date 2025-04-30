package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcto implements zzhkp {
    private final zzhlg zza;

    public zzcto(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z8 = true;
        if (((zzczc) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfG)).booleanValue()) {
                z8 = false;
            }
        }
        return Boolean.valueOf(z8);
    }
}
