package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfdz implements zzfek {

    @Nullable
    private zzcys zza;

    @Override // com.google.android.gms.internal.ads.zzfek
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcys zzd() {
        return this.zza;
    }

    public final synchronized f4.c zzb(zzfel zzfelVar, zzfej zzfejVar, @Nullable zzcys zzcysVar) {
        zzcvx zzb;
        try {
            if (zzcysVar != null) {
                this.zza = zzcysVar;
            } else {
                this.zza = (zzcys) zzfejVar.zza(zzfelVar.zzb).zzh();
            }
            zzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ f4.c zzc(zzfel zzfelVar, zzfej zzfejVar, @Nullable Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }
}
