package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbde extends zzayd implements zzbdf {
    public zzbde() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return false;
                        }
                        zzf();
                        parcel2.writeNoException();
                    } else {
                        zze();
                        parcel2.writeNoException();
                    }
                } else {
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzaye.zzc(parcel);
                    zzd(asInterface);
                    parcel2.writeNoException();
                }
            } else {
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
            }
        } else {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        }
        return true;
    }
}
