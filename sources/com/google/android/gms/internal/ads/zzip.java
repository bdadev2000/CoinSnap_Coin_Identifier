package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes2.dex */
final class zzip extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzir zza;
    private final zziq zzb;
    private final Handler zzc;

    public zzip(zzir zzirVar, Handler handler, zziq zziqVar) {
        this.zza = zzirVar;
        this.zzc = handler;
        this.zzb = zziqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
