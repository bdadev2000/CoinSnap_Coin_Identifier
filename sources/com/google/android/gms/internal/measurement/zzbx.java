package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzbx extends Binder implements IInterface {
    public zzbx(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        boolean z8;
        if (i9 > 16777215) {
            z8 = super.onTransact(i9, parcel, parcel2, i10);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z8 = false;
        }
        if (z8) {
            return true;
        }
        return zza(i9, parcel, parcel2, i10);
    }

    public boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        return false;
    }
}
