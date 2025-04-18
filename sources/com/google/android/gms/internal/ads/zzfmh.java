package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzfmh implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzfmh(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfmg((zzfmp) this.zza.zzb(), ((zzfme) this.zzb).zzb(), (Clock) this.zzc.zzb());
    }
}
