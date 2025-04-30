package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes2.dex */
public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            zzb((LocationSettingsResult) zzc.zzb(parcel, LocationSettingsResult.CREATOR));
            return true;
        }
        return false;
    }
}
