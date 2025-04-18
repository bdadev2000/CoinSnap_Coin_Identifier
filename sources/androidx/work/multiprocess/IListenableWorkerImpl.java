package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* loaded from: classes2.dex */
public interface IListenableWorkerImpl extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        /* loaded from: classes2.dex */
        public static class Proxy implements IListenableWorkerImpl {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                parcel.createByteArray();
                IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                l();
                return true;
            }
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
                return true;
            }
            parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            parcel.createByteArray();
            IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
            t();
            return true;
        }
    }

    void l();

    void t();
}
