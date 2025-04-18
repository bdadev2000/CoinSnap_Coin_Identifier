package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes3.dex */
public final class zzdwm extends zzftg {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwl zzf;
    private boolean zzg;

    public zzdwm(Context context) {
        super("ShakeDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziD)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            float f13 = f12 * f12;
            if (((float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10))) >= ((Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziE)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziF)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziG)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i10 = this.zze + 1;
                    this.zze = i10;
                    zzdwl zzdwlVar = this.zzf;
                    if (zzdwlVar != null) {
                        if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziH)).intValue()) {
                            zzdvk zzdvkVar = (zzdvk) zzdwlVar;
                            zzdvkVar.zzh(new zzdvh(zzdvkVar), zzdvj.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziD)).booleanValue()) {
                return;
            }
            if (this.zzb == null) {
                SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                this.zzb = sensorManager2;
                if (sensorManager2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.zzc = sensorManager2.getDefaultSensor(1);
            }
            if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.zzd = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziF)).intValue();
                this.zzg = true;
                com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
            }
        }
    }

    public final void zzd(zzdwl zzdwlVar) {
        this.zzf = zzdwlVar;
    }
}
