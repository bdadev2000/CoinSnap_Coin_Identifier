package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfqg implements Runnable {
    final /* synthetic */ zzfql zza;

    public zzfqg(zzfql zzfqlVar) {
        this.zza = zzfqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfqf zzfqfVar;
        zzfqfVar = this.zza.zzl;
        zzfqfVar.zzb();
    }
}
