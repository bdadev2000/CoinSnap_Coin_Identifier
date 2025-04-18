package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes4.dex */
public final class c extends Binder implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22401b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22402a;

    public c(d dVar) {
        this.f22402a = dVar;
        attachInterface(this, b.o8);
    }

    @Override // android.os.Binder
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = b.o8;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i2 != 1) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        S(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    public final void S(int i2, Bundle bundle) {
        d dVar = this.f22402a;
        dVar.getClass();
        dVar.b(i2, bundle);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
