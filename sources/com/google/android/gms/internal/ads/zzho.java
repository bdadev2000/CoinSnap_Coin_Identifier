package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes3.dex */
final class zzho extends BroadcastReceiver implements Runnable {
    private final Handler zza;

    public zzho(zzhq zzhqVar, Handler handler, zzhp zzhpVar) {
        this.zza = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
