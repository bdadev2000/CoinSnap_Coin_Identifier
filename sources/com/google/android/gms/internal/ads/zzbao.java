package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes4.dex */
public interface zzbao extends IInterface {
    com.google.android.gms.ads.internal.client.zzby zze() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdy zzf() throws RemoteException;

    void zzg(boolean z2) throws RemoteException;

    void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzbav zzbavVar) throws RemoteException;
}
