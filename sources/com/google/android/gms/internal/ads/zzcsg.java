package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzcsg implements zzayv {

    @Nullable
    private final zzcfo zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcsg(@Nullable zzcfo zzcfoVar, Executor executor) {
        this.zza = zzcfoVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final synchronized void zzdp(zzayu zzayuVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmh)).booleanValue()) {
                if (zzayuVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzcfo zzcfoVar = this.zza;
                        Objects.requireNonNull(zzcfoVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcse
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfo.this.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzayuVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzcfo zzcfoVar2 = this.zza;
                        Objects.requireNonNull(zzcfoVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsf
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfo.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
