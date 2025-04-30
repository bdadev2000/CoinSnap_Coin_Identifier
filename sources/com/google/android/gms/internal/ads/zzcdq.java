package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcdq implements Runnable {
    final /* synthetic */ zzcds zza;

    public zzcdq(zzcds zzcdsVar) {
        this.zza = zzcdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
