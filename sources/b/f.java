package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o.q;
import o.r;
import o.t;

/* loaded from: classes.dex */
public abstract class f extends Binder implements g {
    public f() {
        attachInterface(this, g.W7);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        final boolean z10;
        String str = g.W7;
        final int i12 = 1;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Object obj = null;
        final boolean z11 = false;
        byte b3 = 0;
        byte b10 = 0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                final Bundle bundle = (Bundle) obj;
                r rVar = (r) this;
                Handler handler = rVar.f22948b;
                final t tVar = rVar.f22949c;
                handler.post(new Runnable() { // from class: o.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i12;
                        Bundle bundle2 = bundle;
                        boolean z12 = z11;
                        t tVar2 = tVar;
                        switch (i13) {
                            case 0:
                                tVar2.onVerticalScrollEvent(z12, bundle2);
                                return;
                            default:
                                tVar2.onSessionEnded(z12, bundle2);
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
                r rVar2 = (r) this;
                rVar2.f22948b.post(new q(rVar2.f22949c, readInt, (Bundle) obj, b10 == true ? 1 : 0));
            }
        } else {
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator3.createFromParcel(parcel);
            }
            final Bundle bundle2 = (Bundle) obj;
            r rVar3 = (r) this;
            Handler handler2 = rVar3.f22948b;
            final t tVar2 = rVar3.f22949c;
            final byte b11 = b3 == true ? 1 : 0;
            handler2.post(new Runnable() { // from class: o.p
                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = b11;
                    Bundle bundle22 = bundle2;
                    boolean z12 = z10;
                    t tVar22 = tVar2;
                    switch (i13) {
                        case 0:
                            tVar22.onVerticalScrollEvent(z12, bundle22);
                            return;
                        default:
                            tVar22.onSessionEnded(z12, bundle22);
                            return;
                    }
                }
            });
        }
        return true;
    }
}
