package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfnf extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfnh zzb;
    final /* synthetic */ zzcfz zzc;

    public zzfnf(zzfnh zzfnhVar, zzcfz zzcfzVar, Timer timer) {
        this.zzc = zzcfzVar;
        this.zza = timer;
        this.zzb = zzfnhVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzg();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}
