package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcjt implements zzfcy {
    private final zzciy zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzs zzd;

    public /* synthetic */ zzcjt(zzciy zzciyVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final /* bridge */ /* synthetic */ zzfcy zza(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzsVar.getClass();
        this.zzd = zzsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final /* bridge */ /* synthetic */ zzfcy zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final /* bridge */ /* synthetic */ zzfcy zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcy
    public final zzfcz zzd() {
        zzhgf.zzc(this.zzb, Context.class);
        zzhgf.zzc(this.zzc, String.class);
        zzhgf.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzs.class);
        return new zzcju(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
