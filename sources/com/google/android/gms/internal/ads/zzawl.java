package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzawl extends BroadcastReceiver {
    final /* synthetic */ zzawm zza;

    public zzawl(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
