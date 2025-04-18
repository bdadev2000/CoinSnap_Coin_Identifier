package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbpg;
import java.util.List;

/* loaded from: classes3.dex */
public interface zzcz extends IInterface {
    float zze() throws RemoteException;

    String zzf() throws RemoteException;

    List zzg() throws RemoteException;

    void zzh(@Nullable String str) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(boolean z10) throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzm(zzdl zzdlVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzo(zzbpg zzbpgVar) throws RemoteException;

    void zzp(boolean z10) throws RemoteException;

    void zzq(float f10) throws RemoteException;

    void zzr(String str) throws RemoteException;

    void zzs(zzblw zzblwVar) throws RemoteException;

    void zzt(String str) throws RemoteException;

    void zzu(zzfv zzfvVar) throws RemoteException;

    boolean zzv() throws RemoteException;
}
