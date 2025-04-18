package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzdw extends zzayl implements zzdy {
    public zzdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        Bundle bundle = (Bundle) zzayn.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final zzw zzf() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        zzw zzwVar = (zzw) zzayn.zza(zzdb, zzw.CREATOR);
        zzdb.recycle();
        return zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() throws RemoteException {
        Parcel zzdb = zzdb(1, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() throws RemoteException {
        Parcel zzdb = zzdb(6, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList createTypedArrayList = zzdb.createTypedArrayList(zzw.CREATOR);
        zzdb.recycle();
        return createTypedArrayList;
    }
}
