package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzbvp extends zzaym implements zzbvq {
    public zzbvp() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayn.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzayn.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i2 != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzayn.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzayn.zzc(parcel);
            zze(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
