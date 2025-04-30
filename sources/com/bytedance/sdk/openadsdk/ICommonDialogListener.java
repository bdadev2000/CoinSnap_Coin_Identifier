package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ICommonDialogListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ICommonDialogListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnNo() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnYes() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogCancel() throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ICommonDialogListener {

        /* loaded from: classes.dex */
        public static class zp implements ICommonDialogListener {
            public static ICommonDialogListener zp;
            private IBinder lMd;

            public zp(IBinder iBinder) {
                this.lMd = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.lMd;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnNo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.lMd.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogBtnNo();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnYes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.lMd.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogBtnYes();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogCancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.lMd.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogCancel();
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
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        public static ICommonDialogListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICommonDialogListener)) {
                return (ICommonDialogListener) queryLocalInterface;
            }
            return new zp(iBinder);
        }

        public static ICommonDialogListener getDefaultImpl() {
            return zp.zp;
        }

        public static boolean setDefaultImpl(ICommonDialogListener iCommonDialogListener) {
            if (zp.zp == null && iCommonDialogListener != null) {
                zp.zp = iCommonDialogListener;
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
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 1598968902) {
                            return super.onTransact(i9, parcel, parcel2, i10);
                        }
                        parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    onDialogCancel();
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnNo();
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            onDialogBtnYes();
            parcel2.writeNoException();
            return true;
        }
    }

    void onDialogBtnNo() throws RemoteException;

    void onDialogBtnYes() throws RemoteException;

    void onDialogCancel() throws RemoteException;
}
