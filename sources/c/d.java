package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.j;

/* loaded from: classes4.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new j(9);

    /* renamed from: a, reason: collision with root package name */
    public b f22403a;

    /* JADX WARN: Type inference failed for: r0v3, types: [c.a, java.lang.Object] */
    public d(Parcel parcel) {
        b bVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = c.f22401b;
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.o8);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                ?? obj = new Object();
                obj.f22400a = readStrongBinder;
                bVar = obj;
            } else {
                bVar = (b) queryLocalInterface;
            }
        }
        this.f22403a = bVar;
    }

    public void b(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            try {
                if (this.f22403a == null) {
                    this.f22403a = new c(this);
                }
                parcel.writeStrongBinder(this.f22403a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
