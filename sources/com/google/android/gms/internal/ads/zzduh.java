package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzduh implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;

    public zzduh(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdug((zzdty) this.zza.zzb(), ((zzhiw) this.zzb).zzb(), (Clock) this.zzc.zzb());
    }
}
