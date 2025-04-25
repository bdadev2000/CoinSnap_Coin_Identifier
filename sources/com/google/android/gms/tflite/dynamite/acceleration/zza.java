package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zza implements AccelerationServiceLogger {
    private final zzc zza;

    public zza(zzc zzcVar) {
        this.zza = zzcVar;
    }

    private final void zza(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            Log.w("AccelerationLogger", "Failed to log counter: ".concat(str), e);
        }
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logApplyValidatedConfig(int i, ApplyValidatedConfigStatus applyValidatedConfigStatus) {
        try {
            this.zza.zzd(i, applyValidatedConfigStatus);
        } catch (RemoteException e) {
            Log.w("AccelerationLogger", String.format("Failed to log apply validated config outcome: delegate (%d), status: (%s)", Integer.valueOf(i), applyValidatedConfigStatus), e);
        }
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logGenerateBestConfigCounter() {
        zza("AccelerationServiceGenerateBestConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logSelectBestConfigCounter() {
        zza("AccelerationServiceSelectBestConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logValidateConfigCounter() {
        zza("AccelerationServiceValidateConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logValidationResult(byte[] bArr, ValidationSettings validationSettings) {
        try {
            this.zza.zzf(bArr, validationSettings);
        } catch (RemoteException e) {
            Log.w("AccelerationLogger", "Failed to log validation result; validation settings: ".concat(String.valueOf(String.valueOf(validationSettings))), e);
        }
    }
}
