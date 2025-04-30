package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;

/* loaded from: classes2.dex */
public final class zzbr extends zzbad implements zzbt {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzdb = zzdb(1, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zzbaf.zzd(zza, zzaVar);
        Parcel zzdb = zzdb(3, zza);
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
