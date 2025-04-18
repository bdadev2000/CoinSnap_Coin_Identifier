package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfcm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzfcm(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfck zzb() {
        zzbzt zzh;
        Context context = (Context) this.zza.zzb();
        zzfgy zzfgyVar = (zzfgy) this.zzb.zzb();
        zzfhq zzfhqVar = (zzfhq) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgh)).booleanValue()) {
            zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        } else {
            zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzh();
        }
        boolean z10 = false;
        if (zzh != null && zzh.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgx)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgg)).booleanValue() || z10) {
                zzfhp zza = zzfhqVar.zza(zzfhg.AppOpen, context, zzfgyVar, new zzfbo(new zzfbl()));
                zzfca zzfcaVar = new zzfca(new zzfbz());
                zzfhc zzfhcVar = zza.zza;
                zzges zzgesVar = zzcaj.zza;
                return new zzfbq(zzfcaVar, new zzfbw(zzfhcVar, zzgesVar), zza.zzb, zza.zza.zza().zzf, zzgesVar);
            }
        }
        return new zzfbz();
    }
}
