package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcle implements zzfga {
    private final zzcjk zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcle(zzcjk zzcjkVar, zzcld zzcldVar) {
        this.zza = zzcjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfga
    public final /* synthetic */ zzfga zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfga
    public final /* bridge */ /* synthetic */ zzfga zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfga
    public final zzfgb zzc() {
        zzhiq.zzc(this.zzb, Context.class);
        return new zzclg(this.zza, this.zzb, this.zzc, null);
    }
}
