package com.applovin.array.apphub.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IAppHubDirectDownloadServiceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback";

    /* loaded from: classes.dex */
    public static class Default implements IAppHubDirectDownloadServiceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onAppDetailsDismissed(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onAppDetailsShown(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onDownloadStarted(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onError(String str, String str2) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IAppHubDirectDownloadServiceCallback {
        static final int TRANSACTION_onAppDetailsDismissed = 2;
        static final int TRANSACTION_onAppDetailsShown = 1;
        static final int TRANSACTION_onDownloadStarted = 3;
        static final int TRANSACTION_onError = 4;

        /* loaded from: classes.dex */
        public static class Proxy implements IAppHubDirectDownloadServiceCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAppHubDirectDownloadServiceCallback.DESCRIPTOR;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onAppDetailsDismissed(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onAppDetailsShown(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onDownloadStarted(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onError(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
        }

        public static IAppHubDirectDownloadServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppHubDirectDownloadServiceCallback)) {
                return (IAppHubDirectDownloadServiceCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i9 >= 1 && i9 <= 16777215) {
                parcel.enforceInterface(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            }
            if (i9 != 1598968902) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                return super.onTransact(i9, parcel, parcel2, i10);
                            }
                            onError(parcel.readString(), parcel.readString());
                        } else {
                            onDownloadStarted(parcel.readString());
                        }
                    } else {
                        onAppDetailsDismissed(parcel.readString());
                    }
                } else {
                    onAppDetailsShown(parcel.readString());
                }
                return true;
            }
            parcel2.writeString(IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            return true;
        }
    }

    void onAppDetailsDismissed(String str) throws RemoteException;

    void onAppDetailsShown(String str) throws RemoteException;

    void onDownloadStarted(String str) throws RemoteException;

    void onError(String str, String str2) throws RemoteException;
}
