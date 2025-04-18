package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;

/* loaded from: classes3.dex */
public final class zzbg extends zzayc implements zzbi {
    public zzbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb() throws RemoteException {
        zzdc(1, zza());
    }
}
