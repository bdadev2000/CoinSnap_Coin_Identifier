package v1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f25926b;

    public m(IBinder iBinder) {
        this.f25926b = iBinder;
    }

    @Override // v1.n
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n.f25927h8);
            obtain.writeStringArray(strArr);
            this.f25926b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25926b;
    }
}
