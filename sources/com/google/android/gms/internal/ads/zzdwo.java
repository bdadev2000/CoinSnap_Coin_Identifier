package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdwo implements zzdwc {
    private final long zza;
    private final zzepk zzb;

    public zzdwo(long j7, Context context, zzdwh zzdwhVar, zzcjd zzcjdVar, String str) {
        this.zza = j7;
        zzfey zzv = zzcjdVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzv.zzb(str);
        zzepk zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdwn(this, zzdwhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzab(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
