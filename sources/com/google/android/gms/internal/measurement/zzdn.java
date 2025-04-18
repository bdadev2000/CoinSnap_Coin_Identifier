package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzdn extends zzbx implements zzdo {
    public zzdn() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            zzbw.zzb(parcel);
            zza(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
