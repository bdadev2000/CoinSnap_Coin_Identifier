package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbxc;
import java.util.List;

/* loaded from: classes3.dex */
public interface zzci extends IInterface {
    @Nullable
    zzbaf zze(String str) throws RemoteException;

    @Nullable
    zzby zzf(String str) throws RemoteException;

    @Nullable
    zzbxc zzg(String str) throws RemoteException;

    void zzh(zzbpg zzbpgVar) throws RemoteException;

    void zzi(List list, zzcf zzcfVar) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    boolean zzk(String str) throws RemoteException;

    boolean zzl(String str) throws RemoteException;
}
