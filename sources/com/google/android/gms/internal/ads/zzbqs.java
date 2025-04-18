package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbqs extends zzayd implements zzbqt {
    public zzbqs() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    zzbpp zzb = zzbpo.zzb(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzh(zzb);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaye.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                    zzaye.zzc(parcel);
                    zzf(zzeVar);
                }
            } else {
                String readString = parcel.readString();
                zzaye.zzc(parcel);
                zze(readString);
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zzg(asInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
