package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzesi implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzesi(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzerx(((zzext) this.zza).zzb(), ((Long) zzbeg.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
