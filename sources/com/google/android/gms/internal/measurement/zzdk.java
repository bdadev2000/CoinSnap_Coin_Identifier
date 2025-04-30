package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzdk extends zzbx implements zzdh {
    public zzdk() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            zzbw.zzb(parcel);
            zza(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
