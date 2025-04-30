package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbxj extends zzbae implements zzbxk {
    public zzbxj() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzbaf.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzbaf.zzc(parcel);
            zze(zzbbVar);
        } else {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbaf.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbaf.zzc(parcel);
            zzf(parcelFileDescriptor);
        }
        parcel2.writeNoException();
        return true;
    }
}
