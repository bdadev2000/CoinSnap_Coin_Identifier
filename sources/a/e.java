package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes4.dex */
public abstract class e extends Binder implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
        switch (i2) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean E = E(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(E ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean D = D(b.R(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(D ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean K = K(b.R(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(K ? 1 : 0);
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                Bundle b2 = b();
                parcel2.writeNoException();
                if (b2 != null) {
                    parcel2.writeInt(1);
                    b2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean v2 = v(b.R(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(v2 ? 1 : 0);
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean d = d(b.R(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(d ? 1 : 0);
                return true;
            case 8:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                int M = M(b.R(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(M);
                return true;
            case 9:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean A = A(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, b.R(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(A ? 1 : 0);
                return true;
            case 10:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean G = G(b.R(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(G ? 1 : 0);
                return true;
            case 11:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean q2 = q(b.R(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(q2 ? 1 : 0);
                return true;
            case 12:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                c R = b.R(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                boolean u2 = u(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, R);
                parcel2.writeNoException();
                parcel2.writeInt(u2 ? 1 : 0);
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }
}
