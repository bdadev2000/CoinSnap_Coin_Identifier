package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzcbc extends zzbae implements zzcbd {
    public zzcbc() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
                zzbaf.zzc(parcel);
                zzc(readString, readString2, bundle);
            } else {
                String readString3 = parcel.readString();
                zzbaf.zzc(parcel);
                zzb(readString3);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzbaf.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
