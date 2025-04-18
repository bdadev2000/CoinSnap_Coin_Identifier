package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgfg extends zzgeq {
    final /* synthetic */ zzgfh zza;
    private final Callable zzb;

    public zzgfg(zzgfh zzgfhVar, Callable callable) {
        this.zza = zzgfhVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
