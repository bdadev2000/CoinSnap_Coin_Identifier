package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzcqs implements zzaym {

    @Nullable
    private final zzcfk zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqs(@Nullable zzcfk zzcfkVar, Executor executor) {
        this.zza = zzcfkVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final synchronized void zzdp(zzayl zzaylVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmm)).booleanValue()) {
                if (zzaylVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzcfk zzcfkVar = this.zza;
                        Objects.requireNonNull(zzcfkVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfk.this.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzaylVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzcfk zzcfkVar2 = this.zza;
                        Objects.requireNonNull(zzcfkVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqr
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfk.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
