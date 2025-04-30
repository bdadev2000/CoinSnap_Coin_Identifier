package c;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u.BinderC2735d;
import u.BinderC2743l;
import w4.v0;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578b implements InterfaceC0580d {
    public IBinder b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final boolean b(InterfaceC0577a interfaceC0577a, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(interfaceC0577a);
            v0.E(obtain, bundle);
            boolean z8 = false;
            this.b.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean c(InterfaceC0577a interfaceC0577a, Uri uri, Bundle bundle, ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(interfaceC0577a);
            v0.E(obtain, uri);
            v0.E(obtain, bundle);
            boolean z8 = false;
            if (arrayList == null) {
                obtain.writeInt(-1);
            } else {
                int size = arrayList.size();
                obtain.writeInt(size);
                for (int i9 = 0; i9 < size; i9++) {
                    v0.E(obtain, (Parcelable) arrayList.get(i9));
                }
            }
            this.b.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean d(BinderC2735d binderC2735d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(binderC2735d);
            boolean z8 = false;
            this.b.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int e(BinderC2735d binderC2735d, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(binderC2735d);
            obtain.writeString(str);
            v0.E(obtain, bundle);
            this.b.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean f(BinderC2735d binderC2735d, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(binderC2735d);
            v0.E(obtain, uri);
            boolean z8 = false;
            this.b.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean g(BinderC2735d binderC2735d, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(binderC2735d);
            v0.E(obtain, uri);
            v0.E(obtain, bundle);
            boolean z8 = false;
            this.b.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean h(InterfaceC0577a interfaceC0577a, BinderC2743l binderC2743l, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(interfaceC0577a);
            obtain.writeStrongBinder(binderC2743l);
            v0.E(obtain, bundle);
            boolean z8 = false;
            this.b.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean i(BinderC2735d binderC2735d, int i9, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeStrongInterface(binderC2735d);
            obtain.writeInt(i9);
            v0.E(obtain, uri);
            v0.E(obtain, bundle);
            boolean z8 = false;
            this.b.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean j() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0580d.b8);
            obtain.writeLong(0L);
            boolean z8 = false;
            this.b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z8 = true;
            }
            return z8;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
