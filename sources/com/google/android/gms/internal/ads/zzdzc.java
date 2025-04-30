package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public final class zzdzc extends zzfvc {
    private final Context zzb;
    private SensorManager zzc;
    private Sensor zzd;
    private long zze;
    private int zzf;
    private zzdzb zzg;
    private boolean zzh;

    public zzdzc(Context context) {
        super("ShakeDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziY)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f9 = fArr[0] / 9.80665f;
            float f10 = fArr[1] / 9.80665f;
            float f11 = fArr[2] / 9.80665f;
            float f12 = f11 * f11;
            if (((float) Math.sqrt(f12 + (f10 * f10) + (f9 * f9))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziZ)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzja)).intValue() <= currentTimeMillis) {
                    if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjb)).intValue() < currentTimeMillis) {
                        this.zzf = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zze = currentTimeMillis;
                    int i9 = this.zzf + 1;
                    this.zzf = i9;
                    zzdzb zzdzbVar = this.zzg;
                    if (zzdzbVar != null) {
                        if (i9 == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjc)).intValue()) {
                            zzdya zzdyaVar = (zzdya) zzdzbVar;
                            zzdyaVar.zzh(new zzdxx(zzdyaVar), zzdxz.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    SensorManager sensorManager = this.zzc;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzd);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzh = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziY)).booleanValue()) {
                    return;
                }
                if (this.zzc == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zzb.getSystemService("sensor");
                    this.zzc = sensorManager2;
                    if (sensorManager2 == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzd = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzh && (sensorManager = this.zzc) != null && (sensor = this.zzd) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zze = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzja)).intValue();
                    this.zzh = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzdzb zzdzbVar) {
        this.zzg = zzdzbVar;
    }
}
