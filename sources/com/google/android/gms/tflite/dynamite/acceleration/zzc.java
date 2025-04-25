package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzc extends com.google.android.gms.internal.tflite.zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLogger");
    }

    public final void zzd(int i, ApplyValidatedConfigStatus applyValidatedConfigStatus) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        com.google.android.gms.internal.tflite.zzc.zza(zza, applyValidatedConfigStatus);
        zzc(3, zza);
    }

    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(1, zza);
    }

    public final void zzf(byte[] bArr, ValidationSettings validationSettings) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        com.google.android.gms.internal.tflite.zzc.zza(zza, validationSettings);
        zzc(2, zza);
    }
}
