package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public interface zzbxc extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException;

    zzbwz zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxj zzbxjVar) throws RemoteException;

    void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxj zzbxjVar) throws RemoteException;

    void zzh(boolean z10) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws RemoteException;

    void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException;

    void zzk(zzbxf zzbxfVar) throws RemoteException;

    void zzl(zzbxq zzbxqVar) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbxk zzbxkVar) throws RemoteException;
}
