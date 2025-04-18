package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;

/* loaded from: classes3.dex */
public final class zzdb extends zzayc implements zzdd {
    public zzdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }
}
