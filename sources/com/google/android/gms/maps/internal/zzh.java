package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzh extends com.google.android.gms.internal.maps.zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.maps.zzah zzb = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            IObjectWrapper zzc = zzc(zzb);
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzg(parcel2, zzc);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzah zzb2 = com.google.android.gms.internal.maps.zzag.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            IObjectWrapper zzb3 = zzb(zzb2);
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzg(parcel2, zzb3);
        }
        return true;
    }
}
