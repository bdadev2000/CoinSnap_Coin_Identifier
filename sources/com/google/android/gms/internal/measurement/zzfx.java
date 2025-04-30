package com.google.android.gms.internal.measurement;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfx {

    @Nullable
    private static zzga zza;

    public static synchronized zzga zza() {
        zzga zzgaVar;
        synchronized (zzfx.class) {
            try {
                if (zza == null) {
                    zza(new zzfz());
                }
                zzgaVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgaVar;
    }

    private static synchronized void zza(zzga zzgaVar) {
        synchronized (zzfx.class) {
            if (zza == null) {
                zza = zzgaVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
