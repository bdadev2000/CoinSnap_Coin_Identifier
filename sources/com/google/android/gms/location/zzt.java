package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzt extends com.google.android.gms.internal.location.zzb implements zzu {
    public zzt() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzu zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof zzu) {
            return (zzu) queryLocalInterface;
        }
        return new zzs(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
        } else {
            Location location = (Location) com.google.android.gms.internal.location.zzc.zza(parcel, Location.CREATOR);
            com.google.android.gms.internal.location.zzc.zzb(parcel);
            zzd(location);
        }
        return true;
    }
}
