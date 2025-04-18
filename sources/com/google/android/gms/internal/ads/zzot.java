package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzot extends BroadcastReceiver {
    final /* synthetic */ zzov zza;

    public /* synthetic */ zzot(zzov zzovVar, zzou zzouVar) {
        this.zza = zzovVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzg zzgVar;
        zzow zzowVar;
        if (!isInitialStickyBroadcast()) {
            zzov zzovVar = this.zza;
            zzgVar = zzovVar.zzh;
            zzowVar = zzovVar.zzg;
            zzovVar.zzj(zzop.zzd(context, intent, zzgVar, zzowVar));
        }
    }
}
