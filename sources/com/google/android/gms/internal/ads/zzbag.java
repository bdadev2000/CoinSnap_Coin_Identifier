package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbag extends zzbad implements zzbai {
    public zzbag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzbaf.zzf(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzf() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzg(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i9);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzi(int i9) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzdc(5, zza);
    }
}
