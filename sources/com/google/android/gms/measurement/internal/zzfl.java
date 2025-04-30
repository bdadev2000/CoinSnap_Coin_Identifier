package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzfl extends IInterface {
    zzaj zza(zzo zzoVar) throws RemoteException;

    List<zzmu> zza(zzo zzoVar, Bundle bundle) throws RemoteException;

    @Nullable
    List<zzno> zza(zzo zzoVar, boolean z8) throws RemoteException;

    List<zzae> zza(@Nullable String str, @Nullable String str2, zzo zzoVar) throws RemoteException;

    List<zzae> zza(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    List<zzno> zza(String str, @Nullable String str2, @Nullable String str3, boolean z8) throws RemoteException;

    List<zzno> zza(@Nullable String str, @Nullable String str2, boolean z8, zzo zzoVar) throws RemoteException;

    void zza(long j7, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    void zza(Bundle bundle, zzo zzoVar) throws RemoteException;

    void zza(zzae zzaeVar) throws RemoteException;

    void zza(zzae zzaeVar, zzo zzoVar) throws RemoteException;

    void zza(zzbd zzbdVar, zzo zzoVar) throws RemoteException;

    void zza(zzbd zzbdVar, String str, @Nullable String str2) throws RemoteException;

    void zza(zzno zznoVar, zzo zzoVar) throws RemoteException;

    @Nullable
    byte[] zza(zzbd zzbdVar, String str) throws RemoteException;

    @Nullable
    String zzb(zzo zzoVar) throws RemoteException;

    void zzc(zzo zzoVar) throws RemoteException;

    void zzd(zzo zzoVar) throws RemoteException;

    void zze(zzo zzoVar) throws RemoteException;

    void zzf(zzo zzoVar) throws RemoteException;

    void zzg(zzo zzoVar) throws RemoteException;

    void zzh(zzo zzoVar) throws RemoteException;
}
