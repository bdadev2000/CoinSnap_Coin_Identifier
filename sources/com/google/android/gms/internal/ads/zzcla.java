package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcla implements zzfem {
    private final zzcjk zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzs zzd;

    public /* synthetic */ zzcla(zzcjk zzcjkVar, zzckz zzckzVar) {
        this.zza = zzcjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* bridge */ /* synthetic */ zzfem zza(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzsVar.getClass();
        this.zzd = zzsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* bridge */ /* synthetic */ zzfem zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final /* bridge */ /* synthetic */ zzfem zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final zzfen zzd() {
        zzhiq.zzc(this.zzb, Context.class);
        zzhiq.zzc(this.zzc, String.class);
        zzhiq.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzs.class);
        return new zzclc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
