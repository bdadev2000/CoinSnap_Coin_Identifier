package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbhr extends zzayd implements zzbhs {
    public zzbhr() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
        } else {
            String readString = parcel.readString();
            zzaye.zzc(parcel);
            zzf(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
