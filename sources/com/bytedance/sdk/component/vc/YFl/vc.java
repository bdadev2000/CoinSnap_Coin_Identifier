package com.bytedance.sdk.component.vc.YFl;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public interface vc extends IInterface {
    int YFl(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    int YFl(Uri uri, String str, String[] strArr) throws RemoteException;

    String YFl(Uri uri) throws RemoteException;

    String YFl(Uri uri, ContentValues contentValues) throws RemoteException;

    Map YFl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class YFl extends Binder implements vc {
        public YFl() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static vc YFl(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof vc)) {
                return (vc) queryLocalInterface;
            }
            return new C0095YFl(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            Uri uri;
            Uri uri2;
            Uri uri3 = null;
            ContentValues contentValues = null;
            Uri uri4 = null;
            ContentValues contentValues2 = null;
            Uri uri5 = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 1598968902) {
                                    return super.onTransact(i10, parcel, parcel2, i11);
                                }
                                parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                                return true;
                            }
                            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                            if (parcel.readInt() != 0) {
                                uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                            } else {
                                uri2 = null;
                            }
                            if (parcel.readInt() != 0) {
                                contentValues = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
                            }
                            int YFl = YFl(uri2, contentValues, parcel.readString(), parcel.createStringArray());
                            parcel2.writeNoException();
                            parcel2.writeInt(YFl);
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                        if (parcel.readInt() != 0) {
                            uri4 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        int YFl2 = YFl(uri4, parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(YFl2);
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        contentValues2 = (ContentValues) ContentValues.CREATOR.createFromParcel(parcel);
                    }
                    String YFl3 = YFl(uri, contentValues2);
                    parcel2.writeNoException();
                    parcel2.writeString(YFl3);
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                if (parcel.readInt() != 0) {
                    uri5 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                String YFl4 = YFl(uri5);
                parcel2.writeNoException();
                parcel2.writeString(YFl4);
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (parcel.readInt() != 0) {
                uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
            }
            Map YFl5 = YFl(uri3, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeMap(YFl5);
            return true;
        }

        public static vc YFl() {
            return C0095YFl.YFl;
        }

        /* renamed from: com.bytedance.sdk.component.vc.YFl.vc$YFl$YFl, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0095YFl implements vc {
            public static vc YFl;
            private IBinder Sg;

            public C0095YFl(IBinder iBinder) {
                this.Sg = iBinder;
            }

            @Override // com.bytedance.sdk.component.vc.YFl.vc
            public Map YFl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr2);
                    obtain.writeString(str2);
                    if (!this.Sg.transact(1, obtain, obtain2, 0) && YFl.YFl() != null) {
                        return YFl.YFl().YFl(uri, strArr, str, strArr2, str2);
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.Sg;
            }

            @Override // com.bytedance.sdk.component.vc.YFl.vc
            public String YFl(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.Sg.transact(2, obtain, obtain2, 0) && YFl.YFl() != null) {
                        return YFl.YFl().YFl(uri);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.vc.YFl.vc
            public String YFl(Uri uri, ContentValues contentValues) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.Sg.transact(3, obtain, obtain2, 0) && YFl.YFl() != null) {
                        return YFl.YFl().YFl(uri, contentValues);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.vc.YFl.vc
            public int YFl(Uri uri, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.Sg.transact(4, obtain, obtain2, 0) && YFl.YFl() != null) {
                        return YFl.YFl().YFl(uri, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.vc.YFl.vc
            public int YFl(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.Sg.transact(5, obtain, obtain2, 0) && YFl.YFl() != null) {
                        return YFl.YFl().YFl(uri, contentValues, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
