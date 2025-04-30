package com.applovin.impl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.ab;

/* renamed from: com.applovin.impl.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0717k2 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8538a;

    static {
        int i9;
        if (yp.f12451a >= 30) {
            i9 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i9 = 65536;
        }
        f8538a = i9;
    }

    public static ab a(IBinder iBinder) {
        int readInt;
        ab.a f9 = ab.f();
        int i9 = 0;
        int i10 = 1;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i9);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            f9.b((Bundle) AbstractC0669a1.a(obtain2.readBundle()));
                            i9++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i10 = readInt;
                } catch (RemoteException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return f9.a();
    }
}
