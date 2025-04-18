package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes3.dex */
public abstract class zzftg implements SensorEventListener {
    public zzftg(String str, String str2) {
        zzftf.zza();
        zzfte.zza();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}
