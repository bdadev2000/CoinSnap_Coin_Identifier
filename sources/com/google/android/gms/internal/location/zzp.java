package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class zzp extends zzb implements zzq {
    public zzp() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            Location location = (Location) zzc.zza(parcel, Location.CREATOR);
            zzc.zzb(parcel);
            zzb(status, location);
            return true;
        }
        return false;
    }
}
