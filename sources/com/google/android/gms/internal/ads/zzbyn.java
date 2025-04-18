package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzbyn implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzbyn(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbym zzb() {
        return new zzbym((Clock) this.zza.zzb(), (zzbyk) this.zzb.zzb());
    }
}
