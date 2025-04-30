package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcli implements zzfbt {
    private final zzcla zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcli(zzcla zzclaVar, zzclh zzclhVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbt
    public final /* synthetic */ zzfbt zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbt
    public final /* synthetic */ zzfbt zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbt
    public final zzfbu zzc() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, String.class);
        return new zzclk(this.zza, this.zzb, this.zzc, null);
    }
}
