package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzco extends IInterface {
    float zze() throws RemoteException;

    String zzf() throws RemoteException;

    List zzg() throws RemoteException;

    void zzh(@Nullable String str) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(boolean z8) throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzm(zzda zzdaVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzo(zzbrf zzbrfVar) throws RemoteException;

    void zzp(boolean z8) throws RemoteException;

    void zzq(float f9) throws RemoteException;

    void zzr(String str) throws RemoteException;

    void zzs(zzbnu zzbnuVar) throws RemoteException;

    void zzt(String str) throws RemoteException;

    void zzu(zzff zzffVar) throws RemoteException;

    boolean zzv() throws RemoteException;
}
