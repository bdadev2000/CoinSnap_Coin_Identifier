package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes3.dex */
public final class zzduw extends zzftg {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzduv zzi;
    private boolean zzj;

    public zzduw(Context context) {
        super("FlickDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziI)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziK)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f10 = this.zzc;
            zzbce zzbceVar = zzbcn.zziJ;
            if (floatValue > ((Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).floatValue() + f10) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i10 = this.zzf + 1;
                this.zzf = i10;
                this.zzg = false;
                this.zzh = false;
                zzduv zzduvVar = this.zzi;
                if (zzduvVar != null) {
                    if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziL)).intValue()) {
                        zzdvk zzdvkVar = (zzdvk) zzduvVar;
                        zzdvkVar.zzh(new zzdvi(zzdvkVar), zzdvj.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziI)).booleanValue()) {
                return;
            }
            if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.zzj = true;
                com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
            }
            if (this.zza != null && this.zzb != null) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
        }
    }

    public final void zzd(zzduv zzduvVar) {
        this.zzi = zzduvVar;
    }
}
