package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IBinderPool extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i10) throws RemoteException {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IBinderPool {

        /* loaded from: classes.dex */
        public static class YFl implements IBinderPool {
            public static IBinderPool YFl;
            private IBinder Sg;

            public YFl(IBinder iBinder) {
                this.Sg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.Sg;
            }

            @Override // com.bytedance.sdk.openadsdk.IBinderPool
            public IBinder queryBinder(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    obtain.writeInt(i10);
                    if (!this.Sg.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryBinder(i10);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        public static IBinderPool asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IBinderPool)) {
                return (IBinderPool) queryLocalInterface;
            }
            return new YFl(iBinder);
        }

        public static IBinderPool getDefaultImpl() {
            return YFl.YFl;
        }

        public static boolean setDefaultImpl(IBinderPool iBinderPool) {
            if (YFl.YFl == null && iBinderPool != null) {
                YFl.YFl = iBinderPool;
                return true;
            }
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            IBinder queryBinder = queryBinder(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(queryBinder);
            return true;
        }
    }

    IBinder queryBinder(int i10) throws RemoteException;
}
