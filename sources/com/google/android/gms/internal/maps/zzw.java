package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzw extends zza implements zzy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final int zzd() throws RemoteException {
        Parcel zzJ = zzJ(1, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final int zze() throws RemoteException {
        Parcel zzJ = zzJ(2, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final int zzf() throws RemoteException {
        Parcel zzJ = zzJ(6, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final List zzg() throws RemoteException {
        Parcel zzJ = zzJ(3, zza());
        ArrayList<IBinder> createBinderArrayList = zzJ.createBinderArrayList();
        zzJ.recycle();
        return createBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final boolean zzh(zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzg(zza, zzyVar);
        Parcel zzJ = zzJ(5, zza);
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final boolean zzi() throws RemoteException {
        Parcel zzJ = zzJ(4, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
