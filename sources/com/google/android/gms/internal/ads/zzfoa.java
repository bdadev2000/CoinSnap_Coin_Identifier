package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfoa extends BroadcastReceiver {
    final /* synthetic */ zzfob zza;

    public zzfoa(zzfob zzfobVar) {
        this.zza = zzfobVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        boolean z11;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfob zzfobVar = this.zza;
            z11 = zzfobVar.zzd;
            zzfobVar.zzd(true, z11);
            this.zza.zzc = true;
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfob zzfobVar2 = this.zza;
            z10 = zzfobVar2.zzd;
            zzfobVar2.zzd(false, z10);
            this.zza.zzc = false;
        }
    }
}
