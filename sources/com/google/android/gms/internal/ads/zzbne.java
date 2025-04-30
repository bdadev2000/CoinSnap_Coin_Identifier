package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzbne extends zzbae implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbaf.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbaf.zzc(parcel);
            zzb(parcelFileDescriptor);
            return true;
        }
        return false;
    }
}
