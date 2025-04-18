package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbqx extends zzaym implements zzbqy {
    public zzbqx() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayn.zzc(parcel);
            zzg(asInterface);
        } else if (i2 == 2) {
            String readString = parcel.readString();
            zzayn.zzc(parcel);
            zze(readString);
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayn.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayn.zzc(parcel);
            zzf(zzeVar);
        } else {
            if (i2 != 4) {
                return false;
            }
            zzbpu zzb = zzbpt.zzb(parcel.readStrongBinder());
            zzayn.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
