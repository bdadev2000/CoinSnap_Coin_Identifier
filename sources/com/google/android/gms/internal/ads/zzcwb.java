package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcwb implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzcwb(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfs((zzdck) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
