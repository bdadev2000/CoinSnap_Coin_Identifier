package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzd extends com.google.android.gms.internal.tflite.zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLoggerCreator");
    }

    public final zzc zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        zzc zzcVar;
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, customerInfo);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLogger");
            zzcVar = queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zzc(readStrongBinder);
        }
        zzb.recycle();
        return zzcVar;
    }
}
