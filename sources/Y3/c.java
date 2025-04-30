package Y3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class c implements e, IInterface {
    public final IBinder b;

    public c(IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // Y3.e
    public final void a(String str, Bundle bundle, X3.f fVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i9 = b.f3771a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(fVar);
        try {
            this.b.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }
}
