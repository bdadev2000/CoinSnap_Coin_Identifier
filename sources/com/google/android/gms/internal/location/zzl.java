package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
                zzc.zzb(parcel);
                zzc(readInt, pendingIntent);
            } else {
                int readInt2 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                zzc.zzb(parcel);
                zzd(readInt2, createStringArray);
            }
        } else {
            int readInt3 = parcel.readInt();
            String[] createStringArray2 = parcel.createStringArray();
            zzc.zzb(parcel);
            zzb(readInt3, createStringArray2);
        }
        return true;
    }
}
