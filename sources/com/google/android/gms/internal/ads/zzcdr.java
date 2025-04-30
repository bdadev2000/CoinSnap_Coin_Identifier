package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcdr implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcds zzb;

    public zzcdr(zzcds zzcdsVar, boolean z8) {
        this.zza = z8;
        this.zzb = zzcdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
