package u;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import c.InterfaceC0581e;

/* renamed from: u.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2743l extends Binder implements InterfaceC0581e {
    public final Handler b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2745n f23052c;

    public BinderC2743l(InterfaceC2745n interfaceC2745n) {
        this.f23052c = interfaceC2745n;
        attachInterface(this, InterfaceC0581e.f5343c8);
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC0581e.f5343c8;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 != 1598968902) {
            Handler handler = this.b;
            Object obj = null;
            final boolean z8 = false;
            final InterfaceC2745n interfaceC2745n = this.f23052c;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        return super.onTransact(i9, parcel, parcel2, i10);
                    }
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    }
                    final Bundle bundle = (Bundle) obj;
                    final int i11 = 0;
                    handler.post(new Runnable() { // from class: u.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    interfaceC2745n.onSessionEnded(z8, bundle);
                                    return;
                                default:
                                    interfaceC2745n.onVerticalScrollEvent(z8, bundle);
                                    return;
                            }
                        }
                    });
                } else {
                    int readInt = parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator2.createFromParcel(parcel);
                    }
                    handler.post(new C0.a(readInt, interfaceC2745n, (Bundle) obj, 4));
                }
            } else {
                if (parcel.readInt() != 0) {
                    z8 = true;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator3.createFromParcel(parcel);
                }
                final Bundle bundle2 = (Bundle) obj;
                final int i12 = 1;
                handler.post(new Runnable() { // from class: u.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                interfaceC2745n.onSessionEnded(z8, bundle2);
                                return;
                            default:
                                interfaceC2745n.onVerticalScrollEvent(z8, bundle2);
                                return;
                        }
                    }
                });
            }
            return true;
        }
        parcel2.writeString(str);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
