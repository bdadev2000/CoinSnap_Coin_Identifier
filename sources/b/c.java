package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o.r;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f2245b;

    public c(IBinder iBinder) {
        this.f2245b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2245b;
    }

    public final boolean d(b bVar, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            com.bumptech.glide.d.M(obtain, bundle);
            boolean z10 = false;
            this.f2245b.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean e(b bVar, Uri uri, Bundle bundle, ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            com.bumptech.glide.d.M(obtain, uri);
            com.bumptech.glide.d.M(obtain, bundle);
            boolean z10 = false;
            if (arrayList == null) {
                obtain.writeInt(-1);
            } else {
                int size = arrayList.size();
                obtain.writeInt(size);
                for (int i10 = 0; i10 < size; i10++) {
                    com.bumptech.glide.d.M(obtain, (Parcelable) arrayList.get(i10));
                }
            }
            this.f2245b.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean f(o.g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(gVar);
            boolean z10 = false;
            this.f2245b.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int g(b bVar, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            obtain.writeString(str);
            com.bumptech.glide.d.M(obtain, bundle);
            this.f2245b.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean h(b bVar, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            com.bumptech.glide.d.M(obtain, uri);
            boolean z10 = false;
            this.f2245b.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean i(b bVar, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            com.bumptech.glide.d.M(obtain, uri);
            com.bumptech.glide.d.M(obtain, bundle);
            boolean z10 = false;
            this.f2245b.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean j(b bVar, r rVar, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            obtain.writeStrongBinder(rVar);
            com.bumptech.glide.d.M(obtain, bundle);
            boolean z10 = false;
            this.f2245b.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean k(b bVar, int i10, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeStrongInterface(bVar);
            obtain.writeInt(i10);
            com.bumptech.glide.d.M(obtain, uri);
            com.bumptech.glide.d.M(obtain, bundle);
            boolean z10 = false;
            this.f2245b.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean l() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.V7);
            obtain.writeLong(0L);
            boolean z10 = false;
            this.f2245b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
