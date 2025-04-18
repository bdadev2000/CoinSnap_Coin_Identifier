package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zznc;
import j1.a;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zznc {
    private zzmy<AppMeasurementService> zza;

    private final zzmy<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzmy<>(this);
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
    public final int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        return zza().zza(intent, i10, i11);
    }

    @Override // android.app.Service
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(@NonNull Intent intent) {
        a.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(@NonNull JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
