package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbq implements Runnable {
    final /* synthetic */ zzcbt zza;

    public zzcbq(zzcbt zzcbtVar) {
        this.zza = zzcbtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
