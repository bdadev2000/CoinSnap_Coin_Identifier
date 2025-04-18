package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayn;

/* loaded from: classes3.dex */
public abstract class zzdq extends zzaym implements zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdr ? (zzdr) queryLocalInterface : new zzdp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzu zzuVar = (zzu) zzayn.zza(parcel, zzu.CREATOR);
            zzayn.zzc(parcel);
            zze(zzuVar);
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i4 = zzayn.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
