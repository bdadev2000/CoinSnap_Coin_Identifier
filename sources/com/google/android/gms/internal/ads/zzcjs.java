package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcjs implements zzfbh {
    private final zzcjk zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjs(zzcjk zzcjkVar, zzcjr zzcjrVar) {
        this.zza = zzcjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* bridge */ /* synthetic */ zzfbh zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* bridge */ /* synthetic */ zzfbh zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final zzfbi zzc() {
        zzhiq.zzc(this.zzb, Context.class);
        zzhiq.zzc(this.zzc, String.class);
        return new zzcju(this.zza, this.zzb, this.zzc, null);
    }
}
