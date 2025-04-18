package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcat implements zzgee {
    final /* synthetic */ zzcav zza;

    public zzcat(zzcav zzcavVar) {
        this.zza = zzcavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(@Nullable Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(1);
    }
}
