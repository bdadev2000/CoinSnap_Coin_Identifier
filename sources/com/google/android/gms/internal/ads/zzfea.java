package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class zzfea implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;

    public zzfea(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdy zzb() {
        Context context = (Context) this.zza.zzb();
        zzfim zzfimVar = (zzfim) this.zzb.zzb();
        zzfje zzfjeVar = (zzfje) this.zzc.zzb();
        zzbzx zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgc)).booleanValue() ? com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh() : com.google.android.gms.ads.internal.zzu.zzo().zzi().zzi();
        boolean z2 = false;
        if (zzh != null && zzh.zzh()) {
            z2 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgs)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgb)).booleanValue() || z2) {
                zzfjd zza = zzfjeVar.zza(zzfiu.AppOpen, context, zzfimVar, new zzfdc(new zzfcz()));
                zzfdo zzfdoVar = new zzfdo(new zzfdn());
                zzfiq zzfiqVar = zza.zza;
                zzgfz zzgfzVar = zzcan.zza;
                return new zzfde(zzfdoVar, new zzfdk(zzfiqVar, zzgfzVar), zza.zzb, zza.zza.zza().zzf, zzgfzVar);
            }
        }
        return new zzfdn();
    }
}
