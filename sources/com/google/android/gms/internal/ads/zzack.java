package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class zzack {
    private final zzacj zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzack(zzacj zzacjVar) {
        this.zza = zzacjVar;
    }

    @Nullable
    public final zzacr zza(Object... objArr) {
        Constructor zza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    zza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (zzacr) zza.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }
}
