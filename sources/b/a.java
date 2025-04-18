package b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class a extends Binder implements b {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
        parcel.readString();
        if (parcel.readInt() != 0) {
        }
        w();
        throw null;
    }
}
