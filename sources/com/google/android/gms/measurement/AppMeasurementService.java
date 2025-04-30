package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzmi;
import q0.AbstractC2638a;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements zzmi {
    private zzme<AppMeasurementService> zza;

    private final zzme<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzme<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NonNull Intent intent) {
        return zza().zza(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(@NonNull Intent intent) {
        zza().zzb(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(@NonNull Intent intent, int i9, int i10) {
        return zza().zza(intent, i9, i10);
    }

    @Override // android.app.Service
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void zza(@NonNull Intent intent) {
        AbstractC2638a.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final void zza(@NonNull JobParameters jobParameters, boolean z8) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzmi
    public final boolean zza(int i9) {
        return stopSelfResult(i9);
    }
}
