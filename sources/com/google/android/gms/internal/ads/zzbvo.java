package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbvo extends zzayd implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzaye.zza(parcel, ParcelFileDescriptor.CREATOR);
                zzbvx zzbvxVar = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
                zzaye.zzc(parcel);
                zzg(parcelFileDescriptor, zzbvxVar);
            } else {
                com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzaye.zza(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
                zzaye.zzc(parcel);
                zze(zzbaVar);
            }
        } else {
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzaye.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzaye.zzc(parcel);
            zzf(parcelFileDescriptor2);
        }
        parcel2.writeNoException();
        return true;
    }
}
