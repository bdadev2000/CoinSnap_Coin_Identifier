package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzbfq extends zzayd implements zzbfr {
    public zzbfq() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbfr zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzbfr) {
            return (zzbfr) queryLocalInterface;
        }
        return new zzbfp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            List zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeList(zzh);
            return true;
        }
        String zzg = zzg();
        parcel2.writeNoException();
        parcel2.writeString(zzg);
        return true;
    }
}
