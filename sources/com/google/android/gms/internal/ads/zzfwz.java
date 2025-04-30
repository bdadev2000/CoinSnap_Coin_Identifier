package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfwz extends zzfww {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfww zzb;
    final /* synthetic */ zzfxg zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwz(zzfxg zzfxgVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfww zzfwwVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzfwwVar;
        this.zzc = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfwv zzfwvVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            try {
                zzfxg.zzn(this.zzc, this.zza);
                atomicInteger = this.zzc.zzl;
                if (atomicInteger.getAndIncrement() > 0) {
                    zzfwvVar = this.zzc.zzc;
                    zzfwvVar.zzc("Already connected to the service.", new Object[0]);
                }
                zzfxg.zzp(this.zzc, this.zzb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
