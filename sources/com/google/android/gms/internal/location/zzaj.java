package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
            } else {
                zzc(parcel.readInt(), parcel.createStringArray());
            }
        } else {
            zzb(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
