package v1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class o implements p {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f25928b;

    public o(IBinder iBinder) {
        this.f25928b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25928b;
    }

    @Override // v1.p
    public final int b(n nVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(p.f25929i8);
            obtain.writeStrongInterface(nVar);
            obtain.writeString(str);
            this.f25928b.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // v1.p
    public final void c(int i10, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(p.f25929i8);
            obtain.writeInt(i10);
            obtain.writeStringArray(strArr);
            this.f25928b.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
