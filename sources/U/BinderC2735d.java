package u;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import c.InterfaceC0577a;
import c1.RunnableC0589d;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2735d extends Binder implements InterfaceC0577a {
    public final Handler b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2732a f23039c;

    public BinderC2735d(C2732a c2732a) {
        this.f23039c = c2732a;
        attachInterface(this, InterfaceC0577a.f5342a8);
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        boolean z8;
        Bundle extraCallbackWithResult;
        String str = InterfaceC0577a.f5342a8;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 != 1598968902) {
            Handler handler = this.b;
            C2732a c2732a = this.f23039c;
            switch (i9) {
                case 2:
                    int readInt = parcel.readInt();
                    Bundle bundle = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a != null) {
                        handler.post(new B3.b(this, readInt, bundle, 6));
                    }
                    return true;
                case 3:
                    String readString = parcel.readString();
                    Bundle bundle2 = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a != null) {
                        handler.post(new RunnableC2733b(this, readString, bundle2, 0));
                    }
                    return true;
                case 4:
                    Bundle bundle3 = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a != null) {
                        handler.post(new f4.b(20, this, bundle3, false));
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    String readString2 = parcel.readString();
                    Bundle bundle4 = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a != null) {
                        handler.post(new RunnableC2733b(this, readString2, bundle4, 1));
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int readInt2 = parcel.readInt();
                    Uri uri = (Uri) r8.k.b(parcel, Uri.CREATOR);
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Bundle bundle5 = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a != null) {
                        handler.post(new RunnableC2734c(this, readInt2, uri, z8, bundle5));
                    }
                    return true;
                case 7:
                    String readString3 = parcel.readString();
                    Bundle bundle6 = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a == null) {
                        extraCallbackWithResult = null;
                    } else {
                        extraCallbackWithResult = c2732a.extraCallbackWithResult(readString3, bundle6);
                    }
                    parcel2.writeNoException();
                    if (extraCallbackWithResult != null) {
                        parcel2.writeInt(1);
                        extraCallbackWithResult.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    Bundle bundle7 = (Bundle) r8.k.b(parcel, Bundle.CREATOR);
                    if (c2732a != null) {
                        handler.post(new RunnableC0589d(this, readInt3, readInt4, bundle7));
                    }
                    return true;
                default:
                    return super.onTransact(i9, parcel, parcel2, i10);
            }
        }
        parcel2.writeString(str);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
