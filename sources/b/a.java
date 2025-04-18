package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a extends Binder implements b {
    public a() {
        attachInterface(this, b.U7);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        Bundle extraCallbackWithResult;
        String str = b.U7;
        int i12 = 1;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i13 = 3;
        int i14 = 0;
        switch (i10) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar = (o.g) this;
                if (gVar.f22930c != null) {
                    gVar.f22929b.post(new d.d(gVar, readInt, bundle, 3));
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar2 = (o.g) this;
                if (gVar2.f22930c != null) {
                    gVar2.f22929b.post(new o.c(gVar2, readString, bundle2, i14));
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar3 = (o.g) this;
                if (gVar3.f22930c != null) {
                    gVar3.f22929b.post(new o.b(gVar3, bundle3, i12));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar4 = (o.g) this;
                if (gVar4.f22930c != null) {
                    gVar4.f22929b.post(new o.c(gVar4, readString2, bundle4, i12));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) com.bumptech.glide.c.a(parcel, Uri.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Bundle bundle5 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar5 = (o.g) this;
                if (gVar5.f22930c != null) {
                    gVar5.f22929b.post(new o.d(gVar5, readInt2, uri, z10, bundle5));
                }
                return true;
            case 7:
                String readString3 = parcel.readString();
                Bundle bundle6 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.a aVar = ((o.g) this).f22930c;
                if (aVar == null) {
                    extraCallbackWithResult = null;
                } else {
                    extraCallbackWithResult = aVar.extraCallbackWithResult(readString3, bundle6);
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
                Bundle bundle7 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar6 = (o.g) this;
                if (gVar6.f22930c != null) {
                    gVar6.f22929b.post(new o.e(gVar6, readInt3, readInt4, bundle7));
                }
                return true;
            case 9:
                Bundle bundle8 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar7 = (o.g) this;
                if (gVar7.f22930c != null) {
                    gVar7.f22929b.post(new o.b(gVar7, bundle8, 2));
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle9 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar8 = (o.g) this;
                if (gVar8.f22930c != null) {
                    gVar8.f22929b.post(new o.f(gVar8, readInt5, readInt6, readInt7, readInt8, readInt9, bundle9));
                }
                return true;
            case 11:
                Bundle bundle10 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar9 = (o.g) this;
                if (gVar9.f22930c != null) {
                    gVar9.f22929b.post(new o.b(gVar9, bundle10, i13));
                }
                return true;
            case 12:
                Bundle bundle11 = (Bundle) com.bumptech.glide.c.a(parcel, Bundle.CREATOR);
                o.g gVar10 = (o.g) this;
                if (gVar10.f22930c != null) {
                    gVar10.f22929b.post(new o.b(gVar10, bundle11, i14));
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }
}
