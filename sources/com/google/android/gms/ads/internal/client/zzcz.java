package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbpl;
import java.util.List;

/* loaded from: classes.dex */
public interface zzcz extends IInterface {
    float zze() throws RemoteException;

    String zzf() throws RemoteException;

    List zzg() throws RemoteException;

    void zzh(@Nullable String str) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(boolean z2) throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzm(zzdl zzdlVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzo(zzbpl zzbplVar) throws RemoteException;

    void zzp(boolean z2) throws RemoteException;

    void zzq(float f2) throws RemoteException;

    void zzr(String str) throws RemoteException;

    void zzs(zzbmb zzbmbVar) throws RemoteException;

    void zzt(String str) throws RemoteException;

    void zzu(zzfw zzfwVar) throws RemoteException;

    boolean zzv() throws RemoteException;
}
