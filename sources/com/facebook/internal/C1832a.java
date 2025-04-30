package com.facebook.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.facebook.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832a implements IInterface {
    public final IBinder b;

    public C1832a(IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final String b() {
        Parcel obtain = Parcel.obtain();
        G7.j.d(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        G7.j.d(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.b.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean c() {
        Parcel obtain = Parcel.obtain();
        G7.j.d(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        G7.j.d(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z8 = true;
            obtain.writeInt(1);
            this.b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z8 = false;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
