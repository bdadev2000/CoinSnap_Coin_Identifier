package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzdhv implements zzhii {
    private final zzdhc zza;
    private final zzhja zzb;

    public zzdhv(zzdhc zzdhcVar, zzhja zzhjaVar) {
        this.zza = zzdhcVar;
        this.zzb = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
