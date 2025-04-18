package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdli implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdli(zzdlb zzdlbVar, zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzded(((zzdon) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
