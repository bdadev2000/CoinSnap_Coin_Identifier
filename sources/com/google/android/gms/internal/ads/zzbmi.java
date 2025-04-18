package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbmi extends zzaym implements zzbmj {
    public zzbmi() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbmm zzbmkVar;
        if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zzeb zzb = zzb();
            parcel2.writeNoException();
            zzayn.zzf(parcel2, zzb);
            return true;
        }
        if (i2 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbmkVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmkVar = queryLocalInterface instanceof zzbmm ? (zzbmm) queryLocalInterface : new zzbmk(readStrongBinder);
            }
            zzayn.zzc(parcel);
            zzf(asInterface, zzbmkVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayn.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 7) {
            return false;
        }
        zzbfz zzc = zzc();
        parcel2.writeNoException();
        zzayn.zzf(parcel2, zzc);
        return true;
    }
}
