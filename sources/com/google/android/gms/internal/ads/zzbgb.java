package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzbgb extends zzayd implements zzbgc {
    public zzbgb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbgc zzdA(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof zzbgc) {
            return (zzbgc) queryLocalInterface;
        }
        return new zzbga(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbfv zzbftVar;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdv(readString, asInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaye.zzc(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdz(asInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdw(asInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzd(asInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbftVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof zzbfv) {
                        zzbftVar = (zzbfv) queryLocalInterface;
                    } else {
                        zzbftVar = new zzbft(readStrongBinder);
                    }
                }
                zzaye.zzc(parcel);
                zzdx(zzbftVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdy(asInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
