package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.L;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbrm extends zzbad implements zzbro {
    public zzbrm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final IObjectWrapper zze() throws RemoteException {
        return L.e(zzdb(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final boolean zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        boolean zzg = zzbaf.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
