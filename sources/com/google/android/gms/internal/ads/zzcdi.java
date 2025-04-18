package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcdi implements Runnable {
    final /* synthetic */ zzcdj zza;

    public zzcdi(zzcdj zzcdjVar) {
        this.zza = zzcdjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzz().zzc(this.zza);
    }
}
