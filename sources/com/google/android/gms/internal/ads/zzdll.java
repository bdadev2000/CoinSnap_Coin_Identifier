package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzdll implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdll(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlk((com.google.android.gms.ads.internal.util.zzbn) this.zza.zzb(), (Clock) this.zzb.zzb(), zzfin.zzc());
    }
}
