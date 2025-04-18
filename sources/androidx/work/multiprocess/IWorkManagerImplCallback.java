package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IWorkManagerImplCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        /* loaded from: classes.dex */
        public static class Proxy implements IWorkManagerImplCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f22276a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f22276a;
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.work.multiprocess.IWorkManagerImplCallback$Stub$Proxy, java.lang.Object, androidx.work.multiprocess.IWorkManagerImplCallback] */
        public static IWorkManagerImplCallback R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) queryLocalInterface;
            }
            ?? obj = new Object();
            obj.f22276a = iBinder;
            return obj;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                parcel.createByteArray();
                a();
                return true;
            }
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
                return true;
            }
            parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            parcel.readString();
            onFailure();
            return true;
        }
    }

    void a();

    void onFailure();
}
