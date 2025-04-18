package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbu implements Runnable {
    final /* synthetic */ zzcbx zza;

    public zzcbu(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
