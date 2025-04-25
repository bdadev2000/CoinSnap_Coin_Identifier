package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzaw extends zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static zzax zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof zzax ? (zzax) queryLocalInterface : new zzav(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        zzc.zzd(parcel);
        Tile zzb = zzb(readInt, readInt2, readInt3);
        parcel2.writeNoException();
        zzc.zzf(parcel2, zzb);
        return true;
    }
}
