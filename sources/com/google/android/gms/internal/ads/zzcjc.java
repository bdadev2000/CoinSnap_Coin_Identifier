package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcjc implements zzezt {
    private final zzciy zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjc(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final /* bridge */ /* synthetic */ zzezt zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final /* bridge */ /* synthetic */ zzezt zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final zzezu zzc() {
        zzhgf.zzc(this.zzb, Context.class);
        zzhgf.zzc(this.zzc, String.class);
        return new zzcjd(this.zza, this.zzb, this.zzc, null);
    }
}
