package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzj extends com.google.android.gms.internal.maps.zzb implements ILocationSourceDelegate {
    public zzj() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaj zzaiVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaiVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                zzaiVar = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzai(readStrongBinder);
            }
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            activate(zzaiVar);
        } else {
            if (i != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}
