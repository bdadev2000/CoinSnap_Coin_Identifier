package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdmz implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzdmz(zzdms zzdmsVar, zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfs(((zzdqe) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
