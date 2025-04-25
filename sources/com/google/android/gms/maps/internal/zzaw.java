package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.maps.zzah zzb = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzd(zzb);
        } else if (i == 2) {
            com.google.android.gms.internal.maps.zzah zzb2 = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(zzb2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.internal.maps.zzah zzb3 = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
