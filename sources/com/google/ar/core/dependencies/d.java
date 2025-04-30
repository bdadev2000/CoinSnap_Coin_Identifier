package com.google.ar.core.dependencies;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class d extends Binder implements IInterface {
    public d(String str) {
        attachInterface(this, str);
    }

    public boolean a(int i9, Parcel parcel) throws RemoteException {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 > 16777215) {
            if (super.onTransact(i9, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return a(i9, parcel);
    }
}
