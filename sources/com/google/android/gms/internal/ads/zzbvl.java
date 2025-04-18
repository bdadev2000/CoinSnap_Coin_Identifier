package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbvl extends zzayd implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzaye.zza(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzaye.zzc(parcel);
            zze(zzbaVar);
        } else {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzaye.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzaye.zzc(parcel);
            zzf(parcelFileDescriptor);
        }
        parcel2.writeNoException();
        return true;
    }
}
