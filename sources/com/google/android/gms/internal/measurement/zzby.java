package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzby extends zzbx implements zzbz {
    public static zzbz zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof zzbz) {
            return (zzbz) queryLocalInterface;
        }
        return new zzca(iBinder);
    }
}
