package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcmg implements zzdwl {
    private final zzcla zza;
    private Context zzb;
    private zzbmo zzc;

    public /* synthetic */ zzcmg(zzcla zzclaVar, zzcmf zzcmfVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwl
    public final /* synthetic */ zzdwl zza(zzbmo zzbmoVar) {
        zzbmoVar.getClass();
        this.zzc = zzbmoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwl
    public final /* synthetic */ zzdwl zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwl
    public final zzdwm zzc() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, zzbmo.class);
        return new zzcmi(this.zza, this.zzb, this.zzc, null);
    }
}
