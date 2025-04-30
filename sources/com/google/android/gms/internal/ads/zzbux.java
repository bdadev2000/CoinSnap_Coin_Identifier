package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbux extends zzbad implements zzbuz {
    public zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzd(zza, intent);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzh() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzaVar);
        zzdc(6, zza);
    }
}
