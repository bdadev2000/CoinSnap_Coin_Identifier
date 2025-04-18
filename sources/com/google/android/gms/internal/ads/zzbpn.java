package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbpn extends zzayc implements zzbpp {
    public zzbpn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final IObjectWrapper zze() throws RemoteException {
        return e.c(zzdb(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final boolean zzf() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        boolean zzg = zzaye.zzg(zzdb);
        zzdb.recycle();
        return zzg;
    }
}
