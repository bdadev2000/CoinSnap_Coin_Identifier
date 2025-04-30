package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzbhz extends IInterface {
    IObjectWrapper zzb(String str) throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdv(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdw(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdx(@Nullable zzbhs zzbhsVar) throws RemoteException;

    void zzdy(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdz(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i9) throws RemoteException;
}
