package com.google.android.gms.tflite.dynamite;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public interface zzc extends IInterface {
    long zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;

    IObjectWrapper zze(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;

    IObjectWrapper zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.tflite.dynamite.internal.zzc zzcVar) throws RemoteException;
}
