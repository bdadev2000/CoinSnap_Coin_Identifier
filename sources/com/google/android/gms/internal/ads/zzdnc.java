package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzdnc implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzdnc(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdnb((com.google.android.gms.ads.internal.util.zzbo) this.zza.zzb(), (Clock) this.zzb.zzb(), zzfkb.zzc());
    }
}
