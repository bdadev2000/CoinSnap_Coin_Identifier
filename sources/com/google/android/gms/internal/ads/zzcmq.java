package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcmq implements zzfey {
    private final zzcla zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzcmq(zzcla zzclaVar, zzcmp zzcmpVar) {
        this.zza = zzclaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final /* synthetic */ zzfey zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final /* synthetic */ zzfey zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final /* synthetic */ zzfey zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfey
    public final zzfez zzd() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, String.class);
        zzhkx.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcms(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
