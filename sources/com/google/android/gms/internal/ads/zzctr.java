package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzctr implements zzhfx {
    private final zzhgp zza;

    public zzctr(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
    }

    public static zzded zza(zzcnn zzcnnVar, Executor executor) {
        return new zzded(zzcnnVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzcnn) this.zza.zzb(), zzfin.zzc());
    }
}
