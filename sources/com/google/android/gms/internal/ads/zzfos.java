package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfos extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfou zzb;
    final /* synthetic */ zzchs zzc;

    public zzfos(zzfou zzfouVar, zzchs zzchsVar, Timer timer) {
        this.zzc = zzchsVar;
        this.zza = timer;
        this.zzb = zzfouVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzg();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}
