package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static final String l8 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* loaded from: classes.dex */
    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public final void g(String[] strArr) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        /* loaded from: classes.dex */
        public static class Proxy implements IMultiInstanceInvalidationCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f21269a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f21269a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public final void g(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.l8);
                    obtain.writeStringArray(strArr);
                    this.f21269a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IMultiInstanceInvalidationCallback.l8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            ((MultiInstanceInvalidationClient$callback$1) this).g(parcel.createStringArray());
            return true;
        }
    }

    void g(String[] strArr);
}
