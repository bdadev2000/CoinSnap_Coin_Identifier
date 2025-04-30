package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzctr implements zzban {

    @Nullable
    private final zzchd zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzctr(@Nullable zzchd zzchdVar, Executor executor) {
        this.zza = zzchdVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final synchronized void zzdp(zzbam zzbamVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmA)).booleanValue()) {
                if (zzbamVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzchd zzchdVar = this.zza;
                        Objects.requireNonNull(zzchdVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctp
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzchd.this.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzbamVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzchd zzchdVar2 = this.zza;
                        Objects.requireNonNull(zzchdVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzchd.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
