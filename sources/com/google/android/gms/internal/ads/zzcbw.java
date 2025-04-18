package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbw implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbx zzb;

    public zzcbw(zzcbx zzcbxVar, boolean z2) {
        this.zza = z2;
        this.zzb = zzcbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
