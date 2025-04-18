package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* loaded from: classes2.dex */
public interface IWorkManagerImpl extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        /* loaded from: classes2.dex */
        public static class Proxy implements IWorkManagerImpl {
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
            if (i2 == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    z();
                    return true;
                case 2:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    J();
                    return true;
                case 3:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    o();
                    return true;
                case 4:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    e();
                    return true;
                case 5:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    c();
                    return true;
                case 6:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    F();
                    return true;
                case 7:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    j();
                    return true;
                case 8:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.R(parcel.readStrongBinder());
                    f();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void F();

    void J();

    void c();

    void e();

    void f();

    void j();

    void o();

    void z();
}
