package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class zzggd {
    private final String zza;
    private volatile Logger zzb;

    public zzggd(Class cls) {
        this.zza = cls.getName();
    }

    public final Logger zza() {
        Logger logger = this.zzb;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.zzb;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zza);
                this.zzb = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
