package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfea implements zzfek {
    private final zzfek zza;

    @Nullable
    private zzcys zzb;

    public zzfea(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcys zzd() {
        return this.zzb;
    }

    public final synchronized f4.c zzb(zzfel zzfelVar, zzfej zzfejVar, @Nullable zzcys zzcysVar) {
        this.zzb = zzcysVar;
        if (zzfelVar.zza != null) {
            zzcvx zzb = zzcysVar.zzb();
            return zzb.zzi(zzb.zzk(zzgft.zzh(zzfelVar.zza)));
        }
        return ((zzfdz) this.zza).zzb(zzfelVar, zzfejVar, zzcysVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ f4.c zzc(zzfel zzfelVar, zzfej zzfejVar, @Nullable Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }
}
