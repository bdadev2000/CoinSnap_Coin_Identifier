package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfqj implements Runnable {
    final /* synthetic */ zzfqo zza;

    public zzfqj(zzfqo zzfqoVar) {
        this.zza = zzfqoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfqi zzfqiVar;
        zzfqiVar = this.zza.zzl;
        zzfqiVar.zzb();
    }
}
