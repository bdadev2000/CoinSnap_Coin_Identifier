package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpv extends BroadcastReceiver {
    final /* synthetic */ zzpw zza;

    public /* synthetic */ zzpv(zzpw zzpwVar, zzpu zzpuVar) {
        this.zza = zzpwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzk zzkVar;
        zzpx zzpxVar;
        if (!isInitialStickyBroadcast()) {
            zzpw zzpwVar = this.zza;
            zzkVar = zzpwVar.zzh;
            zzpxVar = zzpwVar.zzg;
            zzpwVar.zzj(zzpp.zzd(context, intent, zzkVar, zzpxVar));
        }
    }
}
