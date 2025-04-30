package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbob extends zzbae implements zzboc {
    public zzbob() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final boolean zzdF(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbof zzbodVar;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 5) {
                    if (i9 != 6) {
                        if (i9 != 7) {
                            return false;
                        }
                        zzbhs zzc = zzc();
                        parcel2.writeNoException();
                        zzbaf.zzf(parcel2, zzc);
                        return true;
                    }
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zze(asInterface);
                    parcel2.writeNoException();
                    return true;
                }
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbodVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof zzbof) {
                        zzbodVar = (zzbof) queryLocalInterface;
                    } else {
                        zzbodVar = new zzbod(readStrongBinder);
                    }
                }
                zzbaf.zzc(parcel);
                zzf(asInterface2, zzbodVar);
                parcel2.writeNoException();
                return true;
            }
            zzd();
            parcel2.writeNoException();
            return true;
        }
        com.google.android.gms.ads.internal.client.zzdq zzb = zzb();
        parcel2.writeNoException();
        zzbaf.zzf(parcel2, zzb);
        return true;
    }
}
