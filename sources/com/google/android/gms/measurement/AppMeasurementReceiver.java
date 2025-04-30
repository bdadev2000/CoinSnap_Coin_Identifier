package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzgr;
import q0.AbstractC2638a;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends AbstractC2638a implements zzgr.zza {
    private zzgr zza;

    @NonNull
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzgr.zza
    public final void doStartService(@NonNull Context context, @NonNull Intent intent) {
        AbstractC2638a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzgr(this);
        }
        this.zza.zza(context, intent);
    }
}
