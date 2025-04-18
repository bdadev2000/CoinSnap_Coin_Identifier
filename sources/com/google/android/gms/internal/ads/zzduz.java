package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzduz implements zzhfx {
    private final zzhgp zza;

    public zzduz(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
    }

    public static zzded zza(zzduy zzduyVar, Executor executor) {
        return new zzded(zzduyVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzduy) this.zza.zzb(), zzfin.zzc());
    }
}
