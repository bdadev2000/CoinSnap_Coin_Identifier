package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcmu implements zzfgm {
    private final zzcla zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcmu(zzcla zzclaVar, zzcmt zzcmtVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    public final /* synthetic */ zzfgm zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    public final /* synthetic */ zzfgm zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    public final zzfgn zzc() {
        zzhkx.zzc(this.zzb, Context.class);
        return new zzcmw(this.zza, this.zzb, this.zzc, null);
    }
}
