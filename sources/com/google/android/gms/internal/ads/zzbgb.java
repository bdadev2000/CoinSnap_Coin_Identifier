package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbgb extends zzaym implements zzbgc {
    public zzbgb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbgc zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbgc ? (zzbgc) queryLocalInterface : new zzbga(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zzdF(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper zzf = zzf();
            parcel2.writeNoException();
            zzayn.zzf(parcel2, zzf);
        } else if (i2 == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzayn.zze(parcel2, zze);
        } else if (i2 == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i2 == 4) {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            if (i2 != 5) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
