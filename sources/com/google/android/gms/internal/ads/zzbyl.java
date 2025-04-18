package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzbyl implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzbyl(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbyk((Clock) this.zza.zzb(), (com.google.android.gms.ads.internal.util.zzg) this.zzb.zzb(), (zzbyv) this.zzc.zzb());
    }
}
