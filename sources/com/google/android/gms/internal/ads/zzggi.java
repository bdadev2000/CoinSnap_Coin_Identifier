package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzggi extends zzgeh.zzi implements Runnable {
    private final Runnable zza;

    public zzggi(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String zza() {
        return AbstractC2914a.e("task=[", this.zza.toString(), "]");
    }
}
