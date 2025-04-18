package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.internal.ads.zzgcy;

/* loaded from: classes3.dex */
final class zzgew extends zzgcy.zzi implements Runnable {
    private final Runnable zza;

    public zzgew(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzd(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        return e.f("task=[", this.zza.toString(), "]");
    }
}
