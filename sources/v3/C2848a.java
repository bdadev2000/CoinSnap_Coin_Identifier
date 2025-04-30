package v3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2848a implements c, IInterface {
    public final IBinder b;

    public C2848a(IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final Bundle d(Bundle bundle) {
        Parcelable parcelable;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i9 = g3.a.f20425a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.b.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (obtain.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            }
            return (Bundle) parcelable;
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            obtain.recycle();
        }
    }
}
