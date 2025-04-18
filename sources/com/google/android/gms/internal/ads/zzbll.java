package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzbll extends zzaym implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayn.zza(parcel, ParcelFileDescriptor.CREATOR);
        zzayn.zzc(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
