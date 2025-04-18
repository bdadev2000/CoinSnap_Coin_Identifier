package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzq extends com.google.android.gms.internal.location.zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzr zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof zzr) {
            return (zzr) queryLocalInterface;
        }
        return new zzp(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzf();
            } else {
                LocationAvailability locationAvailability = (LocationAvailability) com.google.android.gms.internal.location.zzc.zza(parcel, LocationAvailability.CREATOR);
                com.google.android.gms.internal.location.zzc.zzb(parcel);
                zzd(locationAvailability);
            }
        } else {
            LocationResult locationResult = (LocationResult) com.google.android.gms.internal.location.zzc.zza(parcel, LocationResult.CREATOR);
            com.google.android.gms.internal.location.zzc.zzb(parcel);
            zze(locationResult);
        }
        return true;
    }
}
