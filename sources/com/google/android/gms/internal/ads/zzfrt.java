package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public abstract class zzfrt extends zzayd implements zzfru {
    public zzfrt() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaye.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaye.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaye.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaye.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
