package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzcvk implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;

    public zzcvk(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
        this.zzd = zzhjaVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvj((Clock) this.zza.zzb(), (zzcvl) this.zzb.zzb(), ((zzcxr) this.zzc).zza(), (String) this.zzd.zzb());
    }
}
