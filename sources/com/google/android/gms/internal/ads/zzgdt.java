package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzgdt extends zzgdu {
    final /* synthetic */ zzgdv zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdt(zzgdv zzgdvVar, Callable callable, Executor executor) {
        super(zzgdvVar, executor);
        this.zza = zzgdvVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
