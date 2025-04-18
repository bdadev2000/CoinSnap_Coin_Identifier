package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes3.dex */
public interface zzbzh extends IInterface {
    IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbzl zzbzlVar, zzbze zzbzeVar) throws RemoteException;

    void zzg(zzbue zzbueVar) throws RemoteException;

    void zzh(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException;

    void zzi(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException;

    void zzm(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) throws RemoteException;
}
