package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbhm extends zzbad implements zzbho {
    public zzbhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbho
    public final String zzg() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        String readString = zzdb.readString();
        zzdb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbho
    public final List zzh() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        ArrayList zzb = zzbaf.zzb(zzdb);
        zzdb.recycle();
        return zzb;
    }
}
