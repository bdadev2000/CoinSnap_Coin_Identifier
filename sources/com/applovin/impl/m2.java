package com.applovin.impl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.eb;

/* loaded from: classes.dex */
public abstract class m2 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25180a;

    static {
        f25180a = xp.f27962a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static eb a(IBinder iBinder) {
        int readInt;
        eb.a f2 = eb.f();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            f2.b((Bundle) b1.a(obtain2.readBundle()));
                            i2++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i3 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return f2.a();
    }
}
