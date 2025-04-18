package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;

/* loaded from: classes3.dex */
public final class zzcu extends zzayc implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzbpg getAdapterCreator() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        zzbpg zzf = zzbpf.zzf(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzfb getLiteSdkVersion() throws RemoteException {
        Parcel zzdb = zzdb(1, zza());
        zzfb zzfbVar = (zzfb) zzaye.zza(zzdb, zzfb.CREATOR);
        zzdb.recycle();
        return zzfbVar;
    }
}
