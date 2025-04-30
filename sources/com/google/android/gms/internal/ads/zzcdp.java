package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcdp implements Runnable {
    final /* synthetic */ zzcds zza;

    public zzcdp(zzcds zzcdsVar) {
        this.zza = zzcdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
