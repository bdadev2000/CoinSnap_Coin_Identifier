package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;

/* loaded from: classes3.dex */
public final class zzdm extends zzayc implements zzdo {
    public zzdm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdo
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }
}
