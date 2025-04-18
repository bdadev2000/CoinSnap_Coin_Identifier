package d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(4);

    /* renamed from: b, reason: collision with root package name */
    public b f16787b;

    public e(Parcel parcel) {
        b aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = c.f16781c;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.Y7);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                aVar = (b) queryLocalInterface;
            } else {
                aVar = new a(readStrongBinder);
            }
        }
        this.f16787b = aVar;
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f16787b == null) {
                this.f16787b = new c(this);
            }
            parcel.writeStrongBinder(this.f16787b.asBinder());
        }
    }
}
