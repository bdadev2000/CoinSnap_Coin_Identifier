package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzoy extends BroadcastReceiver {
    final /* synthetic */ zzoz zza;

    public /* synthetic */ zzoy(zzoz zzozVar, zzox zzoxVar) {
        this.zza = zzozVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzh zzhVar;
        zzpa zzpaVar;
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzoz zzozVar = this.zza;
        zzhVar = zzozVar.zzh;
        zzpaVar = zzozVar.zzg;
        zzozVar.zzj(zzos.zzd(context, intent, zzhVar, zzpaVar));
    }
}
