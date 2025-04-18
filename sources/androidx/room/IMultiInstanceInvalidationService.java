package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String m8 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* loaded from: classes.dex */
    public static class Default implements IMultiInstanceInvalidationService {
        @Override // androidx.room.IMultiInstanceInvalidationService
        public final int B(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            return 0;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void Q(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void s(int i2, String[] strArr) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f21270a = 0;

        /* loaded from: classes.dex */
        public static class Proxy implements IMultiInstanceInvalidationService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f21271a;

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final int B(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationService.m8);
                    obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    obtain.writeString(str);
                    this.f21271a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final void Q(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationService.m8);
                    obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    obtain.writeInt(i2);
                    this.f21271a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f21271a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final void s(int i2, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationService.m8);
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    this.f21271a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v8, types: [androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy, java.lang.Object] */
        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IMultiInstanceInvalidationService.m8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback = null;
            IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback2 = null;
            if (i2 == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.l8);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                        ?? obj = new Object();
                        obj.f21269a = readStrongBinder;
                        iMultiInstanceInvalidationCallback = obj;
                    } else {
                        iMultiInstanceInvalidationCallback = (IMultiInstanceInvalidationCallback) queryLocalInterface;
                    }
                }
                int B = ((MultiInstanceInvalidationService$binder$1) this).B(iMultiInstanceInvalidationCallback, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(B);
            } else if (i2 == 2) {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(IMultiInstanceInvalidationCallback.l8);
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                        ?? obj2 = new Object();
                        obj2.f21269a = readStrongBinder2;
                        iMultiInstanceInvalidationCallback2 = obj2;
                    } else {
                        iMultiInstanceInvalidationCallback2 = (IMultiInstanceInvalidationCallback) queryLocalInterface2;
                    }
                }
                ((MultiInstanceInvalidationService$binder$1) this).Q(iMultiInstanceInvalidationCallback2, parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                ((MultiInstanceInvalidationService$binder$1) this).s(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int B(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);

    void Q(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2);

    void s(int i2, String[] strArr);
}
