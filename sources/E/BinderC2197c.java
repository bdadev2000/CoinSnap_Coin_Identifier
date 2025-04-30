package e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2197c extends Binder implements InterfaceC2196b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19921c = 0;
    public final /* synthetic */ C2198d b;

    public BinderC2197c(C2198d c2198d) {
        this.b = c2198d;
        attachInterface(this, InterfaceC2196b.f19920e8);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        Object obj;
        String str = InterfaceC2196b.f19920e8;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i9 != 1) {
            return super.onTransact(i9, parcel, parcel2, i10);
        }
        int readInt = parcel.readInt();
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            obj = creator.createFromParcel(parcel);
        } else {
            obj = null;
        }
        C2198d c2198d = this.b;
        c2198d.getClass();
        c2198d.a(readInt, (Bundle) obj);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
