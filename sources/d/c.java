package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends Binder implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16781c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16782b;

    public c(e eVar) {
        this.f16782b = eVar;
        attachInterface(this, b.Y7);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Object obj;
        String str = b.Y7;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int readInt = parcel.readInt();
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            obj = creator.createFromParcel(parcel);
        } else {
            obj = null;
        }
        e eVar = this.f16782b;
        eVar.getClass();
        eVar.a(readInt, (Bundle) obj);
        return true;
    }
}
