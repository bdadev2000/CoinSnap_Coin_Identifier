package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class zzs extends BroadcastReceiver {
    final /* synthetic */ zzt zza;

    public /* synthetic */ zzs(zzt zztVar, zzr zzrVar) {
        this.zza = zztVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzt.zze(this.zza, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzt.zze(this.zza, false);
        }
    }
}
