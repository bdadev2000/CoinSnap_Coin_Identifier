package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfem implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzfem(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfek zzb() {
        zzcbs zzi;
        Context context = (Context) this.zza.zzb();
        zzfiy zzfiyVar = (zzfiy) this.zzb.zzb();
        zzfjq zzfjqVar = (zzfjq) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgA)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzi();
        }
        boolean z8 = false;
        if (zzi != null && zzi.zzh()) {
            z8 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgQ)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgz)).booleanValue() || z8) {
                zzfjp zza = zzfjqVar.zza(zzfjg.AppOpen, context, zzfiyVar, new zzfdo(new zzfdl()));
                zzfea zzfeaVar = new zzfea(new zzfdz());
                zzfjc zzfjcVar = zza.zza;
                zzgge zzggeVar = zzcci.zza;
                return new zzfdq(zzfeaVar, new zzfdw(zzfjcVar, zzggeVar), zza.zzb, zza.zza.zza().zzf, zzggeVar);
            }
        }
        return new zzfdz();
    }
}
