package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcjv implements zzfem {
    private final zzciy zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjv(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* synthetic */ zzfem zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* bridge */ /* synthetic */ zzfem zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final zzfen zzc() {
        zzhgf.zzc(this.zzb, Context.class);
        return new zzcjw(this.zza, this.zzb, this.zzc, null);
    }
}
