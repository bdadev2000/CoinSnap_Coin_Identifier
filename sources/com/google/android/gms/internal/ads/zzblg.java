package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzblg extends zzayd implements zzblh {
    public zzblg() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzaye.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzaye.zzc(parcel);
            zzb(parcelFileDescriptor);
            return true;
        }
        return false;
    }
}
