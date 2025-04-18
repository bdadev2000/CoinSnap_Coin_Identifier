package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzblp implements zzgev {
    final /* synthetic */ zzblh zza;

    public zzblp(zzblt zzbltVar, zzblh zzblhVar) {
        this.zza = zzblhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcas zzcasVar = new zzcas();
        ((zzbln) obj).zze(this.zza, new zzblo(this, zzcasVar));
        return zzcasVar;
    }
}
