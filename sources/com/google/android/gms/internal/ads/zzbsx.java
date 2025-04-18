package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbsx extends zzayc implements zzbsz {
    public zzbsx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzd(zza, intent);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zza = zza();
        zzaye.zzf(zza, iObjectWrapper);
        zzaye.zzd(zza, zzaVar);
        zzdc(6, zza);
    }
}
