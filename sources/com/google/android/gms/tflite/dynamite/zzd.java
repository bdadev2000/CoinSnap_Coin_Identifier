package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzd extends com.google.android.gms.internal.tflite.zza implements zzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.ITfLiteLoggerCreator");
    }

    @Override // com.google.android.gms.tflite.dynamite.zzf
    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, customerInfo);
        Parcel zzb = zzb(3, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }
}
