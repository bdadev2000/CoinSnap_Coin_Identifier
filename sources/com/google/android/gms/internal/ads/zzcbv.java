package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbv implements Runnable {
    final /* synthetic */ zzcbx zza;

    public zzcbv(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
