package com.google.android.gms.internal.measurement;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzgl {

    @Nullable
    @GuardedBy
    private static zzgk zza;

    public static synchronized zzgk zza() {
        zzgk zzgkVar;
        synchronized (zzgl.class) {
            try {
                if (zza == null) {
                    zza(new zzgn());
                }
                zzgkVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgkVar;
    }

    private static synchronized void zza(zzgk zzgkVar) {
        synchronized (zzgl.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzgkVar;
        }
    }
}
