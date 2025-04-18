package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbr implements Runnable {
    final /* synthetic */ zzcbt zza;

    public zzcbr(zzcbt zzcbtVar) {
        this.zza = zzcbtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
