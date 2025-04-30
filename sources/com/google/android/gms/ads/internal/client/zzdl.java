package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdl extends zzbad implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        Bundle bundle = (Bundle) zzbaf.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        zzu zzuVar = (zzu) zzbaf.zza(zzdb, zzu.CREATOR);
        zzdb.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() throws RemoteException {
        Parcel zzdb = zzdb(1, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList createTypedArrayList = zzdb.createTypedArrayList(zzu.CREATOR);
        zzdb.recycle();
        return createTypedArrayList;
    }
}
