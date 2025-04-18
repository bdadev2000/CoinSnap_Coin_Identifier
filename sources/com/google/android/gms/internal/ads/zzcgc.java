package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzcgc implements Runnable {
    public final /* synthetic */ zzcfo zza;

    public /* synthetic */ zzcgc(zzcfo zzcfoVar) {
        this.zza = zzcfoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}
