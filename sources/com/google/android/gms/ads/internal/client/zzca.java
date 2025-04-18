package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;

/* loaded from: classes3.dex */
public final class zzca extends zzayc implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }
}
