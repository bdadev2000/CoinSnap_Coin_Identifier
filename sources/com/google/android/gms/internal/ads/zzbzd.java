package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbzd extends zzayd implements zzbze {
    public zzbzd() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzaye.zza(parcel, Bundle.CREATOR);
                zzaye.zzc(parcel);
                zzc(readString, readString2, bundle);
            } else {
                String readString3 = parcel.readString();
                zzaye.zzc(parcel);
                zzb(readString3);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzaye.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
