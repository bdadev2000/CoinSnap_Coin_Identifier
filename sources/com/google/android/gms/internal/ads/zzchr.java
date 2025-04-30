package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzchr implements Runnable {
    public final /* synthetic */ zzchd zza;

    public /* synthetic */ zzchr(zzchd zzchdVar) {
        this.zza = zzchdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
