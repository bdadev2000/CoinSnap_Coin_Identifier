package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfow implements Runnable {
    final /* synthetic */ zzfpb zza;

    public zzfow(zzfpb zzfpbVar) {
        this.zza = zzfpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfov zzfovVar;
        zzfovVar = this.zza.zzl;
        zzfovVar.zzb();
    }
}
