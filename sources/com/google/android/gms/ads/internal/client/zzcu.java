package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes.dex */
public final class zzcu extends zzayl implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzbpl getAdapterCreator() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        zzbpl zzf = zzbpk.zzf(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzfc getLiteSdkVersion() throws RemoteException {
        Parcel zzdb = zzdb(1, zza());
        zzfc zzfcVar = (zzfc) zzayn.zza(zzdb, zzfc.CREATOR);
        zzdb.recycle();
        return zzfcVar;
    }
}
