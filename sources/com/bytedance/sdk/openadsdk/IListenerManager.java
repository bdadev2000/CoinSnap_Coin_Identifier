package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;

/* loaded from: classes.dex */
public interface IListenerManager extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IListenerManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void broadcastDialogListener(String str, int i9) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeRewardVideoCallback(String str, String str2, boolean z8, int i9, String str3, int i10, String str4) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IListenerManager {

        /* loaded from: classes.dex */
        public static class zp implements IListenerManager {
            public static IListenerManager zp;
            private IBinder lMd;

            public zp(IBinder iBinder) {
                this.lMd = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.lMd;
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastDialogListener(String str, int i9) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeInt(i9);
                    if (!this.lMd.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().broadcastDialogListener(str, i9);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastPermissionListener(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.lMd.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().broadcastPermissionListener(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.lMd.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().executeAppOpenAdCallback(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.lMd.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().executeDisLikeClosedCallback(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeFullVideoCallback(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.lMd.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().executeFullVideoCallback(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeRewardVideoCallback(String str, String str2, boolean z8, int i9, String str3, int i10, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z8 ? 1 : 0);
                    obtain.writeInt(i9);
                    obtain.writeString(str3);
                    obtain.writeInt(i10);
                    obtain.writeString(str4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.lMd.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().executeRewardVideoCallback(str, str2, z8, i9, str3, i10, str4);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (iAppOpenAdInteractionListener != null) {
                        iBinder = iAppOpenAdInteractionListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.lMd.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerAppOpenAdListener(str, iAppOpenAdInteractionListener);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (iCommonDialogListener != null) {
                        iBinder = iCommonDialogListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.lMd.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerDialogListener(str, iCommonDialogListener);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (iDislikeClosedListener != null) {
                        iBinder = iDislikeClosedListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.lMd.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerDisLikeClosedListener(str, iDislikeClosedListener);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (iFullScreenVideoAdInteractionListener != null) {
                        iBinder = iFullScreenVideoAdInteractionListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.lMd.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerFullVideoListener(str, iFullScreenVideoAdInteractionListener);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (iCommonPermissionListener != null) {
                        iBinder = iCommonPermissionListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.lMd.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerPermissionListener(str, iCommonPermissionListener);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (iRewardAdInteractionListener != null) {
                        iBinder = iRewardAdInteractionListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.lMd.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerRewardVideoListener(str, iRewardAdInteractionListener);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void unregisterDisLikeClosedListener(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    obtain.writeString(str);
                    if (!this.lMd.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterDisLikeClosedListener(str);
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
            attachInterface(this, "com.bytedance.sdk.openadsdk.IListenerManager");
        }

        public static IListenerManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IListenerManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IListenerManager)) {
                return (IListenerManager) queryLocalInterface;
            }
            return new zp(iBinder);
        }

        public static IListenerManager getDefaultImpl() {
            return zp.zp;
        }

        public static boolean setDefaultImpl(IListenerManager iListenerManager) {
            if (zp.zp == null && iListenerManager != null) {
                zp.zp = iListenerManager;
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
            boolean z8;
            if (i9 != 1598968902) {
                switch (i9) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        registerRewardVideoListener(parcel.readString(), IRewardAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        executeRewardVideoCallback(readString, readString2, z8, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        registerFullVideoListener(parcel.readString(), IFullScreenVideoAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        executeFullVideoCallback(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        registerDialogListener(parcel.readString(), ICommonDialogListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        broadcastDialogListener(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        registerPermissionListener(parcel.readString(), ICommonPermissionListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        broadcastPermissionListener(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        registerDisLikeClosedListener(parcel.readString(), IDislikeClosedListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        unregisterDisLikeClosedListener(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        executeDisLikeClosedCallback(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        registerAppOpenAdListener(parcel.readString(), IAppOpenAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        executeAppOpenAdCallback(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i9, parcel, parcel2, i10);
                }
            }
            parcel2.writeString("com.bytedance.sdk.openadsdk.IListenerManager");
            return true;
        }
    }

    void broadcastDialogListener(String str, int i9) throws RemoteException;

    void broadcastPermissionListener(String str, String str2) throws RemoteException;

    void executeAppOpenAdCallback(String str, String str2) throws RemoteException;

    void executeDisLikeClosedCallback(String str, String str2) throws RemoteException;

    void executeFullVideoCallback(String str, String str2) throws RemoteException;

    void executeRewardVideoCallback(String str, String str2, boolean z8, int i9, String str3, int i10, String str4) throws RemoteException;

    void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException;

    void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException;

    void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException;

    void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException;

    void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException;

    void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException;

    void unregisterDisLikeClosedListener(String str) throws RemoteException;
}
