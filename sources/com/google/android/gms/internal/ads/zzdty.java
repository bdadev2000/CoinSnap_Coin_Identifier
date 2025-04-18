package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzdty implements zzdtm {
    private final long zza;
    private final zzena zzb;

    public zzdty(long j3, Context context, zzdtr zzdtrVar, zzchk zzchkVar, String str) {
        this.zza = j3;
        zzfcy zzv = zzchkVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzs());
        zzv.zzb(str);
        zzena zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdtx(this, zzdtrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
