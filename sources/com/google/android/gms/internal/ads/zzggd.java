package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgec;

/* loaded from: classes2.dex */
final class zzggd extends zzgec.zzi implements Runnable {
    private final Runnable zza;

    public zzggd(Runnable runnable) {
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

    @Override // com.google.android.gms.internal.ads.zzgec
    public final String zza() {
        return androidx.compose.foundation.text.input.a.A("task=[", this.zza.toString(), "]");
    }
}
