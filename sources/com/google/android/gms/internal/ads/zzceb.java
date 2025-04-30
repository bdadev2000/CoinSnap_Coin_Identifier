package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes2.dex */
final class zzceb extends zzfvc {
    private final SensorManager zzb;
    private final Object zzc;
    private final Display zzd;
    private final float[] zze;
    private final float[] zzf;
    private float[] zzg;
    private Handler zzh;
    private zzcea zzi;

    public zzceb(Context context) {
        super("OrientationMonitor", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zzb = (SensorManager) context.getSystemService("sensor");
        this.zzd = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzc = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zza(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.zzc) {
                try {
                    if (this.zzg == null) {
                        this.zzg = new float[9];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zze, fArr);
            int rotation = this.zzd.getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        System.arraycopy(this.zze, 0, this.zzf, 0, 9);
                    } else {
                        SensorManager.remapCoordinateSystem(this.zze, 130, 1, this.zzf);
                    }
                } else {
                    SensorManager.remapCoordinateSystem(this.zze, 129, 130, this.zzf);
                }
            } else {
                SensorManager.remapCoordinateSystem(this.zze, 2, 129, this.zzf);
            }
            float[] fArr2 = this.zzf;
            float f9 = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f9;
            float f10 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f10;
            float f11 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f11;
            synchronized (this.zzc) {
                System.arraycopy(this.zzf, 0, this.zzg, 0, 9);
            }
            zzcea zzceaVar = this.zzi;
            if (zzceaVar != null) {
                zzceaVar.zza();
            }
        }
    }

    public final void zzb(zzcea zzceaVar) {
        this.zzi = zzceaVar;
    }

    public final void zzc() {
        if (this.zzh == null) {
            Sensor defaultSensor = this.zzb.getDefaultSensor(11);
            if (defaultSensor == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzfuv zzfuvVar = new zzfuv(handlerThread.getLooper());
            this.zzh = zzfuvVar;
            if (!this.zzb.registerListener(this, defaultSensor, 0, zzfuvVar)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("SensorManager.registerListener failed.");
                zzd();
            }
        }
    }

    public final void zzd() {
        if (this.zzh == null) {
            return;
        }
        this.zzb.unregisterListener(this);
        this.zzh.post(new zzcdz(this));
        this.zzh = null;
    }

    public final boolean zze(float[] fArr) {
        synchronized (this.zzc) {
            try {
                float[] fArr2 = this.zzg;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
