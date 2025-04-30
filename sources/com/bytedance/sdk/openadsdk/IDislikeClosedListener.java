package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IDislikeClosedListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
        public void onItemClickClosed() throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IDislikeClosedListener {

        /* loaded from: classes.dex */
        public static class zp implements IDislikeClosedListener {
            public static IDislikeClosedListener zp;
            private IBinder lMd;

            public zp(IBinder iBinder) {
                this.lMd = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.lMd;
            }

            @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
            public void onItemClickClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (!this.lMd.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onItemClickClosed();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static IDislikeClosedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDislikeClosedListener)) {
                return (IDislikeClosedListener) queryLocalInterface;
            }
            return new zp(iBinder);
        }

        public static IDislikeClosedListener getDefaultImpl() {
            return zp.zp;
        }

        public static boolean setDefaultImpl(IDislikeClosedListener iDislikeClosedListener) {
            if (zp.zp == null && iDislikeClosedListener != null) {
                zp.zp = iDislikeClosedListener;
                return true;
            }
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i9 != 1) {
                if (i9 != 1598968902) {
                    return super.onTransact(i9, parcel, parcel2, i10);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            onItemClickClosed();
            parcel2.writeNoException();
            return true;
        }
    }

    void onItemClickClosed() throws RemoteException;
}
