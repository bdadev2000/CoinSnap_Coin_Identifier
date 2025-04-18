package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzhj;
import j1.a;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends a implements zzhj.zza {
    private zzhj zza;

    @NonNull
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj.zza
    public final void doStartService(@NonNull Context context, @NonNull Intent intent) {
        a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzhj(this);
        }
        this.zza.zza(context, intent);
    }
}
