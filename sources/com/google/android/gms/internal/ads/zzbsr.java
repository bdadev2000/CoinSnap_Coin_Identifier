package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbsr extends zzbae implements zzbss {
    public zzbsr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        return false;
                    }
                    zzbro zzb = zzbrn.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzh(zzb);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                    zzbaf.zzc(parcel);
                    zzf(zzeVar);
                }
            } else {
                String readString = parcel.readString();
                zzbaf.zzc(parcel);
                zze(readString);
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            zzg(asInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
