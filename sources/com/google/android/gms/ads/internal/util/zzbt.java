package com.google.android.gms.ads.internal.util;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzbt extends IInterface {
    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException;
}
