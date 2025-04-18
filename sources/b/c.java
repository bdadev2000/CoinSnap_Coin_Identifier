package b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class c extends Binder implements d {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 9) {
            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            parcel.readString();
            if (parcel.readInt() != 0) {
            }
            parcel.readStrongBinder();
            b();
            throw null;
        }
        if (i2 == 1598968902) {
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
            return true;
        }
        switch (i2) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                if (parcel.readInt() != 0) {
                }
                r();
                throw null;
            case 3:
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                if (parcel.readInt() != 0) {
                }
                k();
                throw null;
            case 4:
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                H();
                throw null;
            case 5:
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                y();
                throw null;
            case 6:
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                if (parcel.readInt() != 0) {
                }
                I();
                throw null;
            case 7:
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                m();
                throw null;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }
}
