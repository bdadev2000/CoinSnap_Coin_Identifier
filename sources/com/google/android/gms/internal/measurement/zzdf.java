package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzdf extends zzbx implements zzdg {
    public zzdf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            zzbw.zzb(parcel);
            zza(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
