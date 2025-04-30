package com.google.ar.core.dependencies;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class c implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14290a;
    private final String b;

    public c(IBinder iBinder, String str) {
        this.f14290a = iBinder;
        this.b = str;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14290a;
    }

    public final Parcel b(int i9, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14290a.transact(i9, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void c(int i9, Parcel parcel) throws RemoteException {
        try {
            this.f14290a.transact(i9, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
