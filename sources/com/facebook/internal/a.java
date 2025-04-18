package com.facebook.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f11018b;

    public a(IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f11018b = binder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11018b;
    }

    public final String d() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f11018b.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean e() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z10 = true;
            obtain.writeInt(1);
            this.f11018b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z10 = false;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
