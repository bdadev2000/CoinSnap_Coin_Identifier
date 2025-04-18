package com.google.android.gms.internal.measurement;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzgl {

    @Nullable
    private static zzgk zza;

    public static synchronized zzgk zza() {
        zzgk zzgkVar;
        synchronized (zzgl.class) {
            if (zza == null) {
                zza(new zzgn());
            }
            zzgkVar = zza;
        }
        return zzgkVar;
    }

    private static synchronized void zza(zzgk zzgkVar) {
        synchronized (zzgl.class) {
            if (zza == null) {
                zza = zzgkVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
