package Y3;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public abstract class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        Parcelable parcelable;
        int i11 = 0;
        if (i9 > 16777215) {
            if (super.onTransact(i9, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        X3.f fVar = (X3.f) this;
        if (i9 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i12 = b.f3771a;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(parcel);
        }
        Bundle bundle = (Bundle) parcelable;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            j jVar = fVar.f3672d.f3674a;
            if (jVar != null) {
                TaskCompletionSource taskCompletionSource = fVar.f3671c;
                synchronized (jVar.f3781f) {
                    jVar.f3780e.remove(taskCompletionSource);
                }
                synchronized (jVar.f3781f) {
                    try {
                        if (jVar.f3786k.get() > 0 && jVar.f3786k.decrementAndGet() > 0) {
                            jVar.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                        } else {
                            jVar.a().post(new h(jVar, i11));
                        }
                    } finally {
                    }
                }
            }
            fVar.b.a("onGetLaunchReviewFlowInfo", new Object[0]);
            fVar.f3671c.trySetResult(new X3.c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
            return true;
        }
        throw new BadParcelableException(o.h(dataAvail, "Parcel data not fully consumed, unread size: "));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
