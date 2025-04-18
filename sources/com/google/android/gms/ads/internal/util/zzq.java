package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
final class zzq extends BroadcastReceiver {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzr zzrVar) {
        this.zza = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzs.zze(this.zza, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzs.zze(this.zza, false);
        }
    }
}
