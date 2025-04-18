package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a implements c, IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f23733b;

    public a(IBinder iBinder) {
        this.f23733b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23733b;
    }

    public final Bundle d(Bundle bundle) {
        Parcelable parcelable;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i10 = e7.a.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f23733b.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (obtain.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            }
            return (Bundle) parcelable;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }
}
