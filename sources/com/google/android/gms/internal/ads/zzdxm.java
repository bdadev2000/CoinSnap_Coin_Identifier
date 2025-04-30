package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public final class zzdxm extends zzfvc {
    private final SensorManager zzb;
    private final Sensor zzc;
    private float zzd;
    private Float zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private zzdxl zzj;
    private boolean zzk;

    public zzdxm(Context context) {
        super("FlickDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zzd = 0.0f;
        this.zze = Float.valueOf(0.0f);
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzj = null;
        this.zzk = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zzb = sensorManager;
        if (sensorManager != null) {
            this.zzc = sensorManager.getDefaultSensor(4);
        } else {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjd)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (this.zzf + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjf)).intValue() < currentTimeMillis) {
                this.zzg = 0;
                this.zzf = currentTimeMillis;
                this.zzh = false;
                this.zzi = false;
                this.zzd = this.zze.floatValue();
            }
            Float valueOf = Float.valueOf(this.zze.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zze = valueOf;
            float floatValue = valueOf.floatValue();
            float f9 = this.zzd;
            zzbeg zzbegVar = zzbep.zzje;
            if (floatValue > ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).floatValue() + f9) {
                this.zzd = this.zze.floatValue();
                this.zzi = true;
            } else if (this.zze.floatValue() < this.zzd - ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).floatValue()) {
                this.zzd = this.zze.floatValue();
                this.zzh = true;
            }
            if (this.zze.isInfinite()) {
                this.zze = Float.valueOf(0.0f);
                this.zzd = 0.0f;
            }
            if (this.zzh && this.zzi) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zzf = currentTimeMillis;
                int i9 = this.zzg + 1;
                this.zzg = i9;
                this.zzh = false;
                this.zzi = false;
                zzdxl zzdxlVar = this.zzj;
                if (zzdxlVar != null) {
                    if (i9 == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjg)).intValue()) {
                        zzdya zzdyaVar = (zzdya) zzdxlVar;
                        zzdyaVar.zzh(new zzdxy(zzdyaVar), zzdxz.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzk && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzk = false;
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
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
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjd)).booleanValue()) {
                    return;
                }
                if (!this.zzk && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzk = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zzb != null && this.zzc != null) {
                    return;
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzdxl zzdxlVar) {
        this.zzj = zzdxlVar;
    }
}
