package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class zzadm {
    private final zzadl zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzadm(zzadl zzadlVar) {
        this.zza = zzadlVar;
    }

    @Nullable
    public final zzadu zza(Object... objArr) {
        Constructor zza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    zza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating extension", e4);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (zzadu) zza.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }
}
