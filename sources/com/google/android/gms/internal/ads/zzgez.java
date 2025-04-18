package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzgez extends zzgfa {
    final /* synthetic */ zzgfb zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgez(zzgfb zzgfbVar, Callable callable, Executor executor) {
        super(zzgfbVar, executor);
        this.zza = zzgfbVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
