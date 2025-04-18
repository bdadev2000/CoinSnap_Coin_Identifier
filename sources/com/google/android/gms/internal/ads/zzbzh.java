package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbzh extends zzaym implements zzbzi {
    public zzbzh() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            parcel.readString();
            parcel.readString();
            zzayn.zzc(parcel);
        } else if (i2 == 2) {
            String readString = parcel.readString();
            zzayn.zzc(parcel);
            zzb(readString);
        } else {
            if (i2 != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzayn.zza(parcel, Bundle.CREATOR);
            zzayn.zzc(parcel);
            zzc(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
