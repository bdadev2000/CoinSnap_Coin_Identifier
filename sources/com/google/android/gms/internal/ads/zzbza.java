package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzbza extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException;

    zzbyx zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar) throws RemoteException;

    void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzh zzbzhVar) throws RemoteException;

    void zzh(boolean z8) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException;

    void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException;

    void zzk(zzbzd zzbzdVar) throws RemoteException;

    void zzl(zzbzo zzbzoVar) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z8) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbzi zzbziVar) throws RemoteException;
}
