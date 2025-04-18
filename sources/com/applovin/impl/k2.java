package com.applovin.impl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.ab;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public abstract class k2 extends Binder {
    private static final int a;

    static {
        a = yp.a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public static ab a(IBinder iBinder) {
        int readInt;
        ab.a f10 = ab.f();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            f10.b((Bundle) a1.a(obtain2.readBundle()));
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i11 = readInt;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                throw th2;
            }
        }
        return f10.a();
    }
}
