package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class zzger {
    private final zzfxn zza = new zzfxn();
    private final String zzb;
    private volatile Logger zzc;

    public zzger(Class cls) {
        this.zzb = cls.getName();
    }

    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
