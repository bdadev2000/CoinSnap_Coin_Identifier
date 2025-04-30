package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzw extends Binder implements IInterface {
    public zzw(String str) {
        attachInterface(this, str);
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
        return zzb(i9, parcel, parcel2, i10);
    }

    public boolean zzb(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        throw null;
    }
}
