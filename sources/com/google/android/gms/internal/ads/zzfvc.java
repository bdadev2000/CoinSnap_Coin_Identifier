package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes2.dex */
public abstract class zzfvc implements SensorEventListener {
    final zzfuw zza;

    public zzfvc(String str, String str2) {
        zzfvb.zza();
        zzfqz zzfqzVar = zzfqz.UNKNOWN;
        zzfuy.zza();
        this.zza = zzfuy.zza;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}
