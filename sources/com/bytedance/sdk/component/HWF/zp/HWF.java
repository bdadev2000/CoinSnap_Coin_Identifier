package com.bytedance.sdk.component.HWF.zp;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface HWF extends IInterface {
    int zp(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    int zp(Uri uri, String str, String[] strArr) throws RemoteException;

    String zp(Uri uri) throws RemoteException;

    String zp(Uri uri, ContentValues contentValues) throws RemoteException;

    Map zp(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class zp extends Binder implements HWF {
        public zp() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static HWF zp(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof HWF)) {
                return (HWF) queryLocalInterface;
            }
            return new C0073zp(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            Uri uri;
            Uri uri2;
            Uri uri3 = null;
            ContentValues contentValues = null;
            Uri uri4 = null;
            ContentValues contentValues2 = null;
            Uri uri5 = null;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 != 1598968902) {
                                    return super.onTransact(i9, parcel, parcel2, i10);
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
                            int zp = zp(uri2, contentValues, parcel.readString(), parcel.createStringArray());
                            parcel2.writeNoException();
                            parcel2.writeInt(zp);
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                        if (parcel.readInt() != 0) {
                            uri4 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        int zp2 = zp(uri4, parcel.readString(), parcel.createStringArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(zp2);
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
                    String zp3 = zp(uri, contentValues2);
                    parcel2.writeNoException();
                    parcel2.writeString(zp3);
                    return true;
                }
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                if (parcel.readInt() != 0) {
                    uri5 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                String zp4 = zp(uri5);
                parcel2.writeNoException();
                parcel2.writeString(zp4);
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (parcel.readInt() != 0) {
                uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
            }
            Map zp5 = zp(uri3, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeMap(zp5);
            return true;
        }

        public static HWF zp() {
            return C0073zp.zp;
        }

        /* renamed from: com.bytedance.sdk.component.HWF.zp.HWF$zp$zp, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0073zp implements HWF {
            public static HWF zp;
            private IBinder lMd;

            public C0073zp(IBinder iBinder) {
                this.lMd = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.lMd;
            }

            @Override // com.bytedance.sdk.component.HWF.zp.HWF
            public Map zp(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
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
                    if (!this.lMd.transact(1, obtain, obtain2, 0) && zp.zp() != null) {
                        Map zp2 = zp.zp().zp(uri, strArr, str, strArr2, str2);
                        obtain2.recycle();
                        obtain.recycle();
                        return zp2;
                    }
                    obtain2.readException();
                    HashMap readHashMap = obtain2.readHashMap(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readHashMap;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.HWF.zp.HWF
            public String zp(Uri uri) throws RemoteException {
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
                    if (!this.lMd.transact(2, obtain, obtain2, 0) && zp.zp() != null) {
                        String zp2 = zp.zp().zp(uri);
                        obtain2.recycle();
                        obtain.recycle();
                        return zp2;
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.HWF.zp.HWF
            public String zp(Uri uri, ContentValues contentValues) throws RemoteException {
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
                    if (!this.lMd.transact(3, obtain, obtain2, 0) && zp.zp() != null) {
                        String zp2 = zp.zp().zp(uri, contentValues);
                        obtain2.recycle();
                        obtain.recycle();
                        return zp2;
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.HWF.zp.HWF
            public int zp(Uri uri, String str, String[] strArr) throws RemoteException {
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
                    if (!this.lMd.transact(4, obtain, obtain2, 0) && zp.zp() != null) {
                        int zp2 = zp.zp().zp(uri, str, strArr);
                        obtain2.recycle();
                        obtain.recycle();
                        return zp2;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.HWF.zp.HWF
            public int zp(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
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
                    if (!this.lMd.transact(5, obtain, obtain2, 0) && zp.zp() != null) {
                        int zp2 = zp.zp().zp(uri, contentValues, str, strArr);
                        obtain2.recycle();
                        obtain.recycle();
                        return zp2;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }
    }
}
