package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbxf;
import java.util.List;

/* loaded from: classes.dex */
public interface zzci extends IInterface {
    @Nullable
    zzbao zze(String str) throws RemoteException;

    @Nullable
    zzby zzf(String str) throws RemoteException;

    @Nullable
    zzbxf zzg(String str) throws RemoteException;

    void zzh(zzbpl zzbplVar) throws RemoteException;

    void zzi(List list, zzcf zzcfVar) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    boolean zzk(String str) throws RemoteException;

    boolean zzl(String str) throws RemoteException;
}
