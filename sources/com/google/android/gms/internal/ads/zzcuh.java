package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcuh implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcuh(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzded((zzdav) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
