package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzai extends zzb implements zzaj {
    public zzai() {
        super("com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzm zzmVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            zzmVar = queryLocalInterface instanceof zzm ? (zzm) queryLocalInterface : new zzm(readStrongBinder);
        }
        zzc.zzd(parcel);
        zzb(zzmVar);
        parcel2.writeNoException();
        return true;
    }
}
