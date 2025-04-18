package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbs implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbt zzb;

    public zzcbs(zzcbt zzcbtVar, boolean z10) {
        this.zza = z10;
        this.zzb = zzcbtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
